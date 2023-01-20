public class interfaceInIt {
    public static void main(String[] args) {
        bear b1 = new bear();
        b1.eat();
    }
}

interface herbivor{
    void eat();
}
interface carnivor{
    void eat();
}
class bear implements herbivor, carnivor{
    public void eat(){
        System.out.println("Eats grass and met");
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