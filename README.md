**🧩 GoZayaan Login Automation — Selenium Project**
📘 Overview

This project automates the login functionality of the GoZayaan website using Selenium WebDriver with IntelliJ IDEA.
It demonstrates end-to-end browser automation, element handling, and login validation through a structured testing approach.

**⚙️ Technologies Used**
Language: Java
Automation Tool: Selenium WebDriver
IDE: IntelliJ IDEA
Build Tool: Maven
Testing Framework: TestNG 
Browser: Chrome


**🎯 Project Objective**

The goal of this project is to:
Automate the GoZayaan login process.
Validate correct and incorrect login attempts.
Ensure test reliability through reusable methods and modular design.
Strengthen understanding of automation testing frameworks.

**🧠 Key Features**
Automated login test using valid and invalid credentials.
Implementation of XPath and CSS selectors for element identification.
Browser synchronization using explicit and implicit waits.
Reusable functions for better maintainability.
Console logs and assertions for clear test reporting.

**📂 Project Structure**
GoZayaanLoginAutomation/
│
├── src/
│   ├── main/
│   │   └── java/
│   │       └── pages/        # Page Object Model classes
│   │       └── utils/        # Utility functions
│   └── test/
│       └── java/
│           └── tests/        # Test scripts
│
├── pom.xml                   # Maven dependencies (if applicable)
├── README.md                 # Project documentation
└── testng.xml                # Test configuration (if using TestNG)

**🚀 How to Run**

Clone the repository:
git clone https://github.com/sozibul23/Selenium_Login_Automation_sadhin.git

Open the project in IntelliJ IDEA.
Install dependencies via Maven (pom.xml).
Configure your ChromeDriver path in the setup file.

Run the test using one of the following:
mvn test

or directly from IntelliJ using the TestNG/JUnit runner.

**🧩 Test Scenario**
Scenario: Validate login functionality
Navigate to GoZayaan.com
Click the Login button.
Enter valid or invalid credentials.
Click Submit.
Validate the login success message or error alert.
