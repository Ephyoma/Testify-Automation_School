import time

from appium import webdriver
from appium.options.android import UiAutomator2Options
from appium.webdriver.common.appiumby import AppiumBy
from selenium.webdriver.common.action_chains import ActionChains
from selenium.webdriver.common.actions.action_builder import ActionBuilder
from selenium.webdriver.common.actions.pointer_input import PointerInput
from selenium.webdriver.common.actions import interaction
from selenium.webdriver.common.actions.interaction import POINTER_TOUCH

from selenium.webdriver import ActionChains
from selenium.webdriver.common.actions.action_builder import ActionBuilder
from selenium.webdriver.common.actions.pointer_input import PointerInput


def swipe_up(driver):
    size = driver.get_window_size()
    print(size)


    start_x = size["width"] // 2
    start_y = int(size["height"] * 0.45)
    end_y = int(size["height"] * 0.5)

    time.sleep(2)

    finger = PointerInput("touch", "finger")

    actions = ActionChains(driver)
    actions.w3c_actions = ActionBuilder(driver, mouse=finger)

    pa = actions.w3c_actions.pointer_action
    pa.move_to_location(start_x, start_y)
    pa.pointer_down()
    pa.pause(3)
    pa.move_to_location(start_x, end_y)
    pa.release()

    actions.perform()

def double_tap_center(driver):
    size = driver.get_window_size()
    x = size["width"] // 2
    y = size["height"] // 2

    finger = PointerInput("touch", "finger")
    actions = ActionChains(driver)
    actions.w3c_actions = ActionBuilder(driver, mouse=finger)
    pa = actions.w3c_actions.pointer_action
    time.sleep(5)

    # First tap
    pa.move_to_location(x, y)

    pa.pointer_up()
    pa.pointer_down()

    pa.pause(2)

    # Second tap

    pa.pointer_up()
    pa.pointer_down()

    actions.perform()

def main():
    options = UiAutomator2Options()
    options.platform_name = "Android"
    options.automation_name = "UiAutomator2"
    options.device_name = "emulator-5554"
    options.udid = "emulator-5554"
    options.app_package = "com.google.android.apps.maps"
    options.app_activity = "com.google.android.maps.MapsActivity"
    options.no_sign = True
    options.new_command_timeout = 300
    print("Connecting to Appium...", flush=True)
    driver = webdriver.Remote("http://127.0.0.1:4723", options=options)
    time.sleep(2)
    skip_button = driver.find_element(AppiumBy.XPATH, '//android.widget.Button[@text="SKIP"]')
    skip_button.click()
    #time.sleep(2)
    #swipe_up(driver)
    time.sleep(2)
    double_tap_center(driver)








    #driver.quit()


if __name__ == "__main__":
    main()









