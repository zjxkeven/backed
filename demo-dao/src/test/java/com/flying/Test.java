package com.flying;

import com.flying.entity.UserInfo;
import com.flying.entity.UserSearchParam;
import com.flying.mapper.UserMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes={DaoApplication.class})
public class Test {

    @Autowired
    private UserMapper userMapper;

    /**
     * 分页查询用户列表
     * @author pan_junbiao
     */
    @org.junit.Test
    public void searchUserByParam()
    {
        int pageIndex = 2; ///获取第2页的数据
        int pageSize = 10; //每页10条数据
        String orderBy = "create_time ASC"; //排序

        //分页信息
        PageHelper.startPage(pageIndex, pageSize, orderBy);

        //查询条件类
        UserSearchParam userSearchParam = new UserSearchParam();
        //userSearchParam.setUserName("pan_junbiao的博客"); //查询条件1
        //userSearchParam.setProvince("广东省"); //查询条件2

        //执行分页查询
        PageInfo<UserInfo> userInfoPage = new PageInfo<UserInfo>(userMapper.searchUserList(userSearchParam));

        //打印用户列表
        System.out.println("\n");
        List<UserInfo> userInfoList = userInfoPage.getList();
        userInfoList.stream().forEach(System.out::println);

        //打印分页信息
        System.out.println("当前页码：第" + userInfoPage.getPageNum() + "页");
        System.out.println("分页大小：每页" + userInfoPage.getPageSize() + "条");
        System.out.println("数据总数：共" + userInfoPage.getTotal() + "条");
        System.out.println("总页数：共" + userInfoPage.getPages() + "页");
    }
}
