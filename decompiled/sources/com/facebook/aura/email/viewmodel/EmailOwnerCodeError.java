package com.facebook.aura.email.viewmodel;

import X.Ey9;
import X.F3w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class EmailOwnerCodeError {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ EmailOwnerCodeError[] $VALUES;
    public static final EmailOwnerCodeError EXPIRED;
    public static final EmailOwnerCodeError INCORRECT;
    public static final EmailOwnerCodeError INVALID;

    static {
        EmailOwnerCodeError emailOwnerCodeError = new EmailOwnerCodeError("INCORRECT", 0);
        INCORRECT = emailOwnerCodeError;
        EmailOwnerCodeError emailOwnerCodeError2 = new EmailOwnerCodeError("EXPIRED", 1);
        EXPIRED = emailOwnerCodeError2;
        EmailOwnerCodeError emailOwnerCodeError3 = new EmailOwnerCodeError("INVALID", 2);
        INVALID = emailOwnerCodeError3;
        EmailOwnerCodeError[] emailOwnerCodeErrorArr = {emailOwnerCodeError, emailOwnerCodeError2, emailOwnerCodeError3};
        $VALUES = emailOwnerCodeErrorArr;
        $ENTRIES = new F3w(emailOwnerCodeErrorArr);
    }

    public static Ey9<EmailOwnerCodeError> getEntries() {
        return $ENTRIES;
    }

    public static EmailOwnerCodeError valueOf(String str) {
        return (EmailOwnerCodeError) Enum.valueOf(EmailOwnerCodeError.class, str);
    }

    public static EmailOwnerCodeError[] values() {
        return (EmailOwnerCodeError[]) $VALUES.clone();
    }

    public EmailOwnerCodeError(String str, int i) {
    }
}
