import java.util.*;
public class profit {
    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter cost price");
        int c_price=sc.nextInt();
        System.out.println("Enter selling price");
        int s_price=sc.nextInt();

        if(s_price>c_price){
            int pro=s_price-c_price;
            System.out.println("Profit="+pro);
        }else{
            int loss=c_price-s_price;
            System.out.println("Loss="+loss);
        }


    }
}
