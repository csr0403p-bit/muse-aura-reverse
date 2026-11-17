package com.hatch.browser.protocol;

import X.C06H;
import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class SubmitState {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ SubmitState[] $VALUES;
    public static final SubmitState ACKNOWLEDGED;
    public static final Companion Companion;
    public static final SubmitState NOT_REQUESTED;
    public static final SubmitState NOT_SENT;
    public static final SubmitState SUPPRESSED_BY_MISMATCH;
    public static final SubmitState UNKNOWN;

    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    static {
        SubmitState submitState = new SubmitState("NOT_REQUESTED", 0);
        NOT_REQUESTED = submitState;
        SubmitState submitState2 = new SubmitState("NOT_SENT", 1);
        NOT_SENT = submitState2;
        SubmitState submitState3 = new SubmitState("SUPPRESSED_BY_MISMATCH", 2);
        SUPPRESSED_BY_MISMATCH = submitState3;
        SubmitState submitState4 = new SubmitState("ACKNOWLEDGED", 3);
        ACKNOWLEDGED = submitState4;
        SubmitState submitState5 = new SubmitState("UNKNOWN", 4);
        UNKNOWN = submitState5;
        SubmitState[] submitStateArr = {submitState, submitState2, submitState3, submitState4, submitState5};
        $VALUES = submitStateArr;
        $ENTRIES = C3cG.A0w(submitStateArr);
        Companion = new Companion();
    }

    public static Ey9<SubmitState> getEntries() {
        return $ENTRIES;
    }

    public static SubmitState valueOf(String str) {
        return (SubmitState) Enum.valueOf(SubmitState.class, str);
    }

    public static SubmitState[] values() {
        return (SubmitState[]) $VALUES.clone();
    }

    public SubmitState(String str, int i) {
    }
}
