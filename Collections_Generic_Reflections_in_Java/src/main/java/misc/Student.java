package misc;

public class Student {

    private String name;
    private int age;
    private String phoneno;

    public Student(String name, int age, String phoneno) {
        this.name = name;
        this.age = age;
        this.phoneno = phoneno;
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

    public String getPhoneno() {
        return phoneno;
    }

    public void setPhoneno(String phoneno) {
        this.phoneno = phoneno;
    }

    @Override
    public String toString() {
        return "Student[ name='" + name +  ", age=" + age + ", phoneno=" + phoneno + ']';
    }
}
