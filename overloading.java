class Shape {
double radius;
double length,breadth;
double base,height;
Shape(double r){
radius = r;\}
Shape(double l,double b){
length=l;
breadth=b;
}
Shape(double b,double h,boolean isTriangle){
base = b;
height = h ;
}
double calculateCircleArea(){
return 3.14159*radius*radius;
}
double calculatrRectangleArea(){
    return length*breadth;
}
double calculateTriangleArea(){
   return 0.5*base*heigth;
  }
  public static void main (String[] args){
  Shape circle = new Shape(7.5);
  System.out.println("Area of Circle:"+circle.calculateCircleArea());
  Shape rectangle = new Shape(10.0,5.0);
  System.out.println("Area of Rectangle:"+rectangle.calculateRectangleArea());
  Shape triangle = new Shape(8.0,6.0,true);
  System.out.println("Area of Square:"+square.calculateTriangleArea());
  }
  }
