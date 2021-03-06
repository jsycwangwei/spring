/**
 * Copyright (c) 2005-2012 https://github.com/zhangkaitao Licensed under the Apache License, Version 2.0 (the
 * "License");
 */
package org.wangwei.event.register;

import org.springframework.context.ApplicationListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class IndexRegisterListener implements ApplicationListener<RegisterEvent> {
    @Async
    @Override
    public void onApplicationEvent(final RegisterEvent event) {
        System.out.println("注册成功，索引用户信息：" + ((User) event.getSource()).getUsername());
    }
}
