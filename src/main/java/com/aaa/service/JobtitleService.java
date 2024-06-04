package com.aaa.service;

import com.aaa.entity.*;

import java.util.List;

public interface JobtitleService {
    /*
     * 医生的增删改查
     * */
    List<Jobtitles> findjobtitle(Jobtitles jobtitles);
    int deleteJobtitle(Integer  jobtitleId);
    int addJobtitle(Jobtitles jobtitles);
    int editJobtitle(Jobtitles jobtitles);
    int count(Jobtitles jobtitles);
    /*
     * 判断该职称是否还有医生
     * */
    int checkCount(Integer jobtitleId);
}
