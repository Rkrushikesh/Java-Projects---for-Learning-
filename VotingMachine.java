
 import java.util.Scanner;
 
 class VotingMachine {
   static int bjp , congress , aap, mns , sena, nota ; 
  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
  System.out.println("***  Voting  Machine *** ");
  System.out.println();
  System.out.println("Enter the Count Of voter ");
  int count = sc.nextInt();

  for(int i = 1; i<=count; i++){
    System.out.println();
    System.out.println(" 1. BJP 2.CONGRESS 3.AAP 4.MNS 5.SHIVSENA 6.NOTA ");
    System.out.println("Enter the choice of Voter ");
    int choice = sc.nextInt();
    System.out.println();
    switch(choice){
      
      case 1: bjp++; System.out.println(" BJP ");
      break;
      case 2:congress++; System.out.println("Congress");
      break;
      case 3 : aap++; System.out.println(" aap ");
      break;
      case 4 : mns++; System.out.println(" mns");
      break;
      case 5 : sena++; System.out.println(" sena ");
      break;
      case 6 : nota++; System.out.println(" nota ");
      break;
      default: System.out.println(" Invalid Choice ");
      i++;

    }

  }

   if( bjp > congress && bjp > aap && bjp > mns && bjp >sena && bjp >nota)
   {
    System.out.println(" BJP WON BY " + bjp + " votes ");
   }

  else if( congress > bjp  && congress > aap  && congress  > mns && congress >sena && congress >nota ){
    System.out.println(" CONGRESS WON BY " + congress + "votes " ); 
  }

  else if( aap > bjp  && aap > congress  && aap  > mns && aap >sena && aap >nota){
    System.out.println(" AAP WON "); 
  }

  else if(mns > bjp  && mns > congress  && mns > aap  && mns >sena && mns >nota){
    System.out.println(" MNS WON "); 
  }

  else if(sena > bjp  && sena > congress  && sena > aap  && sena >mns && sena >nota){
    System.out.println(" SENA WON "); 
  }
   else {
    System.out.println(" NOTA WON "); 
  }




  }
}
