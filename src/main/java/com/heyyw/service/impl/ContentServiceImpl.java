package com.heyyw.service.impl;

import com.heyyw.dao.ContentDao;
import com.heyyw.pojo.Content;
import com.heyyw.service.ContentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created with IDEA
 * Created by ${jie.chen} on 2016/7/14.
 */
@Service("contentService")
public class ContentServiceImpl implements ContentService {

    @Resource
    public ContentDao contentDao ;

    public List<Content> findContentList() {
        return contentDao.findContentList();
    }

    public int insertSelective(Content content) {
        return contentDao.insertSelective(content);
    }
}
