package com.demo.domain.model.sys.dto;

import lombok.Data;

import java.util.List;

/**
 * @ClassName: TRoleDto
 * @Description: 角色DTO
 * @Author: yujunhong@aliyun.com
 * @Date: 2021/8/12 17:31
 * @Version: 1.0
 */
@Data
public class TRoleUserDto {

    /**
     * 主键
     */
    private String id;

    /**
     * 角色ID
     */
    private String roleUuid;

    /**
     * 用户ID
     */
    private String userUuid;

    /**
     * 角色集合
     */
    private List<TSysRoleDto> roleDtoList;

    /**
     * 用户集合
     */
    private List<TSysUserDto> userDtoList;

}
