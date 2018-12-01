package com.mbm.playground.counselor.dto;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

public class RoleDTO {
    public enum PERMISSION {
	LOGIN, MANAGE_USER, COUNSIL, STUDENT
    };

    private final String roleName;
    private Collection<PERMISSION> permissions;

    public static final RoleDTO DEFAULT_ROLE = new RoleDTO("User").addPermission(PERMISSION.LOGIN);
    public static final RoleDTO ADMIN_ROLE = new RoleDTO("Administrator").addPermission(PERMISSION.LOGIN,
	    PERMISSION.MANAGE_USER);
    public static final RoleDTO COUNSELOR_ROLE = new RoleDTO("Counselor").addPermission(PERMISSION.LOGIN,
	    PERMISSION.COUNSIL);
    public static final RoleDTO STUDENT_ROLE = new RoleDTO("Student").addPermission(PERMISSION.LOGIN,
	    PERMISSION.STUDENT);

    private static final Collection<RoleDTO> ALL_ROLES = Arrays.asList(ADMIN_ROLE, COUNSELOR_ROLE, STUDENT_ROLE);

    public RoleDTO(String roleName) {
	this.roleName = roleName;
    }

    public static Collection<RoleDTO> getAllRoles() {
	return ALL_ROLES;
    }

    private RoleDTO addPermission(PERMISSION... permissions) {
	if (this.permissions == null)
	    this.permissions = new HashSet<>();
	return this;
    }

    public String getRoleName() {
	return roleName;
    }

    public Collection<PERMISSION> getPermissions() {
	return permissions == null ? Collections.emptyList() : Collections.unmodifiableCollection(permissions);
    }

    public boolean hasPermission(PERMISSION permission) {
	return this.permissions == null ? false : this.permissions.contains(permission);
    }
}
