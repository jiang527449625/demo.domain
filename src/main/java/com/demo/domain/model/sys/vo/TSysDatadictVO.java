package com.demo.domain.model.sys.vo;

import com.demo.common.mybatis.AbstractVO;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 值对象
 * Created by jky on 2021/08/10.
 */
@Data
public class TSysDatadictVO extends AbstractVO {

    @ApiModelProperty(name = "id",value = "主键uuid")
    private String id;
    @ApiModelProperty(name = "type",value = "字典类型")
    private String type;
    @ApiModelProperty(name = "value",value = "字典类型项目值")
    private String value;
    @ApiModelProperty(name = "display",value = "字典类型项目名称")
    private String display;
    @ApiModelProperty(name = "sort",value = "字典类型项目排序")
    private Short sort;
    @ApiModelProperty(name = "remark",value = "字典类型项目备注")
    private String remark;
    @ApiModelProperty(name = "inputCode",value = "拼音码")
    private String inputCode;

}
