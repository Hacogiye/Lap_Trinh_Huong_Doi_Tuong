/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise1.utils;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Student{
    public String name;
    public int so_mon;
    public float[] diem;
    static int soluong = 0;
    public void init(){
        Scanner sc = new Scanner(System.in);
        soluong++;
        System.out.println("-----Sinh Vien " +soluong+"-----" );
        System.out.print("Nhap ten: ");
        name = sc.nextLine();
        System.out.print("Nhap so mon hoc: ");
        so_mon = sc.nextInt();
        diem = new float[so_mon];
        System.out.println("Nhap so diem tung mon: ");
        for(int i = 0; i<so_mon ; i++){
            System.out.print("Mon "+ (i+1) + ": ");
            diem[i] = sc.nextFloat();
        }
    }
    
    public float TinhDTB(){
        //System.out.println("Diem trung binh cua " + name + " la: ");
        float dtb = 0;
        float tongx = 0;
        for(float x : diem){
            tongx += x;
        }
        dtb = (tongx / 10) * 4;
        return dtb;
    }
}

