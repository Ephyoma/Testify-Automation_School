from appium import webdriver
from appium.webdriver.common.appiumby import  AppiumBy
from selenium.webdriver import ActionChains
from  selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC
from appium.options.android import UiAutomator2Options
import time

print("SCRIPT STARTED ✅", flush=True)

def main():
    options = UiAutomator2Options()
    options.platform_name = "Android"
    options.automation_name = "UiAutomator2"
    options.device_name = "emulator-5554"
    options.udid = "emulator-5554"
    options.app_package = "com.google.android.calculator"
    #options.app_activity = "com.google.android.calculator.Calculator"
    options.new_command_timeout = 300
    print("Connecting to Appium...", flush=True)
    driver = webdriver.Remote("http://127.0.0.1:4723", options=options)
    num1 = driver.find_element(AppiumBy.ID, "com.google.android.calculator:id/digit_1")
    actions = ActionChains(driver)
    actions.move_to_element_with_offset(num1, 200, -200)
    #actions.click()
    #actions.double_click()
    actions.click_and_hold()
    actions.release()
    actions.perform()


    time.sleep(5)


if __name__ == "__main__":
    print("SCRIPT STARTED ✅", flush=True)
    main()