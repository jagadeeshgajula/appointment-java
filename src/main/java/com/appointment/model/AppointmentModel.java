package com.appointment.model;

import java.sql.Time;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="bookedappointments")
public class AppointmentModel {
	@Id
	@Column(name="aid")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer aId;
	
	@Column(name="userid")
	private Integer userId;
	
	@Column(name="timezone")
	private String timezone;
	
	@Column(name="appointmenttype")
	private String appointmentType;
	
	@Column(name="startdate")
	private LocalDate startDate;
	
	@Column(name="starttime")
	private String startTime;
	
	@Column(name="endtime")
	private String endTime;
	
	@Column(name="title")
	private String title;
	
	@Column(name="location")
	private String location;
	
	@Column(name="comments")
	private String comments;

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	
	public Integer getaId() {
		return aId;
	}

	public void setaId(Integer aId) {
		this.aId = aId;
	}

	public AppointmentModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getTimezone() {
		return timezone;
	}

	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}

	public String getAppointmentType() {
		return appointmentType;
	}

	public void setAppointmentType(String appointmentType) {
		this.appointmentType = appointmentType;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}
	
	@Override
	public String toString() {
		return "AppointmentModel [aId=" + aId + ", timezone=" + timezone + ", appointmentType=" + appointmentType
				+ ", startDate=" + startDate + ", startTime=" + startTime + ", endTime=" + endTime + ", title=" + title
				+ ", location=" + location + ", comments=" + comments + "]";
	}
	
	
}
