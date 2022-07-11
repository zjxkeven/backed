package com.flying.mapper;

import com.flying.entity.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import java.util.List;

@Mapper
@Repository
public interface BookMapper {
    /**
     * 查询全部
     * @return
     */
    @Select("select * from book")
    List<Book> selectAll();

    /**
     * 分页查询
     * @return
     */
    @Select("select * from book")
    List<Book> selectPage();
}
