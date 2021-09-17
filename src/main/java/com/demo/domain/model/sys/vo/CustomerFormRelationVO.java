package com.demo.domain.model.sys.vo;

import com.demo.common.mybatis.AbstractVO;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 值对象
 * Created by jky on 2021/08/24.
 */
@Data
public class CustomerFormRelationVO extends AbstractVO {
    @ApiModelProperty(name = "id",value = "主键uuid")
    private String id;
    @ApiModelProperty(name = "customerFormId",value = "表单uuid")
    private String customerFormId;
    @ApiModelProperty(name = "menuId",value = "按钮uuid")
    private String menuId;
}
