package jpademoo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String role;
    private int salary;

    // Constructor
    public Employee(String name, String role, int salary) {
        this.name = name;
        this.role = role;
        this.salary = salary;
    }

    // Default constructor (required by JPA)
    public Employee() {}

    // Getters and Setters (Required for JPA)
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getRole() { return role; }
    public void setRole(String role) { this.role = role; }

    public int getSalary() { return salary; }
    public void setSalary(int salary) { this.salary = salary; }
}
