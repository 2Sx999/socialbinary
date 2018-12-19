package cn.porkchop.socialbinary.qa.client;

import cn.porkchop.socialbinary.common.utils.Result;
import cn.porkchop.socialbinary.qa.client.impl.LabelClientImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "socialbinary-base", fallback = LabelClientImpl.class)
public interface LabelClient {
    @RequestMapping(value = "/label/{id}", method = RequestMethod.GET)
    Result findById(@PathVariable("id") String id);
}
