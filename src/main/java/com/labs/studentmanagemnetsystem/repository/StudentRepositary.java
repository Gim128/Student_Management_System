package com.labs.studentmanagemnetsystem.repository;

import com.labs.studentmanagemnetsystem.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author GImhan Pabasara <gimhanpabasara4@gmail.com> (www.gimhanpabasara.tk)
 * @since 12/7/2022
 */

public interface StudentRepositary extends JpaRepository<Student, Long> {

}
