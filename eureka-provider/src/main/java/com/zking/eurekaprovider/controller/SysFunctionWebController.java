package com.zking.eurekaprovider.controller;
import com.zking.eurekaprovider.model.SysFunctionWeb;
import com.zking.eurekaprovider.service.ISysFunctionWeb;
import com.zking.eurekaprovider.util.JsonData;
import com.zking.eurekaprovider.util.PageBean;
import com.zking.eurekaprovider.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping(produces = "application/json", path = "/syw")
public class SysFunctionWebController {
    @Autowired
    private ISysFunctionWeb iSysFunctionWeb;

    private static SimpleDateFormat sdf = new SimpleDateFormat("yyy-MM-dd");

    @RequestMapping("/getall")
    @ResponseBody
    public JsonData getAll(HttpServletRequest request) {
        PageBean pageBean = new PageBean();
        Map map = new HashMap();
        map.put("title", StringUtils.toLikeStr(request.getParameter("title")));
        pageBean.setRequest(request);
        List<SysFunctionWeb> articlesses = this.iSysFunctionWeb.selectgetAll(map, pageBean);
        JsonData jsonData = new JsonData(1, "操作成功", articlesses);
        jsonData.put("pagebean", pageBean);
        return jsonData;
    }

    /**
     * 新增操作方法
     *
     * @param request
     * @return
     */
    @RequestMapping("/add")
    @ResponseBody
    public JsonData add(HttpServletRequest request) {

        SysFunctionWeb articles = new SysFunctionWeb();

        articles.setFunctionName(request.getParameter("function_name"));
        articles.setPath(request.getParameter("path"));
        articles.setParameter(request.getParameter("parameter"));
        articles.setMethod(request.getParameter("method"));
        articles.setFunctionDesc(request.getParameter("function_desc"));
        String up_time = request.getParameter("up_time");
        try {
            Date date = sdf.parse(up_time);
            articles.setUpTime(date);
        } catch (ParseException e) {
            System.out.println("转时间异常");
        }
        int insert = this.iSysFunctionWeb.insert(articles);
//        存放入jsonData字符串
        JsonData jsonData = new JsonData(insert, insert == 0 ? "新增失败" : "新增成功", insert);
        return jsonData;
    }


    /**
     * 修改操作发方法
     * @param request
     * @return
     */
    @RequestMapping("/edit")
    @ResponseBody
    public JsonData edit(HttpServletRequest request){
        SysFunctionWeb articles = new SysFunctionWeb();
        articles.setFunctionName(request.getParameter("function_name"));
        articles.setPath(request.getParameter("path"));
        articles.setParameter(request.getParameter("parameter"));
        articles.setMethod(request.getParameter("method"));
        articles.setFunctionDesc(request.getParameter("function_desc"));
        String up_time = request.getParameter("up_time");

        String  id = request.getParameter("function_id");
        articles.setFunctionId(Long.parseLong(id));
        int i = this.iSysFunctionWeb.updateByPrimaryKeyWithBLOBs(articles);
        JsonData jsonData = new JsonData(i, i == 0 ? "修改失败" : "修改成功", i);
        return jsonData;
    }

    /**
     * 删除操作方法
     * @param request
     * @return
     */
    @RequestMapping("/del")
    @ResponseBody
    public  JsonData del(HttpServletRequest request){
        int  id = Integer.parseInt(request.getParameter("id"));
        int i = this.iSysFunctionWeb.deleteByPrimaryKey(id);
        JsonData jsonData = new JsonData(i, i == 0 ? "删除失败" : "删除成功", i);
        return jsonData;
    }

}
