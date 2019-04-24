package com.zscat.mallplus.sys.service;

import com.zscat.mallplus.sys.entity.SysPermission;
import com.baomidou.mybatisplus.extension.service.IService;
import com.zscat.mallplus.sys.entity.SysPermissionNode;

import java.util.List;

/**
 * <p>
 * 后台用户权限表 服务类
 * </p>
 *
 * @author zscat
 * @since 2019-04-14
 */
public interface ISysPermissionService extends IService<SysPermission> {

    Object getPermissionsByUserId(Long id);

    List<SysPermissionNode> treeList();
}
