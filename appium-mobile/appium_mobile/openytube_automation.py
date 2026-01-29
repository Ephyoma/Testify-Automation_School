from appium import webdriver
from appium.options.android import UiAutomator2Options
import time

print("SCRIPT STARTED ✅", flush=True)

def main():
    options = UiAutomator2Options()
    options.platform_name = "Android"
    options.automation_name = "UiAutomator2"
    options.device_name = "emulator-5554"
    options.udid = "emulator-5554"
    options.new_command_timeout = 300

    print("Connecting to Appium...", flush=True)
    options.app_package = "com.google.android.youtube"
    options.app_activity = "com.google.android.youtube.app.honeycomb.Shell$HomeActivity"
    driver = webdriver.Remote("http://127.0.0.1:4723", options=options)
    options.auto_grant_permissions = True

    print("Session started:", driver.session_id, flush=True)
    time.sleep(30)

    driver.quit()
    print("Done", flush=True)

if __name__ == "__main__":
    main()