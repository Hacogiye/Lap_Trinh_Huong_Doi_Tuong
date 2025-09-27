package exercise3.pack1;

import exercise3.pack2.Department;

public class MainClass {
    public static void main(String[] args) {
        
        Department dept = new Department("IT Department", 3);

        
        Employee e1 = new Employee("Nguyen Van A", 123456789, "Ha Noi");
        Employee e2 = new Employee("Tran Van B", 987654321, "Hai Phong");
        Employee e3 = new Employee("Le Thi C", 555666777, "Da Nang");

        dept.addEmployee(e1);
        dept.addEmployee(e2);
        dept.addEmployee(e3);

        
        dept.display();
    }
}

