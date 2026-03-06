package Main.Test;

public class Product {
    int id;
    String name;
    String thumbnail;
    double price;
    int qty;
    String description;

    public Product() {

    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void displayInfo() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Thumbnail: " + thumbnail);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + qty);
        System.out.println("Description: " + description);
    }

    public boolean checkAvailability(Integer orderQty) {
        return orderQty > 0 && orderQty <= qty;
    }

    public Double placeOrder(Integer orderQty) {
        if (checkAvailability(orderQty)) {
            qty = qty - orderQty;
            return orderQty * price;
        } else {
            return 0.0;
        }
    }

}
