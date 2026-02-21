from appium import webdriver
from appium.webdriver.common.appiumby import  AppiumBy
from  selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC
from appium.options.android import UiAutomator2Options
import time

print("SCRIPT STARTED ✅", flush=True)

def calculator_session():
    options = UiAutomator2Options()
    options.platform_name = "Android"
    options.automation_name = "UiAutomator2"
    options.device_name = "emulator-5554"
    options.udid = "emulator-5554"
    options.app = "F:/Testify/CI-CD-Lesson/Testify-Automation_School/install/Calculator_9.0 (827797324)_APKPure.apk"
    options.app_package = "com.google.android.calculator"
    options.new_command_timeout = 300
    print("Connecting to Appium...", flush=True)
    driver = webdriver.Remote("http://127.0.0.1:4723", options=options)
    #image_base64 = driver.get_screenshot_as_base64()- //If you want to get the image value
    driver.get_screenshot_as_file("calculator.png") #/if you want to save as file

    time.sleep(5)
    driver.quit()

def youtube_session():
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
    driver.get_screenshot_as_file("youtube.png")
    time.sleep(5)
    driver.quit()

def main():
    calculator_session()
    youtube_session()


if __name__ == "__main__":
    print("SCRIPT STARTED ✅", flush=True)
    main()