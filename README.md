# Gradle App Setup

## Table of Contents

- [Introduction](#introduction)
- [Setting Up a Gradle Java Application](#setting-up-a-gradle-java-application)
- [Build, Run, Test, and Install Commands](#build-run-test-and-install-commands)
- [Problem Solving Explanation](#problem-solving-explanation)
  - [Understanding the Problem](#understanding-the-problem)
  - [Coding](#coding)
  - [Verification](#verification)
- [Conclusion](#conclusion)
- [Additional Resources](#additional-resources)

## Introduction

This document explains how to create a Java application using Gradle as well as outlines approaches to effective problem solving. The README covers project setup, common commands for execution, testing and installation, and key considerations when solving coding challenges.

| **Topic**                       | **Exercises / Problems**                                                                                   |
| ------------------------------- | ---------------------------------------------------------------------------------------------------------- |
| **Topic 1: Arrays & Strings**   | ● A Very Big Sum (Warm-up, learning how to use HackerRank) <br> ● Designer PDF Viewer <br> ● Left Rotation |
| **Topic 2: Lists**              | ● Insert a Node at a Position Given in a List <br> ● Cycle Detection                                       |
| **Topic 3: Lists**              | ● Balanced Brackets <br> ● Queue Using Two Stacks                                                          |
| **Topic 4: Sorting Algorithms** | ● Insertion Sort part 2 <br> ● Quicksort part 2                                                            |

## Setting Up a Gradle Java Application

### Prerequisites

- **Java Development Kit (JDK):** Ensure that you have Java installed by running `java -version` in your terminal.
- **Gradle:** Install Gradle from [the official website](https://gradle.org/).

### Initializing the Project

1. **Open the Terminal:** Navigate to your desired directory.
2. **Run the Gradle Init Command:**
   ```bash
   gradle init --type java-application
   ```
   This command creates a new project with the necessary directories and configuration files.

### Project Structure Overview

- **`src/main/java`:** Contains your main Java source code.
- **`src/test/java`:** Contains your test cases.
- **`build.gradle` or `build.gradle.kts`:** The Gradle build configuration file.

## Build, Run, Test, and Install Commands

After setting up your project, you can use the following commands:

- **Build the Project:**

  ```bash
  gradle build
  ```

  This command compiles your code and runs your tests.

- **Run the Application:**

  ```bash
  gradle run
  ```

  This command executes the main class specified in your Gradle configuration.

- **Execute Tests:**

  ```bash
  gradle test
  ```

- **Execute Spotless (Prettier):**

  ```
  ./gradlew :app:spotlessApply
  ```

## Problem Solving Explanation

### Understanding the Problem

- **Decomposition:** Break down complex problems into smaller, manageable parts.
- **Comparing Solutions:** Explore multiple approaches and analyze their trade-offs in terms of clarity, performance, and maintainability.
- **Data Structures:** Choose data structures that suit the problem requirements while optimizing space and time complexity.

### Coding

- **Executable Code:** Convert your algorithm into well-organized, executable code that mirrors the thought process behind your solution.
- **Organization:** Use classes and methods to maintain a logical structure that helps in understanding and maintaining the code.

### Verification

- **Test Cases:** Develop a comprehensive set of test cases to cover normal, edge, and error scenarios.
- **Correctness:** Walk through your code logic to ensure its correctness and explain why your solution works.
- **Debugging:** If your solution has bugs, use systematic debugging techniques to locate, understand, and fix them.

## Additional Resources

- [Gradle Documentation](https://docs.gradle.org/current/userguide/userguide.html)
- [Effective Java](https://www.pearson.com/us/higher-education/program/Bloch-Effective-Java-3rd-Edition/PGM310872.html)
- [Pinterest Challenges](https://github.com/lolapriego/coursework)
