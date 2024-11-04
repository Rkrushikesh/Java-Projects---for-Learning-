import java.util.*;
class restraunt1 {
    static String username;
    static String pass;
    static String phone;
    static ArrayList<String> Cart=new ArrayList<>();
    static double bill;

     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        for(;;){
            System.out.println();
            System.out.println("     **** WELCOME ****");
            System.out.println();
            System.out.println("1. sign in ");
            System.out.println("2. sign up ");
            System.out.println();
            System.out.print("Enter an option :");
            int option =sc.nextInt();
            switch(option){
                case 1:creatAccount(sc);break;
                case 2:login(sc);break;
                default:System.out.println("wrong option entered");

            }
            

        }
     }
     public static void creatAccount(Scanner sc) {
        System.out.println();
        System.out.println(" Create Account ");
        System.out.println();
        System.out.print(" user name :");
        sc.nextLine();
        username=sc.nextLine();
        System.out.print("Password :");
        pass=sc.next();
        System.out.print("Contact Number :");
        phone=sc.next();
        System.out.println();
        System.out.println("Account Created");
        System.out.println();

        }
        public static void login(Scanner sc) {
            if (username!=null){
                for(int i=1;i<=3;i++){
                    System.out.println(" ");
                    System.out.println(" login page  ");
                    System.out.println();
                    System.out.print("username/contact : ");
                    sc.nextLine();
                    String un1=sc.nextLine();
                    System.out.print("password :");
                    String pass1=sc.next();
                    if(((un1.equals(username))||(un1.equals(phone)))&&(pass1.equals(pass))){
                        homePage(sc);
                    }else{
                        System.out.println();
                        System.out.println("Wrong cred interd");
                        System.out.println();

                    }

                }
                System.exit(0);
            }
            else{
                System.out.println("Creat your account First");
            }
        }
        public static void homePage(Scanner sc) {
            for(;;){
                System.out.println();
                System.out.println(" Home page ");
                System.out.println();
                System.out.println("1. VEG MENU");
                System.out.println("2. NON-VEG MENU");
                System.out.println("3. Checkout ");
                System.out.println("4. Logout");
                System.out.println();
                System.out.print("Enter an option " );
                int option=sc.nextInt();
                switch(option){
                    case 1:vegMenu(sc);break;
                    case 2:nonvegMenu(sc);break;
                    case 3:checKout(sc);break;
                    case 4:System.exit(0);break;
                    default:System.out.println("Wrong option ");

                }

            }
            
        }
        public static void vegMenu(Scanner sc) {
            for(;;){
            System.out.println();
            System.out.println("veg dishes ");    
            System.out.println("101. paneer tikka ");    
            System.out.println("102. kaju carry ");    
            System.out.println("103.veg maratha ");    
            System.out.println("104.dal tadka");    
            System.out.println("105.veg biryani ");    
            System.out.println("106. Menu");
            System.out.println();
            System.out.print("enter a dish id");
            int id=sc.nextInt();
            switch(id){
                case 101:Cart.add("paneer tikka :200");
                    
                System.out.println("paneer tikka added inside the cart");break;
                case 102:Cart.add("Kaju carry  :200");
                System.out.println("kaju carry added inside the cart");break;
                case 103:Cart.add("veg maratha  :200");
                System.out.println("veg maratha added inside the cart");break;
                case 104:Cart.add("dal tadka  :200");
                System.out.println("dal tadka added inside the cart");break;
                case 105:Cart.add("veg biryani :200");
                System.out.println("veg biryani added inside the cart");break;
                case 106:return;
                default:System.out.println("Wrong dish id ");break;

            }    

            }
            
        }
        public static void nonvegMenu(Scanner sc) {
            for(;;){
            System.out.println();
            System.out.println("veg dishes ");    
            System.out.println("101. chicken tikka ");    
            System.out.println("102. chicken carry ");    
            System.out.println("103.chicken biryani ");    
            System.out.println("104.Menu");    
           
            System.out.print("enter a dish id :");
            int id=sc.nextInt();
            switch(id){
                case 101:Cart.add("chicken tikka  :200");
                bill+=200;
                System.out.println("chicken tikka   added inside the cart");break;
                case 102:Cart.add("chicken carry  :200");
                bill+=200;
                System.out.println("chicken carry  added inside the cart");break;
                case 103:Cart.add("chicken biryani :200");
                bill+=200;
                System.out.println("chicken biryani added inside the cart");break;
                case 104:return;
                default:System.out.println("Wrong dish id :");break;
            }
        }
    }
    public static void Cart(Scanner sc) {

        System.out.println("your purchased Food ");
        System.out.println();
        for(String food :Cart){
            System.out.println(food);
        }
        System.out.println();
        System.out.println(" Your total Bill is : " + bill + "rs");
        System.out.println();
    }
    public static void checKout(Scanner sc) {
        System.out.println(" CHECK OUT TOMO");
        Cart(sc); }

}