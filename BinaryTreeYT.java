import java.util.*;
public class BinaryTreeYT {
    static class Node{
        int data;
        Node left;
        Node right;
        //constructor
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static class BinaryTree{
        static  int idx = -1;

        //function
        public static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx] == -1){
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left=buildTree(nodes);
            newNode.right=buildTree(nodes);
            return  newNode;

        }
    }
    //preorder Traversal
    public static void preorder(Node root){
        if(root == null){
            //iss line null ke jagahe hum -1 print kra skte ho
            //System.out.print(-1+" ");
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);

    }
    //Inorder subTree
    public static void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    //postorder
    public static void postorder(Node root){
        if(root == null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }
    //level order traversal
    public static void levelorder(Node root){
        if(root == null){
            return;
        }
        //queue
        Queue<Node> Q=new LinkedList<>();
        Q.add(root);
        Q.add(null);

        while (Q.isEmpty()){
            //queue is ek current element se bhahar nikal lenge
            Node currentNode =Q.remove();
            if(currentNode == null){
                System.out.println();
                if (Q.isEmpty()){
                    break;
                }else {
                    Q.add(null);
                }

            }else {
                System.out.print(currentNode.data+" ");
                if (currentNode.left != null){
                    Q.add(currentNode.left);
                }
                if (currentNode.right != null){
                    Q.add(currentNode.right);
                }
            }
        }


    }
    // QUESTION ....1 Count of node
    public static int countOfNode(Node root){
        if(root == null){
            return 0;
        }
        int leftNode =countOfNode(root.left);
        int rightNode =countOfNode(root.right);

        return leftNode + rightNode+ 1;
    }

    //sum of node
    public static int sumOfCount(Node root){
        if (root == null){
            return 0;
        }
        int leftSum=sumOfCount(root.left);
        int rightSum=sumOfCount(root.right);
        return leftSum+rightSum+ root.data;
    }
    //Hight of N
    public static void main(String args[]){
        //all nodes is data are givin in preorder
        int  nodes[]={1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree binaryTree=new BinaryTree();
        Node root = binaryTree.buildTree(nodes);
        System.out.println("Print root");
        System.out.println(root.data);
        System.out.println("Print preorder");
        preorder(root);
        System.out.println("Print inorder");
        inorder(root);
        System.out.print("print postorder");
        postorder(root);
        System.out.println("print levelorder");
        levelorder(root);
       System.out.println(countOfNode(root));

       System.out.println(sumOfCount(root));

    }
}
