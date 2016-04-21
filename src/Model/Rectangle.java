package Model;

import javafx.geometry.Point2D;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Rectangle implements IShape
{
    private Color mColor;
    private Point2D mTopLeft;
    private int mX;
    private int mY;

    public Rectangle(Point2D topLeft, int x, int y, Color color)
    {
        this.mTopLeft = topLeft;
        this.mX = x;
        this.mY = y;
        this.mColor = color;
    }

    @Override
    public Color getColor()
    {
        return mColor;
    }

    @Override
    public void setColor(Color color)
    {
        this.mColor = color;
    }

    @Override
    public Point2D getTopLeft()
    {
        return mTopLeft;
    }

    @Override
    public void setTopLeft(Point2D topLeft)
    {
        this.mTopLeft = topLeft;
    }

    @Override
    public int getWidth()
    {
        return mX;
    }

    @Override
    public void setWidth(int x)
    {
        this.mX = x;
    }

    @Override
    public int getHeight()
    {
        return mY;
    }

    @Override
    public void setHeight(int y)
    {
        this.mY = y;
    }

    @Override
    public void draw(GraphicsContext gc)
    {
        gc.setFill(mColor);
        gc.fillRect(mTopLeft.getX(),
                mTopLeft.getY(),
                mX,
                mY);
    }
}
