package BasicsOfJavaWIthB;

class x{
    public void say(){
        System.out.println("Saying");
    }
}

class y extends x{
    public void singing(){
        System.out.println("Singing");
    }

    public void say(){
        System.out.println("saying from y");
    }

    public void walking(){
        System.out.println("Walking from y");
    }
}

interface i{
    public void walking();
}

class z extends y implements i{

    public void walking(){
        super.walking();
        System.out.println("walking");
    }
}



public class hybridInheritance {
    public static void main(String[] args) {
        z h= new z();
        h.say();
        h.walking();
    }
}
