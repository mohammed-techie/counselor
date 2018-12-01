package com.mbm.playground.counselor.dao;

import com.mbm.playground.counselor.dto.UserDTO;
import com.mbm.playground.counselor.dto.UserForm;

public interface IUserDAO {

    public UserDTO getUserDetails(String id) ;
    public UserDTO createUser(UserForm userForm) ;
    public UserDTO modifyUser(UserDTO userDTO);
}
