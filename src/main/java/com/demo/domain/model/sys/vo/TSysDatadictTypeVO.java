package com.demo.domain.model.sys.vo;

import com.demo.common.mybatis.AbstractVO;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 值对象
 * Created by jky on 2021/08/10.
 */
@Data
public class TSysDatadictTypeVO extends AbstractVO {

    @ApiModelProperty(name = "id",value = "主键uuid")
    private String id;
    @ApiModelProperty(name = "type",value = "字典类型")
    private String type;
    @ApiModelProperty(name = "name",value = "字典类型名称")
    private String name;
    @ApiModelProperty(name = "remark",value = "字典类型备注")
    private String remark;
    @ApiModelProperty(name = "inputCode",value = "拼音码")
    private String inputCode;
}
