import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // accepting input from the user
        String inpuString = sc.nextLine();

        // extracting values
        char []array = inpuString.toCharArray();

        // printing max length of contiguous sub array
        System.out.println(ContiguousSubArray.maxLengthSubArray(array));

        // closing resource
        sc.close();
    }
}