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
            System.out.println(temp.data + "<-->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        
    }
}
