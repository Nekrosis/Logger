import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
//        Filter filter= new Filter();
        logger.log("Запускаем программу");
        logger.log("Просим пользователя ввести входные данные для списка");
        System.out.print("Введите размер списка: ");
        int size = scanner.nextInt();
        System.out.print("Введите верхнюю границу для значений: ");
        int maxValue = scanner.nextInt();
        List<Integer> list = new ArrayList<>(size);
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            list.add(random.nextInt(maxValue));
        }
        logger.log("Создаем и наполняем список");
        System.out.println("Вот случайный список: " + list.toString().replace(",", "")
                .replaceAll("^\\[|\\]$", ""));
        logger.log("Просим пользователя ввести входные данные для фильтрации");
        System.out.print("Введите порог для фильтра: ");
        int fil = scanner.nextInt();
        logger.log("Запускаем фильтрацию");
        Filter filter = new Filter(fil);
        filter.filterOut(list);
        logger.log("Завершаем программу");
    }
}
