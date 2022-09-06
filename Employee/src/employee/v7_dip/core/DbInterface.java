package employee.v7_dip.core;

public interface DbInterface {
    void create(Employee e);

    void retrieve(int id, Employee e);

    void update(Employee e);

    void delete(Employee e);

}
