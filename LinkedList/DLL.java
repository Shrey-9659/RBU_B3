package LinkedList;
class DoubleNode{
    int data;
    DoubleNode next;
    DoubleNode prev;
    DoubleNode(int data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
public class DLL {
    DoubleNode head;
    public void forwardTraversal(){
        DoubleNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + "<-->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public void backwardTraversal(){
        DoubleNode temp = head;
        if(temp == null) return;
        while(temp.next != null){
            temp = temp.next;
        }
        while (temp != null) {
            System.out.print(temp.data + "<-->");
            temp = temp.prev;
        }
        System.out.println("null");
    }
    public void insertAtStart(int data) {
    DoubleNode newNode = new DoubleNode(data);

    if (head != null) {
        head.prev = newNode;
        newNode.next = head;
    }

    head = newNode;
}
public void insertAtEnd(int data) {
    DoubleNode newNode = new DoubleNode(data);

    if (head == null) {
        head = newNode;
        return;
    }

    DoubleNode temp = head;
    while (temp.next != null) {
        temp = temp.next;
    }

    temp.next = newNode;
    newNode.prev = temp;
}


    public static void main(String[] args) {
        DLL list = new DLL();
        list.insertAtStart(0);
        list.insertAtStart(1);
        list.insertAtStart(2);
        list.insertAtStart(3);
        list.insertAtStart(4);
        list.forwardTraversal();
        list.backwardTraversal();
    }
}
