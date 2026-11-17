package com.facebook.aura.email.repo;

import X.Ey9;
import X.F3w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class EmailEndpoint {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ EmailEndpoint[] $VALUES;
    public static final EmailEndpoint ACCOUNT_EMAILS;
    public static final EmailEndpoint VERIFY;
    public final String path;

    static {
        EmailEndpoint emailEndpoint = new EmailEndpoint("ACCOUNT_EMAILS", 0, "/hatch/account-email/");
        ACCOUNT_EMAILS = emailEndpoint;
        EmailEndpoint emailEndpoint2 = new EmailEndpoint("VERIFY", 1, "/hatch/email/addresses/owners/challenges");
        VERIFY = emailEndpoint2;
        EmailEndpoint[] emailEndpointArr = {emailEndpoint, emailEndpoint2};
        $VALUES = emailEndpointArr;
        $ENTRIES = new F3w(emailEndpointArr);
    }

    public static Ey9<EmailEndpoint> getEntries() {
        return $ENTRIES;
    }

    public static EmailEndpoint valueOf(String str) {
        return (EmailEndpoint) Enum.valueOf(EmailEndpoint.class, str);
    }

    public static EmailEndpoint[] values() {
        return (EmailEndpoint[]) $VALUES.clone();
    }

    public final String getPath() {
        return this.path;
    }

    public EmailEndpoint(String str, int i, String str2) {
        this.path = str2;
    }
}
