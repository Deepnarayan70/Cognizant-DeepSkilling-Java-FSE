interface Shape { void draw(); }

class Circle implements Shape { public void draw() { System.out.println("Circle"); } }
class Square implements Shape { public void draw() { System.out.println("Square"); } }
class Triangle implements Shape { public void draw() { System.out.println("Triangle"); } }

class ShapeFactory {
    static Shape create(String type) {
        return switch (type) {
            case "circle" -> new Circle();
            case "square" -> new Square();
            case "triangle" -> new Triangle();
            default -> throw new IllegalArgumentException("Unknown" + type);
        };
    }
}

Shape s = ShapeFactory.create("circle");
s.draw();

