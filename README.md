# ThreadDemo
# Java Thread Creation and Methods Demo

This Java program demonstrates the creation of threads and explores various methods and features associated with thread management. It covers thread creation, setting thread names, starting and joining threads, checking thread status, and managing thread priorities.

## Overview

Java provides robust support for multi-threaded programming, allowing developers to create concurrent tasks that run independently. Threads in Java can be created by extending the `Thread` class or implementing the `Runnable` interface. This program uses the latter approach, creating threads with lambda expressions for simplicity and readability.

## Features Demonstrated

1. **Thread Creation:** The program creates a new thread using a lambda expression, defining the thread's behavior inline.
2. **Thread Naming:** Each thread is given a meaningful name using the `setName` method for easy identification.
3. **Starting and Joining Threads:** Threads are started using the `start` method, and the `join` method is used to wait for a thread to complete its execution.
4. **Checking Thread Status:** The `isAlive` method is used to check if a thread is currently running.
5. **Managing Thread Priority:** The program showcases how to get and set thread priorities using the `getPriority` and `setPriority` methods.

## How to Run

1. Ensure you have Java Development Kit (JDK) installed on your system.
2. Clone this repository or download the `ThreadDemo.java` file.
3. Open a terminal or command prompt and navigate to the directory containing `ThreadDemo.java`.
4. Compile the program using the command:
5. Run the compiled program using the command:



## Program Explanation

- The program creates a thread named "MyThread1" using a lambda expression to define its behavior.
- After starting the thread, it checks if it is alive and then waits for it to complete using the `join` method.
- Thread priorities are showcased by getting and setting the priority of the thread, demonstrating the impact on execution order.

## Additional Resources

- [Java Thread Documentation](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/Thread.html): Official documentation for Java threads.
- [Java Multithreading Guide](https://www.baeldung.com/java-multithreading): A comprehensive guide to Java multithreading concepts and practices.

