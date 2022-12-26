class Computer {
    String manufacturer;
    String model;

    Computer(String manufacturer, String model) {
        this.manufacturer = manufacturer;
        this.model = model;
    }

    public String getManufacturer() {
        this.manufacturer = manufacturer;
        return manufacturer;
    }

    public String getModel() {
        this.model = model;
        return model;
    }
}
