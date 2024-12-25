# Maven Multi-Module Demo with Unit Tests, Integration Tests, Cucumber, and JaCoCo

Welcome to the **Maven Multi-Module Demo** project! This repository demonstrates how to configure a Maven multi-module project to handle different types of testing and integrate code coverage results with [JaCoCo](https://www.jacoco.org/) and [SonarQube](https://www.sonarqube.org/).

---

## Project Structure

This project consists of multiple Maven modules designed to showcase:

- **Unit Tests:** Basic tests targeting individual components or methods.
- **Integration Tests:** Tests that verify how multiple components work together.
- **Cucumber Tests:** Behavior-driven development (BDD) tests using [Cucumber](https://cucumber.io/).
- **Code Coverage with JaCoCo:** Aggregating coverage reports for all test types.
- **Sonar Integration:** Pushing combined coverage results to [SonarCloud](https://sonarcloud.io/) or a local SonarQube server.

---

## Features

- **Multi-Module Maven Setup:** Modular design to separate concerns and demonstrate real-world scenarios.
- **Test Types:**
  - Unit Tests: Fast, isolated tests for individual units of code.
  - Integration Tests: Verify system-level interactions.
  - Cucumber Tests: Human-readable scenarios for functional testing.
- **JaCoCo Integration:** 
  - Generate code coverage reports.
  - Aggregate coverage data across different test types.
- **Sonar Integration:** Analyze code quality and coverage.

---

## Prerequisites

Before running the project, ensure you have the following installed:

1. **Java JDK 21+**
2. **Maven 3.6+**
3. **SonarQube or SonarCloud Account** (if pushing results to Sonar)

---

## How to Run the Project

### Step 1: Clone the Repository

```bash
git clone https://github.com/DanieleNinicato/maven-multi-module-unittest-integrationtest-cucumber-jacoco.git
cd maven-multi-module-unittest-integrationtest-cucumber-jacoco
