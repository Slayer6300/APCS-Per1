import gpdraw.*;

public class House
{
    private DrawingTool myPencil;
    private SketchPad myPaper;
    
    public House()
    {
        myPaper = new SketchPad(500, 500);
        myPencil = new DrawingTool(myPaper);
    }
    
    public void draw()
    {
        myPencil.up();
        myPencil.forward(100);
        myPencil.down();
        myPencil.turnLeft(90);
        myPencil.forward(100);
        myPencil.turnLeft(90);
        myPencil.forward(200);
        myPencil.turnLeft(90);
        myPencil.forward(200);
        myPencil.turnLeft(90);
        myPencil.forward(200);
        myPencil.turnLeft(90);
        myPencil.forward(200);
        myPencil.turnLeft(225);
        myPencil.forward(100*Math.sqrt(2));
        myPencil.turnRight(90);
        myPencil.forward(100*Math.sqrt(2));
        myPencil.up();
        myPencil.turnLeft(180);
        myPencil.forward(50);
        myPencil.turnLeft(135);
        myPencil.forward(100);
        myPencil.down();
        myPencil.drawRect(50, 50);
        myPencil.up();
        myPencil.turnLeft(90);
        myPencil.backward(125);
        myPencil.down();
        myPencil.drawRect(50, 50);
        myPencil.up();
        myPencil.move(0, -50);
        myPencil.down();
        myPencil.drawRect(50, 100);
        myPencil.up();
        myPencil.move(-15,-50);
        myPencil.down();
        myPencil.drawCircle(5);
        myPencil.up();
        myPencil.move(75,126);
        myPencil.down();
        myPencil.turnLeft(27.5);
        myPencil.forward(50);
        myPencil.turnLeft(90);
        myPencil.forward(20);
        myPencil.turnLeft(90);
        myPencil.forward(30);
        myPencil.up();
        myPencil.move(-175, -50);
        myPencil.down();
        myPencil.setColor(java.awt.Color.black);
        myPencil.fillRect(40, 120);
        myPencil.up();
        myPencil.move(-175, 20);
        myPencil.down();
        myPencil.setColor(java.awt.Color.green);
        myPencil.fillCircle(50);
    }
}