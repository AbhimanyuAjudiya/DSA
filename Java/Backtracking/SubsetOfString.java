public class SubsetOfString {

    public static void subStr(String str, String ans, int i) {
        if (i == str.length()) {
            if(ans.length() == 0){
                System.out.println("null");
            } else {
                System.out.println(ans);
            }
            return;
        }

        subStr(str, ans+str.charAt(i), i+1); //Choice Yes
        subStr(str, ans, i+1); // Chice No

    }
    public static void main(String[] args) {
        String str = "abc";
        subStr(str, "", 0);

    }
}
