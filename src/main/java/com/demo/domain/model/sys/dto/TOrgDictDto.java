package com.demo.domain.model.sys.dto;

import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * @ClassName: TOrgDictDto
 * @Description: 机构DTO
 * @Author: yujunhong@aliyun.com
 * @Date: 2021/8/12 17:31
 * @Version: 1.0
 */
@Data
public class TOrgDictDto {
    private String id;

    private String orgName;

    private String parentUuid;

    private String remarks;

    private String createBy;

    private Date createAt;

    private String updateBy;

    private Date updateAt;

    private String whetherEnable;

    private String delFlag;

    private String inputCode;

    private List<TOrgDictDto> children;

}