
package exercise3.pack2;

import exercise3.pack1.Employee;

public class Department {
    public String name;
    public Employee[] emps;
    public int num;
    public Department(int N){
        emps = new Employee[N];
        num = 0;
    }
    public void addEmployee(Employee e){
        emps[num] = e;
        num ++;
    }
    public void display() {
    for (int i = 0; i < num; i++) {
        if (emps[i] != null) {
            emps[i].Display();
        }
    }
}
}
    

