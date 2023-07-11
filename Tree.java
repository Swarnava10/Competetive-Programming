import java.util.Scanner;

/**
 * Tree
 */
public class Tree {

    static Scanner sc=null;
    public static void main(String[] args) {
        sc=new Scanner(System.in);

        Node n=creatingTree();
        System.out.println(n);

    }

    static Node creatingTree()
    {
        Node root=null;
        

        System.out.println("Enter data");
        int data=sc.nextInt();

        if(data==-1)
        return null;

        root=new Node(data);
        System.out.println("Enter the left child of Node "+data);
        root.left=creatingTree();

        System.out.println("Enter the right child of Node "+data);
        root.right=creatingTree();


        return root;


    }
}

 class Node{
    int data;
    Node left, right;
 
    
    public Node(int data)
    {
        this.data = data;
    }
}
