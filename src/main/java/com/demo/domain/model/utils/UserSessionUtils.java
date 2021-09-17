package com.demo.domain.model.utils;


import com.demo.common.model.vo.Constants;
import com.demo.domain.model.sys.dto.TSysUserDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * element 当前登陆用户
 */
@Slf4j
public class UserSessionUtils {

    /**
     * 获取当前登陆人
     * @return
     */
    public static TSysUserDto getCurrentUser(){
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        TSysUserDto user = (TSysUserDto) request.getAttribute(Constants.USER);
        return user;
    }

}
