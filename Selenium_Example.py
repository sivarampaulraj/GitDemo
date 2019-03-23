from selenium import webdriver
from selenium.webdriver.common.keys import Keys
import time

browser = webdriver.Chrome()

browser.get("http://newtours.demoaut.com")
time.sleep(10)

ids = browser.find_elements_by_xpath('//*[@name]')
for ii in ids:
    print(ii.get_attribute('name'))
    print(type(ii.get_attribute('name')))

time.sleep(5)

username = browser.find_element_by_name("userName")

password = browser.find_element_by_name("password")

username.send_keys("test")
password.send_keys("test")

sign_in = browser.find_element_by_name("login")
sign_in.click()


