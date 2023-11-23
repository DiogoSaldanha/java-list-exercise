import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Credit {
    private float limit;
    private float balance;
    private List<Product> purchases;

    public Credit(float limit) {
        this.limit = limit;
        balance = this.limit;
        this.purchases = new ArrayList<>();
    }

    public float getLimit() {
        return limit;
    }

    public float getBalance() {
        return balance;
    }    

    public List<Product> getPurchases() {
        return purchases;
    }

    public boolean buyProduct(Product product) {
        if (product.getPrice() <= this.balance) {
            this.purchases.add(product);
            this.balance -= product.getPrice();
            return true;
        } else {
            return false;
        }
    }

    public void menu(){
        int i = 0;
        Collections.sort(this.purchases);
        System.out.println("\nCOMPRAS REALIZADAS: ");
        while (i < this.purchases.size()){
            System.out.println(this.purchases.get(i).toString());
            i++;
        }
        System.out.println("Saldo restante: " + this.getBalance());
    }
}
