public class Product implements Comparable<Product>{
    private String description;
    private float price;

    public Product(String description, float price) {
        this.description = description;
        this.price = price;
    }
    
    public String getDescription() {
        return description;
    }

    public float getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Descrição da compra: " + this.description + " - Valor: " + this.price;
    }

    @Override
    public int compareTo(Product otherProduct) {
        return Float.valueOf(this.price).compareTo(Float.valueOf(otherProduct.price));

        //  if (this.price < otherProduct.price) {
        //      return -1;
        //  }
        //  if (this.price > otherProduct.price) {
        //      return 1;
        //  }
        //  else {
        //      return 0;
        //  }
        
    }
}
