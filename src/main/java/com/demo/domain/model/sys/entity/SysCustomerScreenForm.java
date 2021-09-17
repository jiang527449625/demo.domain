package com.demo.domain.model.sys.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.util.Date;

/**
 * @Description: 自定义大屏管理
 * @Author: yujunhong@aliyun.com
 * @Date: 2021/9/1 10:44
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("SYS_CUSTOMER_SCREEN_FORM")
public class SysCustomerScreenForm {
    @TableId("id")
    private String id;

    private String screenName;

    private String inputCode;

    private byte[] screenJson;

    private String delFlag;

    private String whetherEnable;

    private String remarks;

    private String createBy;

    private Date createAt;

    private String updateBy;

    private Date updateAt;
}