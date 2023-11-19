package com.book.library.issuerms.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookDetails {
	private int isbn;
	private String title;
	private Date publishedDate;
	private int totalCopies;
	private int issuedCopies;
	private String author;
}
