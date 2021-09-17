package com.demo.domain.model.sys.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("CUSTOMER_FORM_RELATION")
public class CustomerFormRelation implements Serializable {
    @TableId("id")
    private String id;

    private String customerFormId;

    private String menuId;
}
