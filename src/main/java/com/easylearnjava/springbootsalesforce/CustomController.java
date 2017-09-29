package com.easylearnjava.springbootsalesforce;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
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
    
    @RequestMapping(value="/saveaccount", method = RequestMethod.GET)
    @ResponseBody
    public void saveAccount(OAuth2Authentication principal, @RequestParam(value="Name") String accName, @RequestParam(value="Industry") String accIndustry, @RequestParam(value="BillingAddress") String accbillingAddress) {
    	System.out.println("Method call to save accounts object");
    }
    

    @RequestMapping(value="/contacts", method = RequestMethod.GET)
    public List<Contact> contacts(OAuth2Authentication principal) {
        return contactService.contacts(principal);
    }
}
