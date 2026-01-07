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
    System.out.println("null");
}
public void deleteAtStart(){
    if(head == null) return;
    head = head.next;
}
public void deleteAtEnd(){
    if(head == null || head.next == null){
        head = null;
        return;
    }
    Node temp = head;
    while(temp.next.next != null){
        temp = temp.next;
    }
    temp.next = null;
}
public void deleteValue(int data){
    if(head.data == data){
        head = head.next;
        return;
    }
    Node temp = head;
    while(temp.next.data != data && temp.next != null){
        temp = temp.next;
    }
    if(temp.next != null){
        temp.next = temp.next.next;
    }
}
public boolean search(int data){
    Node temp = head;
    while(temp != null){
        if(temp.data == data) return true;
        temp = temp.next;
    }
    return false;
}
public void sort(){
    Node curr, index;
    int temp;

    for (curr = head; curr != null; curr = curr.next) {
        for (index = curr.next; index != null; index = index.next) {
            if (curr.data > index.data) {
                temp = curr.data;
                curr.data = index.data;
                index.data = temp;
            }
        }
    }
}

    public static void main(String[] args) {
        LL list = new LL();
        list.insertAtEnd(56);
        list.insertAtEnd(53);
        list.insertAtEnd(52);
        list.insertAtEnd(50);
        list.traverse();
        list.sort();
        // list.deleteValue(6);
        list.traverse();
        // System.out.println(list.search(6));
    }
    
}
