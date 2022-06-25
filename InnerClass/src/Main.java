public class Main {
    public static void main(String[] args) {
        SuperUser.User user = new SuperUser().new User("George", "New Zeland");
        SuperUser superUser = new SuperUser(user);
        System.out.println(superUser.getDescription());
    }
}