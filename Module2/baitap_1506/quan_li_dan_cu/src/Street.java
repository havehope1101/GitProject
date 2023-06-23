import java.util.ArrayList;
import java.util.List;

public class Street implements Management<Family>{
    private int id;
    private String name;
    private List<Family> street = new ArrayList<>();
    public Street(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public void add(Family family) {
        this.street.add(family);
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void edit(int id, Family family) {

    }

    @Override
    public int findIndexById(int id) {
        return 0;
    }

    @Override
    public List<Family> getAll() {
        return this.street;
    }
}
