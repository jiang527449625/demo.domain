package com.demo.domain.model.sys.vo;

import com.demo.common.mybatis.AbstractVO;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 值对象
 * Created by jky on 2021/08/10.
 */
@Data
public class TRoleUserVO extends AbstractVO {
    @ApiModelProperty(name = "id", value = "主键uuid")
    private String id;
    @ApiModelProperty(name = "roleUuid", value = "角色uuid")
    private String roleUuid;
    @ApiModelProperty(name = "userUuid", value = "用户uuid")
    private String userUuid;
}
