package me.codeboy.common.base.example;

import me.codeboy.common.base.net.CBHttpsUtil;
import me.codeboy.common.base.security.CBBase64;
import me.codeboy.common.base.util.CBLogUtil;
import me.codeboy.common.base.util.CBStringUtil;

import java.io.IOException;


/**
 * 测试
 */
public class TestExample {

    public static void main(String[] args) {
        // new TestExample().testBase64();
        // new TestExample().testHttps();
        new TestExample().testVersionUtil();
    }

    /**
     * base64编
     */
    public void testBase64() {
        String str = "小胖轩(codeboy.me)";
        String tmp = CBBase64.encode(str);
        CBLogUtil.print(tmp);
        try {
            CBLogUtil.print(CBBase64.decode(tmp));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 测试https
     */
    public void testHttps() {
        String url = "https://kyfw.12306.cn/otn/leftTicket/init";
        try {
            CBLogUtil.print(new CBHttpsUtil().get(url));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    /**
     * 版本比较
     */
    public void testVersionUtil() {
        CBLogUtil.print(CBStringUtil.versionCompareAndHasANewVersion("1.1.2", "1.2.1"));
        CBLogUtil.print(CBStringUtil.versionCompareAndHasANewVersion("1.1.2", "1.2.1"));
        CBLogUtil.print(CBStringUtil.versionCompareAndHasANewVersion("1.1.2", "1.1.2"));
        CBLogUtil.print(CBStringUtil.versionCompareAndHasANewVersion("1.1.2", "1.1.2.1"));
        CBLogUtil.print(CBStringUtil.versionCompareAndHasANewVersion("1.10.2", "1.2.1.1"));
        CBLogUtil.print(CBStringUtil.versionCompareAndHasANewVersion("1.10.2", "1.1.1"));
    }
}