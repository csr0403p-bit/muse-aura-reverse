package com.facebook.aura.network.noise;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class AuraNoiseConnectionDemandRejectionReason {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ AuraNoiseConnectionDemandRejectionReason[] $VALUES;
    public static final AuraNoiseConnectionDemandRejectionReason BACKGROUND;
    public static final AuraNoiseConnectionDemandRejectionReason INTERNAL;
    public static final AuraNoiseConnectionDemandRejectionReason OFFLINE;
    public static final AuraNoiseConnectionDemandRejectionReason PAUSED;
    public static final AuraNoiseConnectionDemandRejectionReason RETRY_EXHAUSTED;
    public static final AuraNoiseConnectionDemandRejectionReason SESSION_ENDED;

    static {
        AuraNoiseConnectionDemandRejectionReason auraNoiseConnectionDemandRejectionReason = new AuraNoiseConnectionDemandRejectionReason("OFFLINE", 0);
        OFFLINE = auraNoiseConnectionDemandRejectionReason;
        AuraNoiseConnectionDemandRejectionReason auraNoiseConnectionDemandRejectionReason2 = new AuraNoiseConnectionDemandRejectionReason("BACKGROUND", 1);
        BACKGROUND = auraNoiseConnectionDemandRejectionReason2;
        AuraNoiseConnectionDemandRejectionReason auraNoiseConnectionDemandRejectionReason3 = new AuraNoiseConnectionDemandRejectionReason("PAUSED", 2);
        PAUSED = auraNoiseConnectionDemandRejectionReason3;
        AuraNoiseConnectionDemandRejectionReason auraNoiseConnectionDemandRejectionReason4 = new AuraNoiseConnectionDemandRejectionReason("SESSION_ENDED", 3);
        SESSION_ENDED = auraNoiseConnectionDemandRejectionReason4;
        AuraNoiseConnectionDemandRejectionReason auraNoiseConnectionDemandRejectionReason5 = new AuraNoiseConnectionDemandRejectionReason("RETRY_EXHAUSTED", 4);
        RETRY_EXHAUSTED = auraNoiseConnectionDemandRejectionReason5;
        AuraNoiseConnectionDemandRejectionReason auraNoiseConnectionDemandRejectionReason6 = new AuraNoiseConnectionDemandRejectionReason("INTERNAL", 5);
        INTERNAL = auraNoiseConnectionDemandRejectionReason6;
        AuraNoiseConnectionDemandRejectionReason[] auraNoiseConnectionDemandRejectionReasonArr = {auraNoiseConnectionDemandRejectionReason, auraNoiseConnectionDemandRejectionReason2, auraNoiseConnectionDemandRejectionReason3, auraNoiseConnectionDemandRejectionReason4, auraNoiseConnectionDemandRejectionReason5, auraNoiseConnectionDemandRejectionReason6};
        $VALUES = auraNoiseConnectionDemandRejectionReasonArr;
        $ENTRIES = C3cG.A0w(auraNoiseConnectionDemandRejectionReasonArr);
    }

    public static Ey9<AuraNoiseConnectionDemandRejectionReason> getEntries() {
        return $ENTRIES;
    }

    public static AuraNoiseConnectionDemandRejectionReason valueOf(String str) {
        return (AuraNoiseConnectionDemandRejectionReason) Enum.valueOf(AuraNoiseConnectionDemandRejectionReason.class, str);
    }

    public static AuraNoiseConnectionDemandRejectionReason[] values() {
        return (AuraNoiseConnectionDemandRejectionReason[]) $VALUES.clone();
    }

    public AuraNoiseConnectionDemandRejectionReason(String str, int i) {
    }
}
