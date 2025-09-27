import exercise3.pack1.Employee;
import exercise3.pack2.Department;


public class MainClass {

    public static void main(String[] args) {
        Employee a;
        a = new Employee("Tu", 84343538, "Son Vi");
        a.Display();
        Department b = new Department(5);
        b.addEmployee(a);
        b.display();
    }
}
