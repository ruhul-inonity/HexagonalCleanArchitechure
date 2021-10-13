package com.inonity.justpay.account.application.service;

import com.inonity.justpay.account.application.port.out.AccountLock;
import com.inonity.justpay.account.domain.Account;
import org.springframework.stereotype.Component;

@Component
class NoOpAccountLock implements AccountLock {

	@Override
	public void lockAccount(Account.AccountId accountId) {
		// do nothing
	}

	@Override
	public void releaseAccount(Account.AccountId accountId) {
		// do nothing
	}

}
