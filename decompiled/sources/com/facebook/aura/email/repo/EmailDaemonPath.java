package com.facebook.aura.email.repo;

import X.Ey9;
import X.F3w;
import com.facebook.aura.network.api.JarvisPath;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class EmailDaemonPath implements JarvisPath.Extension {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ EmailDaemonPath[] $VALUES;
    public static final EmailDaemonPath ADDRESS_AVAILABILITY;
    public static final EmailDaemonPath MAILBOX;
    public static final EmailDaemonPath OWNERS;
    public static final EmailDaemonPath OWNER_CHALLENGES;
    public static final EmailDaemonPath SETTINGS;
    public static final EmailDaemonPath SETUP;
    public static final EmailDaemonPath SETUP_END;
    public static final EmailDaemonPath THREADS;
    public final String value;

    static {
        EmailDaemonPath emailDaemonPath = new EmailDaemonPath("SETUP", 0, "api/email/mailbox/setup");
        SETUP = emailDaemonPath;
        EmailDaemonPath emailDaemonPath2 = new EmailDaemonPath("SETUP_END", 1, "api/email/mailbox/setup/end");
        SETUP_END = emailDaemonPath2;
        EmailDaemonPath emailDaemonPath3 = new EmailDaemonPath("MAILBOX", 2, "api/email/mailbox");
        MAILBOX = emailDaemonPath3;
        EmailDaemonPath emailDaemonPath4 = new EmailDaemonPath("THREADS", 3, "api/email/threads");
        THREADS = emailDaemonPath4;
        EmailDaemonPath emailDaemonPath5 = new EmailDaemonPath("OWNER_CHALLENGES", 4, "api/email/owners/challenges");
        OWNER_CHALLENGES = emailDaemonPath5;
        EmailDaemonPath emailDaemonPath6 = new EmailDaemonPath("OWNERS", 5, "api/email/owners");
        OWNERS = emailDaemonPath6;
        EmailDaemonPath emailDaemonPath7 = new EmailDaemonPath("ADDRESS_AVAILABILITY", 6, "api/email/mailbox/address-availability");
        ADDRESS_AVAILABILITY = emailDaemonPath7;
        EmailDaemonPath emailDaemonPath8 = new EmailDaemonPath("SETTINGS", 7, "api/email/settings");
        SETTINGS = emailDaemonPath8;
        EmailDaemonPath[] emailDaemonPathArr = {emailDaemonPath, emailDaemonPath2, emailDaemonPath3, emailDaemonPath4, emailDaemonPath5, emailDaemonPath6, emailDaemonPath7, emailDaemonPath8};
        $VALUES = emailDaemonPathArr;
        $ENTRIES = new F3w(emailDaemonPathArr);
    }

    public static Ey9<EmailDaemonPath> getEntries() {
        return $ENTRIES;
    }

    public static EmailDaemonPath valueOf(String str) {
        return (EmailDaemonPath) Enum.valueOf(EmailDaemonPath.class, str);
    }

    public static EmailDaemonPath[] values() {
        return (EmailDaemonPath[]) $VALUES.clone();
    }

    @Override // com.facebook.aura.network.api.JarvisPath
    public String getValue() {
        return this.value;
    }

    public EmailDaemonPath(String str, int i, String str2) {
        this.value = str2;
    }
}
