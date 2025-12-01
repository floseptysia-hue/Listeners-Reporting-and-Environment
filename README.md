# Automation Testing Project – TestNG, Log4j, Listener, and Reporting

Project ini dibuat sebagai bagian dari assignment untuk membangun automation test menggunakan Java, TestNG, dan Gradle, serta mengimplementasikan:

- Log4j untuk logging
- TestNG Listener
- Reporting
- Data Driven Testing
- Test Runner

## Project Overview
Project ini berisi test automation yang dapat dijalankan menggunakan TestNG. Fokus utama dari assignment ini adalah:

1. Menambahkan dependency Log4j pada build.gradle.kts
2. Mengimplementasikan Test Runner
3. Menerapkan Data-Driven Testing
4. Menggunakan TestNG Listener
5. Menghasilkan report automation

Project Structure
-----------------

project-name/
│
├── .idea/
├── gradle/
│   └── wrapper/
├── logs/
├── src/
│   ├── main/
│   │   └── java/
│   └── test/
│       └── java/
│
├── test-output/
├── build.gradle.kts
├── settings.gradle.kts
└── .gitignore


## Tech Stack
- Java  
- Gradle  
- TestNG  
- Log4j  
- TestNG Listener  
- Data Provider (TestNG Data Driven)  
- Reporting (TestNG Default Report atau Extent Report)

## Features

### 1. Logging (Log4j)
- Dependency Log4j ditambahkan pada build.gradle.kts
- Semua log tersimpan otomatis pada folder `/logs`

### 2. Test Runner
- Menggunakan TestNG XML atau TestNG runner class

### 3. Test Listener
Listener digunakan untuk:
- Mencatat event test (start, passed, failed)
- Screenshot otomatis ketika test gagal (jika diimplementasikan)

### 4. Reporting
Report otomatis dihasilkan setelah test dijalankan pada folder:

test-output/
├── index.html
├── emailable-report.html


### 5. Data-Driven Testing
- Menggunakan anotasi `@DataProvider` pada TestNG

## How to Run

### 1. Clone repository

### 2. Jalankan test via Gradle
./gradlew test

### 3. Jalankan test via TestNG XML
Jika memiliki file testng.xml:
- Klik kanan → Run 'testng.xml'

## Assignment Checklist
- [x] Menambahkan dependency Log4j
- [x] Implementasi Listener
- [x] Data-driven testing
- [x] Reporting
- [x] Project dapat dijalankan dengan baik

## Author
flo
