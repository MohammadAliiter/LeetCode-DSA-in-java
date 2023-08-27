class Middle_Element_in_linklist
{
 static class  Node{
        int data;
        Node next;
        Node(int x){
            this.data = x;
        }
    }
   static int getMiddle(Node head)
    {
        Node fast = head;
        Node slow = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow.data;
    }
    public static void main(String args[]){
        Node a = new Node(10);
          Node b = new Node(20);
            Node c = new Node(30);
              Node d = new Node(40);
                Node e = new Node(50);
                a.next = b;
                b.next = c;
                c.next = d;
                d.next = e;
                
             Node head = a;
             
             System.out.print( getMiddle(head));
             
            }
    }


