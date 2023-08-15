public class Demo6taskB {
    public static void main(String[] args) {

        String Name1="Alice";
        int Age1=24;

        String Name2="Bob";
        int Age2=30;


        System.out.println("+-----------------+-----+");
        System.out.printf("|\u001B[34m%-17s\u001B[0m|\u001B[34m%5s\u001B[0m|%n","NAME","AGE");
        System.out.println("+-----------------+-----+");
        System.out.printf("|%-17s|\u001B[31m%5d\u001B[0m|%n",Name1,Age1);
         System.out.println("+-----------------+-----+");
         System.out.printf("|%-17s|\u001B[31m%5d\u001B[0m|%n",Name2,Age2);
         System.out.println("+-----------------+-----+");




        
        
    }
    
}
