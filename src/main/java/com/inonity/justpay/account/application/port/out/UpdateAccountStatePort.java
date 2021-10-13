package com.inonity.justpay.account.application.port.out;


import com.inonity.justpay.account.domain.Account;

public interface UpdateAccountStatePort {

	void updateActivities(Account account);

}
