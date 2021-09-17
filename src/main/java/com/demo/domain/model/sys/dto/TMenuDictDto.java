package com.demo.domain.model.sys.dto;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class TMenuDictDto {
    private String id;

    private String parentUuid;

    private String parentUuids;

    private String menuName;

    private String menuHref;

    private String menuAssemblyHref;

    private String menuIcon;

    private String whetherEnable;

    private Short sort;

    private String hideFlag;

    private String delFlag;

    private String createBy;

    private Date createAt;

    private String updateBy;

    private Date updateAt;

    private String remarks;

    private String menuType;

    private String inputCode;

    private List<TMenuDictDto> children;

}