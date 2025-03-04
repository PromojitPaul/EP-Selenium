# EP-Selenium

## Description
EP-Selenium is a Selenium-based automation framework designed for end-to-end testing of web applications. It follows the Page Object Model (POM) framework and integrates best practices for maintainability and scalability. The framework supports TestNG for test execution, Maven for dependency management, and Extent Reports for test result visualization.

Automate login, forms, search, file upload/download, alerts, tables, and dynamic elements. Handle multiple windows, iFrames, and cross-browser testing. Perform e-commerce, user registration, booking, and social media automation. Validate broken links, images, and pop-ups. Execute end-to-end testing scenarios for seamless web automation.

## Features
- Page Object Model (POM) for better test maintainability
- TestNG integration for structured test execution
- Maven for dependency management
- Configuration management via `config.properties`
- Explicit and implicit waits for synchronization
- Screenshots for failed test cases
- Extent Reports for detailed test execution logs
- Cross-browser testing support

## Folder Structure
```
EP-Selenium/
│── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── config/              # Configuration files (e.g., config.properties)
│   │   │   ├── pages/               # Page Object Model classes
│   │   │   │   ├── HomePage.java
│   │   │   │   ├── LoginPage.java
│   │   │   │   ├── CartPage.java
│   │   │   │   ├── CheckoutPage.java
│   │   │   ├── tests/               # Test cases
│   │   │   │   ├── LoginTest.java
│   │   │   │   ├── CartTest.java
│   │   │   │   ├── CheckoutTest.java
│   │   │   ├── utils/               # Utility functions (e.g., wait handling, screenshot capture)
│   │   │   │   ├── WebDriverUtil.java
│   │   │   │   ├── ScreenshotUtil.java
│   │   │   │   ├── ExcelReader.java  # If data-driven testing is used
│   ├── test/
│   │   ├── java/                     # Additional test-specific code if needed
│
│── test-output/                      # Stores generated test reports
│── drivers/                           # WebDriver executables (e.g., chromedriver, geckodriver)
│── reports/                           # Extent Reports output
│── logs/                              # Log files for debugging
│── screenshots/                       # Captured screenshots for failed test cases
│── resources/
│   ├── config.properties              # Application configurations
│   ├── testdata.xlsx                   # Test data file (if applicable)
│
│── pom.xml                             # Maven dependencies and configurations
│── testng.xml                          # TestNG test suite configuration
│── .gitignore                          # Files and directories to ignore in Git
│── README.md                           # Project documentation
```

## Installation & Setup
### Prerequisites
- Java (JDK 8 or higher)
- Maven
- Selenium WebDriver
- TestNG
- IDE (IntelliJ IDEA / Eclipse)


### Install Dependencies
```sh
mvn clean install
```

## Running Tests
### Execute All Tests
```sh
mvn test
```

### Execute Specific Test Suite
```sh
mvn test -DsuiteXmlFile=TestSuite.xml
```

## Reporting
- Test execution reports are generated using Extent Reports and can be found in the `test-output/` folder.

## Contribution
1. Fork the repository.
2. Create a new branch (`feature-branch-name`).
3. Commit changes (`git commit -m "Added new feature"`).
4. Push to the branch (`git push origin feature-branch-name`).
5. Create a Pull Request.

## Contact
For any inquiries, please reach out to **[Promojit Paul](https://github.com/PromojitPaul)**.

---
Happy Testing! 🚀

