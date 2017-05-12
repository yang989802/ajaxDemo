package com.springapp.repository;

/**
 * Created by �ȕD on 2017/5/12.
 */
import com.springapp.model.UserInfoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
@Repository
public interface UserInfoRepository extends JpaRepository<UserInfoEntity, Integer>{

    @Query(value="select * from user_info where objectId =:oId " ,nativeQuery=true)
    public UserInfoEntity findByObjectId( @Param("oId") String objectId);
    /**
     (1�� findAll()�����ұ������м�¼��

     ��2��findOne(Integer id)����id������ĳһ����¼��

     ��3��findByXXX(Object xxx)��������XXX��һ���ֶ��������ݸ��ֶε�ֵ���������м�¼��

     ��4��save()��delete()�����һ����¼�Լ�ɾ��һ����¼��
     */
}
