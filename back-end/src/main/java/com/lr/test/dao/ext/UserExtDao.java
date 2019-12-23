package com.lr.test.dao.ext;

import com.lr.test.dao.UserDao;
import com.lr.test.entity.ext.UserExt;

/**
 * @author kenny.cai
 */
public interface UserExtDao extends UserDao {

    UserExt selectExtByPrimaryKey(String id);
}
