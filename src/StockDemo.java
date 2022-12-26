class StockDemo {
    public static void main(String[] args) {
        Stock company1 = new Stock("Google", 250);
        company1.updatePrice(280);
        System.out.println(company1.currentPrice);
        System.out.println("------------------");
        company1.getPriceInformation();
        System.out.println("------------------");
        company1.updatePrice(100);
        company1.updatePrice(800);
        company1.updatePrice(555);
        company1.getPriceInformation();
    }
}
