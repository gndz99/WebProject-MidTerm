package com19.midterm.cs208midterm;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Datalar {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String firstname;
    private String email;
    private String lastname;
    private String faculty;

    public Datalar() {}

    public Datalar(Integer id, String firstname, String email,String lastname,String faculty) {
        this.id = id;
        this.firstname = firstname;
        this.email = email;
        this.lastname=lastname;
        this.faculty=faculty;

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    @Override
    public int hashCode() {
        return firstname.hashCode() + lastname.hashCode()+ email.hashCode()+ faculty.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (((Datalar) obj).getFirstname().equals(firstname))
            return true;
        else
            return false;
    }

    @Override
    public String toString() {
        return firstname +":" + lastname+ ":" + email+":" +faculty;
    }


}













