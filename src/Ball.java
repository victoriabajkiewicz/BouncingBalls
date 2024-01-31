import java.awt.*;
public class Ball {

    private int size;
    private Color color;
    private int x;
    private int y;
    private int speed;

    public Ball(int x, int y){
        this.x = x;
        this.y = y;
        speed = 2;
        color = Color.PINK;
        size = 10;
    }


    public Ball(int x, int y, int speed, Color color, int size){
        this.x = x;
        this.y = y;
        this.speed = speed;
        this.color = color;
        this.size = size;
    }

    public void draw(Graphics g2){
        g2.setColor(color);
        g2.fillOval(x,y,size, size);
    }


    public void move(){
        x+=speed;
        y+=speed;
    }

    public void bounce(){
        if(x >= 500-size){
            speed*=-1;



        }
        if(x < 1+size){
            speed*=-1;
        }
        if(y >= 500-size){
            speed*=-1;
        }
        if(y< 1+size){
            speed*=-1;
        }

    }



}
