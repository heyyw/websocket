package com.heyyw.controller;

//import com.crossoverJie.lucene.LuceneIndex;
//import com.crossoverJie.pojo.Content;
//import com.crossoverJie.pojo.PageEntity;
//import com.crossoverJie.pojo.User;
//import com.crossoverJie.service.ContentService;
//import com.crossoverJie.service.IUserService;
//import com.crossoverJie.util.CommonUtil;
//import com.crossoverJie.util.PageUtil;
//import com.fasterxml.jackson.databind.util.JSONPObject;
//import net.sf.json.JSONObject;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import com.alibaba.fastjson.JSONObject;
import com.heyyw.pojo.Content;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/")
public class IndexController {

    //private Logger logger = LoggerFactory.getLogger(IndexController.class);



    @RequestMapping("/turnToWebSocketIndex")
    public String turnToWebSocketIndex() {
        return "websocket/websocket";
    }



}
