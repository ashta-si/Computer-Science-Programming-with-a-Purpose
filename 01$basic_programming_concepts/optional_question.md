Nice 👍 You’re working on enrichment exercises from **Sedgewick & Wayne – Computer Science: An Interdisciplinary Approach**.
I’ll give you **step-by-step explanations and correct Java code** using only features introduced so far (no loops, no `if` statements, just `Math` functions and simple expressions).

---

## **1.2.30 – Uniform random numbers**

👉 Requirements:

* Generate **five uniform random numbers between 0 and 1** using `Math.random()`.
* Print them.
* Print **average, min, max** using `Math.min()` and `Math.max()`.
* No loops allowed → so just explicitly compute with five variables.

### Code:

```java
public class RandomStats {
    public static void main(String[] args) {
        double a = Math.random();
        double b = Math.random();
        double c = Math.random();
        double d = Math.random();
        double e = Math.random();

        double average = (a + b + c + d + e) / 5.0;

        double min1 = Math.min(a, b);
        double min2 = Math.min(c, d);
        double min3 = Math.min(min1, min2);
        double min  = Math.min(min3, e);

        double max1 = Math.max(a, b);
        double max2 = Math.max(c, d);
        double max3 = Math.max(max1, max2);
        double max  = Math.max(max3, e);

        System.out.println("Numbers: " + a + " " + b + " " + c + " " + d + " " + e);
        System.out.println("Average = " + average);
        System.out.println("Min = " + min);
        System.out.println("Max = " + max);
    }
}
```

✅ Uses only `Math.random()`, `Math.min()`, `Math.max()`. No loops.

---

## **1.2.34 – Three-sort**

👉 Requirements:

* Take **three integer command-line arguments**.
* Print them in **ascending order**.
* No conditionals → just use `Math.min()` and `Math.max()`.

### Idea:

* Smallest = `Math.min(x, Math.min(y, z))`
* Largest = `Math.max(x, Math.max(y, z))`
* Middle = `(x + y + z) - smallest - largest`

### Code:

```java
public class ThreeSort {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        int z = Integer.parseInt(args[2]);

        int smallest = Math.min(x, Math.min(y, z));
        int largest  = Math.max(x, Math.max(y, z));
        int middle   = (x + y + z) - smallest - largest;

        System.out.println(smallest + " " + middle + " " + largest);
    }
}
```

✅ Works for any three integers, prints them sorted in ascending order.

---

👉 Do you want me to also make a **Markdown assignment version** (like your earlier quiz) with the **exercise statement + code + output example** neatly formatted, so you can keep all exercises organized?
