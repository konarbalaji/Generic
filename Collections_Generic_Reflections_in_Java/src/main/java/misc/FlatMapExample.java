package misc;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapExample {

    public static void main(String[] args) {

        List<SchoolClass> schoolClasses = createSchoolClass();

        List<List<String>> entireSchoolStudentsList = schoolClasses.stream()
                .map(schoolClass -> {
                    return schoolClass.getStudents().stream()
                            .map(Student::getName)
                            .collect(Collectors.toList());
                }).collect(Collectors.toList());

        System.out.println(entireSchoolStudentsList);

        List<String> entireSchoolStudentsList1 = schoolClasses.stream()
                                                    .flatMap(schoolClass -> {
                                                        return schoolClass.getStudents()
                                                                .stream()
                                                                .map(Student::getName);
                                                    }).collect(Collectors.toList());

        System.out.println(entireSchoolStudentsList1);


    }

    private static List<SchoolClass> createSchoolClass(){

        SchoolClass christinaclass = new SchoolClass("Christina");
        christinaclass.addStudent(new Student("Bob",11,"212-221-2332"));
        christinaclass.addStudent(new Student("Veronica",10,"212-221-4212"));
        christinaclass.addStudent(new Student("Amy",11,"212-221-3212"));
        christinaclass.addStudent(new Student("Shane",10,"212-221-1121"));

        SchoolClass shaneclass = new SchoolClass("Mr. Shane");
        christinaclass.addStudent(new Student("Gabrielle",11,"212-221-4358"));
        christinaclass.addStudent(new Student("Nick",10,"212-221-4522"));
        christinaclass.addStudent(new Student("Bella",11,"212-221-8744"));
        christinaclass.addStudent(new Student("Juan",10,"212-221-2272"));
        return Arrays.asList(christinaclass, shaneclass);

    }
}
