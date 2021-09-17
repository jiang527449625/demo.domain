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
@TableName("SYS_LOG")
public class SysLog {
    @TableId("id")
    private String id;

    private String logModular;

    private String logExplain;

    private String creator;

    private Date createTime;

    private String updator;

    private Date updateTime;

    private String logResult;

    private String logRemark;

    private String logParam;

    private String logIp;
}