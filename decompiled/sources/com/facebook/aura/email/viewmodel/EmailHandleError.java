package com.facebook.aura.email.viewmodel;

import X.Ey9;
import X.F3w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class EmailHandleError {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ EmailHandleError[] $VALUES;
    public static final EmailHandleError CHARACTERS;
    public static final EmailHandleError HYPHENS;
    public static final EmailHandleError LENGTH;
    public static final EmailHandleError LETTER;

    static {
        EmailHandleError emailHandleError = new EmailHandleError("CHARACTERS", 0);
        CHARACTERS = emailHandleError;
        EmailHandleError emailHandleError2 = new EmailHandleError("LENGTH", 1);
        LENGTH = emailHandleError2;
        EmailHandleError emailHandleError3 = new EmailHandleError("HYPHENS", 2);
        HYPHENS = emailHandleError3;
        EmailHandleError emailHandleError4 = new EmailHandleError("LETTER", 3);
        LETTER = emailHandleError4;
        EmailHandleError[] emailHandleErrorArr = {emailHandleError, emailHandleError2, emailHandleError3, emailHandleError4};
        $VALUES = emailHandleErrorArr;
        $ENTRIES = new F3w(emailHandleErrorArr);
    }

    public static Ey9<EmailHandleError> getEntries() {
        return $ENTRIES;
    }

    public static EmailHandleError valueOf(String str) {
        return (EmailHandleError) Enum.valueOf(EmailHandleError.class, str);
    }

    public static EmailHandleError[] values() {
        return (EmailHandleError[]) $VALUES.clone();
    }

    public EmailHandleError(String str, int i) {
    }
}
