package com.example.spring;

import java.util.List;

public class Square {
    private List<Point> points;

    public List<Point> getPoints() {
        return points;
    }

    public void setPoints(List<Point> points) {
        this.points = points;
    }
    public void printPoints(){
        for (Point p:points){
            System.out.println(p.getClass()+" ("+p.getX()+","+p.getY()+")");
        }
    }
}
