package com.haigou.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.sql.Date;

public class ScheduleJob {
	/** ����id */
    private Long              id;

    /** �������� */
    private String            job_name;

    /** ������� */
    private String            alias_name;

    /** ������� */
    private String            job_group;

    /** ����״̬ */
    private String            status;

    /** ��������ʱ����ʽ */
    private String            cron_expression;

    /** �������� */
    private String            description;

    /** ����ʱ�� */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date              create_time;

    /** �޸�ʱ�� */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date              update_time;
    
    private String				job_class;



	public String getJob_class() {
		return job_class;
	}



	public void setJob_class(String job_class) {
		this.job_class = job_class;
	}



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getJob_name() {
		return job_name;
	}



	public void setJob_name(String job_name) {
		this.job_name = job_name;
	}



	public String getAlias_name() {
		return alias_name;
	}



	public void setAlias_name(String alias_name) {
		this.alias_name = alias_name;
	}



	public String getJob_group() {
		return job_group;
	}



	public void setJob_group(String job_group) {
		this.job_group = job_group;
	}


	public String getStatus() {
		return status;
	}



	public void setStatus(String status) {
		this.status = status;
	}



	public String getCron_expression() {
		return cron_expression;
	}



	public void setCron_expression(String cron_expression) {
		this.cron_expression = cron_expression;
	}


	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}



	public Date getCreate_time() {
		return create_time;
	}



	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}



	public Date getUpdate_time() {
		return update_time;
	}



	public void setUpdate_time(Date update_time) {
		this.update_time = update_time;
	}

}
