public class LinkedList {

    Node head;
    int size;

    static class Node {
        int val;
        Node next;

        Node(int val){
            this.val = val;
            next = null;
        }
    }

    public int getFirst(){
        synchronized (Main.obj){
            return head.val;
        }
    }

    public int getLast(){
        synchronized (Main.obj){
            Node tail = head;
            while(tail.next != null){
                tail = tail.next;
            }

            return tail.val;
        }
    }

    public int size(){
        synchronized (Main.obj){
            size = 0;
            for(Node n = head; n.next != null; n = n.next)
                size ++;

            return size;
        }
    }
}
