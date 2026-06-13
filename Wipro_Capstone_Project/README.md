# TestAutomationHybridFramework
A robust Hybrid Test Automation Framework developed using Selenium WebDriver, TestNG, Java, Maven, and Jenkins following the Page Object Model (POM) design pattern.
This framework automates multiple web UI functionalities on the Test Automation Practice application, covering form validation, alerts, dropdowns, drag-and-drop operations, file handling, web tables, navigation flows, and advanced browser interactions. The project incorporates data-driven testing using Excel, detailed reporting through Extent Reports, centralized logging with Log4j2, and automated browser management using WebDriverManager.

# Key Features

* Hybrid Framework using Page Object Model (POM) and Data-Driven Testing
* Selenium WebDriver with TestNG for UI Automation
* Excel-Based Test Data Management using Apache POI
* Extent Reports with Automatic Screenshot Capture
* Log4j2 Logging for Execution Tracking and Debugging
* Cross-Browser Testing Support (Chrome & Edge)
* WebDriverManager for Automatic Driver Configuration
* Reusable Utility Classes for Waits, Screenshots, and JavaScript Actions
* Jenkins CI/CD Pipeline Integration for Automated Execution
* Scalable, Maintainable, and Industry-Standard Framework Design

# Project Overview

This project is a Hybrid Test Automation Framework built using Selenium WebDriver, TestNG, Java, and Maven. It follows the Page Object Model (POM) design pattern and incorporates Data-Driven Testing, Extent Reports, Log4j2 logging, WebDriverManager, and Jenkins CI/CD integration to deliver a scalable, maintainable, and industry-standard automation solution.

## Tech Stack

| Technology         | Purpose                         |
| ------------------ | ------------------------------- |
| Java 17            | Core Programming Language       |
| Selenium WebDriver | Web UI Automation               |
| TestNG             | Test Execution & Assertions     |
| Maven              | Build & Dependency Management   |
| WebDriverManager   | Automatic Driver Setup          |
| Apache POI         | Excel-Based Data-Driven Testing |
| Extent Reports     | HTML Test Reporting             |
| Log4j2             | Logging & Debugging             |
| Jenkins            | CI/CD Pipeline Automation       |

# Project Structure

```text
TestAutomationHybridFramework/
│
├── src/
│   ├── test/
│   │   ├── java/
│   │   │   ├── Base/
│   │   │   │   └── BaseTest.java
│   │   │   │
│   │   │   ├── Listeners/
│   │   │   │   └── TestListener.java
│   │   │   │
│   │   │   ├── Pages/
│   │   │   │   ├── AlertPage.java
│   │   │   │   ├── DatePickerPage.java
│   │   │   │   ├── DoubleClickPage.java
│   │   │   │   ├── DownloadFilesPage.java
│   │   │   │   ├── DragDropPage.java
│   │   │   │   ├── DropDownPage.java
│   │   │   │   ├── DynamicButtonPage.java
│   │   │   │   ├── FooterPage.java
│   │   │   │   ├── FormPage.java
│   │   │   │   ├── HiddenAjaxPage.java
│   │   │   │   ├── LabelsAndLinksPage.java
│   │   │   │   ├── MouseHoverPage.java
│   │   │   │   ├── NavigationPage.java
│   │   │   │   ├── PaginationWebTablePage.java
│   │   │   │   ├── ShadowDomPage.java
│   │   │   │   ├── SliderPage.java
│   │   │   │   ├── SvgPage.java
│   │   │   │   ├── TablePage.java
│   │   │   │   ├── TabsPage.java
│   │   │   │   └── UploadPage.java
│   │   │   │
│   │   │   ├── Tests/
│   │   │   │   ├── AlertTest.java
│   │   │   │   ├── DatePickerTest.java
│   │   │   │   ├── DoubleClickTest.java
│   │   │   │   ├── DownloadFilesTest.java
│   │   │   │   ├── DragDropTest.java
│   │   │   │   ├── DropDownTest.java
│   │   │   │   ├── DynamicButtonTest.java
│   │   │   │   ├── FooterTest.java
│   │   │   │   ├── FormTest.java
│   │   │   │   ├── HiddenAjaxTest.java
│   │   │   │   ├── LabelsAndLinksTest.java
│   │   │   │   ├── MouseHoverTest.java
│   │   │   │   ├── NavigationTest.java
│   │   │   │   ├── PaginationWebTableTest.java
│   │   │   │   ├── ShadowDomTest.java
│   │   │   │   ├── SliderTest.java
│   │   │   │   ├── SvgTest.java
│   │   │   │   ├── TableTest.java
│   │   │   │   ├── TabsTest.java
│   │   │   │   └── UploadTest.java
│   │   │   │
│   │   │   ├── Utilities/
│   │   │   └── TestData/
│   │
│   └── resources/
│       ├── config.properties
│       ├── FormData.xlsx
│       ├── log4j2.xml
│       ├── sample.txt
│       ├── sample1.txt
│       └── sample2.txt
│
├── reports/
│   └── ExtentReport_*.html
│
├── Screenshots/
│   └── Failed Test Screenshots
│
├── logs/
│   └── automation.log
│
├── test-output/
│   └── TestNG Reports
│
├── Jenkinsfile
├── pom.xml
└── testng.xml
```
# Running Tests

Execute the complete automation suite:

```bash
mvn test
```

Execute tests using the TestNG suite configuration:

```bash
mvn test -DsuiteXmlFile=testng.xml
```

Execute an individual test class:

```bash
mvn test -Dtest=AlertTest
```

The framework leverages `testng.xml` for centralized test execution and integrates `TestListener` for reporting, logging, and test lifecycle management.

# Screenshots
## Jenkins Pipeline
<img width="1904" height="986" alt="Screenshot 2026-06-10 195401" src="https://github.com/user-attachments/assets/5b4a1199-d1ac-4a5d-8a75-a4e5bc51c67e" />

# Jenkins Console
<img width="1918" height="988" alt="Screenshot 2026-06-10 200115" src="https://github.com/user-attachments/assets/e7a4d2d2-1b61-42ba-a900-e8dfecc38814" />

# Date Picker
<img width="1544" height="506" alt="Screenshot 2026-06-10 200440" src="https://github.com/user-attachments/assets/775b0c02-d2e7-4725-b636-f610b20b04ce" />
<img width="1899" height="979" alt="Screenshot 2026-06-10 200340" src="https://github.com/user-attachments/assets/49b07e79-d144-4973-9512-d74d5ab90b50" />

# Multiple File Upload
<img width="1897" height="947" alt="Screenshot 2026-06-10 200650" src="https://github.com/user-attachments/assets/c452fd97-c6d7-4d80-aafb-d8dadac96d65" />
<img width="1542" height="460" alt="Screenshot 2026-06-10 200619" src="https://github.com/user-attachments/assets/6b21a4cc-3b42-486a-9569-0ebfd33e76a1" />

# AutomationSuite Test Execution Summary
<img width="1536" height="497" alt="Screenshot 2026-06-10 201411" src="https://github.com/user-attachments/assets/ad301bee-ee34-412c-9c30-3e0d88f4a4e4" />

# Test Suite Organization

```text
Your 20 Automation Tests

├── Smoke Suite (Critical Tests)
│
│   ├── NavigationTest          → Verify application accessibility
│   ├── FormTest                → Validate form submission
│   ├── AlertTest               → Verify alert and popup handling
│   ├── DropDownTest            → Validate dropdown functionality
│   └── LabelsAndLinksTest      → Verify links and navigation
│
└── Regression Suite (Complete Coverage)
    │
    ├── Smoke Suite Tests
    ├── MouseHoverTest          → Mouse interactions
    ├── DoubleClickTest         → Double-click actions
    ├── DragDropTest            → Drag and drop operations
    ├── SliderTest              → Slider functionality
    ├── TabsTest                → Tab navigation
    ├── TableTest               → Web table validation
    ├── PaginationWebTableTest  → Paginated table handling
    ├── DatePickerTest          → Date selection
    ├── UploadTest              → File upload validation
    ├── DownloadFilesTest       → File download verification
    ├── HiddenAjaxTest          → AJAX element handling
    ├── DynamicButtonTest       → Dynamic element validation
    ├── ShadowDomTest           → Shadow DOM interaction
    ├── SvgTest                 → SVG element automation
    └── FooterTest              → Footer links verification
```

# CI/CD Workflow

```text id="0if0zm"
GitHub Push
      ↓
Jenkins Pipeline
      ↓
Source Code Checkout
      ↓
Maven Build
      ↓
TestNG Test Execution
      ↓
Extent Report Generation
      ↓
TestNG Report Publishing
      ↓
Artifact Archiving
      ↓
Build Status
```
# Extent Report
<img width="1918" height="906" alt="Screenshot 2026-06-10 204656" src="https://github.com/user-attachments/assets/6786c529-376a-4d6d-95a3-37774aba31a1" />

# Author

## Shaurya Chattopadhyay

### Automation Concepts Used

* Selenium WebDriver for Web UI Automation
* TestNG for Test Execution and Reporting
* Page Object Model (POM) for Maintainable Test Design
* Data-Driven Testing using Apache POI and Excel
* Jenkins CI/CD for Automated Build and Test Execution
* Extent Reports and Log4j2 for Reporting and Logging



