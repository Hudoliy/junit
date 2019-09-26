/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedList;

public class OneLinkedList {
    
    private OneLinkedNote root = null;

    public void addFirst(int data)
    {
        if(root == null)
        {
            root = new OneLinkedNote(data);
        }
        else
        {
            root = new OneLinkedNote(data, root);
        }
        
    }
    public void addLast(int data)
    {
        if(root == null) {addFirst(data);}
        else
        {
            OneLinkedNote node = root;
            while(node.next()!=null)
            {
                node = node.next();
            }
            node.setNext(new OneLinkedNote(data));
        }
        
    }
    public void removeFirst()
    {
        if(root!=null)
        {
            OneLinkedNote node  = root.next();
            root.setNext(null);
            root = node;
        }
        
    }
    public void removeLast()
    {
        if(root!=null)
        {
            
            OneLinkedNote node = root;
            OneLinkedNote prev = node;
            while(node.next()!=null)
            {
                prev = node;
                node = node.next();
            }
            prev.setNext(null);
        }
        
    }
    public OneLinkedNote find (int data)
    {
        OneLinkedNote node = root;
        while(node!=null&&node.getData()!=data)
        {
            node = node.next();
        }
        return node; 
    }
    
    public int count()
    {
        if(root==null)
            return 0;
        else
        {
            int am = 0;
            OneLinkedNote node = root;
            while(node!=null)
            {
                node = node.next();
                am++;
            }
            return am;
        }
    }
    
    public void toStr()
    {
        if(root!=null)
        {
            OneLinkedNote node = root;
            while(node!=null)
            {
                System.out.print(node.getData()+" ");
                node = node.next();
            }
            System.out.println(" ");
        }
    }
    public void reverse()
    {
        OneLinkedNote first = root;
        OneLinkedNote second = root.next();
        OneLinkedNote third = second.next();
        first.setNext(null);
        second.setNext(first);
        
        OneLinkedNote current = third;
        OneLinkedNote prev = second;
        
        while(current!=null)
        {
            OneLinkedNote next = current.next();
            current.setNext(prev);
            
            prev = current;
            current = next;
        }
        root = prev;
    }
    public void sort()
    {
            OneLinkedNote new_root = null;
            
            while(root!=null)
            {
                OneLinkedNote node = root;
                root = root.next();
                
                if(new_root == null||node.getData()<new_root.getData())
                {
                    node.setNext(new_root);
                    new_root = node;
                    
                }
                else
                {
                    OneLinkedNote current = new_root;
                    while(current.next()!=null&&!(node.getData()<current.next().getData()))
                    {
                        current = current.next();
                    }
                    node.setNext(current.next());
                    current.setNext(node);
                }
                
            }
    
        root = new_root;
    }
    public OneLinkedNote getRoot()
            {return root;}
    public static void main(String[] args)
{
   OneLinkedList list = new OneLinkedList();
   list.addFirst(1);
   for(int i = 2; i<11; i++)
       list.addLast(i);
   list.toStr();
   list.removeLast();
   list.removeLast();
   list.toStr();
   System.out.println(list.count());
   list.reverse();
   list.toStr();
   list.sort();
   list.toStr();
   OneLinkedList n = new OneLinkedList();
   System.out.println(n.count());
}
}


