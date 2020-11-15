package BehavioralPattern.Composite;

import java.awt.*;

public class Rectangle extends BaseShape {
    public int height;
    public int width;

    public Rectangle(int x, int y, Color color, int height, int width) {
        super(x, y, color);
        this.height = height;
        this.width = width;
    }

    @Override
    public int getWidth() {
        return width;
    }

    @Override
    public int getHeight() {
        return height;
    }

    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics);
        graphics.drawRect(x, y, getWidth() - 1, getHeight() - 1);
    }
}
