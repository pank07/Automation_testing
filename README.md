# ✅ 2. Install Selenium and Browser Driver on Linux Server (Ubuntu)
You need:

Python + pip

Selenium Python package

Browser (e.g. Chrome)

WebDriver (e.g. ChromeDriver)

✅ OPTION 1: Use a Virtual Environment (Recommended 🔒✅)
- Best practice. Isolated, clean, and won't upset your OS.
- Install python venv module (if not already)
```bash
sudo apt install python3-venv -y
```
- Create virtual environment
```bash
python3 -m venv selenium-env
```

- Activate it
```bash
source selenium-evn/bin/activate
```

- Now install packages safety!
```bash
pip install selenium
```
- when done, deactivate
```bash
deactivate
```
