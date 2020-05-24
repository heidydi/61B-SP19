public class ArrayDeque<Hehe> implements Deque<Hehe> {
    Hehe[] items;
    int capacity;
    int RFACTOR=2;
    int first, last;
    int SFACTOR=4;

    public ArrayDeque(){
        items=(Hehe[]) new Object[8];
        capacity=8;
        first=-1;
        last=-1;
    }

    public ArrayDeque(ArrayDeque other){
        items=(Hehe[]) new Object[other.capacity];
        System.arraycopy(items,0,other,0,other.capacity);
        capacity=other.capacity;
        first=other.first;
        last=other.last;
    }

    private void resize(int cap){
        Hehe[] a=(Hehe[]) new Object[cap];
        for(int i=0;i<size();i++){
            a[i]=items[(i+first)%capacity];
        }
        first = 0;
        last = size()-1;
        items=a;
        capacity=cap;
    }

    public void addFirst(Hehe x){
        if(first==-1){
            items[0]=x;
            first=0;
            last=0;
            return;
        }
        if(size()==capacity){
          resize(capacity*RFACTOR);
        }
        first=first-1;
        if (first<0){
          first=first+capacity;
        }
        items[first]=x;
    }

    public void addLast(Hehe x){
        if(first==-1){
            items[0]=x;
            first=0;
            last=0;
            return;
        }
        if(size()==capacity){
            resize(capacity*RFACTOR);
        }
        last=(last+1)%capacity;
        items[last]=x;
    }

    public int size(){
        if(first==-1){
            return 0;
        }
        int n=last-first+1;
        if (n<=0){
            return n+capacity;
        }
        return n;
    }

    public void printDeque(){
        for(int i=first; i!=last; i=(i+1)%capacity){
            System.out.print(items[i]);
        }
        System.out.print(items[last]);
    }

    public Hehe removeFirst(){
        if(capacity/size()>SFACTOR){
            resize(capacity/RFACTOR);
        }
        Hehe x=items[first];
        first=(first+1)%capacity;
        return x;
    }

    public Hehe removeLast(){
        if(capacity/size()>SFACTOR){
            resize(capacity/RFACTOR);
        }
        Hehe x=items[last];
        last=(last-1+capacity)%capacity;
        return x;
    }

    public Hehe get(int index){
        return items[index];
    }
}
