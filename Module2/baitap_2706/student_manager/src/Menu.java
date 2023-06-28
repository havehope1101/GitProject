
import java.util.List;
import java.util.Scanner;

public class Menu {
    StudentManagement studentManagement = new StudentManagement();
    //    private List<Student> students = new ArrayList<>();
//    private Student students = new Student(1, "Long", 18, "Ha Noi" );
    public Scanner inputNumber = new Scanner(System.in);
    public Scanner inputString = new Scanner(System.in);

    public int checkInput() {
        int input;
        while (true) {
            try {
                input = Integer.parseInt(inputString.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("phai nhap vao dang so ban ei");
//                String mainMenu = "==== Quan li sinh vien ====\n" +
//                        "1. Them sinh vien\n" +
//                        "2. Sua thong tin sinh vien\n" +
//                        "3. Xoa thong tin sinh vien\n" +
//                        "4. Tim kiem sinh vien theo ten\n" +
//                        "5. Hien thi thong tin sinh vien theo id\n" +
//                        "6. Hien thi thong tin toan bo sinh vien\n" +
//                        "0. Thoat";
//
//                System.out.println(mainMenu);
            }
        }
        return input;
    }

    public void showMainMenu() {
        int choice = -1;
        do {
            String mainMenu = "==== Quan li sinh vien ====\n" +
                    "1. Them sinh vien\n" +
                    "2. Sua thong tin sinh vien\n" +
                    "3. Xoa thong tin sinh vien\n" +
                    "4. Tim kiem sinh vien theo ten\n" +
                    "5. Hien thi thong tin sinh vien theo id\n" +
                    "6. Hien thi thong tin toan bo sinh vien\n" +
                    "0. Thoat";

            System.out.println(mainMenu);

            choice = checkInput();

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    editStudent();
                    break;
                case 3:
                    deleteStudent();
                    break;
                case 4:
                    findStudentByName();
                    break;
                case 5:
                    showStudent();
                    break;
                case 6:
                    showAllStudents();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("vua nhap cai gi the ban ei ???");
            }
        } while (choice != 0);
    }

    public void addStudent() {
        System.out.println("=== Them sinh vien vao danh sach ===");
        int id;
        while (true) {
            System.out.println("nhap id: ");
            id = checkInput();
            if (studentManagement.findIndexById(id) == -1) {
                break;
            }
            System.out.println("id da co");
        }
//         id = inputNumber.nextInt();
        System.out.println("nhap vao ten: ");
        String name = inputString.nextLine();
        System.out.println("nhap vao tuoi: ");
//        int age = inputNumber.nextInt();
        int age = checkInput();
        System.out.println("nhap vao dia chi: ");
        String hometown = inputString.nextLine();


        Student student = new Student(id, name, age, hometown);
        studentManagement.add(student);
    }

    public void editStudent() {
        System.out.println("nhap vao id sinh vien can sua");
        int id = inputNumber.nextInt();
        int index = studentManagement.findIndexById(id);
        if (index == -1) {
            System.out.println("khong co sinh vien nao voi id la : " + id);
        } else {
            System.out.println("nhap vao ten: ");
            String name = inputString.nextLine();
            System.out.println("nhap vao tuoi: ");
            int age = inputNumber.nextInt();
            System.out.println("nhap vao dia chi: ");
            String hometown = inputString.nextLine();

            Student student = new Student(id, name, age, hometown);
            studentManagement.edit(id, student);
        }
    }

    public void deleteStudent() {
        System.out.println("nhap vao id sinh vien can xoa");
        int id = inputNumber.nextInt();
        studentManagement.delete(id);
    }

    public void findStudentByName() {
        System.out.println("nhap vao ten sinh vien muon tim: ");
        String name = inputString.nextLine();
        studentManagement.findStudentByName(name);
    }

    public void showStudent() {
        System.out.println("=== Nhap vao id can kiem tra: ");
        int id = inputNumber.nextInt();
        studentManagement.getStudent(id);
    }

    public void showAllStudents() {
        List<Student> list = studentManagement.getAll();
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }


}
