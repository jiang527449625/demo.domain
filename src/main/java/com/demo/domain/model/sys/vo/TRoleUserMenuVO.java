package com.demo.domain.model.sys.vo;

import com.demo.common.mybatis.AbstractVO;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 值对象
 * Created by jky on 2021/08/10.
 */
@Data
public class TRoleUserMenuVO extends AbstractVO {

    @ApiModelProperty(name = "id", value = "主键uuid")
    private String id;

    @ApiModelProperty(name = "ruUuid", value = "角色/用户uuid")
    private String ruUuid;

    @ApiModelProperty(name = "menuUuid", value = "菜单uuid")
    private String menuUuid;

    @ApiModelProperty(name = "roleUuid", value = "角色uuid")
    private String roleUuid;

    @ApiModelProperty(name = "userUuid", value = "用户uuid")
    private String userUuid;

    @ApiModelProperty(name = "menuNameOrInputCode", value = "菜单名称或者拼音码")
    private String menuNameOrInputCode;
}
