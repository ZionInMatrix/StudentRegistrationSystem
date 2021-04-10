package Registration;

public class User {
    String name, telephoneNumber, id;

    public User(String name, String telephoneNumber, String id) {
        this.name = name;
        this.telephoneNumber = telephoneNumber;
        this.id = id;
    }

    //getters

    public String getName() {
        return name;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public String getId() {
        return id;
    }
}
