package sis.model;

import sis.enums.DegreeLevel;

import java.util.UUID;

/**
 * Represents a row in the PROGRAMS table (Ogretim Programlari).
 */
public class Program {

    private UUID id;
    private String code;
    private String name;
    private UUID departmentId; // FK -> Department.id
    private DegreeLevel degreeLevel;
    private int totalCredits;
    private int durationYears;
    private String language; // TR / EN
    private boolean active;

    public Program() {
    }

    public Program(UUID id, String code, String name, UUID departmentId, DegreeLevel degreeLevel,
                    int totalCredits, int durationYears, String language, boolean active) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.departmentId = departmentId;
        this.degreeLevel = degreeLevel;
        this.totalCredits = totalCredits;
        this.durationYears = durationYears;
        this.language = language;
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

    public UUID getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(UUID departmentId) {
        this.departmentId = departmentId;
    }

    public DegreeLevel getDegreeLevel() {
        return degreeLevel;
    }

    public void setDegreeLevel(DegreeLevel degreeLevel) {
        this.degreeLevel = degreeLevel;
    }

    public int getTotalCredits() {
        return totalCredits;
    }

    public void setTotalCredits(int totalCredits) {
        this.totalCredits = totalCredits;
    }

    public int getDurationYears() {
        return durationYears;
    }

    public void setDurationYears(int durationYears) {
        this.durationYears = durationYears;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @Override
    public String toString() {
        return "Program{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", departmentId=" + departmentId +
                ", degreeLevel=" + degreeLevel +
                ", totalCredits=" + totalCredits +
                ", durationYears=" + durationYears +
                ", language='" + language + '\'' +
                ", active=" + active +
                '}';
    }
}
