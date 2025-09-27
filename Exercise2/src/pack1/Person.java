/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pack1;

/**
 *
 * @author Admin
 */
public class Person {
    public String name;
    public int age;
    public String address;
    static int count = 0;
    Person(){
        this.name = "Default";
        this.age = 0;
        count ++;
    }
    Person (String name, int age, String address){
        this.name = name;
        this.age = age;
        this.address = address;
        count++;
    }
    void display(){
        System.out.println("Ten: " + name);
        System.out.println("Tuoi: " + age);
        System.out.println("Dia chi: " + address);
    }
    static int getCount(){
        return count;
    }
}
