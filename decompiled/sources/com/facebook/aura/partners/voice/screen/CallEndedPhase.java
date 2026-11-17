package com.facebook.aura.partners.voice.screen;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class CallEndedPhase {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ CallEndedPhase[] $VALUES;
    public static final CallEndedPhase ANNOUNCING;
    public static final CallEndedPhase IDLE;
    public static final CallEndedPhase SETTLING;

    static {
        CallEndedPhase callEndedPhase = new CallEndedPhase("IDLE", 0);
        IDLE = callEndedPhase;
        CallEndedPhase callEndedPhase2 = new CallEndedPhase("SETTLING", 1);
        SETTLING = callEndedPhase2;
        CallEndedPhase callEndedPhase3 = new CallEndedPhase("ANNOUNCING", 2);
        ANNOUNCING = callEndedPhase3;
        CallEndedPhase[] callEndedPhaseArr = {callEndedPhase, callEndedPhase2, callEndedPhase3};
        $VALUES = callEndedPhaseArr;
        $ENTRIES = C3cG.A0w(callEndedPhaseArr);
    }

    public static Ey9<CallEndedPhase> getEntries() {
        return $ENTRIES;
    }

    public static CallEndedPhase valueOf(String str) {
        return (CallEndedPhase) Enum.valueOf(CallEndedPhase.class, str);
    }

    public static CallEndedPhase[] values() {
        return (CallEndedPhase[]) $VALUES.clone();
    }

    public CallEndedPhase(String str, int i) {
    }
}
