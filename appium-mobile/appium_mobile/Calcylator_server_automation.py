from appium import webdriver
from appium.webdriver.common.appiumby import  AppiumBy
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
    options.app = "http://127.0.0.1:9009/Calculator_9.0%20%28827797324%29_APKPure.apk"
    options.app_package = "com.google.android.calculator"
    options.new_command_timeout = 300
    print("Connecting to Appium...", flush=True)
    driver = webdriver.Remote("http://127.0.0.1:4723", options=options)
    time.sleep(5)
    driver.quit()


if __name__ == "__main__":
    print("SCRIPT STARTED ✅", flush=True)
    main()