package employee.v7_dip.db;

public class SqlDatabase {
    public void query(String queryString) {
        System.out.printf("DB: Sending query '%s'.%n", queryString);
    }
}
