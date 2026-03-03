import java.util.*;

public class Main{
    public static void main(String[] args) {
        ProductRepository repo = new ProductRepository();
        repo.add(new ElectronicProduct("01", "MacBook", 20000000.0, 24));
        repo.add(new ElectronicProduct("02", "Laptop Dell", 15000000.0, 12));
        repo.add(new FoodProduct("03", "Kem", 12000.0,10));
        repo.add(new FoodProduct("03", "Bánh quy", 10000.0,6));

        System.out.println("--- Danh sách sản phẩm---");
        for (Product p : repo.findAll()) {
            p.displayInfo();
            System.out.println("Thành tiền: " + p.calculateFinalPrice());
            System.out.println("--------------------");
        }

    }
}