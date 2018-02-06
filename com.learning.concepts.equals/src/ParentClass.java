import java.util.Objects;

public class ParentClass {
    int i = 10;
    int j = 20;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ParentClass)) return false;
        ParentClass that = (ParentClass) o;
        return i == that.i &&
                j == that.j;
    }

    @Override
    public int hashCode() {

        return Objects.hash(i, j);
    }

    @Override
    public String toString() {
        return "ParentClass{" +
                "i=" + i +
                ", j=" + j +
                '}';
    }
}
