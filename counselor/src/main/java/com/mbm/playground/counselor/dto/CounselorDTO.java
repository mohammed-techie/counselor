package com.mbm.playground.counselor.dto;

public class CounselorDTO extends UserDTO {

    public CounselorDTO(int id) {
	super(id);
	setRole(RoleDTO.COUNSELOR_ROLE);
    }
    

}
