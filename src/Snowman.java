import javax.swing.*;
import java.awt.*;
import java.awt.geom.Dimension2D;

public class Snowman extends Canvas {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Снеговик");
        Snowman t = new Snowman();
        jFrame.add(t);

        Font font = new Font("Javanese Text", Font.BOLD, 80);

        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(600, 700);
        jFrame.setLocation(900, 50);
    }
    public void paint(Graphics g){
        setBackground(Color.WHITE);

                    // туловище
        g.setColor(Color.BLACK);
        g.fillOval(207,450 ,215, 186);
        g.setColor(Color.WHITE);
        g.fillOval(210, 453, 209,180);
        g.setColor(Color.BLACK);
        g.fillOval(235, 350, 150, 130);
        g.setColor(Color.white);
        g.fillOval(238, 353, 144, 124);

                    //пуговицы
        g.setColor(Color.BLACK);
        g.fillOval(320,396,15,15);
        g.fillOval(320,421,15,15);
        g.fillOval(320,446,15,15);
        g.setColor(Color.WHITE);
        g.fillOval(323,399,9,9);
        g.fillOval(323,424,9,9);
        g.fillOval(323,449,9,9);

                    //лувая рука
       g.setColor(Color.BLACK);
        int[] xp = {252,182,169,158,167,147,144,164,153,161,176,246};
        int[] yp = {392,363,334,338,357,351,363,368,381,390,374,403};
        g.fillPolygon(xp,yp,12);
        g.setColor(Color.white);
        int[] xp1 = {248,179,167,163,172,150,148,170,157,161,175,245};
        int[] yp1 = {393,364,338,340,361,355,360,367,381,385,371,399};
        g.fillPolygon(xp1,yp1,12);

                     //правая рука
        g.setColor(Color.BLACK);
        int[] xp2 = {378,437,448,457,449,472,477,457,474,467,443,383};
        int[] yp2 = {391,360,334,338,356,347,356,365,376,385,370,403};
        g.fillPolygon(xp2,yp2,12);
        g.setColor(Color.white);
        int[] xp22 = {381,439,450,454,443,471,473,451,469,466,443,383};
        int[] yp22 = {393,363,337,339,362,351,355,364,376,381,366,399};
        g.fillPolygon(xp22,yp22,12);

                         //лицо
        g.setColor(Color.BLACK);
        g.fillOval(270, 280, 80, 80);
        g.setColor(Color.white);
        g.fillOval(273, 283, 74, 74);

                         //рот
        g.setColor(Color.BLACK);
        g.fillOval(303, 336, 6, 6);
        g.fillOval(313, 342, 6, 6);
        g.fillOval(322, 342, 6, 6);
        g.fillOval(330, 336, 6, 6);
        g.setColor(Color.WHITE);
        g.fillOval(305, 338, 2, 2);
        g.fillOval(315, 344, 2, 2);
        g.fillOval(324, 344, 2, 2);
        g.fillOval(332, 338, 2, 2);

                        //глаза
        g.setColor(Color.BLACK);
        g.fillOval(294, 304, 12, 12);
        g.fillOval(324, 304, 12, 12);
        g.setColor(Color.WHITE);
        g.fillOval(296, 306, 8, 8);
        g.fillOval(326, 306, 8, 8);

                        //нос
        g.setColor(Color.BLACK);
        int[] xp3 = {317,380,319};
        int[] yp3 = {321,320,334};
        g.fillPolygon(xp3,yp3,3);
        g.setColor(Color.white);
        int[] xp4 = {320,366,321};
        int[] yp4 = {323,322,331};
        g.fillPolygon(xp4,yp4,3);

                      // шляпа
        g.setColor(Color.BLACK);
        g.fillOval(260, 275, 100, 22);
        g.setColor(Color.WHITE);
        g.fillOval(263, 278, 94, 16);
        g.setColor(Color.BLACK);
        g.fillRoundRect(282, 242, 56, 41, 12, 12);
        g.setColor(Color.WHITE);
        g.fillRoundRect(285,245,50,35,10,10);


        g.setColor(Color.BLACK);
        g.fillRect(283,265,55,3);

    }

}