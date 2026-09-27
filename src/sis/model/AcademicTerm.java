package sis.model;

import sis.enums.Semester;

import java.time.LocalDate;
import java.util.UUID;

/**
 * Represents a row in the ACADEMIC_TERMS table (Akademik Donemler).
 */
public class AcademicTerm {

    private UUID id;
    private String code; // e.g. "2024-1"
    private String name; // e.g. "2024-25 Guz"
    private String academicYear; // e.g. "2024-2025"
    private Semester semester;
    private LocalDate startDate;
    private LocalDate endDate;
    private LocalDate registrationStart;
    private LocalDate registrationEnd;
    private LocalDate addDropEnd;
    private boolean active;

    public AcademicTerm() {
    }

    public AcademicTerm(UUID id, String code, String name, String academicYear, Semester semester,
                         LocalDate startDate, LocalDate endDate, LocalDate registrationStart,
                         LocalDate registrationEnd, LocalDate addDropEnd, boolean active) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.academicYear = academicYear;
        this.semester = semester;
        this.startDate = startDate;
        this.endDate = endDate;
        this.registrationStart = registrationStart;
        this.registrationEnd = registrationEnd;
        this.addDropEnd = addDropEnd;
        this.active = active;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAcademicYear() {
        return academicYear;
    }

    public void setAcademicYear(String academicYear) {
        this.academicYear = academicYear;
    }

    public Semester getSemester() {
        return semester;
    }

    public void setSemester(Semester semester) {
        this.semester = semester;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public LocalDate getRegistrationStart() {
        return registrationStart;
    }

    public void setRegistrationStart(LocalDate registrationStart) {
        this.registrationStart = registrationStart;
    }

    public LocalDate getRegistrationEnd() {
        return registrationEnd;
    }

    public void setRegistrationEnd(LocalDate registrationEnd) {
        this.registrationEnd = registrationEnd;
    }

    public LocalDate getAddDropEnd() {
        return addDropEnd;
    }

    public void setAddDropEnd(LocalDate addDropEnd) {
        this.addDropEnd = addDropEnd;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @Override
    public String toString() {
        return "AcademicTerm{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", academicYear='" + academicYear + '\'' +
                ", semester=" + semester +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", registrationStart=" + registrationStart +
                ", registrationEnd=" + registrationEnd +
                ", addDropEnd=" + addDropEnd +
                ", active=" + active +
                '}';
    }
}
