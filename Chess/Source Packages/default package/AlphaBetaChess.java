import javax.swing.*;
public class AlphaBetaChess {
    static String chessBoard[][]={
        {"r","k","b","q","a","b","k","r"},
        {"p","p","p","p","p","p","p","p"},
        {" "," "," "," "," "," "," "," "},
        {" "," "," "," "," "," "," "," "},
        {" "," "," "," "," "," "," "," "},
        {" "," "," "," "," "," "," "," "},
        {"P","P","P","P","P","P","P","P"},
        {"R","K","B","Q","A","B","K","R"}};
    public static void main(String[] args) {
        /*
         * PIECE=WHITE/black
         * pawn=P/p
         * kinght (horse)=K/k
         * bishop=B/b
         * rook (castle)=R/r
         * Queen=Q/q
         * King=A/a
         * 
         * My strategy is to create an alpha-beta tree diagram wich returns
         * the best outcome
         * 
         * (1234b represents row1,column2 moves to row3, column4 which captured
         * b (a space represents no capture))
         */
        /*JFrame f=new JFrame("Chess Tutorial");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        UserInterface ui=new UserInterface();
        f.add(ui);
        f.setSize(500, 500);
        f.setVisible(true);*/
    }
    public static String posibleMoves() {
        String list="";
        for (int i=0; i<64; i++) {
            switch (chessBoard[i/8][i%8]) {
                case "P": list+=posibleP(i);
                    break;
                case "R": list+=posibleR(i);
                    break;
                case "K": list+=posibleK(i);
                    break;
                case "B": list+=posibleB(i);
                    break;
                case "Q": list+=posibleQ(i);
                    break;
                case "A": list+=posibleA(i);
                    break;
            }
        }
        return list;//x1,y1,x2,yx,captured piece
    }
    public static String posibleP(int i) {
        String list="";
        return list;
    }
    public static String posibleR(int i) {
        String list="";
        return list;
    }
    public static String posibleK(int i) {
        String list="";
        return list;
    }
    public static String posibleB(int i) {
        String list="";
        return list;
    }
    public static String posibleQ(int i) {
        String list="";
        return list;
    }
    public static String posibleA(int i) {
        String list="";
        return list;
    }
}