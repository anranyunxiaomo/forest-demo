package com.moxuan.forest.demo.forest;

import com.dtflys.forest.annotation.Request;

/**
 * @ProjectName dxyt-mdm
 * @ClassName ForestDemoService
 * @Author zhangkai
 * @Description
 * @Date 2020/7/26 3:45 下午
 */
public interface ForestDemoService {

    @Request(url = "http://localhost:8080/forest/test",type = "get")
    String simpleRequest();
}
