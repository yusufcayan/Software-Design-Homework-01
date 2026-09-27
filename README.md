# Student Information System – Class Design (Assignment 1)

**Language used: Java**

## Project Structure

```
src/
  sis/
    Main.java                         # Simulates student registration & prints result
    enums/
      Gender.java
      StudentStatus.java
      DegreeLevel.java
      InstructorTitle.java
      CourseType.java
      Semester.java
      PrerequisiteType.java
      ProgramCourseType.java
    model/
      Faculty.java
      Department.java
      Program.java
      Student.java
      Instructor.java
      Course.java
      AcademicTerm.java
      CoursePrerequisite.java
      ProgramCourse.java
```

Each entity class in `sis.model` mirrors a table from the provided database
schema:

| Class               | Table                  |
|---------------------|-------------------------|
| Faculty              | FACULTIES               |
| Department           | DEPARTMENTS             |
| Program              | PROGRAMS                |
| Student              | STUDENTS                |
| Instructor           | INSTRUCTORS             |
| Course               | COURSES                 |
| AcademicTerm         | ACADEMIC_TERMS          |
| CoursePrerequisite   | COURSE_PREREQUISITES    |
| ProgramCourse        | PROGRAM_COURSES         |

Foreign keys are represented as `UUID` fields (e.g. `Department.facultyId`
referencing `Faculty.id`) rather than embedded objects, since the schema
models them as FK columns.

Each class follows the assignment's Java requirements:
- All fields are `private`.
- Getter/setter methods are provided for every field (`isActive()` /
  `setActive()` style for booleans).
- At least one constructor is defined (a no-arg constructor plus an
  all-args constructor).
- `toString()` is overridden.
- Enum fields (`gender`, `status`, `degree_level`, `title`, `course_type`,
  `semester`, prerequisite `type`, program-course `course_type`) use real
  Java `enum` types instead of raw strings.
- `UUID` ids use `java.util.UUID`.
- Naming follows Java camelCase conventions.

## Compiling & Running

From the project root:

```bash
find src -name "*.java" > sources.txt
javac -d out @sources.txt
java -cp out sis.Main
```

Expected output:

```
=== Kayitli Ogrenciler ===
Student{id=..., studentNo='20260001', nationalId='12345678901', firstName='Ali', lastName='Yilmaz', birthDate=2005-03-14, gender=E, email='ali.yilmaz@ogrenci.universite.edu.tr', phone='0555 000 00 00', address='Istanbul, Turkiye', programId=..., enrollmentYear=2026, classYear=1, status=AKTIF, photoUrl='null', createdAt=...}
```

`Main.java` builds a small object graph (`Faculty` -> `Department` ->
`Program`), creates a `Student` object, adds it to an `ArrayList<Student>`,
and prints the list to the console — satisfying the "simulate registration
of at least one student" requirement.
