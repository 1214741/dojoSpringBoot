package co.edu.udea.estudianteapi.service;

import co.edu.udea.estudianteapi.model.StudentEntity;
import co.edu.udea.estudianteapi.repository.IStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl {
    @Autowired
    private IStudentRepository _studentRepository;


    public void createStudent(StudentEntity student) {
        _studentRepository.save(student);
    }


    public StudentEntity findStudentById(Integer id) {
        StudentEntity student = _studentRepository.findById(id).orElse(null);
        return student;
    }


    public List<StudentEntity> findAll() {
        return _studentRepository.findAll();
    }
}
