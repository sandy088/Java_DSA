import java.util.Scanner;

class Student{
    private String name;
    private String rollNo;
    private String Address;

    public  Student(String name, String rollno, String Address){

        this.name= name;
        this.rollNo= rollno;
        this.Address= Address;




    }
    public String print(){
        return "Name: "+name+" Rollno: "+rollNo+" Address: "+Address;
    }

}

public class start {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        //Student Details required
        String name;
        String rollNO;
        String Address;

        System.out.println("Enter the number of How many students's data you wants to Store");
        int n= sc.nextInt();


        Student [] s= new Student[n];


        for(int i=0; i<n; i++) {

            System.out.println("Enter the details of Student no. "+(i+1));
            name= sc.nextLine();
            rollNO = sc.nextLine();
            Address = sc.nextLine();
            s[i] = new Student(name, rollNO, Address);

        }


        for (int i = 0; i < n; ++i) {
            System.out.println(s[i].print());
        }
    }
}
