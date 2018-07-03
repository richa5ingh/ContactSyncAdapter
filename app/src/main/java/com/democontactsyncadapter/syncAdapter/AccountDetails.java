package com.democontactsyncadapter.syncAdapter;

import android.accounts.Account;

/**
 * Created by richa on 3/7/18.
 */

public class AccountDetails {

    private static final String contentAuthority = "com.android.contacts";

    // Value below must match the account type specified in res/xml/syncadapter.xml
    private static final String accountType = "com.account";

    private static final String accountName = "DemoContactsSyncAdapter";
    private static final Object LOCK = new Object();
    private static Account sInstance;

    public static Account getAccount() {
        if (sInstance == null) {
            synchronized (LOCK) {
                sInstance = new Account(accountName, accountType);
            }
        }
        return sInstance;
    }

    public static String getContentAuthority() {
        return contentAuthority;
    }
}
