package com.flying.api;

import com.flying.api.entity.AuthorityMenu;
import com.flying.api.entity.AuthorityResource;
import com.flying.core.entity.ResultBody;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public interface IBaseAuthorityServiceClient {
    /**
     * 获取所有访问权限列表
     * @return
     */
    @GetMapping("/authority/access")
    ResultBody<List<AuthorityResource>> findAuthorityResource();

    /**
     * 获取菜单权限列表
     *
     * @return
     */
    @GetMapping("/authority/menu")
    ResultBody<List<AuthorityMenu>> findAuthorityMenu();
}
