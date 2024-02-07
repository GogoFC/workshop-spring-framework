package se.lexicon.service;


import se.lexicon.model.Student;
import se.lexicon.util.UserInputService;

import java.util.List;

public interface StudentManagement {




    Student create();

    Student save(Student student);

    Student find(int id);

    List<Student> findAll();

    Student edit(Student student);
}
