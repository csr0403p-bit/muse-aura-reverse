package com.hatch.browser.protocol;

import X.C06H;
import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class ReleaseReason {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ ReleaseReason[] $VALUES;
    public static final ReleaseReason AUTHORITY_UNAVAILABLE;
    public static final Companion Companion;
    public static final ReleaseReason EXECUTION_FAILED;
    public static final ReleaseReason HISTORY_FULL;
    public static final ReleaseReason INCOHERENT_DOCUMENT;
    public static final ReleaseReason PROTECTED_WORK_PENDING;
    public static final ReleaseReason RETIRED;
    public static final ReleaseReason SENSITIVE;
    public static final ReleaseReason TIMED_OUT;
    public static final ReleaseReason TOO_LARGE;
    public static final ReleaseReason UNSUPPORTED;

    static {
        ReleaseReason releaseReason = new ReleaseReason("AUTHORITY_UNAVAILABLE", 0);
        AUTHORITY_UNAVAILABLE = releaseReason;
        ReleaseReason releaseReason2 = new ReleaseReason("PROTECTED_WORK_PENDING", 1);
        PROTECTED_WORK_PENDING = releaseReason2;
        ReleaseReason releaseReason3 = new ReleaseReason("SENSITIVE", 2);
        SENSITIVE = releaseReason3;
        ReleaseReason releaseReason4 = new ReleaseReason("RETIRED", 3);
        RETIRED = releaseReason4;
        ReleaseReason releaseReason5 = new ReleaseReason("TOO_LARGE", 4);
        TOO_LARGE = releaseReason5;
        ReleaseReason releaseReason6 = new ReleaseReason("UNSUPPORTED", 5);
        UNSUPPORTED = releaseReason6;
        ReleaseReason releaseReason7 = new ReleaseReason("EXECUTION_FAILED", 6);
        EXECUTION_FAILED = releaseReason7;
        ReleaseReason releaseReason8 = new ReleaseReason("TIMED_OUT", 7);
        TIMED_OUT = releaseReason8;
        ReleaseReason releaseReason9 = new ReleaseReason("INCOHERENT_DOCUMENT", 8);
        INCOHERENT_DOCUMENT = releaseReason9;
        ReleaseReason releaseReason10 = new ReleaseReason("HISTORY_FULL", 9);
        HISTORY_FULL = releaseReason10;
        ReleaseReason[] releaseReasonArr = {releaseReason, releaseReason2, releaseReason3, releaseReason4, releaseReason5, releaseReason6, releaseReason7, releaseReason8, releaseReason9, releaseReason10};
        $VALUES = releaseReasonArr;
        $ENTRIES = C3cG.A0w(releaseReasonArr);
        Companion = new Companion();
    }

    public static Ey9<ReleaseReason> getEntries() {
        return $ENTRIES;
    }

    public static ReleaseReason valueOf(String str) {
        return (ReleaseReason) Enum.valueOf(ReleaseReason.class, str);
    }

    public static ReleaseReason[] values() {
        return (ReleaseReason[]) $VALUES.clone();
    }

    public final class Companion {
        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public ReleaseReason(String str, int i) {
    }
}
