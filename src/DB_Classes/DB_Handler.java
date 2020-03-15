package DB_Classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DB_Handler extends Configs {
    Connection dbConnection;

    public Connection getdbConnection() throws ClassNotFoundException, SQLException {
        String connectionString = "jdbc:mysql://" + dbHost + ":" + dbPort + "/" + dbName;
        Class.forName("com.mysql.cj.jdbc.Driver");
        dbConnection = DriverManager.getConnection(connectionString, dbUser, dbPass);
        return dbConnection;
    }

    public void insertIntoDB(String age, String category, String name, String description) throws SQLException, ClassNotFoundException {
        String insert = "INSERT INTO" + Consts.DATA_TABLE + "(" + Consts.DATA_AGE + "," + Consts.DATA_CAT + "," + Consts.DATA_NAME + "," + Consts.DATA_DES + "VALUES(?,?,?,?)" + ")";
        PreparedStatement RS = getdbConnection().prepareStatement(insert);
        RS.setString(1, age);
        RS.setString(2, category);
        RS.setString(3, name);
        RS.setString(4, description);

    }
}
