package com.demo.application.service;

import com.demo.application.dto.account.AccountModel;
import com.demo.application.dto.account.CreateAccountModel;
import com.demo.application.dto.account.UpdateAccountModel;

/**
 * Service interface that defines operations related to account management.
 * <p>
 * Implementations of this interface handle business logic for creating and updating
 * account records, typically interacting with a persistence layer or repository.
 */
public interface AccountService {

    /**
     * Creates a new account based on the provided account creation details.
     *
     * @param createAccountModel the model containing details required to create an account;
     *                           must not be {@code null}
     * @return the created {@link AccountModel} containing persisted account information
     * @throws IllegalArgumentException if the input model is invalid or required fields are missing
     */
    AccountModel createAccount(CreateAccountModel createAccountModel);

    /**
     * Updates an existing account with the provided account update details.
     *
     * @param updateAccountModel the model containing updated account information;
     *                           must not be {@code null}
     * @return the updated {@link AccountModel} reflecting the latest persisted state
     * @throws IllegalArgumentException if the input model is invalid or the account does not exist
     */
    AccountModel updateAccount(UpdateAccountModel updateAccountModel);
}

