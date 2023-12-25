//public class Trie {
//    //.......................Basic implementation on tries.....................
//
//    //step..3 this tries Node the route will point to either triesNode through this tries node array
//    private TrieNode root;
//    //step ..4 we will analize the constructor
//    public  Trie(){
//        root =new TrieNode();//root is empty
//    }
//    //step.1 create inner class
//    private class TrieNode{
//        private TrieNode[] children;//this is nothing but children with TriesNode and also pass the array with childen
//        private  boolean isEndOfWord;
//
//        //step..2
//        public  TrieNode(){
//            this.children=new  TrieNode[26];//storing english word a to z
//            this.isEndOfWord=false;
//        }
//
//
//    }
//    public static void main(String[] args){
//
//    }
//}

//......................Implementation of insert a new node in the Trie
//public class Data_Trie {
//It has a private instance variable root, which is an instance of the Node_Trie class. The root node serves as the starting point of the trie.
//    private Node_Trie root;
//    public Data_Trie(){
//        this.root = new Node_Trie();
//    }

//insert is a method that adds a word to the trie. It takes a string word as input.
//    public void insert(String word){

//It initializes a variable current with the root of the trie and calculates the length of the word.
//        Node_Trie current = root;
//        int length = word.length();
//        for (int x = 0; x < length; x++){
//            char L = word.charAt(x);
//            Node_Trie node = current.getNode().get(L);
//            if (node == null){
//                node = new Node_Trie ();
//                current.getNode().put(L, node);
//            }
//            current = node;
//        }
//        current.setWord(true);
//  }
//}
//
////..Implementation of search a node in the Trie
//class Search_Trie {
//
//    private Node_Trie Prefix_Search(String W) {
//        Node_Trie node = R;
//        for (int x = 0; x < W.length(); x++) {
//            char curLetter = W.charAt(x);
//            if (node.containsKey(curLetter))
//            {
//                node = node.get(curLetter);
//            }
//            else {
//                return null;
//            }
//        }
//        return node;
//    }
//
//    public boolean search(String W) {
//        Node_Trie node = Prefix_Search(W);
//        return node != null && node.isEnd();
//    }
//}


