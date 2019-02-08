package com.wangzhen.spbsecurityjpa.repository;

import com.wangzhen.spbsecurityjpa.pojo.FKUser;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @ClassName UserRepository
 * @Description
 * @Author momo
 * @Date 2019/2/7 下午8:05
 **/
public interface UserRepository extends JpaRepository<FKUser, Long> {

    // 根据登录名查询出用户
    FKUser findByLoginName(String loginName);

}
