public class BST {

    static class Node{
        Node left;
        Node right;
        int data;
        Node(int data){
            this.data = data;
        }
    }

    public static Node insert(Node root, int val){
        if(root == null){
            root = new Node(val);
            return root;
        }

        if(root.data > val){
            root.left = insert(root.left, val);
        }else {
            root.right = insert(root.right, val);
        }
        return root;
    } 

    public static void inOrder(Node root){
        if(root == null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }

    public static void main(String[] args) {
        int val[] = {5,1,3,4,2,7};
        Node root = null;
        for (int i = 0; i < val.length; i++) {
            root = insert(root, val[i]);
        }        
        inOrder(root);
        System.out.println();
    }
}
