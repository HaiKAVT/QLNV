import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Student[] arrStudent = new Student[1];
        arrStudent[0] = new  Student(1, 20, "nam", "Toàn");
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("Menu");
            System.out.println("1. Thêm ");
            System.out.println("2. Sửa");
            System.out.println("3. Xóa");
            System.out.println("4. Show");
            System.out.println("5. Tìm Kiếm");
            System.out.println("6. Exit");
            System.out.println("nhập vào lựa chọn của bạn : ");
            int choose = scanner.nextInt();
            switch (choose){
                case 1:
                    arrStudent = Manager.create(arrStudent);
                    break;
                case 2:

                case 4:
                    for (Student s:arrStudent) {
                        System.out.println(s);
                    }
                    break;
                case 6:
                    System.exit(0);
            }

        }while (true);
    }
}
