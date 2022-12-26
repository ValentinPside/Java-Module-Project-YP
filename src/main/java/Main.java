import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Double price;
        String name;

        ArrayList<Dish> dishesList = new ArrayList<>();

        int personCount = getPersonCount();

        Scanner scanner = new Scanner(System.in);
        String line = "";
        while(true){
            dishesList.add(new Dish());
            System.out.println("Для добавления нового товара введите что угодно. Для завершения введите 'завершить'");
            line = scanner.nextLine();
            if(line.equalsIgnoreCase("завершить")){
                System.out.println("Составление списка успешно завершино");
                break;
            }
        }
        Calculator calculator = new Calculator(personCount, dishesList);

    }
    private static int getPersonCount(){
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("На скольких человек необходимо разделить счёт?");
            String line = scanner.nextLine();
            if(line.trim().isEmpty()){
                System.out.println("Ничего не введено. Попробуйте снова");
                continue;
            }
            if(!line.equals(line.replaceAll("[^0-9.]", ""))){
                System.out.println("Нужно целое число без букв. Попробуйте снова");
                continue;
            }
            if(line.contains(".") || line.contains(",")){
                System.out.println("Нужно целое число. Попробуйте снова");
                continue;
            }
            int personCount = Integer.parseInt(line);
            if(personCount < 2){
                System.out.println("Число персон должно быть не меньше двух. Попробуйте снова");
                continue;
            }
            else{
                System.out.println("Счёт будет разделён на " + personCount + " персоны");
                return personCount;
            }
        }
    }
}

