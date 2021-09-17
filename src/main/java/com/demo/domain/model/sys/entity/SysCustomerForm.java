package com.demo.domain.model.sys.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.util.Date;

@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("SYS_CUSTOMER_FORM")
public class SysCustomerForm {
    @TableId("id")
    private String id;

    private String formName;

    private String inputCode;

    private String delFlag;

    private String whetherEnable;

    private String remarks;

    private String createBy;

    private Date createAt;

    private String updateBy;

    private Date updateAt;

    private byte[] formFile;

    private byte[] formJson;

}