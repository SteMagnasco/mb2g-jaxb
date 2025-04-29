package lombok;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        String email = user.getEmail();
        System.out.println(email);
    }
}
