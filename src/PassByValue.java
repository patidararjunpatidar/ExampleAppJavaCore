import com.sun.org.apache.xml.internal.utils.StringToStringTable;

public class PassByValue {

    public static void main(String[] args) {
        Student student1 = new Student("Steve");
        Student student2 = new Student("Bill");

        System.out.println("Before Swap:- student1: "+ student1 +" student2: "+student2);
          swap(student1, student2);
        System.out.println("After Swap:- student1: "+student1+" student2: "+student2);
    }

    public  static void swap(Student animal1,Student animal2){
        Student temp = new Student("");
        temp = animal1;
        animal1= animal2;
        animal2=temp;
    }
    }

class Student{
    String name;

    public  Student(String name){
        this.name= name;
    }

    public String toString(){
        return  name;
    }
}
