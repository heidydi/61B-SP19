public class LinkedListDeque <Hehe> implements Deque<Hehe> {

    public class Node{
        public Node prev;
        public Node next;
        public Hehe item;

        public Node(Hehe i,Node n,Node p){
            item=i;
            next=n;
            prev=p;
        }
    }

    private Node sentinelF;
    private Node sentinelL;
    private int size;

    public LinkedListDeque(){
        sentinelF=new Node(null, null, null);
        size=0;
        sentinelL=new Node(null, null, sentinelF);
        sentinelF.next=sentinelL;
    }

    public LinkedListDeque(Hehe x){
        sentinelF=new Node(null,null,null);
        size=1;
        sentinelF.next=new Node(x, null, sentinelF);
        sentinelL=new Node(null, null, sentinelF.next);
        sentinelF.next.next=sentinelL;
    }

    public void addFirst(Hehe item){
        sentinelF.next=new Node(item,sentinelF.next,sentinelF);
        sentinelF.next.next.prev=sentinelF.next;
        size+=1;
    }

    public void addLast(Hehe item){
        sentinelL.prev=new Node(item, sentinelL,sentinelL.prev);
        sentinelL.prev.prev.next=sentinelL.prev;
        size+=1;
    }

    public int size(){
        return size;
    }

    public void printDeque(){
        Node p=sentinelF.next;
        while (p!=sentinelL){
            System.out.println(p.item);
            p=p.next;
        }
    }

    public Hehe removeFirst(){
        if (size==0){
            return null;
        }
        Hehe value=sentinelF.next.item;
        sentinelF.next=sentinelF.next.next;
        sentinelF.next.prev=sentinelF;
        size-=1;
        return value;
    }

    public Hehe removeLast(){
        if (size==0){
            return null;
        }
        Hehe value=sentinelL.prev.item;
        sentinelL.prev=sentinelL.prev.prev;
        sentinelL.prev.next=sentinelL;
        size-=1;
        return value;
    }

    public Hehe get(int index){
        Node p=sentinelF.next;
        int i=0;
        while(i!=index){
            i++;
            p=p.next;
        }
        return p.item;
    }
}
