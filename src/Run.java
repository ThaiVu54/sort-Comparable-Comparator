import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Run {
    public static void main(String[] args) {
        Student student = new Student("Thai", 30, "ND");
        Student student1 = new Student("Lap", 26, "HN");
        Student student2 = new Student("Xuan Anh", 38, "HT" );
        Student student3 = new Student("An", 38, "HT" );

        List<Student> lists = new ArrayList<Student>();
        lists.add(student);
        lists.add(student1);
        lists.add(student2);
        lists.add(student3);
        Collections.sort(lists);
        System.out.println("sap xep theo name:");
        for(Student st : lists){
            System.out.println(st.toString());
        }
        System.out.println();
        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(lists,ageComparator);
        System.out.println("So sanh theo tuoi:");
        for(Student st : lists){
            System.out.println(st.toString());
        }
    }
}
