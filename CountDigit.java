import java.util.Scanner;

public class CountDigit {
    // create count function
    static int countD(int n){
        int count=0;
        while (n>0){
            n=n/10;
            count++;
        }
        return count;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        System.out.println("Print the digit" );
                
        System.out.println(countD(n));

    }
}
