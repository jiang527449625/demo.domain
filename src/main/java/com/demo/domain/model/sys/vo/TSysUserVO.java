package com.demo.domain.model.sys.vo;

import com.demo.common.mybatis.AbstractVO;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 值对象
 *
 * @author yujunhong@aliyun.com
 * @date 2021/08/11
 */
@Data
public class TSysUserVO extends AbstractVO {
    @ApiModelProperty(name = "id", value = "机构主键uuid")
    private String id;
    @ApiModelProperty(name = "userAccount", value = "用户账号")
    private String userAccount;
    @ApiModelProperty(name = "userPassword", value = "用户密码")
    private String userPassword;
    @ApiModelProperty(name = "userRealName", value = "用户名称")
    private String userRealName;
    @ApiModelProperty(name = "userGender", value = "性别(男 女)")
    private String userGender;
    @ApiModelProperty(name = "userTelephone", value = "联系电话")
    private String userTelephone;
    @ApiModelProperty(name = "orgUuid", value = "所属机构uuid")
    private String orgUuid;
    @ApiModelProperty(name = "remark", value = "备注")
    private String remark;
    @ApiModelProperty(name = "whetherEnable", value = "启用状态")
    private String whetherEnable;
    @ApiModelProperty(name = "inputCode", value = "拼音码")
    private String inputCode;
    @ApiModelProperty(name = "userRealNameOrInputCode", value = "账户名称或者拼音码")
    private String userRealNameOrInputCode;
}
