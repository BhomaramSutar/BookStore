package com.book.bookstore;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "book")
public class Book 
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String author;
    private double price;

}