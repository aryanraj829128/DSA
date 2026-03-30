package TREES;

import java.util.Scanner;

public class BTMain {
    public static void main(String[] args) {
//        Scanner scanner= new Scanner(System.in);
//        Binarytree tree= new Binarytree();
//        tree.populate(scanner);
//        //tree.display();
//        tree.prettydisplay();

        BST2 tree= new BST2();
        int[] nums= {5, 2, 7, 1, 4, 6, 9, 8, 3, 10};
        tree.populate(nums);
        tree.dispaly();

    }
}
