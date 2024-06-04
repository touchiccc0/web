package com.aaa.service.Impl;

import com.aaa.entity.Jobtitles;
import com.aaa.mapper.JobtitleMapper;
import com.aaa.service.JobtitleService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
@Service
@Transactional
public class JobtitleServiceImpl implements JobtitleService {
    @Resource
    private JobtitleMapper jobtitleMapper;
    @Override
    public List<Jobtitles> findjobtitle(Jobtitles jobtitles){
        return jobtitleMapper.findjobtitle(jobtitles);
    }
    @Override
    public int deleteJobtitle(Integer jobtitleId) {
        return jobtitleMapper.deleteJobtitle(jobtitleId);
    }
    @Override
    public int addJobtitle(Jobtitles jobtitles){
        return jobtitleMapper.addJobtitle(jobtitles);
    }
    @Override
    public int editJobtitle(Jobtitles jobtitles){
        return jobtitleMapper.editJobtitle(jobtitles);
    }
    @Override
    public int count(Jobtitles jobtitles){
        return jobtitleMapper.count(jobtitles);
    }
    @Override
    public int checkCount(Integer jobtitleId){
        return jobtitleMapper.checkCount(jobtitleId);
    }

}
