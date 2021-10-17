package com.ing.entities.ids;

import java.io.Serializable;
import java.util.Objects;

/**
 * Composite key class
 */
public class StudentCourseId implements Serializable {
    private String coursename;

    private String studentname;

    /**
     * Basic constructor
     * @param coursename
     * @param studentname
     */
    public StudentCourseId(String coursename, String studentname) {
        this.coursename = coursename;
        this.studentname = studentname;
    }

    /**
     * Equals method
     * @param o object to compare to
     * @return boolean depending if the objects are equal
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentCourseId that = (StudentCourseId) o;
        return (this.studentname.compareTo(that.studentname)==0 && this.coursename.compareTo(that.coursename)==0);
    }

    /**
     * Computes a hashcode.
     * @return hashcode number
     */
    @Override
    public int hashCode() { return Objects.hash(coursename, studentname); };
}
