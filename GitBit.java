public class GitBit {
    public static void main(String args[]){
//        int n=5;//010101
//        int pos= 2;
//        int bitMask =1<<pos;
//
//        if ((bitMask & n) == 0) {
//
//            System.out.println("bit was zero");
//
//        } else {
//            System.out.println("bit was one");
//        }

        //.....................SET OPRATION...................................
        int n=5;//010101
        int pos= 2;
        int bitMask =1<<pos;

        //new num ko orignal num se OR oprater ke sath set kra denge n=orignal num

        int newNumber = bitMask | n;
        System.out.println(newNumber);



    }
}
