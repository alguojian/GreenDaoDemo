package com.alguojian.greendaodemo.utils;

import com.alguojian.greendaodemo.MyApplication;
import com.alguojian.greendaodemo.bean.User;
import com.alguojian.greendaodemo.bean.UserDao;

import java.util.List;

/**
 * ${DESCRIPTION}
 *
 * @author ALguojian
 * @date 2018/1/2
 */


public class dbutils {

    /**
     * 添加数据，如果有重复则覆盖
     *
     * @param user
     */
    public static void insertLove(User user) {
        MyApplication.getDaoInstant().getUserDao().insertOrReplace(user);
    }

    /**
     * 删除数据
     *
     * @param id
     */
    public static void deleteLove(long id) {
        MyApplication.getDaoInstant().getUserDao().deleteByKey(id);
    }

    /**
     * 更新数据
     *
     * @param shop
     */
    public static void updateLove(User shop) {
        MyApplication.getDaoInstant().getUserDao().update(shop);
    }

    /**
     * 查询条件为Type=TYPE_LOVE的数据
     *
     * @return
     */
    public static List<User> queryLove() {
        return MyApplication.getDaoInstant().getUserDao().queryBuilder().where(UserDao.Properties.Age.eq(User.TYPE_AGE)).list();
    }

    /**
     * 查询全部数据
     */
    public static List<User> queryAll() {
        return MyApplication.getDaoInstant().getUserDao().loadAll();
    }

}
