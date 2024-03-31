package fc.java.course2.part1;

import fc.java.model2.Connection;
import fc.java.model2.MSSQLDriver;
import fc.java.model2.MySQLDriver;
import fc.java.model2.OracleDriver;

public class DataBaseConnection {
    public static void main(String[] args) {
        //oracle DB접속
        Connection conn = new OracleDriver();
        conn.getConnection("XE","system","Manager");

        //mysql DB접속
        conn = new MySQLDriver();
        conn.getConnection("DBNAME","root","12345");

        //mssql DB접속
        conn = new MSSQLDriver();
        conn.getConnection("mem","sa","12345");
    }
}
