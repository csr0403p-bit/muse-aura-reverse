package com.facebook.aura.network.transport;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class HatchNoiseHandshakeOutcome {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ HatchNoiseHandshakeOutcome[] $VALUES;
    public static final HatchNoiseHandshakeOutcome ENROLLMENT_REQUIRED;
    public static final HatchNoiseHandshakeOutcome KEY_REQUIRED;
    public static final HatchNoiseHandshakeOutcome LEGACY_PEER_VERIFIED;
    public static final HatchNoiseHandshakeOutcome PRIVATE_AUTH_PEER_VERIFIED;
    public static final HatchNoiseHandshakeOutcome VERIFICATION_FAILED;

    static {
        HatchNoiseHandshakeOutcome hatchNoiseHandshakeOutcome = new HatchNoiseHandshakeOutcome("LEGACY_PEER_VERIFIED", 0);
        LEGACY_PEER_VERIFIED = hatchNoiseHandshakeOutcome;
        HatchNoiseHandshakeOutcome hatchNoiseHandshakeOutcome2 = new HatchNoiseHandshakeOutcome("PRIVATE_AUTH_PEER_VERIFIED", 1);
        PRIVATE_AUTH_PEER_VERIFIED = hatchNoiseHandshakeOutcome2;
        HatchNoiseHandshakeOutcome hatchNoiseHandshakeOutcome3 = new HatchNoiseHandshakeOutcome("ENROLLMENT_REQUIRED", 2);
        ENROLLMENT_REQUIRED = hatchNoiseHandshakeOutcome3;
        HatchNoiseHandshakeOutcome hatchNoiseHandshakeOutcome4 = new HatchNoiseHandshakeOutcome("KEY_REQUIRED", 3);
        KEY_REQUIRED = hatchNoiseHandshakeOutcome4;
        HatchNoiseHandshakeOutcome hatchNoiseHandshakeOutcome5 = new HatchNoiseHandshakeOutcome("VERIFICATION_FAILED", 4);
        VERIFICATION_FAILED = hatchNoiseHandshakeOutcome5;
        HatchNoiseHandshakeOutcome[] hatchNoiseHandshakeOutcomeArr = {hatchNoiseHandshakeOutcome, hatchNoiseHandshakeOutcome2, hatchNoiseHandshakeOutcome3, hatchNoiseHandshakeOutcome4, hatchNoiseHandshakeOutcome5};
        $VALUES = hatchNoiseHandshakeOutcomeArr;
        $ENTRIES = C3cG.A0w(hatchNoiseHandshakeOutcomeArr);
    }

    public static Ey9<HatchNoiseHandshakeOutcome> getEntries() {
        return $ENTRIES;
    }

    public static HatchNoiseHandshakeOutcome valueOf(String str) {
        return (HatchNoiseHandshakeOutcome) Enum.valueOf(HatchNoiseHandshakeOutcome.class, str);
    }

    public static HatchNoiseHandshakeOutcome[] values() {
        return (HatchNoiseHandshakeOutcome[]) $VALUES.clone();
    }

    public HatchNoiseHandshakeOutcome(String str, int i) {
    }
}
