package com.hospitalGroup.hospitalProject.entityTables;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class appointments {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long aId;

    @ManyToOne// many appointment for each doctor
    private doctor doctor;//create object for table doctor for foreign key

    @ManyToOne//many appointments for each patient
    private patients patients;//create object for table patients for foreign key(loose coupling)

    private String date;

}
