package MyLinkedList;

class Node{

     public int data;
    public Node next = null;

    public Node(int data){
        this.data = data;
    }
}

public class MyLinkedList {
    private Node head;
    private Node tail;

    public MyLinkedList(){
        head = null;
        tail = null;
    }

    // To insert a node or element
    public void insert(int value){
        Node node = new Node(value);
        if(isEmpty()){
            head = node;
            tail = node;
        }else{
            tail.next=node;
            tail = node;
        }
    }

    // To traverse the LinkedList and print the sum

    public int sum(){
        Node current = head;
        int sum = 0;
        while (current != null){
            sum += current.data;
            current = current.next;
        }
        return sum;
    }

    // To insert a node at beginning of LL
        public void insertAtFirst(int value){
        Node node = new Node(value);
        if(isEmpty()){
           insert(value);
            return;
        }
        node.next = head;
        head = node;
        }

        // To insert a node at a particular index

    public void insertAt(int index, int value){
        if(isEmpty()) throw new IllegalArgumentException();
        Node node = new Node(value);
        Node current = head;
        Node prev = null;

        while (index > 0 && current!=null){
            prev = current;
            current = current.next;
            index--;
        }
        prev.next= node;
        node.next=current;


    }

    // TO reverse a LL

    public void reverse(){
        if(head == null || head.next == null) return;
        Node prev = null;
        Node current = head;
        Node next = head.next;

        while (next != null){
            current.next = prev;
            prev = current;
            current = next;
            next = next.next;
        }

        current.next=prev;
        head = current;
    }

    // Delete node from beginning

    public void removeStart(){
        if(isEmpty()) return;
        Node temp = head;
        head = head.next;
        temp.next = null;
    }

    // Delete Node from end

    public void removeEnd(){
        if(isEmpty()) return;
        if(head == tail){
            head = tail = null;
            return;
        }
        Node current = head;
        while (current.next != tail){
            current = current.next;
        }
        current.next = null;
        tail = current;
    }

    // Remove nth node from end

    public void removeNthFromEnd(int n){
        if(isEmpty()) return;
        if(head.next == null){
            head = null;
            return;
        }

        Node fast = head;
        Node current = head;
        Node prev = null;

    while(n > 1 && fast != null){
        fast = fast.next;
        n--;
    }

    while(fast.next != null){
        prev = current;
        current = current.next;
        fast = fast.next;
    }
    prev.next = current.next;
    current.next = null;
    }


        // isEmpty function

    public boolean isEmpty(){
        return head == null && tail==null;
    }

    public String toString(){
        Node current = head;
        StringBuilder result = new StringBuilder();
        while(current!= null){
            result.append(current.data).append("-->");
            current = current.next;
        }
        return result.toString();
    }
}




