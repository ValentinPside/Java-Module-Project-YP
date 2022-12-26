import java.util.ArrayList;

public class Calculator {
    public Calculator(int personCount, ArrayList<Dish> dishesList) {
        calculate(personCount, dishesList);
    }

    private void calculate(int personCount, ArrayList<Dish> dishesList){
        showDishList(dishesList);
        totalPriceForPerson(personCount, dishesList);
    }

    private void showDishList(ArrayList<Dish> dishesList){
        System.out.println("Добавленные товары:");
        int a = 0;
        String x = "рубль";
        String y = "рубля";
        String z = "рублей";
        for(int i = 0; i < dishesList.size(); i++){
            a = dishesList.get(i).getPrice().intValue();
            String ending = String.valueOf(a);
            ending = ending.substring(ending.length() - 1);
            if(ending.equals("1")){
                ending = x;
            }
            if(ending.equals("2") || ending.equals("3") || ending.equals("4")){
                ending = y;
            }
            if(ending.equals("5") || ending.equals("6") || ending.equals("7") || ending.equals("8") || ending.equals("9") ||ending.equals("0")){
                ending = z;
            }
            System.out.println("Позиция: " + dishesList.get(i).getName() + " Цена: " + String.format("%.2f", dishesList.get(i).getPrice()) + " " + ending);
        }
    }

    private void totalPriceForPerson(int personCount, ArrayList<Dish> dishesList){
        Double totalPrice = 0.0;
        for(int i = 0; i < dishesList.size(); i++){
            totalPrice = totalPrice + dishesList.get(i).getPrice();
        }
        totalPrice = totalPrice / personCount;
        int a = totalPrice.intValue();
        String x = "рубль";
        String y = "рубля";
        String z = "рублей";
        String ending = String.valueOf(a);
        ending = ending.substring(ending.length() - 1);
        if(ending.equals("1")){
            ending = x;
        }
        if(ending.equals("2") || ending.equals("3") || ending.equals("4")){
            ending = x;
        }
        if(ending.equals("5") || ending.equals("6") || ending.equals("7") || ending.equals("8") || ending.equals("9") ||ending.equals("0")){
            ending = z;
        }
        System.out.println("Итоговая цена для каждой персоны: " + String.format("%.2f", totalPrice) + " " + ending);
    }
}
