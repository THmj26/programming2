package Exercise1;

public class threadNode extends Thread{
    public linkList node;
    threadNode(linkList l,String name){
        super(name);
        node=l;
    }
    @Override
    public void run() {
        while (!interrupted()) {
//            System.out.println("现在是线程" + this.getName() + "在运行");
            node.exchange();
        }
    }
}
