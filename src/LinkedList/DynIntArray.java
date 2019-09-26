
package LinkedList;

import java.util.Arrays;

public class DynIntArray {
    private int[] data = null;
 
    public DynIntArray(int... data)
    {
        setData(data);
    }
  
    public DynIntArray(DynIntArray array)
    {
        this(array.data);
    }
    
    private void setData(int[]data)
    {
        if(data!=null&&data.length>0)
        {
            this.data = new int[data.length];
            System.arraycopy(data, 0, this.data, 0, data.length);
        }
    }
      
    private void checkIndex(int i)
    {
        if(this.data == null)
        {
            throw new IllegalArgumentException("Array is empty");
        }
        if(i<0||i>=this.data.length)
        {
            throw new IllegalArgumentException("Index "+i+" is wrong");
        }
    }
     
    public int at(int i)
    {
        checkIndex(i);
        return this.data[i];
    }
         
    public void at(int i, int value)
    {
        checkIndex(i);
        this.data[i] = value;
    }
            
    public int size()
    {
        return this.data != null?this.data.length:0;
    }
               
    public boolean isEmpty()
    {
        return this.data == null || this.data.length==0;
    }
                 
    public void resize (int newLength)
    {
        int[] buff = new int[newLength];
        System.arraycopy(this.data, 0, buff, 0, newLength);
        this.data = buff;
    }
                   
    public String str()
    {
        return Arrays.toString(this.data);
    }
    
}
