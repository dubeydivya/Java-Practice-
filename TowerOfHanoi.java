public class TowerOfHanoi {
    public static void toweOf(int n, String src, String helper, String dest){
        //end me jb one disk left ho jati he

        if(n==1) {
            System.out.println("transfer disk "+ n+ " from "+src+" to "+dest);
            return;
        }
        toweOf(n-1, src, dest , helper);
        System.out.println("transfer disk "+ n+ " from "+src+" to "+dest);
        toweOf(n-1, helper, src ,dest);
    }
    public static void main (String args){
        int n=3;
        toweOf(n, "S", "H", "D");

    }
}

