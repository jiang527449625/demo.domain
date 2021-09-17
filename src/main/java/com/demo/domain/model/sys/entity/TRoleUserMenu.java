package com.demo.domain.model.sys.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("T_ROLE_USER_MENU")
public class TRoleUserMenu {
    @TableId("id")
    private String id;

    private String ruUuid;

    private String menuUuid;
}