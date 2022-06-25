public class SuperUser {
    private User user;


    public SuperUser(){}
    public SuperUser(User user){
        this.user = user;
    }

    public String getDescription(){
        return "My name is " + user.name + ". I'm from the " + user.address;
    }


    public class User{
        private String name;
        private String address;

        public User(String name, String address){
            this.name = name;
            this.address = address;
        }
    }
}