package sis.model;

import sis.enums.InstructorTitle;

import java.time.LocalDate;
import java.util.UUID;

/**
 * Represents a row in the INSTRUCTORS table (Ogretim Uyeleri).
 */
public class Instructor {

    private UUID id;
    private String employeeNo;
    private String nationalId;
    private String firstName;
    private String lastName;
    private String email;
    private UUID departmentId; // FK -> Department.id
    private InstructorTitle title;
    private String specialization;
    private LocalDate hireDate;
    private boolean active;

    public Instructor() {
    }

    public Instructor(UUID id, String employeeNo, String nationalId, String firstName,
                       String lastName, String email, UUID departmentId, InstructorTitle title,
                       String specialization, LocalDate hireDate, boolean active) {
        this.id = id;
        this.employeeNo = employeeNo;
        this.nationalId = nationalId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.departmentId = departmentId;
        this.title = title;
        this.specialization = specialization;
        this.hireDate = hireDate;
        this.active = active;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getEmployeeNo() {
        return employeeNo;
    }

    public void setEmployeeNo(String employeeNo) {
        this.employeeNo = employeeNo;
    }

    public String getNationalId() {
        return nationalId;
    }

    public void setNationalId(String nationalId) {
        this.nationalId = nationalId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public UUID getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(UUID departmentId) {
        this.departmentId = departmentId;
    }

    public InstructorTitle getTitle() {
        return title;
    }

    public void setTitle(InstructorTitle title) {
        this.title = title;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @Override
    public String toString() {
        return "Instructor{" +
                "id=" + id +
                ", employeeNo='" + employeeNo + '\'' +
                ", nationalId='" + nationalId + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", departmentId=" + departmentId +
                ", title=" + title +
                ", specialization='" + specialization + '\'' +
                ", hireDate=" + hireDate +
                ", active=" + active +
                '}';
    }
}
