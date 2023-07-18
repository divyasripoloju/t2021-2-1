import java.util.Scanner;

public class interview {

 public static void main(String[] args) {
  Scanner scan=new Scanner(System.in);
  int n=scan.nextInt();
  int i;
  if(n%2==0) {
   n=n-1;
  }
  for(i=1;i<n;i++)
  {
    
   System.out.print(2*i-1+",");
  
   
   }
  
  System.out.print(2*i-1);
  
 }

}
