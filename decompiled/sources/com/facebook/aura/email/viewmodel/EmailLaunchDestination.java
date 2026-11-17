package com.facebook.aura.email.viewmodel;

import X.Ey9;
import X.F3w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class EmailLaunchDestination {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ EmailLaunchDestination[] $VALUES;
    public static final EmailLaunchDestination INTRO;
    public static final EmailLaunchDestination SENDERS;
    public static final EmailLaunchDestination SETTINGS;

    static {
        EmailLaunchDestination emailLaunchDestination = new EmailLaunchDestination("INTRO", 0);
        INTRO = emailLaunchDestination;
        EmailLaunchDestination emailLaunchDestination2 = new EmailLaunchDestination("SETTINGS", 1);
        SETTINGS = emailLaunchDestination2;
        EmailLaunchDestination emailLaunchDestination3 = new EmailLaunchDestination("SENDERS", 2);
        SENDERS = emailLaunchDestination3;
        EmailLaunchDestination[] emailLaunchDestinationArr = {emailLaunchDestination, emailLaunchDestination2, emailLaunchDestination3};
        $VALUES = emailLaunchDestinationArr;
        $ENTRIES = new F3w(emailLaunchDestinationArr);
    }

    public static Ey9<EmailLaunchDestination> getEntries() {
        return $ENTRIES;
    }

    public static EmailLaunchDestination valueOf(String str) {
        return (EmailLaunchDestination) Enum.valueOf(EmailLaunchDestination.class, str);
    }

    public static EmailLaunchDestination[] values() {
        return (EmailLaunchDestination[]) $VALUES.clone();
    }

    public EmailLaunchDestination(String str, int i) {
    }
}
