package Model;

import javafx.geometry.Point2D;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Circle implements IShape
{
    private int mRadius;
    private Color mColor;
    private Point2D mTopLeft;

    public Circle(Point2D topLeft, int radius, Color color)
    {
        this.mTopLeft = topLeft;
        this.mRadius = radius;
        this.mColor = color;
    }


    @Override
    public Color getColor()
    {
        return this.mColor;
    }

    @Override
    public void setColor(Color color)
    {
        this.mColor = color;
    }

    @Override
    public Point2D getTopLeft()
    {
        return this.mTopLeft;
    }

    @Override
    public void setTopLeft(Point2D topLeft)
    {
        this.mTopLeft = topLeft;
    }

    @Override
    public int getWidth()
    {
        return mRadius * 2;
    }

    @Override
    public void setWidth(int x)
    {
        mRadius = x / 2;
    }

    @Override
    public int getHeight()
    {
        return mRadius * 2;
    }

    @Override
    public void setHeight(int y)
    {
        mRadius = y / 2;
    }

    @Override
    public void draw(GraphicsContext gc)
    {
        gc.setFill(mColor);

        gc.fillOval(mTopLeft.getX(),
                mTopLeft.getY(),
                mRadius * 2,
                mRadius * 2);
    }
}
