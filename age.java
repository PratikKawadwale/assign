import java.util.*;
public class age {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.err.println("Enter age");
        int age=sc.nextInt();

        if(age>=18){
            System.out.println("age is valid");
        }else{
            System.out.println("not valid");
        }
    }
}
