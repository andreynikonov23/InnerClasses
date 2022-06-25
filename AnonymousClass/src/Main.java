import vo.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    private static final List<User> USERS = new ArrayList<>();
    private static final List<Location> LOCATIONS = new ArrayList<>();
    private static final List<Server> SERVERS = new ArrayList<>();
    private static final List<Subject> SUBJECTS = new ArrayList<>();
    private static final List<Subscription> SUBSCRIPTIONS = new ArrayList<>();


    public static void main(String[] args) {
        System.out.println(getUsers().getList());
        System.out.println(getLocations().getList());
        System.out.println(getServers().getList());
        System.out.println(getSubjects().getList());
        System.out.println(getSubscription().getList());
    }

    public static AbstractDBSelectExecutor getUsers(){
        return new AbstractDBSelectExecutor() {
            @Override
            public List getList() {
                USERS.add(new User(1, "User-1", getExecute() + "USERS"));
                USERS.add(new User(2, "User-2", getExecute() + "USERS"));
                USERS.add(new User(3, "User-3", getExecute() + "USERS"));
                return USERS;
            }

        };
    }
    public static AbstractDBSelectExecutor getLocations(){
        return new AbstractDBSelectExecutor() {
            @Override
            public List getList() {
                LOCATIONS.add(new Location(1, "Location-1", getExecute() + "LOCATION"));
                LOCATIONS.add(new Location(2, "Location-2", getExecute() + "LOCATION"));
                LOCATIONS.add(new Location(3, "Location-3", getExecute() + "LOCATION"));
                return LOCATIONS;
            }
        };
    }
    public static AbstractDBSelectExecutor getServers(){
         return new AbstractDBSelectExecutor() {
             private String query;
             @Override
             public List getList() {
                 SERVERS.add(new Server(1, "Server-1", getExecute() + "SERVER"));
                 SERVERS.add(new Server(2, "Server-2", getExecute() + "SERVER"));
                 SERVERS.add(new Server(3, "Server-3", getExecute() + "SERVER"));
                 return SERVERS;
             }
         };
    }
    public static AbstractDBSelectExecutor getSubjects(){
        return new AbstractDBSelectExecutor() {
            @Override
            public List getList() {
                SUBJECTS.add(new Subject(1, "Subject-1", getExecute() + "SUBJECT"));
                SUBJECTS.add(new Subject(2, "Subject-2", getExecute() + "SUBJECT"));
                SUBJECTS.add(new Subject(3, "Subject-3", getExecute() + "SUBJECT"));

                return SUBJECTS;
            }
        };
    }
    public static AbstractDBSelectExecutor getSubscription(){
        return new AbstractDBSelectExecutor() {
            @Override
            public List getList() {
                SUBSCRIPTIONS.add(new Subscription(1, "Subscription-1", getExecute() + "SUBSCRIPTION"));
                SUBSCRIPTIONS.add(new Subscription(2, "Subscription-2", getExecute() + "SUBSCRIPTION"));
                SUBSCRIPTIONS.add(new Subscription(3, "Subscription-3", getExecute() + "SUBSCRIPTION"));
                return SUBSCRIPTIONS;
            }
        };
    }
}