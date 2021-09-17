package com.demo.domain.model.sys.vo;

import com.demo.common.mybatis.AbstractVO;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 值对象
 * Created by jky on 2021/08/10.
 */
@Data
public class TOrgDictVO extends AbstractVO {

    @ApiModelProperty(name = "id",value = "机构主键uuid")
    private String id;
    @ApiModelProperty(name = "orgName",value = "机构名称")
    private String orgName;
    @ApiModelProperty(name = "parentUuid",value = "上级机构")
    private String parentUuid;
    @ApiModelProperty(name = "remark",value = "机构备注")
    private String remark;
    @ApiModelProperty(name = "inputCode",value = "拼音码")
    private String inputCode;
    @ApiModelProperty(name = "orgNameOrInputCode",value = "机构名称或者拼音码")
    private String orgNameOrInputCode;
}
