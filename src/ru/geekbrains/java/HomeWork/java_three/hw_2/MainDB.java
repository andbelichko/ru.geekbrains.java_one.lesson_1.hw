package ru.geekbrains.java.HomeWork.java_three.hw_2;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MainDB {
    private static Connection connect;
    private static Statement statement;
    public static ResultSet resSet;

    public static void main(String[] args) {


    }
    //Не знаю, можно ли будет более одного раза добавлять солбцы этим методом или он заругается что таблица с таким именем уже существут. Но если нельзя, то можно перегрузкой нужное кол-во столбцов добавить
    public void createTable (String nameTable, String columnName, String typeDate) throws SQLException {
        statement = connect.createStatement();
        String sql = "CREATE TABLE if not exists " + nameTable + " ('id' INTEGER PRIMARY KEY AUTOINCREMENT, " + columnName + " " + typeDate + ");";
        statement.execute(sql);
    }
    //Здесь думаю так же можно перегрузкой увеличить кол-во столбцов и значений добавляемых в них. Хотя я понимаю что наверно не очень удобно и точно есть способ лучше.
    public void addEntry(String nameTable, String columnName, String value) throws SQLException {
        statement = connect.createStatement();
        String sql = "INSERT INTO " + nameTable + " (" + columnName + ") VALUES (" + value + "); ";
        statement.execute(sql);

    }
    //Здесь я думаю можно вернуть выборку по всей таблице и уже перебрать ResultSet так как нужно будет пользователю
    public ResultSet readDB(String nameTable, String columnName) throws ClassNotFoundException, SQLException {
        statement = connect.createStatement();
        String sql = "SELECT * FROM " + nameTable;
        resSet = statement.executeQuery(sql);
        return resSet;
    }
    public void deleteEntry(String nameTable, int id) throws SQLException {
        statement = connect.createStatement();
        String sql = "DELETE from " + nameTable + " where ID=" + id + ";";
        statement.executeUpdate(sql);
    }

    public void deleteTable(String nameTable) throws SQLException {
        statement = connect.createStatement();
        String sql = "DELETE from " + nameTable + ";";
        statement.executeUpdate(sql);
    }
}
