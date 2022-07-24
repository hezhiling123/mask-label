package cn.mask.mask.label.dubbo.service.label;

import hezhiling.mask.label.api.service.label.LabelService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author hezhiling
 * @version 1.0
 * @date 2022-05-03 23:57:32
 */

@RequestMapping(value = "/ribbon")
public class LabelServiceImpl implements LabelService {


    @Override
    @PostMapping("test")
    public void addLabel()  {
        System.out.println("invoked");
    }
}
