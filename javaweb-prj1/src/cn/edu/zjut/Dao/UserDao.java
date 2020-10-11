package cn.edu.zjut.Dao;

import cn.edu.zjut.model.UserBean;

import java.sql.*;
//连接过程中因为mysql版本原因，需要将用户dbuser的密码加密规则改为mysql_native_password
public class UserDao {
    private static final String GET_ONE_SQL="select * from usertable where username=? and password=? and type=?";
    public UserDao(){}
    //建立连接
    public Connection getConnection(){
        Connection conn=null;
        String driver="com.mysql.jdbc.Driver";
        String dburl="jdbc:mysql://localhost:3306/myDB";
        String username="dbuser";
        String password="dbpassword";
        try{
            Class.forName(driver);
            conn= DriverManager.getConnection(dburl,username,password);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return conn;
    }
    //判断登录用户合理与否
    public boolean searchUser(UserBean user){
        Connection conn=null;
        PreparedStatement pstmt=null;
        ResultSet rst=null;
        try{
            conn=getConnection();
            pstmt= conn.prepareStatement(GET_ONE_SQL);
            pstmt.setString(1,user.getUsername());
            pstmt.setString(2,user.getPassword());
            if(user.getType().equals("admin")){
                pstmt.setString(3, "1");
            }
            else {
                pstmt.setString(3, "2");
            }
            rst=pstmt.executeQuery();
            if(rst.next()){
                return true;
            }
        }catch(SQLException se){
            se.printStackTrace();;
            return false;
        }finally{
            try{
                pstmt.close();
                conn.close();
            }catch (SQLException se){
                se.printStackTrace();
            }
        }
        return false;
    }
    //注册用户
    public void insert(UserBean user){
        String INSERT_ONE_SQL="insert into usertable values(?,?,?)";
        Connection conn=null;
        PreparedStatement pstmt=null;
        try{
            conn=getConnection();
            pstmt=conn.prepareStatement(INSERT_ONE_SQL);
            pstmt.setString(1,user.getUsername());
            pstmt.setString(2,user.getPassword());
            //默认是普通用户
            pstmt.setString(3,"2");
            pstmt.executeUpdate();
        }catch(SQLException e){
            e.printStackTrace();
        }finally {
            try{
                pstmt.close();
                conn.close();
            }catch(SQLException e){
                e.printStackTrace();
            }
        }

    }

}
