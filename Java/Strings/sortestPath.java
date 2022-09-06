public class sortestPath {

    public static float sortestPath(String path){
        int x=0,y=0;
        for (int i = 0; i < path.length(); i++) {
            char dir = path.charAt(i);
            if(dir == 'N'){             //North
                y++;
            } else if(dir == 'S'){      //South
                y--;
            } else if(dir == 'E'){      //East
                x++;
            } else {                    //West
                x--;
            }
        }

        int X2 = x*x;
        int Y2 = y*y;
        return (float)Math.sqrt(X2+Y2);

    }
    public static void main(String[] args) {
        String path = "WNEENENNN";
        System.out.println(sortestPath(path));
    }
}
