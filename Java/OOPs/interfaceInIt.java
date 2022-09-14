public class interfaceInIt {
    public static void main(String[] args) {
        
    }
}

interface ChessPlayer{
    void moves();
}

class Queen implements ChessPlayer{
    public void moves() {
        System.out.println("up,down,right,left,diogan(in all 4 side)");
    }
}
class Rook implements ChessPlayer{
    public void moves() {
        System.out.println("up,down,right,left");
    }
}
class King implements ChessPlayer{
    public void moves() {
        System.out.println("up,down,right,left,diogan(by 1 step)");
    }
}