public class doublyLL {
    public class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;

        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    // print ll
    public void printDLL(){
        Node temp = head;
        System.out.println("null");
        while(temp != null){
           System.out.print(temp.data+"<->");
           temp = temp.next;
        }
        System.out.println();
    }

    //Add first
    public void  addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }
    // Add last 
    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail.prev = newNode;
        tail = newNode;
    }
    //Remove first
    public int removeFirst(){
       if(head == null){
        System.out.println("Dll is empty");
        return Integer.MIN_VALUE;
       }
       if (size == 1){
          int val = head.data;
          head =  tail = null;
          size--;
          return val;
       } 
       int val = head.data;
       head = head.next;
       size--;
       head.prev =null;
       return val;
    }
    // Remove last 
    
    public void reverse(){
        Node curr = head;
        Node prev = null;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            curr.prev = next;
            prev = curr;
            curr  = next;
        }
        head = prev;
    }
    public static void main(String[] args) {
        doublyLL dll = new doublyLL();
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);

        dll.printDLL();
        dll.removeFirst();
        dll.printDLL();

        dll.addLast(4);
        dll.printDLL();
        
        dll.printDLL();
        
        // dll.reverse();
        // dll.printDLL();

    }
}
