package com.demo.domain.model.sys.dto;

import java.util.List;

/**
 * Created by jky on 2021-06-07.
 */
public class SysTreeNodeDto {
    private String id;
    private String pId;
    private String name;
    private String code;
    private String remarks;
    private String pinyinCode;
    private String clinicAttr;
    private List<SysTreeNodeDto> children;

    public SysTreeNodeDto(){}

    public SysTreeNodeDto(String id, String pId, String name, String pinyinCode, String code, List<SysTreeNodeDto> children) {
        this.id = id;
        this.pId = pId;
        this.name = name;
        this.code = code;
        this.pinyinCode = pinyinCode;
        this.children = children;
    }

    public SysTreeNodeDto(String id, String pId, String name, String pinyinCode, String code, String clinicAttr, List<SysTreeNodeDto> children) {
        this.id = id;
        this.pId = pId;
        this.name = name;
        this.code = code;
        this.pinyinCode = pinyinCode;
        this.clinicAttr = clinicAttr;
        this.children = children;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getpId() {
        return pId;
    }

    public void setpId(String pId) {
        this.pId = pId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public List<SysTreeNodeDto> getChildren() {
        return children;
    }

    public void setChildren(List<SysTreeNodeDto> children) {
        this.children = children;
    }

    public String getClinicAttr() {
        return clinicAttr;
    }

    public void setClinicAttr(String clinicAttr) {
        this.clinicAttr = clinicAttr;
    }

    public String getPinyinCode() {
        return pinyinCode;
    }

    public void setPinyinCode(String pinyinCode) {
        this.pinyinCode = pinyinCode;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}
