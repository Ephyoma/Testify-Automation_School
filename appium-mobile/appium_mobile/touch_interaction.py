from appium import webdriver
from appium.options.android import UiAutomator2Options
from appium.webdriver.common.appiumby import AppiumBy
from selenium.webdriver import Keys
from selenium.webdriver.common.actions import interaction
from selenium.webdriver.common.actions.interaction import POINTER_TOUCH
from selenium.webdriver.common.by import By
from selenium.webdriver.common.devtools.v142.input_ import TouchPoint
from selenium.webdriver.remote.mobile import Mobile
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC
from selenium.common.exceptions import TimeoutException
from selenium.webdriver.common.action_chains import ActionChains
from selenium.webdriver.common.actions.pointer_input import PointerInput
from selenium.webdriver.common.actions.action_builder import ActionBuilder

import time

def skip_page(driver):
    skip_button = driver.find_element(AppiumBy.XPATH, '//android.widget.Button[@text="SKIP"]')

    skip_button.click()

def touch_interaction_tap(driver):
    time.sleep(5)
    restaurant_button = driver.find_element(AppiumBy.XPATH, '(//android.widget.FrameLayout[@resource-id="com.google.android.apps.maps:id/fab_icon"])[2]/android.widget.FrameLayout[2]/android.widget.ImageView')
    finger = PointerInput(POINTER_TOUCH, "finger")
    actions = ActionChains(driver)
    actions.w3c_actions = ActionBuilder(driver, mouse=finger)

    actions.w3c_actions.pointer_action.move_to(restaurant_button)
    actions.w3c_actions.pointer_action.pointer_down()
    actions.w3c_actions.pointer_action.pointer_up()

    actions.perform()


def touch_interaction_double_tap(driver, x, y):
    time.sleep(5)
    map_view = driver.find_element(AppiumBy.ID, 'com.google.android.apps.maps:id/explore_tab_home_bottom_sheet')

    finger = PointerInput(interaction.POINTER_TOUCH, "finger")
    actions = ActionBuilder(driver, mouse=finger)

    # 1st tap
    actions.pointer_action.move_to_location(x, y)
    actions.pointer_action.pointer_down()
    actions.pointer_action.pointer_up()

    actions.pointer_action.pause(0.12)

    # 2nd tap
    actions.pointer_action.pointer_down()
    actions.pointer_action.pointer_up()
    actions.perform()

def touch_interaction_scroll(driver):
    actions = ActionChains(driver)
    time.sleep(5)
    map_view = driver.find_element(AppiumBy.ID, 'com.google.android.apps.maps:id/explore_tab_home_bottom_sheet')
    rect = map_view.rect
    start_x = rect["x"] + rect["width"] // 2
    start_y = rect["y"] + int(rect["height"] * 0.8)
    end_x = start_x
    end_y = rect["y"] + int(rect["height"] * 0.3)

    finger = PointerInput(interaction.POINTER_TOUCH, "finger")
    actions = ActionBuilder(driver, mouse=finger)

    actions.pointer_action.move_to_location(start_x, start_y)
    actions.pointer_action.pointer_down()
    actions.pointer_action.pause(0.15)
    actions.pointer_action.move_to_location(end_x, end_y)
    actions.pointer_action.pointer_up()


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
    skip_page(driver)
    touch_interaction_scroll(driver)
    time.sleep(5)
    #touch_interaction_tap(driver)
    time.sleep(5)
    driver.quit()


if __name__ == "__main__":
    main()