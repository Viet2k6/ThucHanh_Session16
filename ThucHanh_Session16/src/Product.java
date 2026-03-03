public abstract class Product {
    protected String id;
    protected String name;
    protected double price;
    public Product(String id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public abstract double calculateFinalPrice();
    public void displayInfo(){
        System.out.println("ID: " + id + " | Name: " + name + " | Price: " + price );
    }
}
