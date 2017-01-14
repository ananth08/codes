class Tree{
    int data;
    Tree left, right;

    Tree(int n){
        data = n;
        left = null;
        right = null;
    }
}

public class Node {
    Tree root;

    int countLeaves(){
        return countLeaves(root);
    }
    int countLeaves(Tree node){
        int count = 0;
        if(node.left == null && node.right == null){
            count++;
        }
        else {
            count = countLeaves(node.left) + countLeaves(node.right);
        }

        return count;
    }

    public static void main(String[] args){
        Node node = new Node();
        node.root = new Tree(2);
        node.root.left = new Tree(1);
        node.root.right = new Tree(3);

        System.out.println(node.countLeaves());

    }
}