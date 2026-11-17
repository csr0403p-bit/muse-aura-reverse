package com.facebook.aura.ageverification.intf;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class SelfieResetReason {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ SelfieResetReason[] $VALUES;
    public static final SelfieResetReason APP_PAUSED;
    public static final SelfieResetReason FACE_LOST;

    static {
        SelfieResetReason selfieResetReason = new SelfieResetReason("FACE_LOST", 0);
        FACE_LOST = selfieResetReason;
        SelfieResetReason selfieResetReason2 = new SelfieResetReason("APP_PAUSED", 1);
        APP_PAUSED = selfieResetReason2;
        SelfieResetReason[] selfieResetReasonArr = {selfieResetReason, selfieResetReason2};
        $VALUES = selfieResetReasonArr;
        $ENTRIES = C3cG.A0w(selfieResetReasonArr);
    }

    public static Ey9<SelfieResetReason> getEntries() {
        return $ENTRIES;
    }

    public static SelfieResetReason valueOf(String str) {
        return (SelfieResetReason) Enum.valueOf(SelfieResetReason.class, str);
    }

    public static SelfieResetReason[] values() {
        return (SelfieResetReason[]) $VALUES.clone();
    }

    public SelfieResetReason(String str, int i) {
    }
}
