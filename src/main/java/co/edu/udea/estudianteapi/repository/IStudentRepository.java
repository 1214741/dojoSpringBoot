package co.edu.udea.estudianteapi.repository;

import co.edu.udea.estudianteapi.model.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IStudentRepository extends JpaRepository<StudentEntity, Integer> {
}
