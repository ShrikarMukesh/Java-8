package linkedlist;
//12 -->34 -->
public class LinkedList {

    public static  Node insert(int element , Node head){
        Node newNode = new Node(element);
        if(head == null){
            head = newNode;
            return head;
        }
        else{
            Node temp = head;
            while (temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
            return temp;
        }

    }
    public static void display(Node head){
        if(head == null){
            return;
        }
        else {
            while (head != null){
                System.out.println(head.data);
                head = head.next;
            }
        }
    }
    public static void main(String[] args) {
        Node head = new Node();
        insert(12, head);
        insert(13, head);
        insert(62, head);
        display(head);

    }
}
