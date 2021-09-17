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
@TableName("T_MENU_DICT")
public class TMenuDict {
    @TableId("id")
    private String id;

    private String parentUuid;

    private String parentUuids;

    private String menuName;

    private String menuHref;

    private String menuAssemblyHref;

    private String menuIcon;

    private String hideFlag;

    private String whetherEnable;

    private Short sort;

    private String delFlag;

    private String createBy;

    private Date createAt;

    private String updateBy;

    private Date updateAt;

    private String remark;

    private String menuType;

    private String inputCode;
}
