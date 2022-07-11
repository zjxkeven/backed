package com.flying.mapper;

import com.flying.entity.UserInfo;
import com.flying.entity.UserSearchParam;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.jdbc.SQL;
import org.springframework.stereotype.Repository;
import java.util.List;

@Mapper
@Repository
public interface UserMapper
{
    /**
     * 查询用户列表
     */
    @SelectProvider(type = UserSqlBuilder.class, method = "searchUserList")
    public List<UserInfo> searchUserList(UserSearchParam param);

    //建议将SQL Builder以映射器接口内部类的形式进行定义
    public class UserSqlBuilder
    {
        public String searchUserList(UserSearchParam param)
        {
            return new SQL()
            {
                {
                    SELECT("*");
                    FROM("tb_user");
                    WHERE("1 = 1");
                    if(param!=null)
                    {
                        //用户姓名
                        if(param.getUserName()!=null && param.getUserName().length()>0)
                        {
                            WHERE("user_name like '%${userName}%'");
                        }

                        //省份
                        if(param.getProvince()!=null && param.getProvince().length()>0)
                        {
                            WHERE("province = #{province}");
                        }
                    }
                }
            }.toString();
        }
    }
}
