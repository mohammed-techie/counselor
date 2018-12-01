package com.mbm.playground.counselor.dto;

import com.mbm.playground.counselor.dto.RoleDTO.PERMISSION;

public class UserDTO {

    private int id;
    private String fullName;
    private String primaryemailAddress;
    private String alternateContactNumber;
    private String primaryContactNumber;
    private String alternameContactNumber;
    private RoleDTO role = RoleDTO.DEFAULT_ROLE;
    
    public UserDTO(int id) {
	this.id = id;
    }

    public boolean hasPermission(PERMISSION permission) {
	return this.role.hasPermission(permission);
    }
    public String getFullName() {
	return fullName;
    }

    public void setFullName(String fullName) {
	this.fullName = fullName;
    }

    public String getPrimaryemailAddress() {
	return primaryemailAddress;
    }

    public void setPrimaryemailAddress(String primaryemailAddress) {
	this.primaryemailAddress = primaryemailAddress;
    }

    public String getAlternateContactNumber() {
	return alternateContactNumber;
    }

    public void setAlternateContactNumber(String alternateContactNumber) {
	this.alternateContactNumber = alternateContactNumber;
    }

    public String getPrimaryContactNumber() {
	return primaryContactNumber;
    }

    public void setPrimaryContactNumber(String primaryContactNumber) {
	this.primaryContactNumber = primaryContactNumber;
    }

    public String getAlternameContactNumber() {
	return alternameContactNumber;
    }

    public void setAlternameContactNumber(String alternameContactNumber) {
	this.alternameContactNumber = alternameContactNumber;
    }

    public void setId(int id) {
	this.id = id;
    }


    public void setRole(RoleDTO role) {
	this.role = role;
    }

    public RoleDTO getRole() {
	return role;
    }

    public int getId() {
	return id;
    }
}
