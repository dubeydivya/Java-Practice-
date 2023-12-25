public class Backtacking {
    //...............Time  complexity...n*n
    
    // declare function
    public static void printPermutation(String str, String prem, int idx) {
        if (str.length() == 0){
            System.out.println(prem);
            return;
        }
        // first arrange the element
        for (int i=0; i<str.length(); i++) {
            char currChar = str.charAt(i);
            //create the new string
           // String newStr = str.substring(0, 1) + str.substring((1+1);
            String newStr =str.substring(0, i) +str.substring(i+1);

            printPermutation(newStr, prem+ currChar ,idx+1);


        }


    }
    public static void main(String args[]){
        // declare string
        String str= "ABC";
        printPermutation(str, "", 0);

    }
}
