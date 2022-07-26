
class Base{
    private int a;
    int b;
    public Base(int a){
        this.a=a;
        System.out.println(a);
    }

    public Base(Base c){
        System.out.println("Copy constructor called");
        a=c.a;
        System.out.println(a);
    }
}

public class cpyconstructir {
    public static void main(String[] args) {
        Base c2= new Base(5);
        Base c1= new Base(c2);
        Base c3=c1;
    }
}
