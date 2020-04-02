package DB_Classes;

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
        PS.close();
    }

    //    public ResultSet getData(String age, String cat) throws SQLException, ClassNotFoundException {
//        ResultSet RS;
//        String select = "SELECT " + Consts.DATA_DES + " FROM " + Consts.DATA_TABLE + " WHERE " + Consts.DATA_AGE + "=?" + " AND " + Consts.DATA_CAT + "=?";
//        PreparedStatement PS = getdbConnection().prepareStatement(select);
//        PS.setString(1 , age);
//        PS.setString(2 , cat);
//        RS = PS.executeQuery();
//        System.out.println(RS);
//        PS.close();
//
//        return RS;
//    }
    public void getData(String age, String cat) throws SQLException, ClassNotFoundException {
        DB_Handler ds = new DB_Handler();
        Statement stat = dbConnection.createStatement();
        String select = "SELECT * FROM Data WHERE category='особенности'";
//        PreparedStatement PS = getdbConnection().prepareStatement(select);
//        PS.setString(1, age);
//        PS.setString(2, cat);
        ResultSet RS = stat.executeQuery(select);
        System.out.println("TEST");
        while (RS.next()) {
            String id = RS.getString(5);
            System.out.println(id);
        }
        RS.close();
    }
}

