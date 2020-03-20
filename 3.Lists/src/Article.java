import java.util.ArrayList;
import java.util.List;

public class Article {

    String name;
    double price;
    double margin;

    public Article(String name, double price, double margin) {
        this.name = name;
        this.price = price;
        this.margin = margin/100;
    }
    double getPrice() {
        return price + price * margin;
    }

    @Override
    public String toString() {
        return "(" + name + ", " + price + " zł, " + margin*100 +"% margin) ";
    }

    public static void main(String[] args) {
        float[] discounts = new float[] {0, 0.10f, 0.15f, 0.25f};
        List<Article> shoppingList = new ArrayList<>();

        Article showerGel = new Article("Shower Gel", 3,60);
        Article boardGame = new Article("Board Game", 20,130);
        Article bicycle = new Article("Bicycle", 250,80);
        Article strawberries = new Article("Strawberries", 10,50);

        shoppingList.add(showerGel);
        shoppingList.add(boardGame);
        shoppingList.add(bicycle);
        shoppingList.add(strawberries);

        for (Article item : shoppingList) {
            System.out.println(item.toString());
        }
        for (int i = 0; i<discounts.length; i++) {
            double sum = 0.0;
            double discount;
            for (int j = 0; j <shoppingList.size(); j++) {
                sum += shoppingList.get(j).getPrice();
            }
            discount = sum * discounts[i];
            sum = sum - discount;
            System.out.printf("Articles' price after %.2f%% discount: %.2f.\n", discounts[i], sum);
        }
    }
}
