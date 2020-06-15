package com.classyex.github.junitdemo.base;

import org.springframework.test.context.ActiveProfilesResolver;

/**
 * SpringActiveProfileResolver.java <br>
 * @version 1.0 <br>
 * @date 2020/6/15 10:35 <br>
 * @author yex <br>
 */
public class SpringActiveProfileResolver implements ActiveProfilesResolver {
    @Override
    public String[] resolve(Class<?> testClass) {
        final String activeProfile = System.getProperty("spring.profiles.active");
        return new String[]{activeProfile == null ? "dev" : activeProfile};
    }
}
