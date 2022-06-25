public class Main {
    public static void main(String[] args) {

    }
    public class Apartments{
        
    }
    public class Hall{

    }
    public class Apt3BedRoom extends Main.Apartments{
        public Apt3BedRoom(Main main){
            main.super();
        }
    }
    public class BigHall extends Main.Hall{
        public BigHall(Main main){
            main.super();
        }
    }
}
