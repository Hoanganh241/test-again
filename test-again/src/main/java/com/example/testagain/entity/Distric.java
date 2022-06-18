package com.example.testagain.entity;

import com.example.testagain.entity.base.BaseEntity;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "districs")
public class Distric extends BaseEntity {
    @Id
    private String id;
    private String name;
    @OneToMany()
    private String roadInDistric;
    private int status;
}
