package sis;

import sis.enums.DegreeLevel;
import sis.enums.Gender;
import sis.enums.StudentStatus;
import sis.model.Department;
import sis.model.Faculty;
import sis.model.Program;
import sis.model.Student;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Entry point for the Student Information System class-design assignment.
 * Builds a small object graph (Faculty -> Department -> Program -> Student)
 * and simulates the registration of at least one student.
 */
public class Main {

    public static void main(String[] args) {

        // 1) Build a Faculty
        Faculty engineeringFaculty = new Faculty(
                UUID.randomUUID(),
                "MUH",
                "Muhendislik Fakultesi",
                null, // dean_id left null for this simple simulation
                "0212 000 00 00",
                "muhendislik@universite.edu.tr",
                true,
                OffsetDateTime.now()
        );

        // 2) Build a Department under that Faculty
        Department csDepartment = new Department(
                UUID.randomUUID(),
                "BM",
                "Bilgisayar Muhendisligi",
                engineeringFaculty.getId(),
                null, // head_instructor_id left null for this simple simulation
                "0212 111 11 11",
                "bilgisayar@universite.edu.tr",
                true
        );

        // 3) Build a Program under that Department
        Program csProgram = new Program(
                UUID.randomUUID(),
                "BM-LS",
                "Bilgisayar Muhendisligi Lisans Programi",
                csDepartment.getId(),
                DegreeLevel.LISANS,
                240,
                4,
                "TR",
                true
        );

        // 4) Create the student list (Array/ArrayList as required)
        List<Student> registeredStudents = new ArrayList<>();

        // 5) Simulate the registration of at least one student
        Student student = new Student(
                UUID.randomUUID(),
                "20260001",
                "12345678901",
                "Ali",
                "Yilmaz",
                LocalDate.of(2005, 3, 14),
                Gender.E,
                "ali.yilmaz@ogrenci.universite.edu.tr",
                "0555 000 00 00",
                "Istanbul, Turkiye",
                csProgram.getId(),
                2026,
                1,
                StudentStatus.AKTIF,
                null,
                OffsetDateTime.now()
        );

        registeredStudents.add(student);

        // 6) Print the registered student(s) to the console
        System.out.println("=== Kayitli Ogrenciler ===");
        for (Student s : registeredStudents) {
            System.out.println(s);
        }
    }
}
