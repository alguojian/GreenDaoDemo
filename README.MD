GreenDao对象字段注释如下

- @Entity：告诉GreenDao该对象为实体，只有被@Entity注释的Bean类才能被dao类操作
- @Id：对象的Id，使用Long类型作为EntityId，否则会报错。(autoincrement = true)表示主键会自增，如果false就会使用旧值
- @Property：可以自定义字段名，注意外键不能使用该属性
- @NotNull：属性不能为空
- @Transient：使用该注释的属性不会被存入数据库的字段中
- @Unique：该属性值必须在数据库中是唯一值
- @Generated：编译后自动生成的构造函数、方法等的注释，提示构造函数、方法等不能被修改


Dao对象API如下：

- 增加单个数据
   - getShopDao().insert(shop);
  - getShopDao().insertOrReplace(shop)(有的话就更新覆盖);

- 增加多个数据
  - getShopDao().insertInTx(shopList);
  - getShopDao().insertOrReplaceInTx(shopList);

- 查询全部
  - List< Shop> list = getShopDao().loadAll();
  - List< Shop> list = getShopDao().queryBuilder().list();

- 查询条件数据
  - .where()
  - .whereOr()

- 查询附加多个条件
  - .where(, , ,)
  - .whereOr(, , ,)

- 查询附加排序
  - .orderDesc()
  - .orderAsc()

- 查询限制当页个数
  - .limit()

- 查询总个数
  - .count()

- 修改单个数据
  - getShopDao().update(shop);

- 修改多个数据
  - getShopDao().updateInTx(shopList);

- 删除单个数据
  - getTABUserDao().delete(user);

- 删除多个数据
  - getUserDao().deleteInTx(userList);

- 删除数据ByKey
  - getTABUserDao().deleteByKey();



