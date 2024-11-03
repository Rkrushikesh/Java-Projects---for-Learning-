
import java.util.Scanner;
public class Temperature {
  
  
  public static void main(String[] args) 
  {
    Scanner sc = new Scanner(System.in);
   System.out.println();
   System.out.println("    **** Temprature Converter ****  " );
   System.out.println();
   System.out.println(" Enter Temp in °C : " );
   float cel = sc.nextFloat();
   System.out.println(" 1.Kelvin 2.Fahrenheit 3.Rankine 4.Reaumur  " );
   int option = sc.nextInt();
   
   if(option == 1)
  {
   float kelvin = cel+273.15f ; 
   System.out.println( cel + " °C = " + kelvin + "k" );
  
  }
  
   else if( option == 2 ) 
  {
   float fah = ( cel* (9/5f) + 32 ); 
   System.out.println( cel + " °C = " + fah+ "°f ");
   
  }
  
   else if( option == 3 ) 
  {
   float rankine = (float) ( cel* (9/5f) + 491.67 ); 
   System.out.println( cel + " °C = " + rankine + "°R ");
   
  }
  else if(option == 4 ){
    float reaumur =   cel * (4/5f);
    System.out.println( cel + " °C = " + reaumur + "°Re");
  }
   else{ 
   System.out.println(" Wrong option Entered " );
  }
  }
    
  }
  




