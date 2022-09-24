public class Main {
    public static void main(String[] args) {
        long[]arr = {1, 20, 50, 70};
        SalesManager salesManager = new SalesManager(arr);
        long max = salesManager.max();

        System.out.println(max);
        System.out.println(salesManager.getAverageSale());
    }
}