package linkedlist;

public class SearchValue {
    int data;
    Node next;
    public SearchValue(int data){
        this.data=data;
        this.next=null;
    }
    public static boolean searchvalue(Node head,int key){
        Node cur=head;
        while (cur!=null){
            if(cur.data==key){
                return true;
            }
            cur=cur.next;
        }
        return false;
    }
    public static void main(String [] args){
        Node head= new Node(10);
        head.next=new Node(20);
        head.next.next=new Node(30);
        int key=26;
        if(searchvalue(head,key)){
            System.out.println(key+ " present");
        }
        System.out.println("Not present");
    }

}
