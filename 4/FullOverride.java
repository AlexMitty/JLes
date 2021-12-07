import java.util.Objects;

public class FullOverride {
    private static int nextId = 1;
    private int id;

    public FullOverride(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FullOverride h = (FullOverride) o;
        return id == h.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public void setId() {
        id = nextId;
        nextId++;
    }

    public static void main(String[] args) {
        System.out.println(nextId);


        System.out.println(nextId);
    }
}
