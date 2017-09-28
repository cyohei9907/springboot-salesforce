package com.easylearnjava.springbootsalesforce;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.easylearnjava.springbootsalesforce.model.Account;
import com.easylearnjava.springbootsalesforce.service.AccountService;

@RestController
public class CustomController {

	@Autowired
    private AccountService accountService;

    @RequestMapping("/accounts")
    public List<Account> accounts(OAuth2Authentication principal) {
        return accountService.accounts(principal);
    }

	
}
