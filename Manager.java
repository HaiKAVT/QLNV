import java.util.Scanner;

public class Manager {
    public static Student[] create(Student[] arr) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập id : ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập name: ");
        String name = scanner.nextLine();
        System.out.println("nhập gender : ");
        String gender = scanner.nextLine();
        System.out.println("nhập age: ");
        int age = Integer.parseInt(scanner.nextLine());
        Student student = new Student(id, age, gender, name);
        Student[] arrNew = new Student[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            arrNew[i] = arr[i];
        }
        arrNew[arrNew.length - 1] = student;
        return arrNew;
    }


}
