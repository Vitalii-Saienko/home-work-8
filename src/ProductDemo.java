class ProductDemo {
    public static void main(String[] args) {
        Product product1 = new Product("Potato");
        product1.regularPrice = 25.99;
        product1.discount = 0.15;
        product1.calculatePriceWithDiscount();
        product1.productInfo();
    }
}
