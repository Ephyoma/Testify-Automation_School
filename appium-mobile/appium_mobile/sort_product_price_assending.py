from itertools import product

from appium import webdriver
from appium.webdriver.common.appiumby import  AppiumBy
from  selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC
from appium.options.android import UiAutomator2Options
import time

print("SCRIPT STARTED ✅", flush=True)

def login_valid_credentials():
    options = UiAutomator2Options()
    options.platform_name = "Android"
    options.automation_name = "UiAutomator2"
    options.device_name = "emulator-5554"
    options.udid = "emulator-5554"
    # options.app = "F:/Testify/CI-CD-Lesson/Testify-Automation_School/install/Android-MyDemoAppRN.1.1.0.build-226.apk"
    options.app_package = "com.saucelabs.mydemoapp.rn"
    options.app_activity = ".MainActivity"
    options.new_command_timeout = 300
    print("Connecting to Appium...", flush=True)
    driver = webdriver.Remote("http://127.0.0.1:4723", options=options)
    menu = driver.find_element(AppiumBy.XPATH, '//android.view.ViewGroup[@content-desc="open menu"]')
    menu.click()
    time.sleep(2)
    log_in = driver.find_element(AppiumBy.XPATH, '//android.view.ViewGroup[@content-desc="menu item log in"]')
    log_in.click()
    time.sleep(2)
    username = driver.find_element(AppiumBy.XPATH, '//android.widget.TextView[@text="bob@example.com"]')
    username.click()
    time.sleep(2)

    login_submit = driver.find_element(AppiumBy.XPATH, '(//android.widget.TextView[@text="Login"])[2]')
    login_submit.click()
    time.sleep(2)

    # sort price Ascending

    sort_ascending_price = driver.find_element(AppiumBy.XPATH, '//android.view.ViewGroup[@content-desc="sort button"]')
    sort_ascending_price.click()
    time.sleep(2)
    driver.find_element(AppiumBy.XPATH, '//android.widget.TextView[@text="Price - Ascending"]').click()
    #time.sleep(2)
    #driver.find_element(AppiumBy.XPATH, '//android.widget.TextView[@content-desc="store item text" and @text="Sauce Labs Onesie"]').click()
    #time.sleep(2)
    #driver.find_element(AppiumBy.XPATH, '//android.widget.TextView[@text="Add To Cart"]').click()


    time.sleep(5)
    driver.quit()




def main():
    login_valid_credentials()





if __name__ == "__main__":
    print("SCRIPT STARTED ✅", flush=True)
    main()