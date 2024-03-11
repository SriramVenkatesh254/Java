class Student{
    int rollNumber;
    String name;
    int marks;
}

public class ArraysOfObjects {
    public static void main(String a[]){
        Student s1 = new Student();
        s1.rollNumber = 1;
        s1.name = "Sriram";
        s1.marks = 97;

        Student s2 = new Student();
        s2.rollNumber = 2;
        s2.name = "Bala";
        s2.marks = 80;

        Student s3 = new Student();
        s3.rollNumber = 3;
        s3.name = "Harees";
        s3.marks = 98;


        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        //Using Normal For Loop
        for(int i = 0; i < students.length; i++){
            System.out.println(students[i].name + " : " + students[i].marks);
        }

        //Using Enhanced ForLoop
        for(Student i : students){
            System.out.println(i.name + " : " + i.marks);
        }
    }
}
