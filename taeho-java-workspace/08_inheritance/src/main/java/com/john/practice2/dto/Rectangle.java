package com.john.practice2.dto;

public class Rectangle extends Point{
    private int width;
    private int height;

    public Rectangle(){}

    public Rectangle(int x, int y, int width, int height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }

    public void draw(){
        super.draw();
        System.out.printf("면적 : %d \n",(width*height));
        System.out.printf("둘레 : %d \n",(width+height) * 2);
    }
}
