package com.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;

public class MybatisUtil {
    private static SqlSessionFactory fac =null;
    private static SqlSession session =null;
    //工厂初始化一次
    static{
        //获得mybatis-config
        Reader r = null;
        try {
            r = Resources.getResourceAsReader("mybatis-config.xml");
        } catch (IOException e) {
            e.printStackTrace();
        }
        //创建session工厂
       fac=new SqlSessionFactoryBuilder().build(r);
    }

    //获得session
    public static SqlSession getSession(){
        session = fac.openSession();
        return  session;
    }

    //关闭session
    public static void closeSeesion(){
        if(session!=null){
            session.close();
            session=null;
        }
    }

}
