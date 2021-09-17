package com.demo.domain.model.sys.vo;

import com.demo.common.mybatis.AbstractVO;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 值对象:自定义大屏管理
 *
 * @author yujunhong@aliyun.com
 * @date 2021/09/01
 */
@Data
public class SysCustomerScreenFormVO extends AbstractVO {

    @ApiModelProperty(name = "id", value = "主键uuid")
    private String id;
    @ApiModelProperty(name = "screenName", value = "自定义大屏名称")
    private String screenName;
    @ApiModelProperty(name = "inputCode", value = "拼音码")
    private String inputCode;
    @ApiModelProperty(name = "screenJson", value = "自定义大屏Json")
    private String screenJson;
    @ApiModelProperty(name = "whetherEnable", value = "是否启用")
    private String whetherEnable;
    @ApiModelProperty(name = "remarks", value = "备注信息")
    private String remarks;
    @ApiModelProperty(name = "screenNameOrInputCode", value = "自定义大屏名称或拼音码")
    private String screenNameOrInputCode;
}
