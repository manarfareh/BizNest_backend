package com.example.BizNest.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Post {
    @Id
    @Column(unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String title;
    private String content;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name= "user_id")
    private User createdBy;

    @OneToMany(mappedBy = "post",fetch = FetchType.EAGER)
    private List<Image> images;

    @ManyToMany(mappedBy = "posts")
    private List<SubCategory> subCategories;
}
