package TREES;
import java.util.Scanner;
public class Binarytree {
    private static class Node{
        int value;
        Node left;
        Node right;

        public Node(int value){
            this.value= value;
        }
    }
    private Node root;

    //insert element
    public void populate(Scanner scanner){
        System.out.println("Enter the root node: ");
        int value= scanner.nextInt();
        root= new Node(value);
        populate(scanner, root);

    }
    private void populate(Scanner scanner, Node node){
            System.out.println("Do you want to enter left of "+ node.value);
            boolean left= scanner.nextBoolean();
            if(left){
                System.out.println("Enter the value of left node " + node.value);
                int value= scanner.nextInt();
                node.left= new Node(value);
                populate(scanner, node.left);
            }
        System.out.println("Do you want to enter right of "+ node.value);
        boolean right = scanner.nextBoolean();
        if(right){
            System.out.println("Enter the value of right node " + node.value);
            int value= scanner.nextInt();
            node.right = new Node(value);
            populate(scanner, node.right);
        }

    }
    public void display(){
        display(root, "");
    }
    private void display(Node node, String indent){
        if(node==null){
            return;
        }
        System.out.println(indent + node.value);
        display(node.left, indent + "\t");
        display(node.right, indent + "\t");
    }

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        Binarytree tree= new Binarytree();
        tree.populate(scanner);
        tree.display();
    }
    public void prettydisplay(){
        prettydisplay(root,0);
    }
    private void prettydisplay(Node node, int level){
        if(node==null){
            return;
        }
        prettydisplay(node.right, level+1);
        if(level!=0){
            for(int i=0; i<level-1; i++){
                System.out.println("|\t\t");
            }
            System.out.println("--------->" + node.value);
        }
        else{
            System.out.println(node.value);
        }
        prettydisplay(node.left, level+1);

    }
    public void preorder(){
        preorder(root);
    }
    private void preorder(Node node){
        if(node==null){
            return;
        }
        System.out.println(node.value + " ");
        preorder(node.left);
        preorder(node.right);
    }
    public void inorder(){
        preorder(root);
    }
    private void inorder(Node node){
        if(node==null){
            return;
        }
        preorder(node.left);
        System.out.println(node.value + " ");
        preorder(node.right);
    }
    public void postorder(){
        postorder(root);
    }
    private void postorder(Node node){
        if(node==null){
            return;
        }
        preorder(node.left);
        preorder(node.right);
        System.out.println(node.value + " ");
    }
}
