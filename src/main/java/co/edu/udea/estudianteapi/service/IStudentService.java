package co.edu.udea.estudianteapi.service;
import co.edu.udea.estudianteapi.model.StudentEntity;
import java.util.List;
public interface IStudentService {
    void createStudent(StudentEntity student);
    StudentEntity findStudentById(Integer id);
    List<StudentEntity> findAll();
}
