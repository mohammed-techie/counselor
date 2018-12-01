package com.mbm.playground.counselor.dto;

import java.time.YearMonth;

public class WorkExperienceDTO {
    private final String organizationName;
    private final String designation;
    private YearMonth workedFrom, workedTo;
    private String title;

    public WorkExperienceDTO(String organizationName, String designation) {
	this.organizationName = organizationName;
	this.designation = designation;
    }

    public String getOrganizationName() {
	return organizationName;
    }

    public YearMonth getWorkedFrom() {
	return workedFrom;
    }

    public void setWorkedFrom(YearMonth workedFrom) {
	this.workedFrom = workedFrom;
    }

    public YearMonth getWorkedTo() {
	return workedTo;
    }

    public void setWorkedTo(YearMonth workedTo) {
	this.workedTo = workedTo;
    }

    public String getDesignation() {
	return designation;
    }

    public String getTitle() {
	return title;
    }

    public void setTitle(String title) {
	this.title = title;
    }
}
