package com.mbm.playground.counselor.dao;

import javax.security.auth.login.AccountNotFoundException;
import javax.security.auth.login.CredentialException;
import javax.security.auth.login.LoginException;

public interface ILoginDAO {

    /**
     * 
     * @param userName
     * @param password
     * @return User ID
     * @throws LoginException
     */
    public String login(String userName, String password) throws LoginException;

    /**
     * Change the password for given User.
     * 
     * @param userName
     * @param oldPassword
     * @param newPassword
     * @return user ID
     */
    public String changePassword(String userName, String oldPassword, String newPassword) throws CredentialException;

    /**
     * Sets the given password for this account. This should be only possible for
     * Administrator to do so
     * 
     * @param userName
     * @param newPassword
     * @return
     */
    public String setPassword(String userName, String newPassword) throws AccountNotFoundException;
}
