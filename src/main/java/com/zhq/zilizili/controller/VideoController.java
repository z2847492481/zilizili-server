package com.zhq.zilizili.controller;

import com.zhq.zilizili.model.vo.VideoVo;
import org.springframework.web.bind.annotation.*;

/**
 * @author zhq123
 * @date 2025/2/16 17:24
 */
@RestController
@RequestMapping("/video")
public class VideoController {

    @GetMapping("/getVideoInfoById/{id}")
    public VideoVo getVideoInfoById(@PathVariable("id") Long id) {
        VideoVo videoVo = new VideoVo();
        videoVo.setVideoId(id);
        return videoVo;
    }
}
