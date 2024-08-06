
# FinancialDataProcessor

The `FinancialDataProcessor` project is a Java application that processes financial data from CSV files. The main goal is to clean and organize financial data for further analysis. This project also includes examples of integration with Power BI for data visualization.

## Table of Contents

- [Overview](#overview)
- [Requirements](#requirements)
- [Installation](#installation)
- [Usage](#usage)
- [Contributing](#contributing)
- [License](#license)

## Overview

This project reads a CSV file containing financial data and performs data cleaning. The cleaned data is then saved into a new CSV file, which can be used for analysis and visualization, such as in Power BI.

## Requirements

- JDK 22 or higher
- Maven (optional, if you are using Maven to manage dependencies)
- Apache Commons CSV library (for CSV processing)

## Installation

1. **Clone the repository:**

   ```bash
   git clone https://github.com/karinamigotto/FinancialDataProcessor.git
   ```

2. **Navigate to the project directory:**

   ```bash
   cd FinancialDataProcessor
   ```

3. **Compile the project (if you are using Maven):**

   ```bash
   mvn compile
   ```

4. **Make sure you have the Apache Commons CSV library added to your project. If using Maven, add the following dependency to your `pom.xml`:**

   ```xml
   <dependency>
       <groupId>org.apache.commons</groupId>
       <artifactId>commons-csv</artifactId>
       <version>1.10.0</version>
   </dependency>
   ```

## Usage

1. **Place the CSV file with financial data in the project’s input directory.**

2. **Run the program:**

   ```bash
   java -cp target/classes;path/to/commons-csv-1.10.0.jar FinancialDataProcessor
   ```

   Replace `path/to/commons-csv-1.10.0.jar` with the path to the Apache Commons CSV JAR file.

3. **The program will process the CSV file and create a new file with cleaned data.**

## Contributing

If you want to contribute to the project, please follow these steps:

1. **Fork the repository.**
2. **Create a new branch for your changes:**

   ```bash
   git checkout -b my-new-feature
   ```

3. **Commit your changes:**

   ```bash
   git add .
   git commit -m "Description of changes"
   ```

4. **Push to the branch:**

   ```bash
   git push origin my-new-feature
   ```

5. **Open a pull request on GitHub.**

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

---

Feel free to customize the details as needed for your project. If you need any further adjustments or additional information, let me know!
