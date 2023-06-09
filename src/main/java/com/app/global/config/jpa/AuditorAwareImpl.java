package com.app.global.config.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.AuditorAware;
import org.springframework.util.StringUtils;

import javax.servlet.http.HttpServletRequest;
import java.util.Optional;

public class AuditorAwareImpl implements AuditorAware {

    @Autowired
    private HttpServletRequest httpServletRequest; // HttpServletRequest - 빈으로 주입

    @Override
    public Optional getCurrentAuditor() {

        String modifiedBy = httpServletRequest.getRequestURI();
        if(!StringUtils.hasText(modifiedBy)){
            modifiedBy = "unknown";
        }
        return Optional.empty();
    }
}
