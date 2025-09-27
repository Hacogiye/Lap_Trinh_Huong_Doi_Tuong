
package exercise3.pack1;

public class Employee {
    public String name;
    public long phone;
    public String address;
    
    public Employee(){
        name = "Default";
        phone = 0;
        address = "Default";
    }
    public Employee(String name, long phone, String address){
        this.name = name;
        this.address = address;
        this.phone = phone;
    }
    public void Display(){
        System.out.println("Ten: " + name);
        System.out.println("So dien thoai: " + phone);
        System.out.println("Dia chi: " + address);
    }
    
    //b
    
    
}
