package service;

import java.util.Arrays;

public class Sorting {
    public static String sortData(String rawData, String type) {
        int[] data = Arrays.stream(rawData.split(","))
                .mapToInt(Integer::parseInt)
                .toArray();

        if (type.equalsIgnoreCase("Asc")) {
            Arrays.sort(data);
        } else {
            Arrays.sort(data);
            for (int i = 0; i < data.length / 2; i++) {
                int temp = data[i];
                data[i] = data[data.length - i - 1];
                data[data.length - i - 1] = temp;
            }
        }

        return Arrays.toString(data);
    }
}
