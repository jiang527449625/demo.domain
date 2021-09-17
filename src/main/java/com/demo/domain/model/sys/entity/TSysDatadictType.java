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
@TableName("T_SYS_DATADICT_TYPE")
public class TSysDatadictType {
    @TableId("id")
    private String id;

    private String type;

    private String name;

    private String remark;

    private String createBy;

    private Date createAt;

    private String updateBy;

    private Date updateAt;

    private String whetherEnable;

    private String delFlag;

    private String inputCode;

}