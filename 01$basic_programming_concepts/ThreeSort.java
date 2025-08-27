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