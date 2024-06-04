package com.aaa.entity;


public class Doctor {
    private Integer doctorId;
    private String doctorName;
    private Integer departmentId;
    private String department;
    private Integer registeredId;
    private String type;
    private Integer dstate;
    private Integer jobtitleId;
    private String jobtitles;


    public Integer getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(Integer doctorId) {
        this.doctorId = doctorId;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Integer getRegisteredId() {
        return registeredId;
    }

    public void setRegisteredId(Integer registeredId) {
        this.registeredId = registeredId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    private Integer getJobtitleId() {
        return jobtitleId;
    }

    private void setJobtitleId(Integer jobtitleId) {
        this.jobtitleId = jobtitleId;
    }
    public String getJobtitles() {
        return jobtitles;
    }

    public void setJobtitles(String jobtitles) {
        this.jobtitles = jobtitles;
    }

    public Integer getDstate() {
        return dstate;
    }

    public void setDstate(Integer dstate) {
        this.dstate = dstate;
    }
}
