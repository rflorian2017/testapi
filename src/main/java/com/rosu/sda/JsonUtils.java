package com.rosu.sda;


import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class JsonUtils {

    public static List<Student> getStudents(String jsonString) {
        JSONArray studentJsonArray = new JSONArray(jsonString);
        List<Student> students = new ArrayList<Student>();
        for (int i = 0; i < studentJsonArray.length(); i++) {
            JSONObject jsonObject = studentJsonArray.getJSONObject(i);
            Student student = new Student();
            student.setFirstName(jsonObject.getString("firstName"));
            student.setLastName(jsonObject.getString("lastName"));
            student.setStudentId(jsonObject.getInt("studentId"));

            students.add(student);

        }
        return students;
    }
}
