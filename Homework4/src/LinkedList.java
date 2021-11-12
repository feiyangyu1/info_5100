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

    public LinkedList(){
        this.head = null;
        this.size = 0;
    }

    public void addAtPosition(int index, int element){
        synchronized (Main.obj){
            Node newNode = new Node(element);
            Node currNode = head, prevNode = null;
            int position = 0;
            if(this.head == null){
                this.head = newNode;
                size ++;
                return;
            }
            else if(index == 0){
                head = newNode;
                newNode.next = currNode;
                size ++;
                return;
            }

            if(index > this.size() || index < 0) return;

            while(position < index - 1){
                currNode = currNode.next;
                position ++;
            }

            if(position == index - 1){
                newNode.next = currNode.next;
                currNode.next = newNode;
                size ++;
            }


        }
    }

    public void removeAtPosition(int index, int element){
        synchronized (Main.obj){
            if(index > size() - 1 || index < 0) return;

            Node currNode = head, prevNode = null;
            int position = 0;

            if(index == 0 && head.val == element){
                this.head = currNode.next;
                size --;
                return;
            }

            while(position != index){
                prevNode =currNode;
                currNode = currNode.next;
                position ++;
            }
            if(currNode.val == element){
                prevNode.next = currNode.next;
                size --;
                return;
            }
            else
                System.out.println("The element in this position is not matched.");


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
        synchronized (Main.obj) {
            return size;
        }
    }
}
