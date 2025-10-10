package com.demo.application.service;

import com.demo.application.dto.account.AccountModel;
import com.demo.application.dto.account.CreateAccountModel;
import com.demo.application.dto.account.UpdateAccountModel;

public interface AccountService {

    AccountModel createAccount(CreateAccountModel createAccountModel);

    AccountModel updateAccount(UpdateAccountModel updateAccountModel);
}
