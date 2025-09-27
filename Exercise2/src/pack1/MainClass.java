
package pack1;

public class MainClass {


    public static void main(String[] args) {
        // TODO code application logic here
        Person Tu = new Person("Anh tu", 18, "Son Vi");
        Tu.display();
        Person Tu2 = new Person();
        System.out.println(Person.getCount());
    }
    }
