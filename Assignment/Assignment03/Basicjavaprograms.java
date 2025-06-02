package Assignment.Assignment03;
// ### Basic Java Programs
// 1. Area Of Circle Java Program
// 2. Area Of Triangle
// 3. Area Of Rectangle Program 
// 4. Area Of Isosceles Triangle 
// 5. Area Of Parallelogram
// 6. Area Of Rhombus
// 7. Area Of Equilateral Triangle
// 8. Perimeter Of Circle
// 9. Perimeter Of Equilateral Triangle
// 10. Perimeter Of Parallelogram
// 11. Perimeter Of Rectangle
// 12. Perimeter Of Square
// 13. Perimeter Of Rhombus
// 14. Volume Of Cone Java Program
// 15. Volume Of Prism
// 16. Volume Of Cylinder
// 17. Volume Of Sphere
// 18. Volume Of Pyramid
// 19. Curved Surface Area Of Cylinder
// 20. Total Surface Area Of Cube
public class Basicjavaprograms {
    public static void main(String[] args) {
        CircleArea();
        TriangleArea();
        RectangleArea();
        IsoscelesArea();
        ParallelogramArea();
        RectanglePerimeter();
        Rhombusarea();
        EquilateralArea();
        ParallelogramPerimeter();
        CirclePerimeter();
        EquilateralPerimeter();
        SquarePerimeter();
        RhombusPerimeter();
        ConeVolume();
        PyramidVolume();
        PrismVolume();
        CylinderCurvedSurfaceArea();
        CylinderVolume();
        SphereVolume();
        CubeTotalSurfaceArea();
    }

    //area of circle function
    static void CircleArea(){
        double radius = 5;
        double area = Math.PI * radius * radius;
        System.out.println("Area of circle with radius " + radius + " is: " + area);
    }

    //area of triangle
    static void TriangleArea() {
        int h = 10;
        int b = 20;
        double area = 0.5 * b * h;
        System.out.println("Area of triangle with base " + b + " and height " + h + " is: " + area);
    }
//area of rectangle
static void RectangleArea() {
    int length = 10;
    int breadth = 20;
    int area = length * breadth;
    System.out.println("Area of rectangle with length " + length + " and breadth " + breadth + " is: " + area);
}
//area of isosceles triangle
static void IsoscelesArea(){
    int base = 10;
    int height = 8;
    double area = 0.5 * base * height;
    System.out.println("Area of isosceles triangle with base " + base + " and height " + height + " is: " + area);
}
// 5. Area Of Parallelogram
static void ParallelogramArea(){
    int b = 10;
    int h = 10;
    int area = b * h;
    System.out.println("Area of parallelogram with base " + b + " and height " + h + " is: " + area);
}
// 6. Area Of Rhombus
static void Rhombusarea() {
    double d1 = 8; // length of first diagonal
    double d2 = 6; // length of second diagonal
    double area = (d1 * d2) / 2;
    System.out.println("Area of rhombus with diagonals " + d1 + " and " + d2 + " is: " + area);
}
// 7. Area Of Equilateral Triangle
static void EquilateralArea() {
    double side = 6;
    double area = (Math.sqrt(3) / 4) * side * side;
    System.out.println("Area of equilateral triangle with side " + side + " is: " + area);
}
// 8. Perimeter Of Circle
static void CirclePerimeter(){
    double radius = 5;
    double perimeter = 2 * Math.PI * radius;
    System.out.println("Perimeter of circle with radius " + radius + " is: " + perimeter);
}
// 9. Perimeter Of Equilateral Triangle
static void EquilateralPerimeter(){
    double side = 6;
    double perimeter = 3 * side;
    System.out.println("Perimeter of equilateral triangle with side " + side + " is: " + perimeter);
}
// 10. Perimeter Of Parallelogram
static void ParallelogramPerimeter(){
    int base = 10;
    int side = 8;
    int perimeter = 2 * (base + side);
    System.out.println("Perimeter of parallelogram with base " + base + " and side " + side + " is: " + perimeter);
}
// 11. Perimeter Of Rectangle
 static void RectanglePerimeter() {
    int l=10;
    int b=20;
    int area=l*b;
    System.out.println("area of rectangle with length"+l+"and breadth"+b+"is:"+area);
 }
// 12. Perimeter Of Square
static void SquarePerimeter() {
    int side = 7;
    int perimeter = 4 * side;
    System.out.println("Perimeter of square with side " + side + " is: " + perimeter);
}

// 13. Perimeter Of Rhombus
static void RhombusPerimeter() {
    int side = 5;
    int perimeter = 4 * side;
    System.out.println("Perimeter of rhombus with side " + side + " is: " + perimeter);
}
// 14. Volume Of Cone Java Program
 static void ConeVolume(){
    double radius=10;
    double height=34;
    double volume=(1/3)*Math.PI*radius*radius*height;
    System.out.println("the volume of cone with radius"+radius+"and height"+height+" is: "+volume);
 }
// 15. Volume Of Prism
static void PrismVolume() {
    double baseArea = 20; // example base area
    double height = 15;   // example height
    double volume = baseArea * height;
    System.out.println("Volume of prism with base area " + baseArea + " and height " + height + " is: " + volume);
}

// 16. Volume Of Cylinder
static void CylinderVolume() {
    double radius = 7;
    double height = 10;
    double volume = Math.PI * radius * radius * height;
    System.out.println("Volume of cylinder with radius " + radius + " and height " + height + " is: " + volume);
}

// 17. Volume Of Sphere
static void SphereVolume() {
    double radius = 6;
    double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    System.out.println("Volume of sphere with radius " + radius + " is: " + volume);
}

// 18. Volume Of Pyramid
static void PyramidVolume() {
    double baseArea = 30; // example base area
    double height = 12;   // example height
    double volume = (1.0 / 3.0) * baseArea * height;
    System.out.println("Volume of pyramid with base area " + baseArea + " and height " + height + " is: " + volume);
}

// 19. Curved Surface Area Of Cylinder
static void CylinderCurvedSurfaceArea() {
    double radius = 7;
    double height = 10;
    double curvedSurfaceArea = 2 * Math.PI * radius * height;
    System.out.println("Curved surface area of cylinder with radius " + radius + " and height " + height + " is: " + curvedSurfaceArea);
}

// 20. Total Surface Area Of Cube
static void CubeTotalSurfaceArea() {
    double side = 5;
    double totalSurfaceArea = 6 * side * side;
    System.out.println("Total surface area of cube with side " + side + " is: " + totalSurfaceArea);
}
}

