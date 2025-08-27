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