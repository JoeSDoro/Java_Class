/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter4ex6;

/**
 *
 * @author Joe
 */
public class Box {
    private int height = 0;
    private int width = 0;
    private int depth = 0;
    private boolean full = false;
    
    public Box(int tall, int wide, int deep)
    {
        height = tall;
        width = wide;
        depth = deep;
        full = false;
    }
    
    public void setHeight(int tall)
    {
        height = tall;
    }
    
    public void setWidth(int wide)
    {
        width = wide;
    }
    
    public void setDepth(int deep)
    {
        depth = deep;
    }
    
    public void setFull(boolean isFull)
    {
        full = isFull;
    }
    
    public int getHeight()
    {
        return height;
    }
    
    public int getWidth()
    {
        return width;
    }
    
    public int getDepth()
    {
        return depth;
    }
    
    public boolean getFull()
    {
        return full;
    }
    
    public String toString()
    {
        String bHeight = Integer.toString(height);
        String bWidth = Integer.toString(width);
        String bDepth = Integer.toString(depth);
        
        return "Height: " + bHeight + " Width: " + bWidth + " Depth: " + bDepth;
    }
    
}
