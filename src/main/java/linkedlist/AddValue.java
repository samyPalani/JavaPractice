package linkedlist;

public class AddValue {
    int data;
    Node next;
    public AddValue(int data){
        this.data=data;
        this.next=null;
    }
    public static void printnode(Node head){
        Node cur=head;
        while (cur!=null){
            System.out.println(cur.data+" ");
            cur=cur.next;
        }

    }
    public static Node update(Node head,int newdata){
        Node new_node = new Node(newdata);
        new_node.next=head;
        return new_node;

    }
    public static void main(String [] args){
        Node head=new Node(10);
        head.next=new Node(20);
        head.next.next=new Node(10);
        head.next.next.next=new Node(10);
        printnode(head);
        int newdata=27;
        head=update(head,newdata);
        printnode(head);

    }
}
