## Recrusion-in-java 

Welcome to the **Java Recursion** repository! This repository contains a structured collection of fundamental programming exercises focused on mastering the recursive paradigm, understanding call-stack tracing, and tracking step parameters across execution frames in Java.

# Repository Core Principles
* **Base Case Formulation:** Every solution features explicit boundary checks to safely halt recursive frames and prevent stack overflow exceptions.
* **State Parameter Tracking:** Leverages method argument signatures to forward progressive computational state data (like running counters or accumulated sums) cleanly through consecutive stack layers.
* **Head vs. Tail Tracing:** Demonstrates the functional difference between operating before the recursive call (top-down / tail) versus executing after the resolution of deferred calls (bottom-up / head).

---

# Recursion Catalog

| File Name | Problem Description | Recursive Mechanics & Logic |
| :--- | :--- | :--- |
| `rec01.java` | Print Numbers $1$ to $N$ | **Head Recursion:** Postpones printing by calling `print(num - 1)` first. The console prints values bottom-up as the call stack unwinds from `0` back to `N`. |
| `rec02.java` | Print Numbers $1$ to $N$ (Forward Parameter) | **Tail Recursion:** Uses an explicit index tracker `i`. Prints the value first, then increments `print(num, i + 1)` until the base condition `i == num + 1` matches. |
| `rec03.java` | Print Decreasing Numbers $N$ to $1$ | **Tail Recursion:** Prints the current value `num` immediately at the top of the stack frame, then triggers a downward call `printnum(num - 1)` until reaching `0`. |
| `rec04.java` | Accumulate Sum of First $N$ Natural Numbers | **State Accumulation:** Forwards a tracking `sum` and `start` parameter through the stack. When `start == num` is achieved, it adds the final boundary element and prints the completed aggregate total. |

---

# How to Compile and Run

To run any of these files locally on your system using a standard command-line interface or terminal:

1. **Compile the Java Class Source File:**
   ```bash
   javac rec01.java
