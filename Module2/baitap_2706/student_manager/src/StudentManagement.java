import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class StudentManagement implements Management<Student>{

    private int id;
    private int numberStudent = 0;
    List<Student> students = new ArrayList<>();


    @Override
    public void add(Student student) {
        students.add(student);
        this.numberStudent++;
    }

    @Override
    public List<Student> getAll() {
        return this.students;
    }

    @Override
    public void delete(int id) {
        int index = findIndexById(id);
        students.remove(index);
    }

    @Override
    public void edit(int id, Student student) {
        int index = findIndexById(id);
        students.set(index, student);
    }

    @Override
    public int findIndexById(int id) {
        for(int i=0; i< this.students.size(); i++) {
            if(this.students.get(i).getId() == id) return i;
        }
        return -1;
    }

    public void getStudent(int id) {
        for(int i=0; i< this.students.size(); i++) {
            if(this.students.get(i).getId() == id) System.out.println(this.students.get(i));
        }
    }

    public void findStudentByName(String name) {
        for (Student student:students) {
            if(student.getName().contains(name)) {
                System.out.println(student);
            }
        }
    }

    public boolean checkId(int id) {
           for(int i=0; i< this.students.size(); i++) {
               if (this.students.get(i).getId() == id) {
                   System.out.println("da co sinh vien voi ID nay. Hay nhap lai");
                   System.out.println("nhap id: ");
               } else {
                   break;
               }
           }
           return false;
       }

//    public List<Student> findByName(Student name) {
//             ListIterator<Student> iterator = students.listIterator();
//        if(iterator.toString().contains(Student name)) {
//            System.out.println((List<Student>) iterator);
//        }
//        return (List<Student>) iterator;
//    }
}
