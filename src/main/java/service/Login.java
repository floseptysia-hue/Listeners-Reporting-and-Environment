package service;

public class Login {
    public static String login(String username, String password) {
        if ("admin".equals(username) && "admin123".equals(password)) {
            return "success";
        }

        return "failed";
    }
}
