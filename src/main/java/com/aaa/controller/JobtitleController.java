package com.aaa.controller;

import com.aaa.entity.*;
import com.aaa.service.JobtitleService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Mapper
@Controller
@RequestMapping("jobtitle")
public class JobtitleController {
    @Autowired
    private JobtitleService jobtitleService;
    /*
     * 查询职称
     * */
    @RequestMapping("jobtitleList")
    @ResponseBody
    public Object jobtitleList(Jobtitles jobtitles, Integer page, Integer limit){
        PageHelper.startPage(page, limit);
        List<Jobtitles> listAll = jobtitleService.findjobtitle(jobtitles);
        PageInfo pageInfo = new PageInfo(listAll);
        Map<String, Object> tableData = new HashMap<String, Object>();
        //这是layui要求返回的json数据格式
        tableData.put("code", 0);
        tableData.put("msg", "");
        //将全部数据的条数作为count传给前台（一共多少条）
        tableData.put("count", pageInfo.getTotal());
        //将分页后的数据返回（每页要显示的数据）
        tableData.put("data", pageInfo.getList());

        return tableData;
    }
    /*
     * 添加职称
     * */
    @RequestMapping("addJobtitle")
    @ResponseBody
    public Object addJobtitle(Jobtitles jobtitles){
        int count = jobtitleService.count(jobtitles);
        if(count==0){
            int i = jobtitleService.addJobtitle(jobtitles);
            if(i==1){
                return "添加成功";
            }else{
                return "添加失败";
            }
        }else{
            return jobtitles.getJobtitles()+"已存在";
        }

    }
    /*
     * 修改职称
     * */
    @RequestMapping("editJobtitle")
    @ResponseBody
    public Object editJobtitle(Jobtitles jobtitles){
        int i = jobtitleService.editJobtitle(jobtitles);
        if(i==1){
            return "修改成功";
        }else{
            return "修改失败";
        }

    }
    /*
     * 删除职称
     * */
    @RequestMapping("deleteJobtitle")
    @ResponseBody
    public Object deleteJobtitle(Integer jobtitleId){
            int i = jobtitleService.deleteJobtitle(jobtitleId);
            if(i==1){
                return "删除成功";
            }else{
                return "删除失败";
            }
    }

}
