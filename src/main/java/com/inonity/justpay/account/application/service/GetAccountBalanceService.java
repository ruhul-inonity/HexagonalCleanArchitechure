package com.inonity.justpay.account.application.service;

import com.inonity.justpay.account.application.port.in.GetAccountBalanceQuery;
import com.inonity.justpay.account.application.port.out.LoadAccountPort;
import com.inonity.justpay.account.domain.Account;
import com.inonity.justpay.account.domain.Money;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;

@RequiredArgsConstructor
class GetAccountBalanceService implements GetAccountBalanceQuery {

	private final LoadAccountPort loadAccountPort;

	@Override
	public Money getAccountBalance(Account.AccountId accountId) {
		return loadAccountPort.loadAccount(accountId, LocalDateTime.now())
				.calculateBalance();
	}
}
