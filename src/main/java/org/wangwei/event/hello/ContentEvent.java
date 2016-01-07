/**
 * Copyright (c) 2005-2012 https://github.com/zhangkaitao Licensed under the Apache License, Version 2.0 (the
 * "License");
 */
package org.wangwei.event.hello;

import org.springframework.context.ApplicationEvent;

public class ContentEvent extends ApplicationEvent {
    public ContentEvent(final String content) {
        super(content);
    }
}
