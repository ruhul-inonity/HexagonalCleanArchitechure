package com.inonity.justpay.account.application.port.out;


import com.inonity.justpay.account.domain.Account;

import java.time.LocalDateTime;

public interface LoadAccountPort {

	Account loadAccount(Account.AccountId accountId, LocalDateTime baselineDate);
}
