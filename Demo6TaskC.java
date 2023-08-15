public class Demo6TaskC {
    public static void main(String[] args) {

        String City1="Los Angeles";
        String State1="California";
        int Population1=3966936;

        int Population2=8336817;
        String color="\033";
        String City2="\033[32mNew\033[0m York";
        String State2="\033[32mNew\033[0m York";

        System.out.println("\u001B[33m+-----------------+-------------+-------------+\u001B[0m");
        System.out.printf("%4$s|%5$s%2$-17s%4$s|%5$s%2$-13s%4$s|%5$s%3$-13s%4$s|%5$s%n","CITY","STATE","POPULATION","\033[33m","\u001B[0m");
        System.out.println("\u001B[33m+-----------------+-------------+-------------+\u001B[0m");
        System.out.printf("%4$s|%5$s%1$-17s%4$s|%5$s%2$-13s%4$s|%5$s\u001B[35m%3$,13d\u001B[0m%4$s|%5$s%n",City1,State1,Population1,"\033[33m","\u001B[0m");
       
        System.out.printf("%4$s|%5$s%1$-26s%4$s|%5$s%2$-22s%4$s|%5$s\u001B[35m%3$,13d\u001B[0m%4$s|%5$s%n",City2,State2,Population1,"\033[33m","\u001B[0m");
        
        System.out.println("\u001B[33m+-----------------+-------------+-------------+\u001B[0m");
        
    }
    
}
