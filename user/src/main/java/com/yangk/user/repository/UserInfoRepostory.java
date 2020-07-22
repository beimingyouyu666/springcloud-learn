package com.yangk.user.repository;

import com.yangk.user.dataobject.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * 2018-03-04 21:42
 */
public interface UserInfoRepostory extends JpaRepository<UserInfo, String> {

	UserInfo findByOpenid(String openid);
}
