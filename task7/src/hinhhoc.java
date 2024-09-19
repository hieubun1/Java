public class hinhhoc {

    public double caculate() {
        return 0;

    }

    public void display() {
        System.out.println("this is a shape");
    }

    static class Circle extends hinhhoc {
        private double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        public double caculate() {
            return Math.PI * radius * radius;
        }

        public void display() {
            System.out.println("this is a circle");
            System.out.println("Arena = " + caculate());
        }
    }

    static class Rectangle extends hinhhoc {
        private double width;
        private double height;

        public Rectangle(double width, double height) {
            this.width = width;
            this.height = height;
        }

        public double caculate() {
            return width * height;
        }

        public void display() {
            System.out.println("this is a rectangle");
            System.out.println("Area = " + caculate());
        }
    }

    public static class GeometryManager {
        public static void main(String[] args) {
            // Tạo đối tượng hình tròn
            Circle circle = new Circle(5);
            circle.display(); // Gọi phương thức từ đối tượng

            System.out.println();  // Tạo khoảng cách giữa các kết quả

            // Tạo đối tượng hình chữ nhật
            Rectangle rectangle = new Rectangle(4, 6);
            rectangle.display(); // Gọi phương thức từ đối tượng
        }
    }
}