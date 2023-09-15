public class PreFix {
    public static class Node {
        Node children[] = new Node[26];
        boolean eow = false; //End of word
        int freq;

        Node(){
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
            freq = 1;
        }
    }
    public static Node root = new Node();

    public static void insert(String word){
        Node curr = root;
        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';
            if(curr.children[idx] == null){
                curr.children[idx] = new Node();
            } else {
                curr.children[idx].freq++;
            }
            curr = curr.children[idx];
        }
    }

    public static void findPrifix(Node root, String ans){
        if(root == null){
            return;
        }
        if(root.freq == 1){
            System.out.println(ans);
            return;
        }

        for (int i = 0; i < root.children.length; i++) {
            if(root.children[i] != null){
                findPrifix(root.children[i], ans+(char)(i+'a'));
            }
        }
    }
    public static void main(String[] args) {
        String[] str = {"abc", "bhc", "bhs", "aads"};
        for (int i = 0; i < str.length; i++) {
            insert(str[i]);
        }
        root.freq = -1;
        findPrifix(root, "");
    }
}
