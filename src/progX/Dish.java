package progX;

/**
 * Created by TJ Challstrom on 01-Jul-15.
 * Dish Object, has food on it.
 */
public class Dish {
    private String plating; //What type of dish is it? e.g. bowl
    private String name;
    private char rating; //What's its letter grade? A-F descending
    private Food food; //What's on the plate?
    private double price;

    public Dish() {
    }

    public Dish(String plating, String name, char rating, double price) {

        this.plating = plating;
        this.name = name;
        this.rating = rating;
        this.price = price;
    }

    public Dish(String plating, String name, char rating, double price, Food food) {

        this.plating = plating;
        this.name = name;
        this.rating = rating;
        this.price = price;
        this.food = food;
    }

    public String getPlating() {
        return plating;
    }

    public void setPlating(String plating) {
        this.plating = plating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getRating() {
        return rating;
    }

    public void setRating(char rating) {
        this.rating = rating;
    }

    public Food getFood() {
        return food;
    }

    public void setFood(Food food) {
        this.food = food;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "plating='" + plating + '\'' +
                ", name='" + name + '\'' +
                ", rating=" + rating +
                ", food=" + food +
                ", price=" + price +
                '}';
    }

    public void washDish() {
        this.name = "";
        this.rating = 'N';
        this.price = 0;
        this.food = null;
    }
}
