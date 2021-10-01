public class Student implements Comparable <Student> {
    private String name;
    private int age;
    private String addrees;

    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, int age, String addrees) {
        this.name = name;
        this.age = age;
        this.addrees = addrees;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddrees() {
        return addrees;
    }

    public void setAddrees(String addrees) {
        this.addrees = addrees;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student student) {
        return this.getName().compareTo(student.getName());
    }
}

