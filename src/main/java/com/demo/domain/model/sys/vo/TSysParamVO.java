package com.demo.domain.model.sys.vo;

import com.demo.common.mybatis.AbstractVO;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 值对象
 * Created by jky on 2021/08/10.
 */
@Data
public class TSysParamVO extends AbstractVO {

    @ApiModelProperty(name = "id", value = "主键uuid")
    private String id;
    @ApiModelProperty(name = "spCode", value = "参数code")
    private String spCode;
    @ApiModelProperty(name = "spName", value = "参数名称")
    private String spName;
    @ApiModelProperty(name = "spValue", value = "参数内容")
    private String spValue;
    @ApiModelProperty(name = "remark", value = "参数说明")
    private String remark;
    @ApiModelProperty(name = "inputCode", value = "拼音码")
    private String inputCode;
    @ApiModelProperty(name = "whetherEnable", value = "启用状态")
    private String whetherEnable;
    @ApiModelProperty(name = "paramNameOrInputCode", value = "机构名称或者拼音码")
    private String paramNameOrInputCode;
}
