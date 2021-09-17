package com.demo.domain.model.sys.dto;

import lombok.Data;

/**
 * 值对象:自定义大屏管理
 *
 * @author yujunhong@aliyun.com
 * @date 2021/09/01
 */
@Data
public class SysCustomerFormDto {

    private String id;

    private String formName;

    private String remarks;

    private String whetherEnable;

    private String screenNameOrInputCode;
}
