public class linkedList {
    public linkedList() {
        Head = null;
        size=0;
    }

    LinkedListNode Head;
    int size;
    void InsertNode(int Value) {
        if (Head == null) {
            Head = new LinkedListNode();
            Head.Value = Value;
            size++;
            return;
        }
        LinkedListNode tempHead = Head;
        while (tempHead.next != null) {
            tempHead = tempHead.next;
        }
        tempHead.next = new LinkedListNode();
        tempHead.next.Value = Value;
        size++;
    }
    void InsertNode(int Value , int Index){
        if(Head==null && Index <=size){
            Head = new LinkedListNode();
            Head.Value = Value;
            size++;
            return;
        }
        else if (Index <= size){
            int IndexTracker = 0;
            LinkedListNode tempHead = Head;
            if(Index==0){
                LinkedListNode temp =  new LinkedListNode();
                temp.next =Head;
                Head = temp;
                Head.Value = Value;
                size++;
                return;
            }
            while (IndexTracker < size && IndexTracker<Index-1){
                tempHead = tempHead.next;
                IndexTracker++;
            }
            if(IndexTracker == size){
                return ;
                //reached the end
            }
            else{
                LinkedListNode temp =  new LinkedListNode();
                temp.next =tempHead.next;
                tempHead.next = temp;
                tempHead.next.Value = Value;
                size++;
            }
        }

    }

    void DeleteNode(int Value){
        LinkedListNode PrevNode= Head;
        LinkedListNode CurrNode = Head;
        if(size>0){
            while ( CurrNode != null && CurrNode.Value != Value){
                PrevNode = CurrNode;
                CurrNode=CurrNode.next;
            }
            if(CurrNode==null){
                return;
            }
            else if(CurrNode==PrevNode){
                Head=CurrNode.next;
            }
            else if(CurrNode.next ==null && CurrNode.Value==Value){
                PrevNode.next=CurrNode.next;
            }
            else {
                PrevNode.next=PrevNode.next.next;
            }
        }
    }
    void displayLinkedList() {
        LinkedListNode tempHead = Head;
        while (tempHead != null) {
            System.out.print(tempHead.Value + "\t");
            tempHead = tempHead.next;
        }
    }
}
