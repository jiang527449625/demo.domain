package com.demo.domain.model.sys.vo;

import com.demo.common.mybatis.AbstractVO;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 值对象
 * Created by jky on 2021/04/28.
 */
@Data
public class SysLogVO extends AbstractVO {
//    @ApiModelProperty() 用于方法，参数，字段说明；表示对参数的添加元数据（说明或是否必填等）
//    name–参数名
//    value–参数说明
//    required–是否必填
    @ApiModelProperty(name = "logUuid",value = "日志uuid",required = true)
    private String logUuid;
    @ApiModelProperty(name = "logModular",value = "模块（服务）",required = true)
    private String logModular;
    @ApiModelProperty(name = "logExplain",value = "说明")
    private String logExplain;
    @ApiModelProperty(name = "logParam",value = "参数")
    private String logParam;
    @ApiModelProperty(name = "logIp",value = "IP地址")
    private String logIp;
    @ApiModelProperty(name = "logMac",value = "MAC地址")
    private String logMac;
    @ApiModelProperty(name = "logMac",value = "备注")
    private String logRemark;
    @ApiModelProperty(name = "logResult",value = "原数据")
    private String logResult;

    public SysLogVO(){}

    public SysLogVO(String logUuid, String logModular, String logExplain,
                    String logParam, String logIp, String logRemark) {
        this.logUuid = logUuid;
        this.logModular = logModular;
        this.logExplain = logExplain;
        this.logParam = logParam;
        this.logIp = logIp;
        this.logRemark = logRemark;
    }
}
