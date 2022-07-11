# 搭建步骤
## mybatisplus 分页 + mysql
https://blog.csdn.net/pan_junbiao/article/details/106789631  
分页封装：https://www.jianshu.com/p/5f15474ac4c5
## mysql5.7安装：  
https://blog.csdn.net/m0_49284219/article/details/121972531  
https://blog.csdn.net/qq_38244676/article/details/105658273
## 安装nacos  
https://blog.csdn.net/yiguang_820/article/details/114198842
## h2
https://www.cnblogs.com/april-chen/p/11459322.html

# 封装dao层,openfeign,分布式事务
服务层通过调用DAO层代码完成分页查询，这里统一封装分页查询的请求和结果类，从而避免因为替换ORM框架而导致服务层、控制层的分页接口也需要变动的情况，替换ORM框架也不会影响服务层以上的分页接口，起到了解耦的作用。
core  
common  
dao  
api  
platform  
 authority
 authenticate
 msg
 file
services  
 book
