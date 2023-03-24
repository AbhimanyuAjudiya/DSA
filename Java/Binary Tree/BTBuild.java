import java.util.*;
import java.util.LinkedList;;

public class BTBuild {

    static class Node{
        int data;
        Node right;
        Node left;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree{ 
        static int idx = -1;
        public static Node buildTree(int nodes[]){// O(n)
            idx++;
            if(nodes[idx] == -1){
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }

        public static void preOrder(Node root){// O(n)
            if(root == null){
                System.out.print("-1 ");
                return;
            }
            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        }

        public static void inOrder(Node root){// O(n)
            if(root == null){
                return;
            }
            inOrder(root.left);
            System.out.print(root.data+" ");
            inOrder(root.right);
        }

        public static void postOrder(Node root){
            if(root == null){
                return;
            }
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data+" ");
        }

        //Level Order Traversal
        public static void levelOrder(Node root){
            if(root == null){
                return;
            }

            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);
            while(!q.isEmpty()){
                Node currNode = q.remove();
                if(currNode == null){
                    System.out.println();
                    if(q.isEmpty()){
                        break;
                    } else {
                        q.add(null);
                    }
                } else {
                    System.out.print(currNode.data+" ");
                    if(currNode.left != null){
                        q.add(currNode.left);
                    }
                    if(currNode.right != null){
                        q.add(currNode.right);
                    }
                    
                }
            }
        }
    }

    public static int heightOfTree(Node root){// O(n)
        if(root == null){
            return 0;
        }
        int lh = heightOfTree(root.left);
        int rh = heightOfTree(root.right);
        return Math.max(lh, rh)+1;
    }

    public static int countOfNodes(Node root){// O(n)
        if(root == null){
            return 0;
        }
        int lc = countOfNodes(root.left);
        int rc = countOfNodes(root.right);
        return lc + rc + 1;
    }

    public static int sumOfNodes(Node root){// O(n)
        if(root == null){
            return 0;
        }
        int ls = sumOfNodes(root.left);
        int rs = sumOfNodes(root.right);
        return ls + rs + root.data;
    }
    public static void main(String[] args) {
        
        // int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        // BinaryTree bt = new BinaryTree();
        // Node root = bt.buildTree(nodes);
        // System.out.println(root.data);
        // bt.preOrder(root);
        // bt.inOrder(root);
        // bt.postOrder(root);
        // bt.levelOrder(root);
        // System.out.println();

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
          /*
                    1
                   / \
                  2   3
                 / \ / \
                4  5 6  7
         */
        System.out.println(sumOfNodes(root));

    }    
}