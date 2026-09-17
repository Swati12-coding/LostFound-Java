# Campus Lost & Found Matcher

## 1. Problem Statement

In a college campus, students frequently lose personal belongings such as ID cards, wallets, books, electronic devices, and other items. Found items may also remain unclaimed because there is no simple centralized system to connect them with their owners.

The **Campus Lost & Found Matcher** aims to provide a simple Java-based solution where students can report lost and found items, search existing records, and identify possible matches using item details such as name, category, location, date, and description.

## 2. Scope of the Project

The project focuses on managing lost and found items within a campus environment.

The system covers:

* Registration of lost items
* Registration of found items
* Viewing and searching item records
* Matching lost items with found items
* Calculating a matching confidence score
* Processing claims and returned items
* Generating a basic system report
* Storing records using local file storage

The project is implemented as a command-line Java application.

## 3. Target Users

The primary target users are:

* **Students** – to report lost belongings and search for found items.
* **Faculty/Staff** – to report items they find on campus.
* **Campus Administration** – to monitor records and returned items.

## 4. High-Level Features

1. **Lost Item Reporting**
   Users can register details of items they have lost.

2. **Found Item Reporting**
   Users can record items found on campus.

3. **Search & View**
   Users can view and search available records.

4. **Item Matching**
   The system compares lost and found item details and generates a matching score.

5. **Claim & Return**
   Users can process a claim when a suitable match is identified.

6. **System Report**
   The application provides a summary of lost, found, and returned records.

7. **Data Persistence**
   Item information is stored locally using a text file.
