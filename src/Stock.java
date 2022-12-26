class Stock {
    String name;
    int currentPrice;
    int minPrice;
    int maxPrice;

    Stock(String name, int currentPrice) {
        this.name = name;
        this.currentPrice = currentPrice;
        this.minPrice = currentPrice;
        this.maxPrice = currentPrice;
    }

    public int updatePrice(int newCurrentPrice) {
        this.currentPrice = newCurrentPrice;
        if (newCurrentPrice>this.maxPrice){
            this.maxPrice = newCurrentPrice;
        }
        if (newCurrentPrice<this.minPrice){
            this.minPrice = newCurrentPrice;
        }
        return newCurrentPrice;
    }
    public void getPriceInformation(){
        System.out.println("Company - "+this.name+", current price - "+this.currentPrice+", min price - "+this.minPrice+
                ", max price - "+this.maxPrice+".");
    }
}
