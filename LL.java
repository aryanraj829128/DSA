package LL;

public class    LL {

    private Node head;
    private Node tail; //benefit of using this it will take O(n) time
    private int size;

    public LL(){
        this.size=0;
    }
    public void insertfirst(int val){
        Node node= new Node(val);
        node.next= head;
        head=node;

        if(tail == null){
            tail=head;
        }
        size+=1;
    }
    public void insertlast(int value){
        if(tail==null){
            insertfirst(value);
            return;
        }
        Node node= new Node(value);
        tail.next=node;
        tail=node;
        size++;
    }
    public void insert(int value, int index ){
        if(index==0){
            insertfirst(value);
            return;
        }
        if(index==size){
            insertlast(value);
            return;
        }
        Node temp= head;
        for(int i=1 ; i< index ; i++){
            temp= temp.next;
        }
        Node node = new Node(value, temp.next);
        temp.next= node;
        size++;
    }
    public int deletefirst(){
        int value= head.value;
        head= head.next;
        if(head==null){
            tail=null;
        }
        size--;
        return value;
    }
    public int deletelast(){
        if(size<=1){
            return deletefirst();
        }
        Node secondlast = get(size-2);
        int value= tail.value;
        tail=secondlast;
        tail.next=null;
        return value;
    }
    public Node find(int value){ //complexity O(n)
        Node node= head;
        while(node!=null){
            if(node.value == value){
                return node;
            }
            node = node.next;
        }
        return null;
    }
    public void reverse() {
        if (head == null || head.next == null) {
            return;
        }

        Node prev = null;
        Node current = head;
        Node next = null;
        tail = head;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        head = prev;
        /*head
 ↓
1 → 2 → 3 → 4 → null
                ↑
               tail
               prev = null
current = head (node 1)
next = null
tail = head (so tail now = node 1)
next = current.next	next = 2
current.next = prev	1 → null (pointer reversed)
prev = current	prev = 1
current = next	current = 2
List now looks like:
prev        current
 ↓            ↓
1 → null     2 → 3 → 4 → null
Iteration 4

Current node = 4

Action	Result
next = null
current.next = prev	4 → 3
prev = 4
current = null (loop ends)

Final structure:

prev
 ↓
4 → 3 → 2 → 1 → null*/
    }


    public Node get(int index){
        Node node= head;
        for(int i=0; i<index; i++){
            node= node.next;
        }
        return node;
    }

    public int delete(int index){
        if(index==0){
            return deletefirst();
        }
        if(index == size-1){
            return deletelast();
        }
        Node prev= get(index-1);
        int value = prev.next.value;
        prev.next= prev.next.next;
        return value;
    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value + "---->");
            temp=temp.next;
        }
        System.out.println("END");
    }


    private class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value=value;
        }

        public Node(int value, Node next){
             this.value=value;
             this.next=next;

        }

    }

}
