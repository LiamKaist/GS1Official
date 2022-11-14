/*
 * Copyright 2017 Open Language for Internet of Things (Oliot)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.oliot.heroku.tsd.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProjectMetaController {
    @GetMapping("/schema")
    public String schemaDocumentation() {
        String redirectUrl = "https://oliot-tsd.github.io/documentation/schema/v1.1";
        return "redirect:" + redirectUrl;
    }

    @GetMapping("/apis")
    public String apisDocumentation() {
        return "apis";
    }

    @GetMapping("/source")
    public String sourceCode() {
        String redirectUrl = "https://github.com/oliot-tsd/tsd-heroku";
        return "redirect:" + redirectUrl;
    }
}
