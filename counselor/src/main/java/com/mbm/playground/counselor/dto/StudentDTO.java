package com.mbm.playground.counselor.dto;

public class StudentDTO extends UserDTO {

    public StudentDTO(int id) {
	super(id);
	setRole(RoleDTO.ADMIN_ROLE);
    }

}
