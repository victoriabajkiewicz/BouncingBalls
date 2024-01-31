import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {
 int xLoc = 200;
 int yLoc = 200;
 int xVel = 2;
 int yVel = 2;

 Ball myBall;
Ball[] ball20;
    public MyPanel(){
        setBackground(Color.GREEN);
        myBall = new Ball(200, 300);

       ball20 = new Ball[20];
       for(int i = 0; i < ball20.length; i++){
           int randSize = (int)(Math.random()*50)+5;
           int randX =  (int)(Math.random()*500);
           int randY = (int)(Math.random()*500);
           int randSpeed = (int)(Math.random()*5)+1;
                    int randR = (int)(Math.random()*255);
                    int randG = (int)(Math.random()*255);
                    int randB = (int)(Math.random()*255);
           Color randColor = new Color(randR, randG, randB);
          ball20[i] = new Ball(randX, randY, randSpeed, randColor, randSize);
       }



    }

    @Override
    public void paintComponent(Graphics g){
        //super goes up a hierarchy level and calls the method
        super.paintComponent(g);
        System.out.println("hi");
        myBall.draw(g);
        myBall.move();
        myBall.bounce();
        for(int i = 0; i < ball20.length; i++){
            ball20[i].draw(g);
            ball20[i].move();
            ball20[i].bounce();
        }
        //yLoc++;





        //g.fillOval(400,400,50,50);
        g.setColor(Color.BLUE);
        g.drawString("Hello World", 250, 250);



      //delay to control ball's speed
try{
    Thread.sleep(10);
}
catch(InterruptedException e){
    System.out.println(e);
}


        // calls paintComponent again
        repaint();

    }



}
