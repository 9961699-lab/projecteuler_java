public class Problem1 {
    public static void main(String[] args) {
        int add = 0;
        for (int i = 1; i < 1000; i++) {
            System.out.println(i);
            if (i % 3 == 0) {
                System.out.println("divisible by 3");
                add = add + i;
            }
            if (i % 5== 0) {
                System.out.println("divisible by 5");
                add = add + i;
            }
            System.out.println("sum: "+add);
        }
    }
}