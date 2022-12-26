class StockTests {
    public static void main(String[] args) {
        stockTest();

    }

    public static void stockTest() {
        Stock testStock = new Stock("testCompany", 999);
        testStock.updatePrice(150);
        testStock.updatePrice(1001);
        testStock.updatePrice(555);
        int expectedMaxPrice = 1001;
        int expectedMinPrice = 150;
        int expectedCurrentPrice = 555;
        if (testStock.maxPrice == expectedMaxPrice) {
            System.out.println("Test MAX is ok.");
        } else {
            System.out.println("Error in MAX");
        }
        if (testStock.minPrice == expectedMinPrice) {
            System.out.println("Test MIN is ok.");
        } else {
            System.out.println("Error in MIN");
        }
        if (testStock.currentPrice == expectedCurrentPrice) {
            System.out.println("Test CurrentPrice is ok.");
        } else {
            System.out.println("Error in CurrentPrice");
        }
    }
}