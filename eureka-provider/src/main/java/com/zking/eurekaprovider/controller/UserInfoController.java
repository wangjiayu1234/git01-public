package com.zking.eurekaprovider.controller;

import com.zking.eurekaprovider.model.UserInfo;
import com.zking.eurekaprovider.service.IUserInfo;
import com.zking.eurekaprovider.util.JsonData;
import com.zking.eurekaprovider.util.PageBean;
import com.zking.eurekaprovider.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping(produces = "application/json")
public class UserInfoController {

    @Autowired
    private IUserInfo iUserInfo;

    /**
     * 业务模块相关功能操作
     * 查询所有的数据
     *
     * @param request
     * @return
     */
    @RequestMapping("/getall2")
    @ResponseBody
    public JsonData getAll(HttpServletRequest request) {
        PageBean pageBean = new PageBean();
        Map map = new HashMap();
        map.put("title", StringUtils.toLikeStr(request.getParameter("title")));
        pageBean.setRequest(request);
        List<UserInfo> articlesses = this.iUserInfo.selectgetAll(map, pageBean);
        JsonData jsonData = new JsonData(1, "操作成功", articlesses);
        jsonData.put("pagebean", pageBean);
        return jsonData;
    }

    @RequestMapping("/getallgz")
    @ResponseBody
    public JsonData getAll2(HttpServletRequest request) {
        PageBean pageBean = new PageBean();
        Map map = new HashMap();
        map.put("title", StringUtils.toLikeStr(request.getParameter("title")));
        pageBean.setRequest(request);
        List<UserInfo> articlesses = this.iUserInfo.selectgetAll2(map, pageBean);
        JsonData jsonData = new JsonData(1, "操作成功", articlesses);
        jsonData.put("pagebean", pageBean);
        return jsonData;
    }
    @RequestMapping("/getall3")
    @ResponseBody
    public JsonData getAll3(HttpServletRequest request) {
        PageBean pageBean = new PageBean();
        Map map = new HashMap();
        map.put("title", StringUtils.toLikeStr(request.getParameter("title")));
        pageBean.setRequest(request);
        List<UserInfo> articlesses = this.iUserInfo.selectgetAll3(map, pageBean);
        JsonData jsonData = new JsonData(1, "操作成功", articlesses);
        jsonData.put("pagebean", pageBean);
        return jsonData;
    }
    @RequestMapping("/getall4")
    @ResponseBody
    public JsonData getAll4(HttpServletRequest request) {
        PageBean pageBean = new PageBean();
        Map map = new HashMap();
        map.put("title", StringUtils.toLikeStr(request.getParameter("title")));
        pageBean.setRequest(request);
        List<UserInfo> articlesses = this.iUserInfo.selectgetAll4(map, pageBean);
        JsonData jsonData = new JsonData(1, "操作成功", articlesses);
        jsonData.put("pagebean", pageBean);
        return jsonData;
    }

    @RequestMapping("/edit")
    @ResponseBody
    public JsonData edit(HttpServletRequest request) {
        UserInfo articles = new UserInfo();
        System.out.println(request);
        articles.setInfoName(request.getParameter("info_name"));
        articles.setInfoHao(request.getParameter("info_hao"));
        articles.setInfoYG(request.getParameter("info_yg"));

        articles.setInfoZt(request.getParameter("info_zt"));
        articles.setInfoGz(request.getParameter("info_gz"));
        String id = request.getParameter("info_id");
        articles.setInfoId(Integer.parseInt(id));
        int i = this.iUserInfo.updateByPrimaryKeyWithBLOBs(articles);
        JsonData jsonData = new JsonData(i, i == 0 ? "修改失败" : "修改成功", i);
        return jsonData;
    }
}
