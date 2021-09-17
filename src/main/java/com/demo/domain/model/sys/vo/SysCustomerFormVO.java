package com.demo.domain.model.sys.vo;

import com.demo.common.mybatis.AbstractVO;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 值对象
 * Created by jky on 2021/08/24.
 */
@Data
public class SysCustomerFormVO extends AbstractVO {

    @ApiModelProperty(name = "id", value = "主键uuid")
    private String id;
    @ApiModelProperty(name = "formName", value = "表单名称")
    private String formName;
    @ApiModelProperty(name = "remarks", value = "备注信息")
    private String remarks;
    @ApiModelProperty(name = "whetherEnable", value = "是否启用")
    private String whetherEnable;
    @ApiModelProperty(name = "formFile", value = "表单文件")
    private String formFile;
    @ApiModelProperty(name = "formJson", value = "表单Json")
    private String formJson;
    @ApiModelProperty(name = "menuId", value = "按钮uuid")
    private String menuId;
    @ApiModelProperty(name = "formNameOrInputCode", value = "自定义表单名称或拼音码")
    private String formNameOrInputCode;
}
