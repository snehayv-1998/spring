package com.example.spring;

public class Triangle {
    private String type;
    private int angle;
    private Point pointA;
    private Point pointB;
    private Point pointC;

    Triangle(){}//this is needed for setter injection
    Triangle(int s){
        this.setAngle(s);
    }
    Triangle(String t){
        this.setType(t);
    }
    Triangle(String t, int s){
        this.setType(t);
        this.setAngle(s);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAngle() {
        return angle;
    }

    public void setAngle(int angle) {
        this.angle = angle;
    }

    @Override
    public String toString(){
        return "Triangle is of type : "+ getType() +" and it has angle : "+ getAngle();
    }

    public Point getPointA() {
        return pointA;
    }

    public void setPointA(Point pointA) {
        this.pointA = pointA;
    }

    public Point getPointB() {
        return pointB;
    }

    public void setPointB(Point pointB) {
        this.pointB = pointB;
    }

    public Point getPointC() {
        return pointC;
    }

    public void setPointC(Point pointC) {
        this.pointC = pointC;
    }
    public void printPoints(){
        System.out.println("Point A: ("+pointA.getX()+","+pointA.getY()+")");
        System.out.println("Point B: ("+pointB.getX()+","+pointB.getY()+")");
        System.out.println("Point C: ("+pointC.getX()+","+pointC.getY()+")");
    }
}
