from appium import webdriver
from appium.options.android import UiAutomator2Options
from appium.webdriver.common.appiumby import AppiumBy
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC
from selenium.common.exceptions import TimeoutException
import time

def handle_notifications_popup(driver):
    # Some devices use permissioncontroller IDs; others may vary.
    for btn_id, label in [
        ("com.android.permissioncontroller:id/permission_allow_button", "Allow"),
        ("com.android.permissioncontroller:id/permission_deny_button", "Don't allow"),
    ]:
        try:
            el = WebDriverWait(driver, 4).until(
                EC.element_to_be_clickable((AppiumBy.ID, btn_id))
            )
            el.click()
            print(f"Clicked: {label}")
            return
        except TimeoutException:
            pass
    print("Notifications popup not shown (or different IDs)")

def main():
    options = UiAutomator2Options()
    options.platform_name = "Android"
    options.automation_name = "UiAutomator2"
    options.device_name = "emulator-5554"
    options.udid = "emulator-5554"
    options.new_command_timeout = 300

    # App
    options.app_package = "com.google.android.youtube"
    options.app_activity = "com.google.android.youtube.app.honeycomb.Shell$HomeActivity"

    # Runtime perms (not the notification prompt)
    options.auto_grant_permissions = True

    driver = webdriver.Remote("http://127.0.0.1:4723", options=options)

    handle_notifications_popup(driver)

    time.sleep(5)
    driver.quit()

if __name__ == "__main__":
    main()