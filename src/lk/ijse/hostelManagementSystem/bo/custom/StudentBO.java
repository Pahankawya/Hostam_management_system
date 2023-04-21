package lk.ijse.hostelManagementSystem.bo.custom;


import lk.ijse.hostelManagementSystem.bo.SuperBO;
import lk.ijse.hostelManagementSystem.dto.StudentDTO;

import java.sql.SQLException;
import java.util.ArrayList;

public interface StudentBO extends SuperBO {

    ArrayList<StudentDTO> getAllStudent() throws SQLException, ClassNotFoundException;

    ArrayList<StudentDTO> searchAllStudent(String id) throws SQLException, ClassNotFoundException;

    boolean saveStudent(StudentDTO dto) throws SQLException, ClassNotFoundException;

    boolean updateStudent(StudentDTO dto) throws SQLException, ClassNotFoundException;

    boolean deleteStudent(String id) throws SQLException, ClassNotFoundException;

    boolean existStudentID(String id) throws SQLException, ClassNotFoundException;
}
