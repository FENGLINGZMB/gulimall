package com.fenglingzmb.gulimall.thirdparty;

import com.aliyun.oss.OSSClient;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.io.File;

@SpringBootTest
class ThirdpartyApplicationTests {
    @Resource
    private OSSClient ossClient;

    @Test
    void testUpload(){
        String bucketName = "gulimall-fenglingzmb";
        String objectName = "p0.png";
        ossClient.putObject(bucketName, objectName, new File("C:\\Users\\30346\\Desktop\\60144177_p0.png"));
    }

    @Test
    void contextLoads() {
    }

}
