package com.john.practice2.dto;

public class BookDTO {
    private String title;
    private int price;
    private double discountRate;

    public BookDTO(){}

    public BookDTO(String title, int price, double discountRate, String author) {
        this.title = title;
        this.price = price;
        this.discountRate = discountRate;
        this.author = author;
    }

    private String author;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getInformation(){
        return title + "\t" + price + "\t" + discountRate + "\t" + author;
    }
    public String getInformation(String title, int price, double discountRate){
        int discountPrice = price - (int) (price * discountRate);
        return "도서명 = " + title + "\n" +
                "할인된가격 = " + discountPrice + "원";
    }
}
