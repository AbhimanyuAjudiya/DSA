public class RemoveDuplicates {
    
    public static void removeDuplicates(String str,int idx, StringBuilder newString, boolean trac[]) {
        //base case
        if(idx == str.length()){
            System.out.println(newString);
            return;
        }
        //work
        char currChar = str.charAt(idx);
        if(trac[currChar - 'a'] == true){
            removeDuplicates(str, idx+1, newString, trac);
        } else {
            trac[currChar - 'a'] = true;
            removeDuplicates(str, idx+1, newString.append(currChar), trac);
        }
    }
    public static void main(String[] args) {
        String str = "abhimanyu";
        removeDuplicates(str, 0, new StringBuilder(""), new boolean[26]);
    }
}
