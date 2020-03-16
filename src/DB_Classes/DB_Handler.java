package DB_Classes;

import sample.Data;

import java.sql.*;

public class DB_Handler extends Configs {
    Connection dbConnection;

    public Connection getdbConnection() throws ClassNotFoundException, SQLException {
        String connectionString = "jdbc:mysql://" + dbHost + ":" + dbPort + "/" + dbName;
        Class.forName("com.mysql.cj.jdbc.Driver");
        dbConnection = DriverManager.getConnection(connectionString, dbUser, dbPass);

        return dbConnection;
    }

    public void insertIntoDB(String age, String category, String name, String description) throws SQLException, ClassNotFoundException {
        String insert = "INSERT INTO " + Consts.DATA_TABLE + "(" + Consts.DATA_AGE + "," + Consts.DATA_CAT + "," + Consts.DATA_NAME + "," + Consts.DATA_DES + ")" + "VALUES(?,?,?,?)";
        PreparedStatement PS = getdbConnection().prepareStatement(insert);
        PS.setString(1, age);
        PS.setString(2, category);
        PS.setString(3, name);
        PS.setString(4, description);
        PS.executeUpdate();
    }

    public ResultSet getData(String age) throws SQLException, ClassNotFoundException {
        ResultSet RS = null;
        String select = "SELECT " + Consts.DATA_DES + "FROM " + Consts.DATA_TABLE + " WHERE " + Consts.DATA_AGE + "=?";
        PreparedStatement PS = getdbConnection().prepareStatement(select);
        PS.setString(1 , age);
        RS = PS.executeQuery();
        return RS;
    }
}
