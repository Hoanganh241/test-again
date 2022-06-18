package com.example.testagain.entity;

import com.example.testagain.entity.enums.RoadSimpleStatus;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;
import org.h2.value.DataType;

import javax.persistence.*;
import javax.persistence.OneToMany;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "roads")
public class Road {
    @Id
    private String id;
    private String name;

    @OneToMany(mappedBy = "distric",
            cascade = CascadeType.ALL,
            fetch = FetchType.EAGER)
    @JsonManagedReference
    private String location;
    private String detail;
    private RoadSimpleStatus status;
}
