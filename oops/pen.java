
public class pen {
    public static void main(String [] args){
        penpro p = new penpro("red",10);
        System.out.print(p.color);
    }    
}

class penpro{
    String color;
    int size;
    public void setcolor(String color1){
        color = color1;
    }
    public void setsize(int Size){
        size = Size;
    }
    penpro(String col, int size){
        this.color=col;
        this.size = size;
    }
}
