package task1;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class MainTask1 {
    /**
     * Есть две стринги
     * String jewelery = "AuiP"; --> виды драгоценностей
     * String stones = "AUUuuiHNhfgkpPkjAAaakndsdl"; --> набор камней который
     * содержит простые камни и драгоценности
     * !!! Найти сколько и каких драгоценностей в наборе камней
     */
    public static void main(String[] args) {
        String jewelery = "AuiP";
        String stones = "AUUuuiHNhfgkpPkjAAaakndsdl";

        findTheJewelery(jewelery, stones);

    }

    private static void findTheJewelery(String jewelery, String stones) {

        Map<String, Integer> map = new LinkedHashMap<>();

        List<String> jeweleryList = Arrays.stream(jewelery.split("")).toList();
        List<String> stonesList = Arrays.stream(stones.split("")).toList();

        for (int i = 0; i < jeweleryList.size(); i++) {
            for (int j = 0; j < stonesList.size(); j++) {
                if (jeweleryList.get(i).equals(stonesList.get(j))){
                    map.merge(stonesList.get(j), 1, Integer::sum);
                }
            }
        }

        System.out.println(map);
    }
}