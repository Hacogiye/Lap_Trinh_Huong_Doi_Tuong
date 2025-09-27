
package exercise3.pack1;

public class Employee {
    private String name;
    private long phone;
    private String address;

    
    public Employee() {
        this.name = "";
        this.phone = 0;
        this.address = "";
    }

    
    public Employee(String name, long phone, String address) {
        this.name = name;
        this.phone = phone;
        this.address = address;
    }

    
    public void display() {
        System.out.println("Name: " + name + ", Phone: " + phone + ", Address: " + address);
    }
}
