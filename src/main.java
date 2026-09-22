import java.util.*;
public class main{
    public static void main(String[]args){
        String name;
        int age;
        double gpa;
        boolean isEnrolled;
        int[] marks=new int[3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        name=sc.nextLine();
        System.out.println("Enter Your Age");
        age = sc.nextInt();
        System.out.println("Enter your gpa");
        gpa = sc.nextDouble();
        System.out.println("Enter your marks");
        for(int i=0;i<marks.length;i++){
            marks[i] = sc.nextInt();
            System.out.println(marks[i]);

        }
        System.out.println("Name;"+name);
        System.out.println("Age:"+age);
        System.out.println("GPA:"+gpa);

    }
}