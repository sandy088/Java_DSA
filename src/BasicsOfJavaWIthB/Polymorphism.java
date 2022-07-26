package BasicsOfJavaWIthB;

abstract class base{

    public void sayHello(){
        System.out.println("Hello");
    }
    public void sayHello(int i){
        System.out.println("Hello "+i);
    }

    abstract public void sayBye();

}

class child extends base{
    public void sayBye(){
        System.out.println("Say bye");
    }
}

class child2 extends child{

}
class b extends child{

}

interface a{
    public void sayGoodMorn();
}

class multiple extends child2 implements a{
    public void sayGoodMorn(){
        System.out.println("Good MOrning");
    }
}

public class Polymorphism {

    public static void main(String[] args) {
        child b1= new child();
        child2 c2= new child2();
        multiple c3= new multiple();
        b1.sayHello();
        b1.sayHello(2);
        b1.sayBye();

        c2.sayBye();
        c3.sayGoodMorn();
    }
}
