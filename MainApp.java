package com.Poliklinika;

import com.mysql.cj.Session;
import com.mysql.cj.x.protobuf.MysqlxDatatypes;
import com.mysql.cj.xdevapi.SessionFactory;

import javax.security.auth.login.AppConfigurationEntry;
import javax.security.auth.login.Configuration;

public class MainApp {
    public static void main(String[]args){
        SessionFactory sessionFactory;
        sessionFactory = new Configuration()
                .addAnnotatedClass( Items.class)
                .buildSessionFactory();
        sessionFactory.null;

        //===CREATE===
        session = sessionFactory.getSession();
        session.beginTransaction();
        Items items = new Items( username:"Юсупов",password:1234);
        System.out.println((items);
        session.save(items);
        System.out.println(items);

        //=== read===
        session = sessionFactory.getSession();
        session.beginTransaction();
        Items ItemFromDb = session.get(Items.class,username:"Юсупов");
        System.out.println(ItemFromDb);

        //===UPDATE===
        session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        Items ItemFromDb = session.get(Items.class,username:"Юсупов");
        System.out.println(ItemFromDb);
        ItemFromDb.setPassword(2134);
        session.getTransaction().commint();

        sessionFactory.close();


    }










    }
