public class Picture
{
    private Square wall;
    private Square window;
    private Triangle roof;
    private Circle sun;

    public Picture()
    {
        // nothing to do... instance variables are automatically set to null
    }

    public void draw()
    {
        wall = new Square();
        wall.moveVertical(80);
        wall.changeSize(100);
        wall.makeVisible();

        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(20);
        window.moveVertical(100);
        window.makeVisible();

        roof = new Triangle();
        roof.changeSize(50, 140);
        roof.moveHorizontal(60);
        roof.moveVertical(70);
        roof.makeVisible();

        sun = new Circle();
        sun.changeColor("red");
        sun.moveHorizontal(180);
        sun.moveVertical(-10);
        sun.makeVisible();
        sun.slowMoveVertical(200);
        sun.changeSize(60);
    }

    public void setBlackAndWhite()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("black");
            window.changeColor("white");
            roof.changeColor("black");
            sun.changeColor("black");
        }
    }

    public void setColor()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("red");
            window.changeColor("black");
            roof.changeColor("green");
            sun.changeColor("yellow");
        }
    }

    public static void main(String[] args) {
        Picture picture = new Picture();
//        picture.setBlackAndWhite();
        picture.draw();;
    }

}
