
package LinkedList;

public class OneLinkedNote {
    
    private int data;
    private OneLinkedNote next = null;
    
    public OneLinkedNote(int data, OneLinkedNote next)
    {
        this.data = data;
        this.next = next;
    }
    
    public OneLinkedNote(int data) {this.data = data;}
    
    public int getData(){return data;}
    
    public void setData(int data){this.data = data;}
    
    public OneLinkedNote getNext() {return next;}
    
    public void setNext(OneLinkedNote next) {this.next = next;}
    
    public OneLinkedNote next()
    {
        return next!=null?next:null;
    }   
    
}

