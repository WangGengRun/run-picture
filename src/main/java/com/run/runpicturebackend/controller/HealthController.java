package com.run.runpicturebackend.controller;

import com.run.runpicturebackend.common.BaseResponse;
import com.run.runpicturebackend.common.ResultUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HealthController {
    /**
     * 健康检查接口
     * @return 返回字符串 "ok" 表示服务正常
     */
    @GetMapping("/health")
    public BaseResponse<String> health() {
        return ResultUtils.success("health");
    }
}
