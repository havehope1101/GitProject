import java.util.ArrayList;
import java.util.List;

public class Family implements Management<Person>{
    private int id;
    private int numberPerson = 0;
    List<Person> people = new ArrayList<>();
    public Family(int id) {
        this.id = id;
    }

    @Override
    public void add(Person person) {
        people.add(person);
        this.numberPerson++;
    }

    @Override
    public void delete(int id) {
        int index = findIndexById(id);
        people.remove(index);
    }

    @Override
    public void edit(int id, Person person) {
        int index = findIndexById(id);
        people.set(index, person);
    }

    @Override
    public int findIndexById(int id) {
        for(int i = 0; i < this.people.size(); i++) {
            if(this.people.get(i).getId() == id) return i;
        }
        return -1;
    }

    @Override
    public List<Person> getAll() {
        return this.people;
    }

    public int getId() {
        return id;
    }

    public int getNumberPerson() {
        return numberPerson;
    }
}
