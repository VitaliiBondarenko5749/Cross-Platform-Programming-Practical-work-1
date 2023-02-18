import java.io.IOException;

public class Example2 {
    public static void main(String[] args){
        System.out.println("Input your symbol: ");

        try{
            char symbol = (char) System.in.read();

            System.out.println("Your symbol is " + symbol);
        }
        catch (IOException ex){
            System.out.println("Input ERROR");
        }
    }
}
