package pl.sda.savejson;

import com.fasterxml.jackson.databind.ObjectMapper;
import pl.sda.studentmodel.Student;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * @author perczynski
 */
public class Main {
    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper();
        List<Student> studentList = new ArrayList<>();
//        new Student("Jas", "Adamczyk",1);
        studentList.add(new Student("Jas", "Adamczyk", new Integer(1)));
        studentList.add(new Student("Gosia", "Bigos", 2));
        studentList.add(new Student("Michał", "Lucys", 3));
        studentList.add(new Student("Michalina", "Apek", 4));
        studentList.add(new Student("Krzysiu", "Piec", 5));
        try {
            String studentLst = mapper.writeValueAsString(studentList);
            System.out.println(studentLst);

            mapper.writeValue(new File("studenList.json"), studentList);

            // Files.write(Paths.get("studentList.json"), studentLst.getBytes());


        } catch (IOException e) {
            e.printStackTrace();

        }
    }
}
