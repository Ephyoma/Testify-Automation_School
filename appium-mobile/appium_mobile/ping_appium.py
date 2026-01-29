import urllib.request

print("Pinging Appium...")
print(urllib.request.urlopen("http://127.0.0.1:4723/status").read().decode("utf-8"))