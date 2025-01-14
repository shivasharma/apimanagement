package com.example.apimanagement.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name="employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String first_name;
    private String last_name;
    private String email;

    public void  setId(Long id) {
        this.id = id;

    }
    public Long getId(){
        return id;
    }
    public void setfirstname(String firstname) {
        this.first_name = firstname;
    }

    public String getfirstname() {
        return first_name;
    }

    public void setlastname(String lastname) {
        this.last_name = lastname;
    }

    public String getlastname() {
        return last_name;
    }

    public void setemail(String email) {
        this.email = email;
    }

    public String getemail() {
        return email;
    }

}
