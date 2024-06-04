package com.aaa.mapper;

import com.aaa.entity.Jobtitles;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface JobtitleMapper {
    List<Jobtitles> findjobtitle(Jobtitles jobtitles);
    int deleteJobtitle(Integer jobtitleId);
    int addJobtitle(Jobtitles jobtitles);
    int countJobtitle(Jobtitles jobtitles);
    int checkCount(Integer jobtitleId);

    int editJobtitle(Jobtitles jobtitles);

    int count(Jobtitles jobtitles);
}