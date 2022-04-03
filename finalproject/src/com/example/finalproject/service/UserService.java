package com.example.finalproject.service;

import com.example.finalproject.DBConnection.DBConnection;
import com.example.finalproject.model.User;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class UserService {

    public void insertUser(User user) {
        String query = "insert into user(userName,password,fullName)" + "values(?,?,?)";
        PreparedStatement preparedStatement = new DBConnection().getStatement(query);
        //set the value of parameter
        try {
            preparedStatement.setString(1, user.getUserName());
            preparedStatement.setString(1, user.getPassword());
            preparedStatement.setString(1, user.getFullName());
            preparedStatement.execute();
            //preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteUser(int id) {
        String query = "delete from user where id = ?";
        PreparedStatement preparedStatement = new DBConnection().getStatement(query);
        try {
            preparedStatement.setInt(1, id);
            preparedStatement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateUser(int id, User user) {
        String query = "update from user set userName = ?,password = ? ,fullName = ?" + "where id = ?";
        PreparedStatement preparedStatement = new DBConnection().getStatement(query);
        try {
            preparedStatement.setString(1, user.getUserName());
            preparedStatement.setString(2, user.getPassword());
            preparedStatement.setString(3, user.getFullName());
            preparedStatement.setInt(4, id);
            preparedStatement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
    //today24thMarch

    public User getUser(String userName, String password) throws SQLException {

        User user = null;

        String query = "select * from user where userName =?,password=?";
        PreparedStatement preparedStatement = new DBConnection().getStatement(query);
        preparedStatement.setString(1, userName);
        preparedStatement.setString(1, password);
        ResultSet rs = preparedStatement.executeQuery();

        while (rs.next()) {
            user = new User();
            user.setId(rs.getInt("id"));
            user.setUserName(rs.getString("userName"));
            user.setFullName(rs.getString("fullName"));
            user.setPassword(rs.getString("password"));


        }
        return user;
    }

    //Getting user list
    public List<User> getUserList() throws SQLException {

        List<User> arrayList = new ArrayList<>();
        String query = "select * from user ";
        PreparedStatement preparedStatement = new DBConnection().getStatement(query);

        ResultSet rs = preparedStatement.executeQuery();
        while (rs.next()) {
            User user = new User();
            user.setId(rs.getInt("id"));
            user.setUserName(rs.getString("userName"));
            user.setFullName(rs.getString("fullName"));
            user.setPassword(rs.getString("password"));
            arrayList.add(user);
        }
            return arrayList;
    }
}