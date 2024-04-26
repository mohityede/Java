package OOPs.Comparable;

import java.util.Arrays;
import java.util.Comparator;

public class Student implements Comparable<Student> {
    public int rollNo;
    public int marks;

    public Student(int rollNo,int marks){
        this.rollNo=rollNo;
        this.marks=marks;
    }

    @Override
    public int compareTo(Student o) {
        return this.marks-o.marks; // 0: same , -1 : o is greater , +1 : this is greater
    }

    @Override
    public String toString() {
        return this.rollNo+"&"+this.marks;
    }

    public static void main(String[] args) {
        Student s1=new Student(12, 38);
        Student s2=new Student(13, 70);
        Student s3=new Student(14, 98);
        Student s4=new Student(15, 88);

        Student[] arr=new Student[]{s1,s3,s2,s4};

        System.out.println(Arrays.toString(arr));
        // Arrays.sort(arr,new Comparator<Student>() {
        //     @Override
        //     public int compare(Student o1, Student o2) {
        //         return o2.marks-o1.marks;
        //     }
        // });

        Arrays.sort(arr,(o1,o2)->(o1.marks-o2.marks));
        System.out.println(Arrays.toString(arr));


        // if(s2.compareTo(s4) < 0){
        //     System.out.println("S2 has more marks than s4");
        // }   
    }
}
