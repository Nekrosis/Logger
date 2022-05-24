import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Filter {
    protected int treshold;

    public Filter(int treshold) {
        this.treshold = treshold;
    }

    public List<Integer> filterOut(List<Integer> sourse) {
        Logger logger = Logger.getInstance();
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < sourse.size(); i++) {
            if (sourse.get(i) < treshold) {
                logger.log("Элемент " + "\"" + sourse.get(i) + "\"" + " не подходит");
            } else if (sourse.get(i) >= treshold) {
                logger.log("Элемент " + "\"" + sourse.get(i) + "\"" + " подходит");
                result.add(sourse.get(i));
            }
        }
        logger.log("Прошло фильтр " + result.size() + " элемента из " + sourse.size());
        logger.log("Выводим результат на экран");
        System.out.println("Отфильтрованный список: " + result.toString().replace(",", "")
                .replaceAll("^\\[|\\]$", ""));
        return result;
    }
}
