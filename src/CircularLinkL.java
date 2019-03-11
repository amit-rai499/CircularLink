class Node
{
    private int data;
    private Node next;

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
class circularlist
{
    Node start;
    public boolean isEmpty()
    {
        return(start==null);
    }
    public void display()
    {
        if(isEmpty())
        {
            System.out.println("No Node Available");
            return;
        }
        else
        {
            Node temp;
            temp=start;
            while(temp.getNext()!=start)
            {
                System.out.println(temp.getData()+" ");
                temp=temp.getNext();
            }
            System.out.println(temp.getData());
        }

    }
    public void insertend(int data)
    {
        Node n=new Node();
        n.setData(data);
        if(isEmpty())
        {
            start=n;
            n.setNext(start);
        }
        else
        {
            Node temp=start;
            while(temp.getNext()!=start)
            {
                temp=temp.getNext();
            }
            temp.setNext(n);
            n.setNext(start);
        }
    }
    public void insertfirst(int data)
    {
        Node n=new Node();
        n.setData(data);
        if(isEmpty())
        {
            start=n;
            n.setNext(n);//start or n
        }
        else
        {
            Node temp=start;
            while(temp.getNext()!=start)
            {
                temp=temp.getNext();
            }
            temp.setNext(n);
            n.setNext(start);
            start=n;
        }
    }
    public void deletefirst()
    {
        if(isEmpty())
        {
            System.out.println("Node not available");
            return;
        }
        else
        {
            Node temp=start;
            while(temp.getNext()!=start)
            {
                temp=temp.getNext();
            }
            start=start.getNext();
            temp.setNext(start);
        }
    }
    public void deletelast()
    {
        Node temp=start;
        Node previous=new Node();
        while(temp.getNext()!=start)
        {
            previous=temp;
            temp=temp.getNext();
        }
        previous.setNext(start);
    }
}
class CircularLinkedL
{
    public static void main(String[] args) {
        circularlist obj=new circularlist();
        obj.insertfirst(20);
        obj.insertend(30);
        obj.insertend(40);
        obj.insertend(50);
        obj.display();
        System.out.println();
        obj.deletelast();
        obj.display();
    }
}
