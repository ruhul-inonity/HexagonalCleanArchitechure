package com.inonity.justpay.account.adapter.in.web;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.inonity.justpay.account.application.port.in.SendMoneyCommand;
import com.inonity.justpay.account.application.port.in.SendMoneyUseCase;
import com.inonity.justpay.account.domain.Account;
import com.inonity.justpay.account.domain.Money;
import com.inonity.justpay.common.WebAdapter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

/**
 * Created by @ruhul on 10/11/21
 */
@WebAdapter
@RestController
@RequiredArgsConstructor
class SendMoneyController {

    private final SendMoneyUseCase sendMoneyUseCase;

    @PostMapping(path = "/accounts/send/{sourceAccountId}/{targetAccountId}/{amount}")
    void sendMoney(
            @PathVariable("sourceAccountId") Long sourceAccountId,
            @PathVariable("targetAccountId") Long targetAccountId,
            @PathVariable("amount") Long amount) {

        SendMoneyCommand command = new SendMoneyCommand(
                new Account.AccountId(sourceAccountId),
                new Account.AccountId(targetAccountId),
                Money.of(amount));

        sendMoneyUseCase.sendMoney(command);
    }

    @GetMapping(path = "/healthcheck")
    boolean healthCheck(){
        return true;
    }

    @GetMapping(path = "/todo", produces = "application/json")
    HashMap<String, String> getTodo(){
        HashMap<String,String> todos = new HashMap();
        todos.put("task","dockerize my app");
        return todos;
    }

}