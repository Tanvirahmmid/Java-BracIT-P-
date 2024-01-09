import java.util.Scanner;

public class exm17 {


        public static void main(String[] args) {
      
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the first binary number: ");
            String bin1 = scanner.nextLine();
            

            System.out.print("Enter the second binary number: ");
            String bin2 = scanner.nextLine();
    
            int decimal1 = Integer.parseInt(bin1, 2);
            int decimal2 = Integer.parseInt(bin2, 2);
    

            int sum = decimal1 + decimal2;
    

            String binarySum = Integer.toBinaryString(sum);
    

            System.out.println("Sum of two binary number " + binarySum);
        }
    }

