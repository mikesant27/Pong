import java.awt.*;
import java.util.*;

public class Ball extends Rectangle{

    Random random;
    int xVelocity;
    int yVelocity;
    int initSpeed = 2;

    Ball(int x, int y, int width, int height){
        super(x,y,width,height);
        random = new Random();
        int randomXDirection = random.nextInt(2);
        if(randomXDirection == 0) // Go left
            randomXDirection--;
        setXDirection(randomXDirection*initSpeed);

        int randomYDirection = random.nextInt(2);
        if(randomYDirection == 0) // Go left
            randomYDirection--;
        setYDirection(randomYDirection*initSpeed);
    }

    public void setXDirection(int randomXDirection){
        xVelocity = randomXDirection;
    }

    public void setYDirection(int randomYDirection){
        yVelocity = randomYDirection;
    }

    public void move(){
        x += xVelocity;
        y += yVelocity;
    }

    public void draw(Graphics g){
        g.setColor(Color.white);
        g.fillOval(x,y,width,height);
    }
}