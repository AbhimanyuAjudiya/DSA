import java.util.*;
import java.util.LinkedList;


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

    public static int diameter(Node root){// O(n^2) due to height we are calculating height every time So on every nth node we take n time so tc = n * n = n^2
        if(root == null) return 0;
        int leftDia = diameter(root.left);
        int leftHt = heightOfTree(root.left);
        int rightDia = diameter(root.right);
        int rightHt = heightOfTree(root.right);
        
        int selfDia = leftHt + rightHt + 1;
        
        return Math.max(selfDia, Math.max(leftDia, rightDia));
    }

    static class Info{
        int dia;
        int ht;

        Info(int dia, int ht){
            this.dia = dia;
            this.ht = ht;
        }
    }

    public static Info optmizedDiameter(Node root){
        if(root == null) return new Info(0, 0);
        Info lInfo = optmizedDiameter(root.left);
        Info rInfo = optmizedDiameter(root.right);
        int finalDia = Math.max(Math.max(lInfo.dia, rInfo.dia), lInfo.ht + rInfo.ht + 1);
        int finalHt = Math.max(lInfo.ht, rInfo.ht) + 1;

        return new Info(finalDia, finalHt);
    }


    //isSubtree helper function
    public static boolean isIdentical(Node node, Node subRoot){
        if(node == null && subRoot == null){
            return true;
        } else if(node == null || subRoot == null || node.data != subRoot.data){
            return false;
        }

        //now chaeck for left and right
        if(!isIdentical(node.left, subRoot.left)){
            return false;
        }
        if(!isIdentical(node.right, subRoot.right)){
            return false;
        }

        return true;
    }
    public static boolean isSubtree(Node root, Node subRoot){
        if(root == null) return false;
        if(root.data == subRoot.data){
            if(isIdentical(root, subRoot)){
                return true;
            }
        }


        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }


    static class ViewInfo{
        Node node;
        int hd;//Horizontal Distance

        public ViewInfo(Node node, int hd){
            this.node = node;
            this.hd = hd;
        }
    }
    public static void topView(Node root){
        Queue<ViewInfo> q = new LinkedList<>();
        HashMap<Integer, Node> map = new HashMap<>();

        int min = 0,max = 0;

        q.add(new ViewInfo(root, 0));
        q.add(null);

        while(!q.isEmpty()){
            ViewInfo curr = q.remove();
            if(curr == null){
                if(q.isEmpty()){
                    break;
                } else {
                    q.add(null);
                }
            } else {

                if(!map.containsKey(curr.hd)){
                    map.put(curr.hd, curr.node);
                }
    
                if(curr.node.left != null){
                    q.add(new ViewInfo(curr.node.left, curr.hd-1));
                    min = Math.min(min, curr.hd-1);
                }
    
                if(curr.node.right != null){
                    q.add(new ViewInfo(curr.node.right, curr.hd+1));
                    max = Math.max(max, curr.hd+1);
                }
            }
        }
        for(int i = min; i <= max; i++){
            System.out.print(map.get(i).data + " ");
        }
        System.out.println();
    }

    public static void bottumView(Node root){
        Queue<ViewInfo> q = new LinkedList<>();
        HashMap<Integer, Node> map = new HashMap<>();

        int min = 0,max = 0;

        q.add(new ViewInfo(root, 0));
        q.add(null);

        while(!q.isEmpty()){
            ViewInfo curr = q.remove();
            if(curr == null){
                if(q.isEmpty()){
                    break;
                } else {
                    q.add(null);
                }
            } else {

                map.put(curr.hd, curr.node);
    
                if(curr.node.left != null){
                    q.add(new ViewInfo(curr.node.left, curr.hd-1));
                    min = Math.min(min, curr.hd-1);
                }
    
                if(curr.node.right != null){
                    q.add(new ViewInfo(curr.node.right, curr.hd+1));
                    max = Math.max(max, curr.hd+1);
                }
            }
        }
        for(int i = min; i <= max; i++){
            System.out.print(map.get(i).data + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        
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

        topView(root);
        bottumView(root);

        // int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        // BinaryTree bt = new BinaryTree();
        // Node root = bt.buildTree(nodes);
        // System.out.println(root.data);
        // bt.preOrder(root);
        // bt.inOrder(root);
        // bt.postOrder(root);
        // bt.levelOrder(root);
        // System.out.println();

        // Node subRoot = new Node(2);
        // subRoot.left = new Node(4);
        // subRoot.right = new Node(5);
        // /*
        //         2
        //        / \ 
        //       4   5 
        //  */

        // System.out.println(sumOfNodes(root));
        // System.out.println(optmizedDiameter(root).dia);
        // System.out.println(isSubtree(root, subRoot));

    }    
}