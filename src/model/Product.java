package model;

public class Product implements Comparable<Product>{
    private static int CountId = 1;
    private int id;
    private String name;
    private int quantity;
    private double price;
    private String content;

    public Product() {
        this.id = CountId ++;
    }

    public Product(String name, int quantity, double price, String content) {
        this.id = CountId ++;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.content = content;
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

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public int compareTo(Product o) {
        // nếu > 0  thi 2 đối tượng sẽ hoán đổi
        // nếu <= 0  thi 2 đối tượng sẽ giữ nguyên
        if (this.price - o.price == 0){
            return this.quantity - o.quantity;
        }
        return (int) (this.price - o.price);
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                ", content='" + content + '\'' +
                '}';
    }
}
