package com.hatch.browser.protocol;

import X.C06H;
import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class FailureCode {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ FailureCode[] $VALUES;
    public static final FailureCode CREDENTIAL_REFUSED;
    public static final Companion Companion;
    public static final FailureCode DETACHED;
    public static final FailureCode INTERNAL;
    public static final FailureCode NAVIGATION_BLOCKED;
    public static final FailureCode NOT_ACTIONABLE;
    public static final FailureCode PAGE_GONE;
    public static final FailureCode RESULT_TOO_LARGE;
    public static final FailureCode SENSITIVE_OUTPUT_BLOCKED;
    public static final FailureCode STALE_PAGE_REFERENCE;
    public static final FailureCode STALE_REF;
    public static final FailureCode STOPPED;
    public static final FailureCode TIMEOUT;
    public static final FailureCode UNAUTHORIZED;
    public static final FailureCode UNAVAILABLE;
    public static final FailureCode UNSUPPORTED;

    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    static {
        FailureCode failureCode = new FailureCode("UNAUTHORIZED", 0);
        UNAUTHORIZED = failureCode;
        FailureCode failureCode2 = new FailureCode("STOPPED", 1);
        STOPPED = failureCode2;
        FailureCode failureCode3 = new FailureCode("PAGE_GONE", 2);
        PAGE_GONE = failureCode3;
        FailureCode failureCode4 = new FailureCode("STALE_PAGE_REFERENCE", 3);
        STALE_PAGE_REFERENCE = failureCode4;
        FailureCode failureCode5 = new FailureCode("DETACHED", 4);
        DETACHED = failureCode5;
        FailureCode failureCode6 = new FailureCode("UNAVAILABLE", 5);
        UNAVAILABLE = failureCode6;
        FailureCode failureCode7 = new FailureCode("TIMEOUT", 6);
        TIMEOUT = failureCode7;
        FailureCode failureCode8 = new FailureCode("STALE_REF", 7);
        STALE_REF = failureCode8;
        FailureCode failureCode9 = new FailureCode("NOT_ACTIONABLE", 8);
        NOT_ACTIONABLE = failureCode9;
        FailureCode failureCode10 = new FailureCode("NAVIGATION_BLOCKED", 9);
        NAVIGATION_BLOCKED = failureCode10;
        FailureCode failureCode11 = new FailureCode("CREDENTIAL_REFUSED", 10);
        CREDENTIAL_REFUSED = failureCode11;
        FailureCode failureCode12 = new FailureCode("SENSITIVE_OUTPUT_BLOCKED", 11);
        SENSITIVE_OUTPUT_BLOCKED = failureCode12;
        FailureCode failureCode13 = new FailureCode("RESULT_TOO_LARGE", 12);
        RESULT_TOO_LARGE = failureCode13;
        FailureCode failureCode14 = new FailureCode("UNSUPPORTED", 13);
        UNSUPPORTED = failureCode14;
        FailureCode failureCode15 = new FailureCode("INTERNAL", 14);
        INTERNAL = failureCode15;
        FailureCode[] failureCodeArr = {failureCode, failureCode2, failureCode3, failureCode4, failureCode5, failureCode6, failureCode7, failureCode8, failureCode9, failureCode10, failureCode11, failureCode12, failureCode13, failureCode14, failureCode15};
        $VALUES = failureCodeArr;
        $ENTRIES = C3cG.A0w(failureCodeArr);
        Companion = new Companion();
    }

    public static Ey9<FailureCode> getEntries() {
        return $ENTRIES;
    }

    public static FailureCode valueOf(String str) {
        return (FailureCode) Enum.valueOf(FailureCode.class, str);
    }

    public static FailureCode[] values() {
        return (FailureCode[]) $VALUES.clone();
    }

    public FailureCode(String str, int i) {
    }
}
