package pl.sda.readjson;

import com.fasterxml.jackson.databind.ObjectMapper;
import pl.sda.studentmodel.Student;

import java.io.File;
import java.io.IOException;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author perczynski
 */
public class readjson {
    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper();

        try {

            File personFile = new File("studenList.json");
            Student[] personArray = mapper.readValue(personFile, Student[].class);
            System.out.println(personArray[0].toString());
            List<Student> studentList = Arrays.asList(personArray);
            List<Student> filtered = studentList
                    .stream().filter(s->s.getName().startsWith("A")).collect(Collectors.toList());
            for (Student s : filtered) {
                System.out.println(s);

            }
            } catch(
                    IOException e){

            }


            }


        }


