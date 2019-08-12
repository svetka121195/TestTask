package com.example.testTask.repository;

import com.example.testTask.model.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by Светлана on 11.08.2019.
 */
@RepositoryRestResource(path = "student")
public interface StudentRepository extends CrudRepository<Student, Long> {

	//example URL=http://localhost:8080/student/search/getStudentByFirstNameAndLastName?firstName=вася&lastName=пупкин
	Student getStudentByFirstNameAndLastName(@Param("firstName") String firstName, @Param("lastName") String lastName);
}
