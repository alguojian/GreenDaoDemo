package com.alguojian.greendaodemo;

import android.app.Application;
import android.database.sqlite.SQLiteDatabase;

import com.alguojian.greendaodemo.bean.DaoMaster;
import com.alguojian.greendaodemo.bean.DaoSession;


/**
 * 自定义application
 *
 * @author ALguojian
 * @date 2018/1/2
 */


public class MyApplication extends Application {

    private static DaoSession daoSession;
    @Override
    public void onCreate() {
        super.onCreate();
        init();
    }

    /**
     * 初始化数据库创建
     */
    private void init() {

        //创建数据库read.db"
        DaoMaster.DevOpenHelper helper = new DaoMaster.DevOpenHelper(this, "read.db", null);
        //获取可写数据库
        SQLiteDatabase db = helper.getWritableDatabase();
        //获取数据库对象
        DaoMaster daoMaster = new DaoMaster(db);
        //获取Dao对象管理者
        daoSession = daoMaster.newSession();

    }

    /**
     * 获得数据库对象
     * @return
     */
    public static DaoSession getDaoInstant() {
        return daoSession;
    }

}
