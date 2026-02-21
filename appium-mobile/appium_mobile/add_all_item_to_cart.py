from itertools import product

from appium import webdriver
from appium.webdriver.common.appiumby import  AppiumBy
from selenium.webdriver.common.actions import interaction
from selenium.webdriver.common.actions.action_builder import ActionBuilder
from selenium.webdriver.common.actions.pointer_input import PointerInput
from  selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC
from appium.options.android import UiAutomator2Options
import time

print("SCRIPT STARTED ✅", flush=True)

def scroll_down(driver):
    size = driver.get_window_size()

    print(size)

    start_x = size["width"] // 2
    start_y = int(size["height"] * 0.75)
    end_y = int(size["height"] * 0.25)

    finger = PointerInput(interaction.POINTER_TOUCH, "finger")
    actions = ActionBuilder(driver, mouse=finger)

    actions.pointer_action.move_to_location(start_x, start_y)
    actions.pointer_action.pointer_down()
    actions.pointer_action.pause(0.2)
    actions.pointer_action.move_to_location(start_x, end_y)
    actions.pointer_action.release()

    actions.perform()



def adding_first_4_items(driver):

    #Go to menu
    menu = driver.find_element(AppiumBy.XPATH, '//android.view.ViewGroup[@content-desc="open menu"]')
    menu.click()
    time.sleep(2)

    #Go to Login tab
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
    time.sleep(2)
# Adding Sauce Labs Onesie


    driver.find_element(AppiumBy.XPATH, '//android.widget.TextView[@content-desc="store item text" and @text="Sauce Labs Onesie"]').click()
    time.sleep(2)
    driver.find_element(AppiumBy.XPATH, '//android.widget.TextView[@text="Add To Cart"]').click()
    time.sleep(2)

    #Adding Labs Bike Light
    menu = driver.find_element(AppiumBy.XPATH, '//android.view.ViewGroup[@content-desc="open menu"]')
    menu.click()
    time.sleep(2)

    catalog = driver.find_element(AppiumBy.XPATH, '//android.view.ViewGroup[@content-desc="menu item catalog"]')
    catalog.click()
    time.sleep(2)
    driver.find_element(AppiumBy.XPATH, '//android.widget.TextView[@content-desc="store item text" and @text="Sauce Labs Bike Light"]').click()
    time.sleep(2)
    driver.find_element(AppiumBy.XPATH, '//android.widget.TextView[@text="Add To Cart"]').click()
    time.sleep(2)
# Adding Sauce Labs Bolt T-Shirt
    menu = driver.find_element(AppiumBy.XPATH, '//android.view.ViewGroup[@content-desc="open menu"]')
    menu.click()
    time.sleep(2)

    catalog = driver.find_element(AppiumBy.XPATH, '//android.view.ViewGroup[@content-desc="menu item catalog"]')
    catalog.click()
    time.sleep(2)
    driver.find_element(AppiumBy.XPATH,'//android.widget.TextView[@content-desc="store item text" and @text="Sauce Labs Bolt T-Shirt"]').click()
    time.sleep(2)
    driver.find_element(AppiumBy.XPATH, '//android.widget.TextView[@text="Add To Cart"]').click()

   # Adding the T-Shirt

    menu = driver.find_element(AppiumBy.XPATH, '//android.view.ViewGroup[@content-desc="open menu"]')
    menu.click()
    time.sleep(2)

    catalog = driver.find_element(AppiumBy.XPATH, '//android.view.ViewGroup[@content-desc="menu item catalog"]')
    catalog.click()
    time.sleep(2)

    driver.find_element(AppiumBy.XPATH,'//android.widget.TextView[@content-desc="store item text" and @text="Test.allTheThings() T-Shirt"]').click()
    time.sleep(2)
    driver.find_element(AppiumBy.XPATH, '//android.widget.TextView[@text="Add To Cart"]').click()

    #Return to the Catalog before Scrolling down

    menu = driver.find_element(AppiumBy.XPATH, '//android.view.ViewGroup[@content-desc="open menu"]')
    menu.click()
    time.sleep(2)

    catalog = driver.find_element(AppiumBy.XPATH, '//android.view.ViewGroup[@content-desc="menu item catalog"]')
    catalog.click()
    print("4 items added to Cart")

def adding_the_remaining_2_items(driver):

    # Adding Lab Backpack
    driver.find_element(AppiumBy.XPATH,
                        '//android.widget.TextView[@content-desc="store item text" and @text="Sauce Labs Backpack"]').click()
    time.sleep(2)
    driver.find_element(AppiumBy.XPATH, '//android.widget.TextView[@text="Add To Cart"]').click()
    time.sleep(2)

    menu = driver.find_element(AppiumBy.XPATH, '//android.view.ViewGroup[@content-desc="open menu"]')
    menu.click()
    time.sleep(2)

    catalog = driver.find_element(AppiumBy.XPATH, '//android.view.ViewGroup[@content-desc="menu item catalog"]')
    catalog.click()
    time.sleep(2)

    #Adding Sauce Labs Fleece Jacket

    driver.find_element(AppiumBy.XPATH,
                        '//android.widget.TextView[@content-desc="store item text" and @text="Sauce Labs Fleece Jacket"]').click()
    time.sleep(2)
    driver.find_element(AppiumBy.XPATH, '//android.widget.TextView[@text="Add To Cart"]').click()
    time.sleep(2)

    print("6 items added to Cart")

def view_cart_items(driver):
    driver.find_element(AppiumBy.XPATH, '//android.view.ViewGroup[@content-desc="cart badge"]').click()
    time.sleep(2)

def assert_cart_items_displayed(driver, expected_items):

    # Wait until at least one cart item is visible
    WebDriverWait(driver, 10).until(
        EC.presence_of_element_located((AppiumBy.XPATH, '//android.widget.ScrollView[@content-desc="cart screen"]'))
    )
    # Collect all item titles displayed in the cart
    cart_titles_elements = driver.find_elements(AppiumBy.XPATH,
                                                '//android.widget.ScrollView[@content-desc="cart screen"]')
    actual_items = [el.text.strip() for el in cart_titles_elements]

    print("✅ Items found in cart:", actual_items)
    print("✅ Items expected:", expected_items)

    # Assert count (optional but good)
    assert len(actual_items) == len(
        expected_items), f"Cart count mismatch. Expected {len(expected_items)} but found {len(actual_items)}"

    # Assert that every expected item is present
    missing = [item for item in expected_items if item not in actual_items]
    assert not missing, f"Missing items in cart: {missing}"


    # Optional: Assert there are no unexpected extra items
    extras = [item for item in actual_items if item not in expected_items]
    assert not extras, f"Unexpected items in cart: {extras}"

    print("✅ Cart items are displayed correctly!")

def get_cart_item_count(driver):
    cartCount= driver.find_elements(AppiumBy.XPATH,'//android.widget.TextView[@content-desc="total number"]')
    total_item = cartCount[0].text.strip()

    print("🛒 Cart items text:", total_item)

    return total_item

def remove_two_items_from_cart(driver):
    #driver.find_element(AppiumBy.XPATH, '//android.view.ViewGroup[@content-desc="cart badge"]').click()
    time.sleep(2)

    driver.find_element(AppiumBy.XPATH,'(//android.widget.TextView[@text="Remove Item"])[1]').click()
    time.sleep(2)
    scroll_down(driver)
    time.sleep(2)
    driver.find_element(AppiumBy.XPATH, '(//android.widget.TextView[@text="Remove Item"])[2]').click()
    time.sleep(2)
    print("Two items removed!")

def get_cart_item_count_after_remove(driver):
    Count= driver.find_elements(AppiumBy.XPATH,'//android.widget.TextView[@content-desc="total number"]')
    total_items = Count[0].text.strip()

    print("🛒 Cart items text:", total_items)

    return total_items


def assert_number_of_item(driver, expected_text="4 items"):

    expected_text = "4 items"

    actual_text = get_cart_item_count(driver)

    assert  actual_text == expected_text, f"Expected {expected_text} but found {actual_text}"

    print("✅ Cart item count assertion passed")

#. Click on the "Proceed to checkout" button.

def check_out(driver):
    check_out_button = driver.find_element(AppiumBy.XPATH, '//android.widget.TextView[@text="Proceed To Checkout"]')
    check_out_button.click()
    time.sleep(2)
    name = driver.find_element(AppiumBy.XPATH, '//android.widget.EditText[@content-desc="Full Name* input field"]')
    name.send_keys("Full Name")
    time.sleep(2)
    address = driver.find_element(AppiumBy.XPATH, '//android.widget.EditText[@content-desc="Address Line 1* input field"]')
    address.send_keys("Address Line 1")
    time.sleep(2)
    address2 = driver.find_element(AppiumBy.XPATH, '//android.widget.EditText[@content-desc="Address Line 2 input field"]')
    address2.send_keys("Address Line 2")
    time.sleep(2)
    city = driver.find_element(AppiumBy.XPATH, '//android.widget.EditText[@content-desc="City* input field"]')
    city.send_keys("City")
    time.sleep(2)

    state = driver.find_element(AppiumBy.XPATH, '//android.widget.EditText[@content-desc="State/Region input field"]')
    state.send_keys("Lagos")
    time.sleep(2)

    zip_code = driver.find_element(AppiumBy.XPATH, '//android.widget.EditText[@content-desc="Zip Code* input field"]')
    zip_code.send_keys("1234567890")
    time.sleep(2)

    country = driver.find_element(AppiumBy.XPATH, '//android.widget.EditText[@content-desc="Country* input field"]')
    country.send_keys("Nigeria")
    time.sleep(2)

#  Proceed to the Payment page.

def assert_on_payment_page(driver):
    payment_button = driver.find_element(AppiumBy.XPATH, '//android.widget.TextView[@text="To Payment"]')
    payment_button.click()
    time.sleep(2)
    payment_header = driver.find_element(AppiumBy.XPATH, '//android.widget.TextView[@text="Enter a payment method"]')
    assert payment_header.is_displayed(), "Payment method is not displayed"

    print("Payment method text:", payment_header.text)


def payment_details(driver):
    full_name = driver.find_element(AppiumBy.XPATH, '//android.widget.EditText[@content-desc="Full Name* input field"]')
    full_name.send_keys("Full Name")
    time.sleep(2)

    card_number = driver.find_element(AppiumBy.XPATH, '//android.widget.EditText[@content-desc="Card Number* input field"]')
    card_number.send_keys("1234567890")
    time.sleep(2)

    card_expiry_date = driver.find_element(AppiumBy.XPATH, '//android.widget.EditText[@content-desc="Expiration Date* input field"]')
    card_expiry_date.send_keys("20/27")
    time.sleep(2)

    security_code = driver.find_element(AppiumBy.XPATH, '//android.widget.EditText[@content-desc="Security Code* input field"]')
    security_code.send_keys("123")
    time.sleep(2)
    review_button = driver.find_element(AppiumBy.XPATH, '//android.widget.TextView[@text="Review Order"]')

    review_button.click()
    time.sleep(2)
    review_button.click()


def review_order(driver):
    scroll_down(driver)

    time.sleep(2)
    #time.sleep(2)
def place_order(driver):
    submit_order = driver.find_element(AppiumBy.XPATH, '//android.widget.TextView[@text="Place Order"]')
    submit_order.click()
    time.sleep(2)

def assert_order_success(driver):
    success_message = WebDriverWait(driver, 10).until(
        EC.presence_of_element_located(
            (AppiumBy.XPATH, '//android.widget.TextView[@text="Thank you for your order"]')
        )
    )

    assert success_message.is_displayed(), "Order success message not displayed"

    print("✅ Order placed successfully — Success message displayed")

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
    time.sleep(1)
    adding_first_4_items(driver)
    time.sleep(2)
    scroll_down(driver)
    time.sleep(1)
    adding_the_remaining_2_items(driver)
    time.sleep(1)
    expected_items = [
        "Sauce Labs Onesie",
        "Sauce Labs Bike Light",
        "Sauce Labs Bolt T-Shirt",
        "Test.allTheThings() T-Shirt",
        "Sauce Labs Backpack",
        "Sauce Labs Fleece Jacket"
    ]

    view_cart_items(driver)
    #assert_cart_items_displayed(driver, expected_items)
    initial_count = get_cart_item_count(driver)
    print("Initial cart count:", initial_count)
    view_cart_items(driver)
    time.sleep(1)
    remove_two_items_from_cart(driver)
    time.sleep(1)
    updated_count = get_cart_item_count_after_remove(driver)
    print("Updated cart count:", updated_count)
    assert_number_of_item(driver, expected_text="4 items")
    print("✅ Cart updated correctly after removal")
    time.sleep(1)

    check_out(driver)
    time.sleep(1)
    assert_on_payment_page(driver)
    print("Assertion completed")
    time.sleep(1)
    payment_details(driver)
    print("Payment details completed")
    time.sleep(1)
    review_order(driver)
    print("Review order completed")
    time.sleep(1)
    place_order(driver)
    print("Place order completed")
    time.sleep(1)
    assert_order_success(driver)
    time.sleep(1)



if __name__ == "__main__":
    print("SCRIPT STARTED ✅", flush=True)
    main()