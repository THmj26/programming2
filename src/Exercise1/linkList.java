package Exercise1;

public class linkList {
    int value;
    linkList next=null;

    linkList(int a,linkList next){value=a;this.next=next;}

    public void insert(linkList next){
        if(this.next==null)
            this.next=next;
        else
            this.next.insert(next);
    }

    public void exchange(){
        if(next!=null){
//            System.out.println("current is "+value+" next is "+next.value);
            synchronized (this){
                synchronized (next){
                    if(this.value>next.value){
                        int temp=this.value;
                        this.value= next.value;
                        next.value=temp;
                    }
                }
            }
        }
    }
    public void printList() {
        linkList current = this;
        while (current != null) {
            synchronized (current) {
                System.out.print(current.value + " ");
                current = current.next;
            }
        }
        System.out.println();
    }


}
