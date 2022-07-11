package com.flying.authority;

import com.flying.api.IBaseAuthorityServiceClient;
import com.flying.api.entity.AuthorityApi;
import com.flying.api.entity.AuthorityMenu;
import com.flying.api.entity.AuthorityResource;
import com.flying.core.entity.ResultBody;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@Api(tags = "系统权限管理")
@RestController
public class BaseAuthorityController implements IBaseAuthorityServiceClient {

    /**
     * 获取所有访问权限列表
     *
     * @return
     */
    @ApiOperation(value = "获取所有访问权限列表", notes = "获取所有访问权限列表")
    @GetMapping("/authority/access")
    @Override
    public ResultBody<List<AuthorityResource>> findAuthorityResource() {
        List<AuthorityResource> result = new ArrayList<AuthorityResource>();
        return ResultBody.ok().data(result);
    }

    /**
     * 获取权限列表
     *
     * @return
     */
    @ApiOperation(value = "获取接口权限列表", notes = "获取接口权限列表")
    @GetMapping("/authority/api")
    public ResultBody<List<AuthorityApi>> findAuthorityApi(
            @RequestParam(value = "serviceId", required = false) String serviceId
    ) {
        List<AuthorityApi> result = new ArrayList<AuthorityApi>();;
        return ResultBody.ok().data(result);
    }


    /**
     * 获取菜单权限列表
     *
     * @return
     */
    @ApiOperation(value = "获取菜单权限列表", notes = "获取菜单权限列表")
    @GetMapping("/authority/menu")
    @Override
    public ResultBody<List<AuthorityMenu>> findAuthorityMenu() {
        List<AuthorityMenu> result = new ArrayList<AuthorityMenu>();
        return ResultBody.ok().data(result);
    }
}
