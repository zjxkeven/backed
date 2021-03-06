package com.flying.core.entity;

import lombok.Getter;
import lombok.Setter;

/**
 * 分页请求
 */
@Setter
@Getter
public class PageRequest {
    /**
     * 当前页码
     */
    private int pageNum;
    /**
     * 每页数量
     */
    private int pageSize;
}
