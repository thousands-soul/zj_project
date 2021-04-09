package com.usian.service;

import com.usian.mapper.TbItemMapper;
import com.usian.pojo.TbItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author ZhangJian
 * @create 2021-04-08-16:08
 */
@Service
public class ItemService {

    @Autowired
    private TbItemMapper tbItemMapper;

    public TbItem selectItemInfo(Long itemId){
        TbItem tbItem = tbItemMapper.selectByPrimaryKey(itemId);
        System.out.println(tbItem);
        return  tbItem;
    }
}
