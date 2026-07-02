# Exercise 7 Analysis

## 1. What is Recursion?

Recursion is a programming technique in which a method calls itself to solve a problem by breaking it into smaller subproblems. Every recursive solution consists of:

* **Base Case:** Stops the recursion.
* **Recursive Case:** Calls the same method with a smaller input.

Recursion simplifies problems that naturally have repeated substructures, such as tree traversal, divide-and-conquer algorithms, factorial computation, Fibonacci numbers, and financial forecasting.

---

## 2. Financial Forecasting Using Recursion

Suppose an investment grows at a fixed annual rate.

Future Value Formula:

Future Value = Present Value × (1 + Growth Rate)^Years

Instead of using exponentiation directly, recursion multiplies the current value by the growth factor once per year until all years have been processed.

---

## 3. Recursive Algorithm

Base Case:

* If the number of years is 0, return the current value.

Recursive Case:

* Multiply the current value by (1 + growthRate).
* Decrease the number of remaining years by one.
* Call the method recursively.

---

## 4. Time Complexity

### Recursive Solution

Each recursive call processes one year.

**Time Complexity:** O(n)

where **n** is the number of years.

**Space Complexity:** O(n)

because each recursive call occupies one stack frame.

---

## 5. Optimization

The recursive approach is simple but creates one stack frame for every recursive call.

Possible optimizations include:

* Using an iterative loop to reduce space complexity to **O(1)**.
* Using the mathematical formula:

Future Value = Present Value × (1 + Growth Rate)^Years

This computes the result directly using exponentiation.

* Applying memoization for recursive problems with overlapping subproblems. Although this forecasting problem does not require memoization, it is useful for recursive algorithms such as Fibonacci or dynamic programming.

---

## 6. Conclusion

Recursion provides an elegant way to model repeated annual growth and is easy to understand. However, for very large numbers of years, an iterative approach or the direct mathematical formula is more efficient because it avoids deep recursion and excessive stack usage.
