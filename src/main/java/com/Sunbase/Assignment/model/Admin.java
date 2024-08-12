package com.Sunbase.Assignment.model;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;


//Admin credentials are stored using this.
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="admin")
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    String userName;

    String password;

    String roles;
}
