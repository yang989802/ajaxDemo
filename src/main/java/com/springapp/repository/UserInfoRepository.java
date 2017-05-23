package com.springapp.repository;

/**
 * Created by �ȕD on 2017/5/12.
 */
import com.springapp.model.UserInfoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserInfoRepository extends JpaRepository<UserInfoEntity, Integer>{

    @Query(value="select * from user_info where objectId =:oId " ,nativeQuery=true)
    public UserInfoEntity findByObjectId( @Param("oId") String objectId);
    /**
     (1） findAll()：查找表中所有记录；

     （2）findOne(Integer id)：按id来查找某一条记录；

     （3）findByXXX(Object xxx)：在这里XXX是一个字段名，根据该字段的值开查找所有记录；

     （4）save()和delete()：添加一条记录以及删除一条记录。
     */
}
