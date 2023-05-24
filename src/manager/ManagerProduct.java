package manager;

import model.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ManagerProduct {
    List<Product> products = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void add() {
        Product product = create();
        products.add(product);
    }

    public void edit(int index) {
        Product product = create();
        product.setId(products.get(index).getId());
        products.set(index, product);
    }

    public void delete(int index) {
        products.remove(index);
    }

    public Product create() {
        System.out.println("Nhập name");
        String name = scanner.nextLine();
        System.out.println("Nhập so lượng");
        int quantity = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập price");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập nội dung");
        String content = scanner.nextLine();
        return new Product(name, quantity, price, content);
    }

    public int findIndexByName(String name) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public void sortByPrice() {
        Collections.sort(products);
    }


    public double findPriceMax() {
        double max = 0;
        for (Product p : products) {
            if (p.getPrice() > max) {
                max = p.getPrice();
            }
        }
        return max;
    }

    public void showALlPriceMax() {
        double max = findPriceMax();
        for (Product p : products) {
            if (p.getPrice() == max) {
                System.out.println(p);
            }
        }
    }

    public void showALl() {
        for (Product p : products) {
            System.out.println(p);
        }
    }


}
