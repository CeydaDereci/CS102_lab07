public class SimpleLinkedList {

    private Node head;
    private Node current;

    public SimpleLinkedList(){
        head = null;
    }

    public void addToTail(String data){
        Node newNode = new Node(data);
        Node temp = head;
        if(head == null)

        while(temp.getNext() != null)
            temp = temp.getNext();
        temp.setNext(newNode);
    }

    public String removeFromHead(){
        Node temp;
        String data;
        if( head == null ){
            return null;
        }
        if(head.getNext() != null){
            temp = head.getNext();
            data = head.getData();
            head = temp;
            return data;
        }
        else{
            data = head.getData();
            head = null;
            return data;
        }
    }

    public boolean isEmpty(){
        return head == null;
    }

    public Node get(String data){
        Node temp = head;
        while(temp != null){
            if(temp.getData().equals(data))
                return temp;
        }
        return null;

    }
    public String toString(){
        String nodeStr = "";
        Node temp = head;
        while(temp != null){
            nodeStr = nodeStr + temp.getData() + "\n";
            temp = temp.getNext();
        }
        return nodeStr;

    }

    public Node getIndex(int index){
        if(head == null){
            return head;
        }
        int i = 0;
        Node temp = head;
        while(temp != null && i == index){
            temp = temp.getNext();
        }
        if(i != index) {
            return null;
        }
        else{
            return temp;
        }

    }
}
