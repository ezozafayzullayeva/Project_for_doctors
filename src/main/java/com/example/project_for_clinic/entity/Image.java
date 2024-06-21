package com.example.project_for_clinic.entity;

import com.example.project_for_clinic.entity.template.AbsUUID;
import jakarta.persistence.Entity;
import lombok.*;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.Where;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
@DynamicInsert
@DynamicUpdate
@Entity(name = "images")
@Where(clause = "deleted=false")
public class Image extends AbsUUID {

    private String name;
    private String url;
    private String fileId;
    private Long size;

}
