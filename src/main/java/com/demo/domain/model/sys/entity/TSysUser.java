package com.demo.domain.model.sys.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.util.Date;

@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("T_SYS_USER")
public class TSysUser {
    @TableId("id")
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
}