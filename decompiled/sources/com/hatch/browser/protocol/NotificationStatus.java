package com.hatch.browser.protocol;

import X.C06H;
import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class NotificationStatus {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ NotificationStatus[] $VALUES;
    public static final NotificationStatus APPLIED;
    public static final Companion Companion;
    public static final NotificationStatus SUPERSEDED;

    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    static {
        NotificationStatus notificationStatus = new NotificationStatus("APPLIED", 0);
        APPLIED = notificationStatus;
        NotificationStatus notificationStatus2 = new NotificationStatus("SUPERSEDED", 1);
        SUPERSEDED = notificationStatus2;
        NotificationStatus[] notificationStatusArr = {notificationStatus, notificationStatus2};
        $VALUES = notificationStatusArr;
        $ENTRIES = C3cG.A0w(notificationStatusArr);
        Companion = new Companion();
    }

    public static Ey9<NotificationStatus> getEntries() {
        return $ENTRIES;
    }

    public static NotificationStatus valueOf(String str) {
        return (NotificationStatus) Enum.valueOf(NotificationStatus.class, str);
    }

    public static NotificationStatus[] values() {
        return (NotificationStatus[]) $VALUES.clone();
    }

    public NotificationStatus(String str, int i) {
    }
}
