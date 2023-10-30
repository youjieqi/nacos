/*
 * Copyright 1999-2023 Alibaba Group Holding Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.alibaba.nacos.config.server.model.event;

public class IstioConfigChangeEvent extends ConfigDataChangeEvent {
    
    public final String content;
    
    public final String type;
    
    public IstioConfigChangeEvent(String dataId, String group, long gmtModified, String content, String type) {
        super(dataId, group, gmtModified);
        this.content = content;
        this.type = type;
    }
    
    public IstioConfigChangeEvent(boolean isBeta, String dataId, String group, String tenant, long gmtModified,
            String content, String type) {
        super(isBeta, dataId, group, tenant, gmtModified);
        this.content = content;
        this.type = type;
    }
    
    public IstioConfigChangeEvent(boolean isBeta, String dataId, String group, long gmtModified, String content,
            String type) {
        super(isBeta, dataId, group, gmtModified);
        this.content = content;
        this.type = type;
    }
    
    public IstioConfigChangeEvent(boolean isBeta, String dataId, String group, String tenant, String tag,
            long gmtModified, String content, String type) {
        super(isBeta, dataId, group, tenant, tag, gmtModified);
        this.content = content;
        this.type = type;
    }
    
    public IstioConfigChangeEvent(String dataId, String group, String tenant, boolean isBatch, long gmtModified,
            String content, String type) {
        super(dataId, group, tenant, isBatch, gmtModified);
        this.content = content;
        this.type = type;
    }
    
}