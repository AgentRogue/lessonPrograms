package progX;

/**
 * Created by TJ Challstrom on 06-Jul-15.
 * Food yum!
 */
public class Food {
    private String size;
    private double price;
    private int quality;

    public Food(){}

    public Food(double price) {
        this.price = price;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }

    @Override
    public String toString() {
        return "Food{" +
                "size='" + size + '\'' +
                ", price=" + price +
                ", quality=" + quality +
                '}';
    }
}
