package com.group.pbox.pvbs.acct;

import com.group.pbox.pvbs.model.acct.Account;

public interface IAcctCreationService
{
    int addAcct(Account acctRequest);
    Integer fetchAcct();
}
