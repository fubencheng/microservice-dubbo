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
package com.netlink.web;

import com.alibaba.dubbo.config.annotation.Reference;
import com.netlink.dto.ImageDTO;
import com.netlink.service.ImageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * ImageServiceController
 *
 * @author fubencheng
 * @version 0.0.1 2018-05-18 10:18 fubencheng
 */
@Slf4j
@RestController
@RequestMapping("/image")
public class ImageServiceController {

    @Reference(version = "1.0.0", loadbalance = "roundrobin")
    private ImageService imageService;

    private String appName = "image-service-provider";

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/list")
    public ImageDTO getImageList() {
        return imageService.getImage();
    }

    @GetMapping("")
    public ImageDTO getImageByTitle(@RequestParam("title") String title){
        log.info("query image list! title={}", title);

        return restTemplate.getForEntity("http://" + appName + "/image?title=" + title, ImageDTO.class).getBody();
    }

}