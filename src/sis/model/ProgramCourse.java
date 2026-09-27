package sis.model;

import sis.enums.ProgramCourseType;

import java.util.UUID;

/**
 * Represents a row in the PROGRAM_COURSES table (Program Mufredati).
 */
public class ProgramCourse {

    private UUID id;
    private UUID programId; // FK -> Program.id
    private UUID courseId; // FK -> Course.id
    private int semesterOrder; // 1..8
    private ProgramCourseType courseType;
    private boolean active;

    public ProgramCourse() {
    }

    public ProgramCourse(UUID id, UUID programId, UUID courseId, int semesterOrder,
                          ProgramCourseType courseType, boolean active) {
        this.id = id;
        this.programId = programId;
        this.courseId = courseId;
        this.semesterOrder = semesterOrder;
        this.courseType = courseType;
        this.active = active;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public UUID getProgramId() {
        return programId;
    }

    public void setProgramId(UUID programId) {
        this.programId = programId;
    }

    public UUID getCourseId() {
        return courseId;
    }

    public void setCourseId(UUID courseId) {
        this.courseId = courseId;
    }

    public int getSemesterOrder() {
        return semesterOrder;
    }

    public void setSemesterOrder(int semesterOrder) {
        this.semesterOrder = semesterOrder;
    }

    public ProgramCourseType getCourseType() {
        return courseType;
    }

    public void setCourseType(ProgramCourseType courseType) {
        this.courseType = courseType;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @Override
    public String toString() {
        return "ProgramCourse{" +
                "id=" + id +
                ", programId=" + programId +
                ", courseId=" + courseId +
                ", semesterOrder=" + semesterOrder +
                ", courseType=" + courseType +
                ", active=" + active +
                '}';
    }
}
