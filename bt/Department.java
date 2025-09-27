
package exercise3.pack2;

import exercise3.pack1.Employee;

public class Department {
    private String name;
    private Employee[] emps;
    private int num;

  
    public Department(String name, int N) {
        this.name = name;
        this.emps = new Employee[N];
        this.num = 0;
    }

    
    public void addEmployee(Employee e) {
        if (num < emps.length) {
            emps[num] = e;
            num++;
        } else {
            System.out.println("Department is full, cannot add more employees.");
        }
    }

    
    public void display() {
        System.out.println("Department: " + name);
        for (int i = 0; i < num; i++) {
            emps[i].display();
        }
    }
}
