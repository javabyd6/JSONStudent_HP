package pl.sda.readjson;

import com.fasterxml.jackson.databind.ObjectMapper;
import pl.sda.studentmodel.Student;

import java.io.File;
import java.io.IOException;

/**
 * @author perczynski
 */
public class readjson {
    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper();

        try {


            File personFile = new File("studentList.json");
            Student[] personArray = mapper.readValue(personFile, Student[].class);
            System.out.println(personArray[0].toString());
        } catch (
                IOException e) {


        }
    }

}
