package cn.porkchop.socialbinary.qa.client.impl;

import cn.porkchop.socialbinary.common.utils.Result;
import cn.porkchop.socialbinary.common.utils.StatusCode;
import cn.porkchop.socialbinary.qa.client.LabelClient;
import org.springframework.stereotype.Component;

@Component
public class LabelClientImpl implements LabelClient {

    @Override
    public Result findById(String id) {
        return new Result(false, StatusCode.ERROR, "熔断器启动了");
    }
}
