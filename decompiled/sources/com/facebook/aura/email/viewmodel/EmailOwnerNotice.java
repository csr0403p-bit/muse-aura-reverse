package com.facebook.aura.email.viewmodel;

import X.Ey9;
import X.F3w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class EmailOwnerNotice {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ EmailOwnerNotice[] $VALUES;
    public static final EmailOwnerNotice REQUEST_COOLDOWN;
    public static final EmailOwnerNotice RESEND_COOLDOWN;

    static {
        EmailOwnerNotice emailOwnerNotice = new EmailOwnerNotice("REQUEST_COOLDOWN", 0);
        REQUEST_COOLDOWN = emailOwnerNotice;
        EmailOwnerNotice emailOwnerNotice2 = new EmailOwnerNotice("RESEND_COOLDOWN", 1);
        RESEND_COOLDOWN = emailOwnerNotice2;
        EmailOwnerNotice[] emailOwnerNoticeArr = {emailOwnerNotice, emailOwnerNotice2};
        $VALUES = emailOwnerNoticeArr;
        $ENTRIES = new F3w(emailOwnerNoticeArr);
    }

    public static Ey9<EmailOwnerNotice> getEntries() {
        return $ENTRIES;
    }

    public static EmailOwnerNotice valueOf(String str) {
        return (EmailOwnerNotice) Enum.valueOf(EmailOwnerNotice.class, str);
    }

    public static EmailOwnerNotice[] values() {
        return (EmailOwnerNotice[]) $VALUES.clone();
    }

    public EmailOwnerNotice(String str, int i) {
    }
}
