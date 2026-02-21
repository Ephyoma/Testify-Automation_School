from itertools import product

from appium import webdriver
from appium.webdriver.common.appiumby import  AppiumBy
from  selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC
from appium.options.android import UiAutomator2Options
import time

print("SCRIPT STARTED ✅", flush=True)

def login_valid_credentials(driver):

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

    # wait until Products title appears
    products_title = WebDriverWait(driver, 10).until(EC.presence_of_element_located((AppiumBy.XPATH, '//android.widget.TextView[@text="Products"]')))

    assert products_title.is_displayed(), "On PRODUCTS page"
    print(products_title.is_displayed())
    print("✅ Successfully on PRODUCTS page")

    time.sleep(5)


def login_invalid_credentials(driver):

    menu = driver.find_element(AppiumBy.XPATH, '//android.view.ViewGroup[@content-desc="open menu"]')
    menu.click()
    time.sleep(2)
    log_in = driver.find_element(AppiumBy.XPATH, '//android.view.ViewGroup[@content-desc="menu item log in"]')
    log_in.click()
    time.sleep(2)
    # username without password
    username = driver.find_element(AppiumBy.XPATH, '//android.widget.EditText[@content-desc="Username input field"]')
    username.send_keys("bob@example.com")

    login_submit = driver.find_element(AppiumBy.XPATH, '(//android.widget.TextView[@text="Login"])[2]')
    login_submit.click()
    error_message = driver.find_element(AppiumBy.XPATH, '//android.widget.TextView[@text="Password is required"]')
    print(error_message.text)
    time.sleep(5)


def login_with_incomplete_username(driver):

    menu = driver.find_element(AppiumBy.XPATH, '//android.view.ViewGroup[@content-desc="open menu"]')
    menu.click()
    time.sleep(2)
    log_in = driver.find_element(AppiumBy.XPATH, '//android.view.ViewGroup[@content-desc="menu item log in"]')
    log_in.click()
    time.sleep(2)
    # username without password
    username = driver.find_element(AppiumBy.XPATH, '//android.widget.EditText[@content-desc="Username input field"]')
    username.send_keys("bob@example")
    password = driver.find_element(AppiumBy.XPATH, '//android.widget.EditText[@content-desc="Password input field"]')
    password.send_keys("10203040")

    login_submit = driver.find_element(AppiumBy.XPATH, '(//android.widget.TextView[@text="Login"])[2]')
    login_submit.click()
    time.sleep(5)



def main():
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
    #login_valid_credentials(driver)
    #login_invalid_credentials(driver)
    login_with_incomplete_username(driver)

    driver.quit()





if __name__ == "__main__":
    main()