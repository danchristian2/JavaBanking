
package work;

public class Person {
    private int id;
    private String name;
    private String identity;
    private String dob;

    public Person(int id, String name, String identity, String dob) {
        this.id = id;
        this.name = name;
        this.identity = identity;
        this.dob = dob;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getIdentity() {
        return identity;
    }

    public String getDob() {
        return dob;
    }
}
