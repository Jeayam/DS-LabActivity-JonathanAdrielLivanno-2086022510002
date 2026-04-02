package ds.lab.activity;

class Node {
    int data;
    Node next;

    public Node(int data){
        this.data=data;
        this.next=null;
    }
}


public class Main {
    Node head;
    public void tambahDepan(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void tambahBelakang(int data){
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current=current.next;
        }
        current.next = newNode;
    }

    public void display(){
        Node current = head;
        while (current!=null) {
            System.out.print(current.data+" -> ");
            current=current.next;
        }
        System.out.println("null");
    }

    public boolean search(int key){
        Node current = head;
        while (current!=null) {
            if (current.data == key) {
                return true;
            }
            current=current.next;
        }
        return false;
    }

    public void delete(int key){
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        if (head.data == key) {
            head = head.next;
            return;
        }
        Node current = head;
        while (current.next != null && current.next.data != key) {
            current=current.next;
        }
        if (current.next == null) {
            System.out.println("Value not found.");
        } else{
            current.next=current.next.next;
        }
    }

    public static void main(String[] args) {
        Main LL = new Main();

        LL.tambahDepan(20);
        LL.tambahDepan(10);
        LL.display();

        LL.tambahBelakang(30);
        LL.tambahBelakang(40);
        LL.display();

        boolean ketemu1 = LL.search(30);
        if (ketemu1){
            System.out.println("true");
        } else{
            System.out.println("false");
        }
        LL.delete(20);
        LL.display();
        LL.delete(10);
        LL.display();
        boolean ketemu2 = LL.search(100);
        if (ketemu2){
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
