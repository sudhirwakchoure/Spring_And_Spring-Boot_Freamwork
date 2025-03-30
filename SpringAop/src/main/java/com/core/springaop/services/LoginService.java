package com.core.springaop.services;


import com.core.springaop.repository.LoginRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

   @Autowired
   private LoginRepo loginRepo;

  public boolean doLogin() {
      loginRepo.getUser();
      return false;
  }
}
