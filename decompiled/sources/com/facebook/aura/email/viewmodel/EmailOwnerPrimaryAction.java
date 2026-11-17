package com.facebook.aura.email.viewmodel;

import X.Ey9;
import X.F3w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class EmailOwnerPrimaryAction {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ EmailOwnerPrimaryAction[] $VALUES;
    public static final EmailOwnerPrimaryAction CONFIRM_ADDRESS;
    public static final EmailOwnerPrimaryAction RESEND_CODE;
    public static final EmailOwnerPrimaryAction VERIFY_CODE;

    static {
        EmailOwnerPrimaryAction emailOwnerPrimaryAction = new EmailOwnerPrimaryAction("CONFIRM_ADDRESS", 0);
        CONFIRM_ADDRESS = emailOwnerPrimaryAction;
        EmailOwnerPrimaryAction emailOwnerPrimaryAction2 = new EmailOwnerPrimaryAction("RESEND_CODE", 1);
        RESEND_CODE = emailOwnerPrimaryAction2;
        EmailOwnerPrimaryAction emailOwnerPrimaryAction3 = new EmailOwnerPrimaryAction("VERIFY_CODE", 2);
        VERIFY_CODE = emailOwnerPrimaryAction3;
        EmailOwnerPrimaryAction[] emailOwnerPrimaryActionArr = {emailOwnerPrimaryAction, emailOwnerPrimaryAction2, emailOwnerPrimaryAction3};
        $VALUES = emailOwnerPrimaryActionArr;
        $ENTRIES = new F3w(emailOwnerPrimaryActionArr);
    }

    public static Ey9<EmailOwnerPrimaryAction> getEntries() {
        return $ENTRIES;
    }

    public static EmailOwnerPrimaryAction valueOf(String str) {
        return (EmailOwnerPrimaryAction) Enum.valueOf(EmailOwnerPrimaryAction.class, str);
    }

    public static EmailOwnerPrimaryAction[] values() {
        return (EmailOwnerPrimaryAction[]) $VALUES.clone();
    }

    public EmailOwnerPrimaryAction(String str, int i) {
    }
}
