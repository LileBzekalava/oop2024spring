package quizes.q2.lile_bzekalava_1.router;

public class CoffeeShop {

    public static void main(String[] args) {
        int pricePerCoffee = 250; // tetri
        int numCoffeeSold = 100;
        int totalCostOfBeans = 15000; // tetri
        int otherExpenses = calculateOtherExpenses(); // Calculating other expenses

        double profit = calculateProfit(pricePerCoffee, numCoffeeSold, totalCostOfBeans, otherExpenses);
        System.out.println("Profit: " + profit + " Lari");
    }

    public static int calculateOtherExpenses() {
        int tax = 32; // lari
        int water = 95; // tetri
        int gas = 112; // tetri
        int electricity = 54; // lari
        int parking = 99; // lari

        // Convert tetri to lari
        double totalOtherExpenses = (water + gas) / 100.0 + (electricity + parking) / 100.0 + tax;
        return (int) totalOtherExpenses;
    }

    public static double calculateProfit(int pricePerCoffee, int numCoffeeSold, int totalCostOfBeans, int otherExpenses) {
        int totalIncome = pricePerCoffee * numCoffeeSold;
        int totalExpenses = totalCostOfBeans + otherExpenses;
        double profitInTetri = totalIncome - totalExpenses;
        double profitInLaris = profitInTetri / 100.0;
        return profitInLaris;
    }
}
