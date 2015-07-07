package progX;

/**
 * Created by TJ Challstrom on 01-Jul-15.
 * Dish Object, Yum!
 */
public class Dish {
    public static String plating = "Bowl";
    private String name;
    private String taste;
    private int spicy;
    private char rating;
    private Food food;

    public Food getFood() {
        return food;
    }

    public void setFood(Food food) {
        this.food = food;
    }

    public Dish(String name, String taste, int spicy, char rating) {
        this.name = name;
        this.taste = taste;
        this.spicy = spicy;
        this.rating = rating;
    }

    public String getTaste() {
        return taste;
    }

    public int getSpicy() {
        return spicy;
    }

    public char getRating() {
        return rating;
    }


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    public void setSpicy(int spicy) {
        this.spicy = spicy;
    }

    public void setRating(char rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "name='" + name + '\'' +
                ", taste='" + taste + '\'' +
                ", spicy=" + spicy +
                ", rating=" + rating +
                ", food=" + food +
                '}';
    }
}
