package com.facebook.aura.email.viewmodel;

import X.Ey9;
import X.F3w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class EmailSenderNameError {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ EmailSenderNameError[] $VALUES;
    public static final EmailSenderNameError CHARACTERS;
    public static final EmailSenderNameError LENGTH;
    public static final EmailSenderNameError REJECTED;

    static {
        EmailSenderNameError emailSenderNameError = new EmailSenderNameError("CHARACTERS", 0);
        CHARACTERS = emailSenderNameError;
        EmailSenderNameError emailSenderNameError2 = new EmailSenderNameError("LENGTH", 1);
        LENGTH = emailSenderNameError2;
        EmailSenderNameError emailSenderNameError3 = new EmailSenderNameError("REJECTED", 2);
        REJECTED = emailSenderNameError3;
        EmailSenderNameError[] emailSenderNameErrorArr = {emailSenderNameError, emailSenderNameError2, emailSenderNameError3};
        $VALUES = emailSenderNameErrorArr;
        $ENTRIES = new F3w(emailSenderNameErrorArr);
    }

    public static Ey9<EmailSenderNameError> getEntries() {
        return $ENTRIES;
    }

    public static EmailSenderNameError valueOf(String str) {
        return (EmailSenderNameError) Enum.valueOf(EmailSenderNameError.class, str);
    }

    public static EmailSenderNameError[] values() {
        return (EmailSenderNameError[]) $VALUES.clone();
    }

    public EmailSenderNameError(String str, int i) {
    }
}
