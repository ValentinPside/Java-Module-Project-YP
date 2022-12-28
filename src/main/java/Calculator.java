import java.util.ArrayList;

public class Calculator {
    public Calculator(int personCount, ArrayList<Dish> dishesList) {
        calculate(personCount, dishesList);
    }

    private void calculate(int personCount, ArrayList<Dish> dishesList){
        showDishList(dishesList);
        totalPriceForPerson(personCount, dishesList);
    }

    private String getRightEnding(double price){
        String ending = "";
        String x = "рубль";
        String y = "рубля";
        String z = "рублей";
        if(price%100 >= 11 && price%100 <= 14){
            ending = z;
            return ending;
        }
        if(price%10 == 1){
            ending = x;
            return ending;
        }
        if(price%10 == 2 || price%10 == 3 || price%10 == 4){
            ending = y;
            return ending;
        }
        return z;
    }

    private void showDishList(ArrayList<Dish> dishesList){
        System.out.println("Добавленные товары:");
        double price;
        for(int i = 0; i < dishesList.size(); i++){
            price = dishesList.get(i).getPrice();
            String ending = getRightEnding(price);
            System.out.println("Позиция: " + dishesList.get(i).getName() + " Цена: " + String.format("%.2f", dishesList.get(i).getPrice()) + " " + ending);
        }
    }

    private void totalPriceForPerson(int personCount, ArrayList<Dish> dishesList){
        Double totalPrice = 0.0;
        for(int i = 0; i < dishesList.size(); i++){
            totalPrice = totalPrice + dishesList.get(i).getPrice();
        }
        totalPrice = totalPrice / personCount;
        double price = totalPrice;
        String ending = getRightEnding(price);
        System.out.println("Итоговая цена для каждой персоны: " + String.format("%.2f", totalPrice) + " " + ending);
    }
}
