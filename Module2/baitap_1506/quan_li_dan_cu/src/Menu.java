import java.util.Scanner;

public class Menu {
    private Street street = new Street(1, "Thanh Xuan");
    private Scanner inputNumber = new Scanner(System.in);
    private Scanner inputString = new Scanner(System.in);

    public void showMainMenu() {
        int choice = -1;
        do {
            String mainMenu = "==== Khu Pho ====\n" +
                    "1. Them nha\n" +
                    "2. Sua nha theo id\n" +
                    "3. Xoa nha\n" +
                    "4. Danh sach nha\n" +
                    "0. Thoat";
            System.out.println(mainMenu);
            choice = inputNumber.nextInt();
            switch (choice) {
                case 1:
                    showMenuAddFamily();
                    break;
                case 2:
                    editFamily();
                    break;
                case 3:
                    break;
                case 4:
                    showMenuFamily();
                    break;
            }
        } while (choice != 0);
    }

    public void showMenuAddFamily() {
        System.out.println("=== Menu them moi nha ===");
        System.out.println("nhap id: ");
        int id = inputNumber.nextInt();
        Family family = new Family(id);
        street.add(family);
    }

    public void editFamily() {
        System.out.println("nhap id nha can sua: ");
//        street.edit(id, family);
    }

    public void showMenuFamily() {
        int choice = -1;
        String str = "=== Menu ho gia dinh ===\n";
        for (int i = 0; i < street.getAll().size(); i++) {
            str += (i + 1) + " Ho gia dinh " + street.getAll().get(i).getId() + "\n";
        }
        System.out.println(str);
        System.out.println("nhap lua chon");
        choice = inputNumber.nextInt();
        showMenuPerson(street.getAll().get(choice - 1));
    }

    public void showMenuPerson(Family family) {
        int choice = -1;
        do {
            String menuPerson = "=== Menu nha so " + family.getId() + "===\n" +
                    "1. them nguoi\n" +
                    "2. xoa nguoi\n" +
                    "3. hien thi ca gia dinh\n" +
                    "0. thoat\n";
            System.out.println(menuPerson);
            choice = inputNumber.nextInt();
            switch (choice) {
                case 1:
                    showMenuAddPerson(family);
                    break;
                case 2:
                    deletePerson(family);
                    break;
                case 3:
                    showPerson(family);
                    break;
            }
        } while (choice != 0);
    }
        public void showMenuAddPerson (Family family){
            System.out.println("==== Thêm người vào nhà " + family.getId() + " =====");
            System.out.println(" Nhập Id: ");
            int id = inputNumber.nextInt();
            System.out.println("Nhập Tên: ");
            String name = inputString.nextLine();
            System.out.println("Nhập tuổi: ");
            int age = inputNumber.nextInt();
            System.out.println("Nhập job: ");
            String job = inputString.nextLine();
            Person person = new Person(id, name, age, job);
            family.add(person);
        }

        public void deletePerson (Family family){
            System.out.println("nhap id nha can xoa: ");
            int id = inputNumber.nextInt();
            family.delete(id);
        }

        public void showPerson (Family family){
            for (int i = 0; i < family.getAll().size(); i++) {
                System.out.println(family.getAll().get(i));
            }
        }
    }

