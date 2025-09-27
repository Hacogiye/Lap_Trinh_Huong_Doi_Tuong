
package exercise4.utils;
import exercise4.pack1.Subject;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class ConvertTool {
    public static final float minGrade = 2f; //Diem toi thieu de ra truong
    public static float NormalToFour(float d) {
        return (d / 10.0f) * 4.0f;
    }
    public static String FourToABCDF(float d){
        if (0<=d && d<1){
            return "F";
        }
        else if (1<=d && d<2){
            return "D";
        }else if (2<=d && d<3){
            return "C";
        }else if (3 <= d && d<4){
            return "B";
        }else {
            return "A";
        }
    }
    
    public static boolean Grade(Subject subs[]){
        float tongdiem = 0;
        int tong_tin_chi = 0;
        for (Subject s: subs){
            tongdiem += s.diem * s.tinchi;
            tong_tin_chi += s.tinchi;
        }
        float tb = tongdiem/ tong_tin_chi;
        return tb< minGrade;
    }
}


