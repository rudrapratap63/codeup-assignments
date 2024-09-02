# codeup-assignments

# Task 1: Expand Characters in a String

## Description
Given a string containing characters followed by digits, expand each character by repeating it according to the digit that follows.

## Examples

### Example 1
- **Input**: `"a1b4c3"`
- **Output**: `"abbbbccc"`
- **Explanation**:
  - The character 'a' is followed by 1, so it appears once.
  - The character 'b' is followed by 4, so it appears four times: `"bbbb"`.
  - The character 'c' is followed by 3, so it appears three times: `"ccc"`.
  - The final output is `"abbbbccc"`.

### Example 2
- **Input**: `"a1c2"`
- **Output**: `"acc"`
- **Explanation**:
  - The character 'a' is followed by 1, so it appears once.
  - The character 'c' is followed by 2, so it appears twice: `"cc"`.
  - The final output is `"acc"`.

## Constraints
- The string will only contain lowercase letters followed by digits.
- The input string length will be at most 100.