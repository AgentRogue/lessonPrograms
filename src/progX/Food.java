package progX;

/**
 * Created by TJ Challstrom on 06-Jul-15.
 * Food yum!
 */
public class Food {
    private String size;
    private int quality; //How good are the ingredients 1-5 ascending
    private String taste; //What is the taste category? I.e.Cajun, sweets
    private int spicy; //How spicy is is 1-5 ascending

    public Food(String size, int quality, String taste, int spicy) {
        this.size = size;
        this.quality = quality;
        this.taste = taste;
        this.spicy = spicy;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    public int getSpicy() {
        return spicy;
    }

    public void setSpicy(int spicy) {
        this.spicy = spicy;
    }
}
