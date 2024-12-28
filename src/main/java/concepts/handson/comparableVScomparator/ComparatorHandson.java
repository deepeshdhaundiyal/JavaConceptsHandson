package concepts.handson.comparableVScomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorHandson {

    public static void main(String[] args) {

        ArrayList list = new ArrayList<>();
        list.add(111);
        list.add(516);
        list.add(715);
        list.add(419);
        list.add(312);
        list.add(213);

        /*System.out.println(list);

        //demonstrating comparator usage with Lambda expression help :
        Comparator<Integer> obj = (o1, o2) -> (o1 % 10 > o2 % 10) ? 1 : -1;

        Collections.sort(list,obj);

        System.out.println(list);*/

        List<Student> studentsList = new ArrayList<>();

        studentsList.add(new Student(24,"Deepesh"));
        studentsList.add(new Student(34,"Rahul"));
        studentsList.add(new Student(3,"Srv"));
        studentsList.add(new Student(36,"Grv"));
        studentsList.add(new Student(4,"Dinesh"));

        //demonstrating comparator usage with Lambda expression help :
        Comparator<Student> studentComparator = ((o1, o2) -> (o1.rollNo > o2.rollNo) ? 1 : -1);
        Collections.sort(studentsList,studentComparator);
        System.out.println(studentsList);


    }
}

class Student {

    int rollNo;
    String name;

    Student(int rollNo, String name){

        this.name = name;
        this.rollNo = rollNo;

    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                '}';
    }
}