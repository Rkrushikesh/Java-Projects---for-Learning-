import java.util.Scanner; 

class Calculator {
  public static void main(String[] args) {
    
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter The Value Of Num1 : " ) ;
 double num1 = sc.nextDouble();
 
 System.out.println("Enter The Value Of Num2 : " ) ;
    double num2 = sc.nextDouble();

System.out.println("Enter The Operator  : " ) ;
  char operator = sc.next().charAt(0);
 
  boolean flag = true; 
 double output = 0; 
   
if(operator == '+') 
{
 output =  num1 + num2; 

  }

else if(operator == '-') {
 output =  num1 - num2; 

  }

else if(operator == '*') {
 output =  num1 * num2; 

  }

else if(operator == '/') {
 output =  num1 / num2; 

  }

else if(operator == '%') {
 output =  num1 % num2; 

  }

 else { 
flag = false;
 System.out.println( "Wrong Operator " );

}


if(flag) 
{ 
  System.out.println( "output : " + num1 +""+ operator + "" + num2 + "=" + output);


}
}

}
