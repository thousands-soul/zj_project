package com.usian.feign;

import com.usian.pojo.TbItem;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author ZhangJian
 * @create 2021-04-08-15:58
 */
@FeignClient("usian-item-service")
public interface ItemServiceFeign {
    @RequestMapping("service/item/selectItemInfo")
     TbItem selectItemInfo(@RequestParam  Long itemId);
}
