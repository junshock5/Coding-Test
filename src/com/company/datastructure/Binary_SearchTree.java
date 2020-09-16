package com.company.datastructure;

import java.io.IOException;

public class Binary_SearchTree {

    public static void main(String[] args) throws IOException {
        BinarySearchTree bst = new BinarySearchTree();

        bst.insertBST('G');
        bst.insertBST('I');
        bst.insertBST('H');
        bst.insertBST('D');
        bst.insertBST('B');
        bst.insertBST('M');
        bst.insertBST('N');
        bst.insertBST('A');
        bst.insertBST('J');
        bst.insertBST('E');
        bst.insertBST('Q');

        System.out.println("Binary Tree >>>");
        bst.printBST();

        System.out.println("Is There \"A\" ? >>> ");
        TreeNode p1 = bst.searchBST('A');
        if(p1!=null){
            System.out.println(p1.data + " 탐색 성공");
        }else{
            System.out.println("탐색 실패");
        }

        System.out.println("Is There \"Z\" ? >>> ");
        TreeNode p2 = bst.searchBST('Z');
        if(p2!=null){
            System.out.println(p2.data + " 탐색 성공");
        }else{
            System.out.println("탐색 실패");
        }

    }

}

class TreeNode {
    char data;
    TreeNode left;
    TreeNode right;

    public TreeNode(){
        this.left = null;
        this.right = null;
    }

    public TreeNode(char data){
        this.data = data;
        this.left = null;
        this.right = null;
    }

    public Object getData(){
        return data;
    }
}

class BinarySearchTree {
    private TreeNode root = new TreeNode();

    public TreeNode insertKey(TreeNode root, char x) {
        TreeNode p = root;
        TreeNode newNode = new TreeNode(x);

        if(p==null){
            return newNode;
        }else if(p.data>newNode.data){
            p.left = insertKey(p.left, x);
            return p;
        }else if(p.data<newNode.data){
            p.right = insertKey(p.right, x);
            return p;
        }else{
            return p;
        }
    }

    public void insertBST(char x){
        root = insertKey(root, x);
    }

    public TreeNode searchBST(char x){
        TreeNode p = root;
        while(p!=null){
            if(x<p.data) p = p.left;
            else if(x>p.data) p = p.right;
            else return p;
        }
        return p;
    }

    public void inorder(TreeNode root){
        if(root!=null){
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    public void printBST(){
        inorder(root);
        System.out.println();
    }
}
