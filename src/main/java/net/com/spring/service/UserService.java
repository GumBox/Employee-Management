/*
 * GumBox Inc
 * (c) 2022 GumBox Inc. Viet Nam
 *
 */
package net.com.spring.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import net.com.spring.dto.UserRegistrationDto;
import net.com.spring.model.User;


/**
 *
 * @author falcon
 */

public interface UserService extends UserDetailsService {
	User save(UserRegistrationDto registrationDto);
}
