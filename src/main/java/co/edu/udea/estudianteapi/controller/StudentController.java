package co.edu.udea.estudianteapi.controller;

import co.edu.udea.estudianteapi.model.StudentEntity;
import co.edu.udea.estudianteapi.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/student")
public class StudentController {

    @Autowired
    private IStudentService _studentService;

    @PostMapping
    public ResponseEntity<String> createStudent(@RequestBody StudentEntity student){
        _studentService.createStudent(student);
        return ResponseEntity.ok("exito");
    }

    @GetMapping
    public ResponseEntity<List<StudentEntity>> getStudents(){
        List<StudentEntity> students = _studentService.findAll();
        return ResponseEntity.ok(students);
    }

}
