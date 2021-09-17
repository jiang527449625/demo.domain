package com.demo.domain.model.sys.vo;

import com.demo.common.mybatis.AbstractVO;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * 值对象
 * Created by jky on 2021/08/10.
 */
@Data
public class TMenuDictVO extends AbstractVO {
    @ApiModelProperty(name = "id", value = "菜单主键ID")
    private String id;
    @ApiModelProperty(name = "parentUuid", value = "父级菜单ID")
    private String parentUuid;
    @ApiModelProperty(name = "parentUuids", value = "所有父级菜单ID")
    private String parentUuids;
    @ApiModelProperty(name = "menuName", value = "菜单名称")
    private String menuName;
    @ApiModelProperty(name = "menuNameOrInputCode", value = "菜单名称或拼音码")
    private String menuNameOrInputCode;
    @ApiModelProperty(name = "menuHref", value = "菜单地址")
    private String menuHref;
    @ApiModelProperty(name = "menuHref", value = "组件地址")
    private String menuAssemblyHref;
    @ApiModelProperty(name = "menuIcon", value = "菜单图标路径")
    private String menuIcon;
    @ApiModelProperty(name = "remark", value = "菜单备注")
    private String remark;
    @ApiModelProperty(name = "hideFlag", value = "是否显示（0.显示 1.隐藏）")
    private String hideFlag;
    @ApiModelProperty(name = "menuType", value = "菜单类型（0.菜单 1.按钮）")
    private String menuType;
    @ApiModelProperty(name = "inputCode", value = "拼音码")
    private String inputCode;
    @ApiModelProperty(name = "sort", value = "菜单排序")
    private Short sort;
    @ApiModelProperty(name = "ruUuidList", value = "角色/用户权限ID")
    private List<String> ruUuidList;
    @ApiModelProperty(name = "czlx", value = "操作类型 0 新增 1 修改 2 删除")
    private String czlx;
    @ApiModelProperty(name = "formUuid", value = "自定义表单uuid")
    private String formUuid;
}
