package com.inonity.justpay.account.application.port.out;


import com.inonity.justpay.account.domain.Account;

public interface AccountLock {

	void lockAccount(Account.AccountId accountId);

	void releaseAccount(Account.AccountId accountId);

}
