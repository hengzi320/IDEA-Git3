package com.lxit.servic;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import org.apache.commons.dbutils.QueryRunner;

import javax.sql.DataSource;
import java.sql.Connection;
import java.util.Properties;

public class gonju {
    public static void main(String args[]) throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        Properties pro= new Properties();
        pro.load(gonju.class.getClassLoader().getResourceAsStream("druid.properties"));
        DataSource ds= DruidDataSourceFactory.createDataSource(pro);

        QueryRunner qr=new QueryRunner(ds);
        String sql="UPDATE student2 set age=?";
        qr.update(sql,19);
        Connection connection =ds.getConnection();
        System.out.println(connection);
        System.out.println("老谭吃**。");
        System.out.println("来吧看某sdf");
    }
}
