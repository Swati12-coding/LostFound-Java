# Campus Lost & Found Matcher

## 1. Project Title

**Campus Lost & Found Matcher**

## 2. Project Overview

Campus Lost & Found Matcher is a Java command-line application designed to help students manage lost and found items within a campus.

The system allows users to report items, search records, identify possible matches, and process item returns using a matching confidence score.

## 3. Functional Modules

The project includes the following major modules:

1. **Item Management** – Report and view lost/found items.
2. **Search & Matching** – Search records and find possible matches.
3. **Claim & Reporting** – Process claims, mark returned items, and generate system reports.

## 4. Features

* Report lost items
* Report found items
* View active lost/found records
* Search items
* Match lost and found items
* Calculate match confidence
* Claim and return items
* Generate system report
* Store records in a local file

## 5. Technologies Used

* **Language:** Java
* **Interface:** Command Line Interface (CLI)
* **Data Structure:** ArrayList
* **Storage:** Text File
* **Version Control:** Git / GitHub
* **Java Version:** Java 8 or later

## 6. Java Concepts Used

The project applies:

* Classes and Objects
* Constructors
* Encapsulation
* Abstraction
* Inheritance
* Polymorphism
* Method Overriding
* `instanceof`
* Nested Classes
* Exception Handling
* Custom Exceptions
* ArrayList
* File I/O
* Lambda Expressions

These concepts align with the Java OOP topics covered in the course syllabus.

## 7. Non-Functional Requirements

* **Usability:** Simple menu-driven command-line interface.
* **Reliability:** Invalid inputs are handled using validation and exception handling.
* **Maintainability:** Functions are separated according to their responsibilities.
* **Resource Efficiency:** Uses lightweight in-memory collections and local file storage.

## 8. Project Structure

```text
Campus-Lost-Found-Matcher/
├── Item.java
├── LostFoundManager.java
├── Main.java
├── MatchEngine.java
├── ReportGenerator.java
├── README.md
└── statement.md
```

`items.txt` is created automatically when data is saved.

## 9. Requirements

* Java Development Kit (JDK) 8 or later
* Command-line terminal
* Git (for repository management)

## 10. Installation & Running

Clone the repository:

```bash
git clone https://github.com/Swati12-coding/LostFound-Java.git
```

## 11. Testing

The application can be tested manually through the command-line menu.

Test the following operations:

* Add a lost item
* Add a found item
* View records
* Search using keywords
* Find possible matches
* Process a valid claim
* Try invalid item IDs
* Try empty input
* Generate the system report

## 12. Matching Logic

The system calculates a score out of 100 using:

| Attribute   | Points |
| ----------- | -----: |
| Category    |     25 |
| Location    |     30 |
| Date        |     20 |
| Item Name   |     10 |
| Description |     15 |

A score of **40% or above** is displayed as a possible match.

## 13. Future Scope

* Database integration
* User authentication
* Graphical/Web interface
* Notifications
* Image-based matching
* Improved AI/ML-based matching

## 14. Conclusion

The project provides a simple solution for managing campus lost and found records while demonstrating practical Java OOP concepts, file handling, collections, validation, exception handling, and basic matching logic.
