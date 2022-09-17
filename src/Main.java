public class Main {
    public static void main(String[] args) {
        int[]arr = {1, 20, 50, 70};
        SalesManager salesManager = new SalesManager(arr);
        int max = salesManager.max();

        System.out.println(max);
    }
}