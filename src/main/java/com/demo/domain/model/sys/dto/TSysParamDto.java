package com.demo.domain.model.sys.dto;

import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * @ClassName: TSysParamDto
 * @Description: 参数DTO
 * @Author: jky
 * @Date: 2021/8/17 17:31
 * @Version: 1.0
 */
@Data
public class TSysParamDto {

    private String id;

    private String spCode;

    private String spName;

    private String spValue;

    private String remark;

    private String createBy;

    private Date createAt;

    private String updateBy;

    private Date updateAt;

    private String whetherEnable;

    private String delFlag;

    private String inputCode;

    private List<TOrgDictDto> children;
}