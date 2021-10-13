package com.inonity.justpay.account.application.port.in;

import com.inonity.justpay.account.domain.Account;
import com.inonity.justpay.account.domain.Money;

public interface GetAccountBalanceQuery {

	Money getAccountBalance(Account.AccountId accountId);

}
