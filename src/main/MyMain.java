package main;

public class MyMain {
    public static void main(String[] args) {
        //create binary search tree
        // and perform insert, search, traversal, delete
        MyBinarySearchTree tree = new MyBinarySearchTree();
        tree.insert(50);
        tree.insert(10);
        tree.insert(60);
        tree.insert(25);
        tree.insert(49);
        tree.insert(41);
        tree.inOrder(tree.getRoot());
        tree.insert(30);
        tree.inOrder(tree.getRoot());
        System.out.println(tree.search(49));
        System.out.println(tree.search(51));
    }
}
