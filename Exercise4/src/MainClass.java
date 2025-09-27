
import java.util.Scanner;
import exercise4.pack1.Subject;
import exercise4.utils.ConvertTool;
import exercise1.utils.Student;


public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so sinh vien");
        int n = sc.nextInt();
        sc.nextLine();
        Student[] sv = new Student[n];
        for(int i = 0; i<n; i ++){
            sv[i] = new Student();
            sv[i].init();
        }
        System.out.println("KET QUA HOC TAP");
        System.out.printf("%-5s %-20s %-15s %s\n", "STT", "Ho ten Sinh vien", "Diem Trung binh", "Ket qua");
        for(int i = 0; i< n; i++){
            System.out.printf("%-5s %-20s %-15s %s\n", i+1, sv[i].name, sv[i].TinhDTB(), "Qua mon" );
        }
    }
    
}
