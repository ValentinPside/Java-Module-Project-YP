import java.util.Scanner;

public class Dish {
    private Double price;
    private String name;

    public Dish() {
        setName();
        setPrice();
        System.out.println("Позиция успешно добавлена!");
    }

    public Double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public void setName() {
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Введите название блюда.");
            String line = scanner.nextLine();
            if(line.trim().isEmpty()){
                System.out.println("Ничего не введено. Попробуйте снова");
                continue;
            }
            else{
                name = line;
                break;
            }
        }
    }

    public void setPrice() {
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Укажите стоимость " + name);
            String line = scanner.nextLine();
            if(line.trim().isEmpty()){
                System.out.println("Ничего не введено. Попробуйте снова");
                continue;
            }
            if(!line.equals(line.replaceAll("[^0-9.]", ""))){
                System.out.println("Нужно число без букв. Попробуйте снова");
                continue;
            }
            price = Double.parseDouble(line);
            if(price <= 0.0){
                System.out.println("Цена должна быть положительной. Попробуйте снова");
                continue;
            }
            else{
                break;
            }
        }
    }
}
