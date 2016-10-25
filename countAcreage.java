package com.company;
abstract class Shape {
    double Acreage;
    abstract void countAcreage () ;
}
class Square extends Shape{
    double lengthOfSide ;
    Square( double lengthOfSide ){
        this.lengthOfSide = lengthOfSide ;
    }
    void countAcreage () {
        Acreage = lengthOfSide * lengthOfSide ;
        System.out.println( "The Square Acreage :" + Acreage ) ;
    }
}
class Triangle extends Shape {
    double hypotenuse ;
    double longSide ;
    double shortSide ;
    Triangle ( double hypotenuse , double longSide ,double shortSide ){
        this.hypotenuse = hypotenuse ;
        this.longSide = longSide ;
        this.shortSide = shortSide ;
    }
    void countAcreage () {
        if( hypotenuse + longSide > shortSide && hypotenuse + shortSide > longSide && shortSide + longSide > hypotenuse ){
        double p = ( hypotenuse + longSide + shortSide ) / 2 ;
        Acreage = Math.sqrt ( p * ( p - hypotenuse ) * ( p - shortSide ) * ( p - longSide ) );
        System.out.println( "The Triangle Acreage :" + Acreage ) ;
        }
        else{
            System.out.println( "This is not a Triangle ! " ) ;
        }
    }
}
class Circle extends Shape {
    double radius ;
    Circle ( double radius ){
        this.radius = radius ;
    }
    void countAcreage () {
        Acreage = Math.PI * radius * radius ;
        System.out.println( "The Circle Acreage :" + Acreage ) ;
    }
}
class Main{
    public static void main(String args[]) {
        Shape Square = new Square( 40 ) ;
        Shape Triangle = new Triangle ( 5 , 4 , 3 ) ;
        Shape Circle = new Circle ( 1 ) ;
        Square.countAcreage();
        Triangle.countAcreage();
        Circle.countAcreage();
    }
}