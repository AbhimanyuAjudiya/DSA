import javax.sound.midi.VoiceStatus;

public class LengthOfStr {

    public static int LengthOf(String s){
        if(s.equals("")){
            return 0;
        }
        return LengthOf(s.substring(1)) + 1;
    }
    public static void main(String[] args) {
        String str = "Abhimanyu";
        System.out.println(LengthOf(str));
    }
}
