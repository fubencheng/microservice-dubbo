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

import com.netlink.dto.ImageDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * ImageController
 *
 * @author fubencheng
 * @version 0.0.1 2018-06-06 16:12 fubencheng
 */
@Slf4j
@RestController
public class ImageController {

    @GetMapping("/image")
    public ImageDTO getImage(@RequestParam("title") String title) {
        log.info("image title = {}", title);

        ImageDTO imageDTO = new ImageDTO();
        imageDTO.setKeywords("雪覆盖松树在日落");
        imageDTO.setTitle("雪覆盖松树在日落");
        imageDTO.setImageUrl("https://goss.veer.com/creative/vcg/veer/1600water/veer-142468260.jpg");
        return imageDTO;
    }

}