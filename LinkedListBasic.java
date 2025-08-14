public class LinkedListBasic {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    //-----------------------Add a node / Head 
    public void addFirst(int data){
        // Step1 - create newNode..
        Node newNode = new Node(data);
        size++;
        if(head == null){
           head = tail = newNode;
           return;
        }

        // step2 - newNode = head..
        newNode.next = head;// linking step..
        
        //Step3 - head = newNode..
        head = newNode; 

    }
    //-------------Add a node / Tail
    public void addLast(int data){
        // Step1 - create newNode..
        Node newNode = new Node(data);
        size++;
        if(head == null){
           head = tail = newNode;
           return;
        }

        // step2 - newNode = tail..
        tail.next = newNode;// linking step..

        //Step3 - tail= newNode..
        tail = newNode; 
    }
    public void print(){
        Node temp = head;
        if(head == null){
           System.out.print("Null");
        }
        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println();
    }
    //-----------Add a node in a middle of the linked list 
    public void addMiddle(int idx, int data){
        if(idx == 0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while(i < idx-1){
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;

    }
    //---------------Remove first node in the linked list 
    public int removeFirst(){
        if(size == 0){
            System.out.print("ll is Empty.");
            return Integer.MIN_VALUE;
        }else if(size == 1){
           int val =head.data;
           head = tail =null;
           size = 0;
           return val;
        }
        int val = head.data;
        head = head.next;// remove first
        size--;
        return val;
    }
    //---------------Remove last node in linked list
    public int removeLast(){
        if(size == 0){
            System.out.print("ll is Empty.");
            return Integer.MIN_VALUE;
        }else if(size == 1){
           int val = head.data;
           head = tail = null;
           size = 0;
           return val;
        }
        Node prev = head;
        
        // prev : i -> size -2; 
        for(int i = 0; i < size-2; i++){
            prev = prev.next;
        }
        int val = prev.next.data;// tail.data
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }
    //----------Iterative approach to search in linked list
    public int itrSearch(int key){//0(n)
        Node temp = head;
        int i = 0;
        while(temp != null){
            if(temp.data == key){
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }
    //------------------------------------Recursive approach in linked list to search
    public static int key;
    public int helper(Node head, int Key){//0(n)
        if(head == null){
            return -1;
        }
        if(head.data == key){
            return 0;
        }
        int idx = helper(head.next, key);
        if(idx == -1){
            return -1;
        }
        return idx+1;
    }
    public int recSearch(int key){
        return helper(head, key);
    }
    //---------------Reverse the linked list 
    public void reverse(){//0(n)
        Node prev = null;
        Node curr = tail = head;// here is optional to write tail (We just making head to tail that's why we used it...)
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }
    public void deleteNthNodeFromLast(int n){
        //Calculate the size ll
        int sz = 0;
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            sz++;
        }
        if(n == sz){
            head = head.next;// remove First
            return;
        }
          //sz - n 
        int i = 1;
        int iTOFind = sz - n;
        Node prev = head;
        while(i < iTOFind){
           prev = prev.next;
           i++;
        }
        prev.next = prev.next.next;
        return ;
    }
    //----------------------Check palindorme
    public Node findMid(Node head){//Slow fast concept / approach 
        Node slow = head;
        Node fast = head;
        
        while(fast != null && fast.next == null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;//Bcz slow will be midNode
    }
    public boolean checkPallindrone(){
        if(head == null || head.next != null){
            return true;
        }
        //Step1 - find mid
        Node midNode = findMid(head);
        
        //Step2 - reverse 2nd half
        Node prev = head;
        Node curr = midNode;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev;//right half head
        Node left = head;//left half head

        //step3 - check left half AND right half
        while(right != null){
            if(left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }
    public void ZigZag(){
        // find mid 
        Node slow = head;
        Node fast = head.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;

        // Reverse 2nd half
        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node left = head;
        Node right = prev;
        Node nextL, nextR;

        // Alternate merge (Zig-Zag merge )
        while(left != null && right != null){
            nextL = left.next;
            left.next = right;
            nextR = right.next;
            right.next = nextL;
        }
    }
    public static void main(String[] args) {
        
       //LinkedListBasic ll = new LinkedListBasic();
  
      //    ll.head = new Node(1);
      //    ll.head.next = new Node(2);
      //ll.print();
     // ll.addFirst(5);
      //ll.print();
     //   ll.addFirst(4);
     //   ll.addFirst(3);
     //   ll.addFirst(2);
     //   ll.addFirst(1);
      //ll.print();
      
      
    //  ll.addLast(1);
    //ll.print();
    //   ll.addLast(4);
    //   ll.addMiddle(2, 5);
    //   ll.print();
    //  System.out.println(ll.size);
    //   ll.removeFirst();
    //   ll.print();
    //   System.out.println(ll.size);
    //   ll.removeLast();
    //   ll.print();
    //   System.out.println(ll.size);
    //   System.out.println(ll.itrSearch(5));
    //   System.out.println(ll.recSearch(5));
    //   ll.reverse();
    //   ll.print();
    //    ll.deleteNthNodeFromLast(2);
    //    ll.print();
    //System.out.println(ll.checkPallindrone());
    // ll.print();
    // ll.ZigZag();
    // ll.print();


    }
}
