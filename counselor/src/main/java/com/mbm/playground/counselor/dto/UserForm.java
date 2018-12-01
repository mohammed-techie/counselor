package com.mbm.playground.counselor.dto;

import static com.mbm.playground.counselor.util.CommonUtils.getStringOrNull;

public class UserForm extends UserDTO {

    public UserForm() {
	super(-1);
    }

    public void setFullName(String fullName) {
	super.setFullName(getStringOrNull(fullName));
    }

    public void setPrimaryemailAddress(String primaryemailAddress) {
	super.setPrimaryemailAddress(getStringOrNull(primaryemailAddress));
    }

    public void setAlternateContactNumber(String alternateContactNumber) {
	super.setAlternateContactNumber(getStringOrNull(alternateContactNumber));
    }

    public void setPrimaryContactNumber(String primaryContactNumber) {
	super.setPrimaryContactNumber(getStringOrNull(primaryContactNumber));
    }
     public void setAlternameContactNumber(String alternameContactNumber) {
	super.setAlternameContactNumber(getStringOrNull( alternameContactNumber));
    }

}