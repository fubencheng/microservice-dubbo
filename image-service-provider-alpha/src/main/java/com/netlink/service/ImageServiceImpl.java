/*
 * Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE
 * file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file
 * to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the
 * License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package com.netlink.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.netlink.dto.ImageDTO;

/**
 * ImageServiceImpl
 *
 * @author fubencheng
 * @version 0.0.1 2018-05-18 10:15 fubencheng
 */
@Service(version = "1.0.0")
public class ImageServiceImpl implements ImageService {

    @Override
    public ImageDTO getImage() {
        ImageDTO imageDTO = new ImageDTO();
        imageDTO.setKeywords("性感尤物|妮小妖|酥胸|性感美图");
        imageDTO.setTitle("[尤果网]U231性感尤物妮小妖傲人酥胸火辣性感美图_特色图");
        imageDTO.setImageUrl("http://www.tesetu.com/tupian/jptt/UGirls/201701/19331.html");
        return imageDTO;
    }

}