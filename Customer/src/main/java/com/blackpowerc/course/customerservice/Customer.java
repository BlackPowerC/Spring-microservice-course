package com.blackpowerc.course.customerservice;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import java.io.Serializable;

@Entity
@Table(name = "customers")
@ToString @EqualsAndHashCode(of = {"id"})
@Getter @Setter @Builder @NoArgsConstructor @AllArgsConstructor
public class Customer implements Serializable
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id ;

    @Column(nullable = false, length = 127)
    private String name ;

    @Column(nullable = false, length = 127)
    private String surname ;

    @Email
    @Column(unique = true, nullable = false, length = 255)
    private String email ;
}
