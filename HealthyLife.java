import java.util.*;

public class HealthyLife
{
public static void main(String[] args)
{
   System.out.println("****************************************************************************");
   System.out.println("Package No         Package Name                        Price(RM)");
   System.out.println("                                              Member(RM)     Non-Member(RM)");
   System.out.println("****************************************************************************");
   System.out.println("1                  HealthyLife Starter        305.00         350.00 ");
   System.out.println("2                  HealthyLife Premium        345.00         390.00 ");
   System.out.println("3                  HealthyLife Advanced       440.00         490.00 ");
   System.out.println("4                  HealthyLife Ultimate       550.00         590.00 \n");

   
   Scanner scan = new Scanner (System.in);
   
   String membership, packageName = "";
   int quantity, packageNum;
   double price = 0.0;
   double totalPrice = 0.0;
   
   System.out.print("Please enter the package number: ");
   packageNum = scan.nextInt();
   
   System.out.print("Please enter quantity: ");
   quantity = scan.nextInt(); 
   
   System.out.print("Membership? (M/N): ");
   membership = scan.next();
       
   if(packageNum == 1)
   {
      packageName = "HealthyLife Starter";
      if(membership.equalsIgnoreCase("m")){
      membership = "Yes";
      price = 305.00;
      }else if(membership.equalsIgnoreCase("n")){
      membership = "No";
      price = 350.00;
      }else{
      System.out.println("Please enter the correct value.");
      }
     } 
      if(packageNum == 2)
   {
      packageName = "HealthyLife Premium";
      if(membership.equalsIgnoreCase("m")){
      membership = "Yes";
      price = 345.00;
      }else if(membership.equalsIgnoreCase("n")){
      membership = "No";
      price = 390.00;
      }else{
      System.out.println("Please enter the correct value.");
      }
}

      if(packageNum == 3)
   {
      packageName = "HealthyLife Advanced";
      if(membership.equalsIgnoreCase("m")){
      membership = "Yes";
      price = 440.00;
      }else if(membership.equalsIgnoreCase("n")){
      membership = "No";
      price = 490.00;
      }else{
      System.out.println("Please enter the correct value.");
      }
}

      if(packageNum == 4)
   {
      packageName = "HealthyLife Starter";
      if(membership.equalsIgnoreCase("m")){
      membership = "Yes";
      price = 550.00;
      }else if(membership.equalsIgnoreCase("n")){
      membership = "No";
      price = 590.00;
      }else{
      System.out.println("Please enter the correct value.");
      }
}   
   totalPrice = price * quantity;
   
   System.out.println("\nPackage No    : " + packageNum);
   System.out.println("Package Name  : " + packageName);
   System.out.println("Quantity      : " + quantity);
   System.out.println("Membership    : " + membership);
   System.out.println("Total price   : RM " + totalPrice);   
   
}
}


