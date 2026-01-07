package LinkedList;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class LL {
    Node head;
    public void insertAtStart(int data) {
    Node newNode = new Node(data);

    newNode.next = head;
    head = newNode;
}
public void insertAtEnd(int data){
    Node newNode = new Node(data);
    if(head == null){
        head = newNode;
        return;
    }
    Node temp = head;
    while (temp.next != null) {
        temp = temp.next;
    }
    temp.next = newNode;
}
public void insertAtPos(int data, int pos){
    if(pos == 1){
        insertAtStart(data);
        return;
    }
    Node newNode = new Node(data);
    Node temp = head;
    for(int i = 1; i<pos-1; i++){
        if(temp == null){
            System.out.println("Invalid position");
            return;
        }
        temp = temp.next;
    }
    newNode.next = temp.next;
    temp.next = newNode;
}
public void traverse(){
    Node temp = head;
    while (temp != null) {
        System.out.print(temp.data + " -- ");
        temp = temp.next;
    }
    System.out.print("null");
}
    public static void main(String[] args) {
        LL list = new LL();
        list.insertAtEnd(5);
        list.insertAtEnd(6);
        list.insertAtEnd(7);
        list.insertAtEnd(8);
        list.traverse();
    }
    
}
