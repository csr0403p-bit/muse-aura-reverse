package com.facebook.aura.email.viewmodel;

import X.Ey9;
import X.F3w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class EmailError {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ EmailError[] $VALUES;
    public static final EmailError DELETE;
    public static final EmailError DELETE_RESET;
    public static final EmailError INVALID_ADDRESS;
    public static final EmailError LOAD;
    public static final EmailError NOT_ENABLED;
    public static final EmailError OWNER_DOMAIN_BLOCKED;
    public static final EmailError PERMISSIONS;
    public static final EmailError RATE_LIMITED;
    public static final EmailError RESET_REQUIRED;
    public static final EmailError SAVE;
    public static final EmailError SENDERS;
    public static final EmailError SETUP;
    public static final EmailError TEST;
    public static final EmailError TEST_UNCERTAIN;
    public static final EmailError UNAVAILABLE;

    static {
        EmailError emailError = new EmailError("LOAD", 0);
        LOAD = emailError;
        EmailError emailError2 = new EmailError("SAVE", 1);
        SAVE = emailError2;
        EmailError emailError3 = new EmailError("SETUP", 2);
        SETUP = emailError3;
        EmailError emailError4 = new EmailError("SENDERS", 3);
        SENDERS = emailError4;
        EmailError emailError5 = new EmailError("TEST", 4);
        TEST = emailError5;
        EmailError emailError6 = new EmailError("PERMISSIONS", 5);
        PERMISSIONS = emailError6;
        EmailError emailError7 = new EmailError("DELETE", 6);
        DELETE = emailError7;
        EmailError emailError8 = new EmailError("DELETE_RESET", 7);
        DELETE_RESET = emailError8;
        EmailError emailError9 = new EmailError("RESET_REQUIRED", 8);
        RESET_REQUIRED = emailError9;
        EmailError emailError10 = new EmailError("INVALID_ADDRESS", 9);
        INVALID_ADDRESS = emailError10;
        EmailError emailError11 = new EmailError("OWNER_DOMAIN_BLOCKED", 10);
        OWNER_DOMAIN_BLOCKED = emailError11;
        EmailError emailError12 = new EmailError("RATE_LIMITED", 11);
        RATE_LIMITED = emailError12;
        EmailError emailError13 = new EmailError("UNAVAILABLE", 12);
        UNAVAILABLE = emailError13;
        EmailError emailError14 = new EmailError("NOT_ENABLED", 13);
        NOT_ENABLED = emailError14;
        EmailError emailError15 = new EmailError("TEST_UNCERTAIN", 14);
        TEST_UNCERTAIN = emailError15;
        EmailError[] emailErrorArr = {emailError, emailError2, emailError3, emailError4, emailError5, emailError6, emailError7, emailError8, emailError9, emailError10, emailError11, emailError12, emailError13, emailError14, emailError15};
        $VALUES = emailErrorArr;
        $ENTRIES = new F3w(emailErrorArr);
    }

    public static Ey9<EmailError> getEntries() {
        return $ENTRIES;
    }

    public static EmailError valueOf(String str) {
        return (EmailError) Enum.valueOf(EmailError.class, str);
    }

    public static EmailError[] values() {
        return (EmailError[]) $VALUES.clone();
    }

    public EmailError(String str, int i) {
    }
}
