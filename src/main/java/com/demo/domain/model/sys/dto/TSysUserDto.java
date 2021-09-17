package com.demo.domain.model.sys.dto;

import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * @ClassName: TRoleDto
 * @Description: 用户DTO
 * @Author: yujunhong@aliyun.com
 * @Date: 2021/8/12 17:31
 * @Version: 1.0
 */
@Data
public class TSysUserDto {

    private String id;

    private String userAccount;

    private String userPassword;

    private String userRealName;

    private String userGender;

    private String userTelephone;

    private String orgUuid;

    private String remark;

    private String createBy;

    private Date createAt;

    private String updateBy;

    private Date updateAt;

    private String delFlag;

    private String whetherEnable;

    private String inputCode;

    /**
     * 机构
     */
    private TOrgDictDto orgDictDto;

    /**
     * 角色
     */
    private List<TSysRoleDto> sysRoleDtoList;
}
