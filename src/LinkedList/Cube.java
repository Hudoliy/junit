
package LinkedList;

public class Cube {
    
    private double rib;
    
    public Cube()
    {
        this.rib = 0;
    }
    public Cube(double rib)
    {
        this.rib = rib;
    }
    
    public double getRib() {return rib;}
    
    public void setRib(double rib) {this.rib = rib;}
    
    public double sumSquare()
    {
        double one_square = rib*rib;
        return one_square*6;
    }
    
    public double volume()
    {
        return rib*rib*rib;
    }
    public double diagonal()
    {
        return Math.ceil(rib*Math.sqrt(3));
    }
}
