/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedList;

public class LinkedList {

    /**
     * @param args the command line arguments
     */
    public static class Point2D
        {
            private int x;
            private int y;
            private static int count = 0;
            
        public Point2D() {
            this(0,0);
        }
        public Point2D(int x, int y) {
            this.x = x;
            this.y = y;
            ++count;
        }
       
        public Point2D (Point2D p)
        {
            this(p.x, p.y);
        } 
        public int getX()
        {
            return this.x;
        }
        
        public int getY()
        {
            return this.y;
        }
        
        public void setX(int x)
        {
            this.x = x;
        }
        
        public void setY(int y)
        {
            this.y = y;
        }
        
            
            public double distance(Point2D p)
            {
                int dx = x-p.x, dy = y-p.y;
                return Math.sqrt(dx*dx+dy*dy*1.);
                
            }
            
            public Point2D diff(Point2D p)
            {
                return new Point2D(x-p.x, y-p.y);
            }
            
            public Point2D diff(int x, int y)
            {
                return new Point2D(this.x-x, this.y-y);
            }
            
            public String str()
            {
                return String.format("(%d, %d) Total %d", x,y,count);
            }
            
            public static int getCount(){return count;}
        }
    public static void main(String[] args) {
        Point2D p1 = new Point2D(10,20);
        System.out.println(p1.str());
        System.out.printf("Point p1 (%d, %d)\n", p1.x, p1.y);
        Point2D p2 = new Point2D(-11,5);
        System.out.println(p2.str());
        System.out.printf("Point p2 (%d, %d)\n", p2.x, p2.y);
        double d1 = p1.distance(p2), d2 = p2.distance(p1);
        System.out.printf("Distance p1 to p2: %f\n", d1);
        System.out.printf("Distance p2 to p1: %f\n", d2);
        Point2D diffP1 = p1.diff(p2);
        System.out.printf("p1-p2 (%d, %d) \n", diffP1.x, diffP1.y);
        Point2D diffP2 = p2.diff(p1);
        System.out.printf("p2-p1 (%d, %d) \n", diffP2.x, diffP2.y);
    }
    
}
