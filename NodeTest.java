class Node{
    int value;
    Node next;
public Node(int value){
    this.value=value;
    this.next=null;
}}
public class NodeTest {
     public static Node pushFront(Node head,int value){
         Node node = new Node(value);
         node.next=head;
         return node;
     }
     public static Node pushBack(Node head,int value){
         Node node =new Node(value);
         while (head==null){
             node.next=head;
             return node;
         }
         Node last=getLast(head);
         last.next=node;
         return head;
     }
     public static Node popFront(Node head){
         if(head==null){
             System.out.println("链表为空,无法删除");
             return null;
         }
         return head.next;
     }
     public static Node popBack(Node head){
        if(head==null){
            System.out.println("链表为空,无法删除");
            return null;
        }
        if(head.next==null){
            return null;
        }else{
            Node lastLast = getLastLast(head);
            lastLast.next = null;
        }
        return head;
    }
     public static Node getLast(Node head){
         Node last = head;
         while(last.next!=null){
             last=last.next;
         }
         return last;
     }
     public static Node getLastLast(Node head){
         Node cur = head;
         while(cur.next.next!=null){
             cur=cur.next;
         }
         return cur;
     }
     public static void disPlay(Node head){
         Node cur = head;
         while(cur!=null){
                 System.out.printf("(%d)-->", cur.value);
                 cur=cur.next;
         }
         System.out.println("null");
         /*for(Node cur = head;cur!=null;cur=cur.next){
             System.out.printf("(%d) --> ", cur.value);
         }
         System.out.println("null");*/
     }
     public static Node creatLinkList(){
         Node n1 = new Node(1);
         Node n2 = new Node(2);
         Node n3 = new Node(3);
         Node n4 = new Node(4);
         Node n5 = new Node(5);
         n1.next = n2;
         n2.next = n3;
         n3.next = n4;
         n4.next = n5;
         n5.next = null;
         return n1;
     }
     public static void main(String args[]){
             Node head = creatLinkList();
             disPlay(head);
         head = pushFront(head, 888);
         disPlay(head);
         pushBack(head, 666);
         disPlay(head);
         head = null;
         disPlay(head);
         head = pushBack(head, 1);
         head = pushBack(head, 2);
         head = pushBack(head, 3);
         head = pushBack(head, 4);
         head = pushBack(head, 5);
         disPlay(head);
         head = popFront(head);
         head = popFront(head);
         disPlay(head);
         head = popBack(head);
         disPlay(head);
         head = popBack(head);
         disPlay(head);
     }
}
