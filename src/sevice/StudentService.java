package sevice;

import java.util.List;

public interface StudentService<T> {
    void add();
    void save(T t);

    void getAll();

    void update();

    void delete();

    void getAllSortByName();
    void getByName();

    void getAllSortDownByMark();
    void getAllSortUpByMark();

}
