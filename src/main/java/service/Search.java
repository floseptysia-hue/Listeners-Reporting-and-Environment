package service;

public class Search {
    public static String search(String keyword) {

        if (keyword == null || keyword.isEmpty())
            return "No results";

        if (keyword.matches(".*[^a-zA-Z0-9 ].*"))
            return "Error message";

        return "Product list muncul";
    }
}
