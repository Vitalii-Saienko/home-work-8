class Product {
    /*
    Свойства:
- Наименование (String name)
- Стандартная цена (double regularPrice)
- Скидка в процентах (double discount)

Методы:
1. Расчет актуальной стоимости с учетом скидки (double actualPrice())
Вывод информации о продукте в консоль (void printInformation())1P
2. Название продукта нужно задавать через конструктор, а стоимость и скидку через оператор ".".
     */
    String name;
    double regularPrice;
    double discount;

    public Product(String name) {
        this.name = name;
    }
    public String calculatePriceWithDiscount() {
        double priceWithDiscount = regularPrice * discount;
        String priceWithDiscountToPrint = String.format("%.2f", regularPrice * (1-discount));
        return priceWithDiscountToPrint;
    }
    public void productInfo(){
        System.out.println("Product: "+name+"\nStandard price: "+regularPrice+"\nDiscount: "+discount+"\nPrice with" +
                " discount: "+calculatePriceWithDiscount());
    }
}
