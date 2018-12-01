package com.mbm.playground.counselor.dto;

import java.time.YearMonth;

public class EducationInformationDTO {

    private final String institutionName;
    private final String nameOfQualification;
    private YearMonth studiedFrom, studiedTo;
    private String grade;
    private double percentage;

    public EducationInformationDTO(String institutionName, String nameOfQualification) {
	this.institutionName = institutionName;
	this.nameOfQualification = nameOfQualification;
    }

    public YearMonth getStudiedFrom() {
	return studiedFrom;
    }

    public void setStudiedFrom(YearMonth studiedFrom) {
	this.studiedFrom = studiedFrom;
    }

    public YearMonth getStudiedTo() {
	return studiedTo;
    }

    public void setStudiedTo(YearMonth studiedTo) {
	this.studiedTo = studiedTo;
    }

    public String getGrade() {
	return grade;
    }

    public void setGrade(String grade) {
	this.grade = grade;
    }

    public double getPercentage() {
	return percentage;
    }

    public void setPercentage(double percentage) {
	this.percentage = percentage;
    }

    public String getInstitutionName() {
	return institutionName;
    }

    public String getNameOfQualification() {
	return nameOfQualification;
    }

}
