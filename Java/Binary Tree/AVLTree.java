public class AVLTree {

    static class Node{

        int data,height;
        Node left,right;

        Node(int data) {
            this.data=data;
            height=1;
        }
    }

    public static Node root;

    public static int height(Node root){
        if(root == null){
            return 0;
        }
        return root.height;
    }

    public static Node rotateRight(Node a){
        Node b = a.left;
        Node c = b.right;

        b.right = a;
        a.left = c;

        a.height = Math.max(height(a.left), height(a.right)) + 1;
        b.height = Math.max(height(b.left), height(b.right)) + 1;

        return b;
    }

    public static Node rotateLeft(Node a){
        Node b = a.right;
        Node c = b.left;

        b.left = a;
        a.right = c;

        a.height = Math.max(height(a.left), height(a.right)) + 1;
        b.height = Math.max(height(b.left), height(b.right)) + 1;

        return b;
    }

    public static int getBalance(Node root){
        if(root == null){
            return 0;
        }
        return Math.max(height(root.left), height(root.right));
    }

    public static Node insert(Node root,int key){
        if(root == null) return new Node(key);

        if(key<root.data)
            root.left=insert(root.left,key);
        else if(key>root.data)
            root.right=insert(root.right,key);
        else 
            return root;

        root.height = 1 + Math.max(height(root.left),height(root.right));

        int bf=getBalance(root);

        if(bf > 1 && key < root.left.data) 
            return rotateRight(root);

        if(bf < -1 && key > root.right.data) 
            return rotateLeft(root);

        if(bf > 1 && key > root.left.data) {
            root.left=rotateLeft(root.left);
            return rotateRight(root);
        }

        if(bf < -1 && key < root.right.data) {
            root.right=rotateRight(root.right);
            return rotateLeft(root);
        }
        return root;
    }

    public static void preorder(Node root) {
        if(root==null) return;
        
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String[] args) {
        root=insert(root,10);
        root=insert(root,20);
        root=insert(root,30);
        root=insert(root,40);
        root=insert(root,50);
        root=insert(root,25);

    }
}