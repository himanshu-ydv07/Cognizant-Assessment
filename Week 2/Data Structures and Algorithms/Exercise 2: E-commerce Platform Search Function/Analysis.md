# Exercise 2 Analysis

## 1. Big O Notation

Big O notation is used to measure the efficiency of an algorithm by describing how its running time grows as the input size increases.

Examples:

- O(1) → Constant Time
- O(log n) → Logarithmic Time
- O(n) → Linear Time
- O(n log n) → Linearithmic Time
- O(n²) → Quadratic Time

Big O helps developers compare algorithms independent of hardware performance.

---

## 2. Search Cases

### Best Case

The desired element is found immediately.

Example:
Searching first element in Linear Search.

### Average Case

The desired element is found somewhere in the middle.

### Worst Case

The desired element is last or absent.

---

## 3. Linear Search

Time Complexity

Best Case:
O(1)

Average Case:
O(n)

Worst Case:
O(n)

Space Complexity:
O(1)

---

## 4. Binary Search

Requirements

- Array must be sorted.

Time Complexity

Best Case:
O(1)

Average Case:
O(log n)

Worst Case:
O(log n)

Space Complexity:
O(1)

---

## 5. Comparison

| Feature | Linear Search | Binary Search |
|----------|--------------|--------------|
| Sorted Data Required | No | Yes |
| Best Case | O(1) | O(1) |
| Average Case | O(n) | O(log n) |
| Worst Case | O(n) | O(log n) |
| Easy Implementation | Yes | Moderate |
| Suitable for Large Data | No | Yes |

---

## 6. Conclusion

For an e-commerce platform containing thousands or millions of products, Binary Search is significantly more efficient because it reduces the search space by half in every iteration.

Although maintaining sorted data has some overhead, Binary Search provides much faster lookup performance, making it the preferred choice for product search systems.
