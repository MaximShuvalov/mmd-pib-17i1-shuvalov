/**
* This is the simplest class which prints the “Hello, world” message.
* @author Shuvalov Max
*/
public class helloWorld {
    public static void main(String[] args){
        System.out.println("Hello World!");
        int result = Summ(13,9);
        System.out.println("Result = " + result);
    }

    private static int Summ(int a, int b){
        return a + b; 
    }
}