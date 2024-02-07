package se.lexicon.data_access;

import org.springframework.stereotype.Component;
import se.lexicon.model.Student;

import java.util.List;

@Component
public class StudentManagementConsoleImpl implements StudentManagement{


    UserInputService scannerService;



    @Override
    public Student create() {
        return null;
    }

    @Override
    public Student save(Student student) {
        return null;
    }

    @Override
    public Student find(int id) {
        return null;
    }

    @Override
    public List<Student> findAll() {
        return null;
    }

    @Override
    public Student edit(Student student) {
        return null;
    }
}
