/*
import java.io.*;
import java.util.*;
class Student implements Serializable {
    int rollNo;
    String name;
    int age;

    Student(int rollNo, String name, int age){
        this.rollNo = rollNo;
        this.age = age;
        this.name = name;


    }

    public String toString(){
        return rollNo + " " + age + " "  + name;
    }
}

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Array List
        ArrayList<String> ar1 = new ArrayList<>();
        ar1.add("Smit");
        ar1.add("Vivek ");
        ar1.add("Kunal");

        System.out.println(ar1.get(1));
        ar1.set(1, "Pruthvi");

        Collections.sort(ar1);
        System.out.println(ar1);

        Iterator itr = ar1.listIterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }


    */
/*    do {
            System.out.println("Enter your name");
            String name = sc.nextLine();
            ar1.add(name);
        }while (true);*//*


        ArrayList<Student> tempStudent = new ArrayList<>();
        Student s1=new Student(101,"Sonoo",23);
        Student s2=new Student(102,"Ravi",21);
        Student s3=new Student(103,"Hanumat",25);

        tempStudent.add(s1);
        tempStudent.add(s2);
        tempStudent.add(s3);



        try{
            FileOutputStream fileOutputStream = new FileOutputStream("file.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            //writeObject writes the specified object
            objectOutputStream.writeObject(tempStudent);
            fileOutputStream.close();
            objectOutputStream.close();


            FileInputStream fileInputStream=new FileInputStream("file.txt");
            ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
            ArrayList  list=(ArrayList)objectInputStream.readObject();
            System.out.println(list);
        }catch (Exception e)
        {
            System.out.println(e);
        }


    }
}
*/
