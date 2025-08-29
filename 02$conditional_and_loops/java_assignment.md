# Java Programming - Assignment (Graded)

---

## Question 1 (1 point)
**What does the following program print?**

```java
public static void main(String[] args) {
    int a = 2;
    int b = 3;
    int c = 4;
    if (a < b) {
        if (b < c) {
            if (c < a) System.out.println(a + " " + b + " " + c);
            else System.out.println(c + " " + b + " " + a);
        } else System.out.println(a + " " + c + " " + b);
    } else System.out.println(b + " " + a + " " + c);
}
```

### Execution:
- `a = 2, b = 3, c = 4`
- `a < b` → true
- `b < c` → true
- `c < a` → false → executes `else` → prints `c b a`

**Correct Answer:** `432` ✅  
**Points:** 1 / 1  

---

## Question 2 (1 point)
**Which of the following will lead to a compile-time error?**

Options:  
1. `if (a > b) { c = 0; }` → Valid ✅  
2. `if a > b { c = 0; }` → Compile error ❌ (missing parentheses)  
3. `if a > b, then c = 0;` → Compile error ❌ (invalid syntax)  
4. `if (a > b) (c = 0;)` → Compile error ❌ (invalid parentheses)  
5. `if (a > b) c = 0 else b = 0;` → Compile error ❌ (bad else placement)  
6. `if (a > b) then c = 0;` → Compile error ❌ (`then` not allowed)  
7. `if (a > b) c = 0;` → Valid ✅  

**Correct Selections:** 2, 3, 4, 5, 6  
**Points:** 1 / 1  

---

## Question 3 (1 point)
**Which of the following errors will be detected at compile time?**

- ✅ Missing semicolon at the end of a statement  
- ✅ Missing left curly brace  
- ❌ Missing curly braces in `while` → runtime infinite loop, not compile error  
- ❌ Division by a variable that might be zero → runtime error  
- ✅ Forgetting to declare the type of a variable  
- ✅ Trying to subtract two strings  

**Correct Answers:** 1, 2, 5, 6  
**Points:** 1 / 1  

---

## Question 4 (1 point)
**What is the value of `m` after executing the following code?**

```java
int n = 123456789;
int m = 0;
while (n != 0) {
    m = (10 * m) + (n % 10);
    n = n / 10;
}
```

- This code reverses the digits of `n`.  
- Final value of `m = 987654321`  

**Correct Answer:** `987654321` ✅  
**Points:** 1 / 1  

---

## Question 5 (1 point)
**What is the value of `j` after executing the following statement?**

```java
for (i = 0, j = 0; i < 10; i++) 
    j += i;
```

- Loop adds numbers from 0 → 9  
- `j = 0 + 1 + 2 + ... + 9 = 45`  

**Correct Answer:** `45` ✅  
**Points:** 1 / 1  

---

# 🎯 Final Score: **5 / 5**
Excellent work! All corrected answers are now accurate. ✅
