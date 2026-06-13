package four;

public class IntList {
    public int head;
    public IntList tail;

    public IntList(int head, IntList tail){this.head=head;this.tail=tail;}

    public void printList(int n){
        if(n<=0){
            System.out.println();
            return;
        }
        System.out.print(head+" ");
        if(tail==null)
            System.out.println();
        else
            tail.printList(n-1);
    }
    //所以在构造链表时 可以使用tail.func的方式 递归 这样也不会改变每一个节点的值
    public void concat(IntList l){
        if(tail==null)
            tail=l;
        else tail.concat(l);
        //这里直接用本身自己的节点调用这个函数
        //直接就完成了一次向下递推
    }
    public void loop(){this.concat(this);}
}
