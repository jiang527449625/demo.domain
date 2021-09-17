package com.demo.domain.model.sys.dto;

import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * @ClassName: TRoleDto
 * @Description: 角色DTO
 * @Author: yujunhong@aliyun.com
 * @Date: 2021/8/12 17:31
 * @Version: 1.0
 */
@Data
public class TSysRoleDto {

    private String id;

    private String roleName;

    private String remark;

    private String parentUuid;

    private String createBy;

    private Date createAt;

    private String updateBy;

    private Date updateAt;

    private String whetherEnable;

    private String delFlag;

    private String inputCode;

    private List<TSysRoleDto> children;
}
