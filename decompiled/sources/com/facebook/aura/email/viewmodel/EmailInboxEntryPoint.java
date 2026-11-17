package com.facebook.aura.email.viewmodel;

import X.Ey9;
import X.F3w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class EmailInboxEntryPoint {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ EmailInboxEntryPoint[] $VALUES;
    public static final EmailInboxEntryPoint DEEP_LINK;
    public static final EmailInboxEntryPoint LAST_TAB;
    public static final EmailInboxEntryPoint TAB_TAP;
    public final String value;

    static {
        EmailInboxEntryPoint emailInboxEntryPoint = new EmailInboxEntryPoint("TAB_TAP", 0, "tab_tap");
        TAB_TAP = emailInboxEntryPoint;
        EmailInboxEntryPoint emailInboxEntryPoint2 = new EmailInboxEntryPoint("DEEP_LINK", 1, "deep_link");
        DEEP_LINK = emailInboxEntryPoint2;
        EmailInboxEntryPoint emailInboxEntryPoint3 = new EmailInboxEntryPoint("LAST_TAB", 2, "last_tab");
        LAST_TAB = emailInboxEntryPoint3;
        EmailInboxEntryPoint[] emailInboxEntryPointArr = {emailInboxEntryPoint, emailInboxEntryPoint2, emailInboxEntryPoint3};
        $VALUES = emailInboxEntryPointArr;
        $ENTRIES = new F3w(emailInboxEntryPointArr);
    }

    public static Ey9<EmailInboxEntryPoint> getEntries() {
        return $ENTRIES;
    }

    public static EmailInboxEntryPoint valueOf(String str) {
        return (EmailInboxEntryPoint) Enum.valueOf(EmailInboxEntryPoint.class, str);
    }

    public static EmailInboxEntryPoint[] values() {
        return (EmailInboxEntryPoint[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }

    public EmailInboxEntryPoint(String str, int i, String str2) {
        this.value = str2;
    }
}
