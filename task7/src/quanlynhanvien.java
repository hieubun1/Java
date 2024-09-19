public class quanlynhanvien {  // Đảm bảo tên lớp khớp với tên tệp
    public String name;
    public int age;
    public String position;

    // Constructor với name, age, position
    public quanlynhanvien(String name, int age, String position) {
        this.name = name;
        this.age = age;
        this.position = position;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Position: " + position);
    }

    public double calculate() {
        return 0;
    }

    // Lớp Fulltime kế thừa từ QuanLyNhanVien
    static class Fulltime extends quanlynhanvien {
        private final double baseSalary;

        public Fulltime(String name, int age, String position, double baseSalary) {
            super(name, age, position);  // Gọi constructor của lớp cha
            this.baseSalary = baseSalary;
        }

        @Override
        public double calculate() {
            return baseSalary;
        }

        @Override
        public void display() {
            super.display();  // Gọi phương thức hiển thị từ lớp cha
            System.out.println("Salary: " + calculate());  // Hiển thị lương
        }
    }

    // Lớp Parttime kế thừa từ QuanLyNhanVien
    static class Parttime extends quanlynhanvien {
        private final double hourlySalary;
        private final double workingHours;

        public Parttime(String name, int age, String position, double workingHours, double hourlySalary) {
            super(name, age, position);  // Gọi constructor của lớp cha
            this.hourlySalary = hourlySalary;
            this.workingHours = workingHours;
        }

        @Override
        public double calculate() {
            return workingHours * hourlySalary;
        }

        @Override
        public void display() {
            super.display();  // Gọi phương thức hiển thị từ lớp cha
            System.out.println("Salary: " + calculate());  // Hiển thị lương
        }
    }

    public static class Manager {
        public static void main(String[] args) {
            // Tạo đối tượng của lớp ngoài QuanLyNhanVien để khởi tạo lớp con

            // Khởi tạo đối tượng Fulltime qua đối tượng lớp ngoài
            Fulltime fulltime = new Fulltime("John", 30, "Manager", 5000);

            // Khởi tạo đối tượng Parttime qua đối tượng lớp ngoài
            Parttime parttime = new Parttime("Bill", 40, "Part-time", 15, 120);

            // Hiển thị thông tin nhân viên toàn thời gian
            System.out.println("Fulltime Employee:");
            fulltime.display();

            // Hiển thị thông tin nhân viên bán thời gian
            System.out.println("\nParttime Employee:");
            parttime.display();
        }
    }
}
