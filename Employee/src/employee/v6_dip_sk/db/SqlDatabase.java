package employee.v6_dip_sk.db;

public class SqlDatabase {
    public void query(String queryString) {
        System.out.printf("DB: Sending query '%s'.%n", queryString);
    }
}
