package sis.model;

import sis.enums.PrerequisiteType;

import java.util.UUID;

/**
 * Represents a row in the COURSE_PREREQUISITES table (Ders Onkosullari).
 */
public class CoursePrerequisite {

    private UUID id;
    private UUID courseId; // FK -> Course.id
    private UUID prerequisiteCourseId; // FK -> Course.id
    private PrerequisiteType type;
    private String minGrade; // e.g. "DD"

    public CoursePrerequisite() {
    }

    public CoursePrerequisite(UUID id, UUID courseId, UUID prerequisiteCourseId,
                               PrerequisiteType type, String minGrade) {
        this.id = id;
        this.courseId = courseId;
        this.prerequisiteCourseId = prerequisiteCourseId;
        this.type = type;
        this.minGrade = minGrade;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public UUID getCourseId() {
        return courseId;
    }

    public void setCourseId(UUID courseId) {
        this.courseId = courseId;
    }

    public UUID getPrerequisiteCourseId() {
        return prerequisiteCourseId;
    }

    public void setPrerequisiteCourseId(UUID prerequisiteCourseId) {
        this.prerequisiteCourseId = prerequisiteCourseId;
    }

    public PrerequisiteType getType() {
        return type;
    }

    public void setType(PrerequisiteType type) {
        this.type = type;
    }

    public String getMinGrade() {
        return minGrade;
    }

    public void setMinGrade(String minGrade) {
        this.minGrade = minGrade;
    }

    @Override
    public String toString() {
        return "CoursePrerequisite{" +
                "id=" + id +
                ", courseId=" + courseId +
                ", prerequisiteCourseId=" + prerequisiteCourseId +
                ", type=" + type +
                ", minGrade='" + minGrade + '\'' +
                '}';
    }
}
