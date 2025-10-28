import java.util.*;
public class Nyall2 {
    
  public static void main(String[] args) {
   Scanner Sc = new Scanner(System.in);
    System.out.println("Enter the marks of 3 students: ");
    float marks1 = Sc.nextFloat();
    float marks2 = Sc.nextFloat();
    float marks3 = Sc.nextFloat();
    
    float sum = marks1+marks2+marks3;
    float average = sum/3;

    System.out.println(average );
  }  
}




