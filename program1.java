import java.util.Scanner;

public class interview {

 public static void main(String[] args) {
  Scanner scan=new Scanner(System.in);
  double a=scan.nextDouble();
  double b=scan.nextDouble();
  String ch=scan.next();
  switch(ch)
  {
  case "addition":
  System.out.print(a+b);
  break;
  case "subtraction":System.out.print(Math.abs(a-b));
  break;
  case "multiplication":System.out.print(a*b);
  break;
  case "division":System.out.print(a/b);
  break;
  default:System.out.print("invalid choice");
           
  }
  
 }

}
