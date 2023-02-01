package cn.mask.mask.label.dubbo.service.label;

import cn.mask.mask.label.api.service.label.LabelService;
import org.springframework.security.access.prepost.PreAuthorize;
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
//    @PreAuthorize("hasAnyRole('admin')")
    public void addLabel()  {
        System.out.println("invoked");
    }
}
