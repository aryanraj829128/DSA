package TREES;

public class BST {
    public class Node {
        int value;
        private Node right;
        private Node left;
        int height;

        public Node(int value) {

            this.value = value;
        }

        public int getValue() {

            return value;
        }
    }
    private Node root;

    public BST(){

        this.root = null;
    }
    public int height(Node node){
        if(node==null){
            return -1;
        }
        return node.height;
    }
    public boolean isEmpty(){
        return root==null;
    }
    public void display(){

        display(this.root, "Root Node: ");
    }
    private void display(Node node, String details){
        if(node == null){
            return;
        }
        System.out.println(details + node.getValue());

        display(node.left, details + "Left child of current node " + node.getValue() + " : " );
        display(node.right, details + "Right child of current node " + node.getValue() + " : " );
    }

}
