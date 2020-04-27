package com.cg.anurag.rs.dto;

public class Rating 
{
   int ratingId;
   int stars;
   Book book;
   public Rating() {}
   public Rating(int ratingId, int stars, Book book) 
   {
	  this.ratingId = ratingId;	this.stars = stars;	this.book = book;
   }
public int getRatingId() {
	return ratingId;
}
public void setRatingId(int ratingId) {
	this.ratingId = ratingId;
}
public int getStars() {
	return stars;
}
public void setStars(int stars) {
	this.stars = stars;
}
public Book getBook() {
	return book;
}
public void setBook(Book book) {
	this.book = book;
}  
}
