public class Demo6TaskD {
    public static void main(String[] args) {


        String price1="\033[32m$\033[35m0.99    ";
        String price2="\033[32m$\033[35m1.49    ";

        
        System.out.println("\u001B[33m+----------+----------+---------+");
        System.out.printf("%4$s|%5$s%1$-10s%4$s|%5$s%2$-10s%4$s|%5$s%3$-9s%4$s|%5$s%n","ITEM","QUANTITY","PRICE","\033[33m","\u001B[0m");
        
        System.out.printf("%1$s+%2$s%2$s%3$s%1$s%1$s+%2$s%1$s%3$s%2$s%1$s+%2$s%2$s%4$s%1$s%1$s+%2$s%n","\033[33m","\033[32m","-".repeat(10),"-".repeat(9));
        System.out.printf("%1$s|%2$s%3$-10s%1$s|%2$s%6$s%4$10d%1$s|%2$s%5$s%1$s|%n","\033[33m","\u001B[0m","Apples",5,price1,"\033[34m");
        
        System.out.printf("%1$s|%2$s%3$-10s%1$s|%2$s%6$s%4$10d%1$s|%2$s%5$s%1$s|%n","\033[33m","\u001B[0m","Oranges",10,price2,"\033[34m");
        System.out.printf("%1$s+%2$s%2$s%3$s%1$s%1$s+%2$s%1$s%3$s%2$s%1$s+%2$s%2$s%4$s%1$s%1$s+%2$s%n","\033[33m","\033[32m","-".repeat(10),"-".repeat(9));
        
    //System.out.printf("hdwwjw %s","-".repeat(17));
        
    }
    
}
