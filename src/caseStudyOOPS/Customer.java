package caseStudyOOPS;

public class Customer {
    String name, email;

    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String toString() {
        return name + " (" + email + ")";
    }
}
