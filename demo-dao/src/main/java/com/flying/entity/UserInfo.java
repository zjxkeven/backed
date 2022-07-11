package com.flying.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;
import java.util.Date;

@Component
@Setter
@Getter
public class UserInfo
{
    private int userId; //用户编号
    private String userName; //用户姓名
    private String province; //省份
    private Date createTime; //注册时间

    //省略getter与setter方法...

    @Override
    public String toString()
    {
        return "编号：" + this.getUserId() +" 姓名：" + this.getUserName() + " 省份：" + this.getProvince();
    }
}