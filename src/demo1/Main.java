package demo1;

 public static void main(String[] args) {
        Triangle triangle = new Triangle(3, 4, 5);

        if (triangle.isValid()) {
            System.out.println("Chu vi tam giác: " + triangle.getPerimeter());
            System.out.println("Diện tích tam giác: " + triangle.getArea());
        } else {
            System.out.println("Không phải là tam giác hợp lệ.");
        }
    }
