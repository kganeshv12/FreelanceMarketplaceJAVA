package com.sheryians.major.model;

import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

import lombok.Data;

@Entity
@Data
@Table(name="users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @NotEmpty
    @Column(nullable = false)
    private String firstName;

    private String lastname;

    @Column(nullable = false,unique = true)
    @NotEmpty
    @Email(message = "{errors.invalid_email}")
    private String email;

    private String password;

    @Transient
    private String roleType;

    @ManyToMany(cascade = CascadeType.MERGE,fetch=FetchType.EAGER)
    @JoinTable(
        name="user_role",
        joinColumns = {@JoinColumn(name="USER_ID",referencedColumnName = "ID")},
            inverseJoinColumns = {@JoinColumn(name="ROLE_ID",referencedColumnName = "ID")}
    )
    private List<Role> roles;

    public User(User user){
        this.firstName=user.getFirstName();
        this.lastname=user.getLastname();
        this.email=user.getEmail();
        this.password=user.getPassword();
        this.roles=user.getRoles();
    }
    public User(){

    }

}
