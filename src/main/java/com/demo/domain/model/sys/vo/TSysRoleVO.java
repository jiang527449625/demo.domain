package com.demo.domain.model.sys.vo;

import com.demo.common.mybatis.AbstractVO;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * 值对象
 * Created by jky on 2021/08/10.
 */
@Data
public class TSysRoleVO extends AbstractVO {

    @ApiModelProperty(name = "id", value = "角色主键")
    private String id;
    @ApiModelProperty(name = "roleName", value = "角色名称")
    private String roleName;
    @ApiModelProperty(name = "remark", value = "备注")
    private String remark;
    @ApiModelProperty(name = "parentUuid", value = "父级角色uuid")
    private String parentUuid;
    @ApiModelProperty(name = "inputCode", value = "拼音码")
    private String inputCode;
    @ApiModelProperty(name = "roleNameOrInputCode", value = "角色名称或拼音码")
    private String roleNameOrInputCode;
    @ApiModelProperty(name = "userUuidList", value = "用户集合")
    private List<String> userUuidList;
    @ApiModelProperty(name = "roleUuidList", value = "角色集合")
    private List<String> roleUuidList;
}
