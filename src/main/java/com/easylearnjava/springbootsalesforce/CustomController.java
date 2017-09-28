package com.easylearnjava.springbootsalesforce;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.easylearnjava.springbootsalesforce.model.Account;
import com.easylearnjava.springbootsalesforce.model.Contact;
import com.easylearnjava.springbootsalesforce.service.AccountService;
import com.easylearnjava.springbootsalesforce.service.ContactService;

@RestController
public class CustomController {

	@Autowired
	@Lazy
    private AccountService accountService;

	@Autowired @Lazy
    private ContactService contactService;
	
    @RequestMapping(value="/accounts", method = RequestMethod.GET)
    public List<Account> accounts(OAuth2Authentication principal) {
        return accountService.accounts(principal);
    }
    

    @RequestMapping(value="/contacts", method = RequestMethod.GET)
    public List<Contact> contacts(OAuth2Authentication principal) {
        return contactService.contacts(principal);
    }
}
