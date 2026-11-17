package com.facebook.aura.network.tigon;

import X.C3cG;
import X.Ey9;
import com.facebook.aura.conversation.offline.HatchPersistedMessageJson;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class AuraTigonAuthPolicy {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ AuraTigonAuthPolicy[] $VALUES;
    public static final AuraTigonAuthPolicy META;
    public static final AuraTigonAuthPolicy NONE;
    public static final AuraTigonAuthPolicy VM;

    static {
        AuraTigonAuthPolicy auraTigonAuthPolicy = new AuraTigonAuthPolicy(HatchPersistedMessageJson.UNSEND_STATUS_NONE, 0);
        NONE = auraTigonAuthPolicy;
        AuraTigonAuthPolicy auraTigonAuthPolicy2 = new AuraTigonAuthPolicy("META", 1);
        META = auraTigonAuthPolicy2;
        AuraTigonAuthPolicy auraTigonAuthPolicy3 = new AuraTigonAuthPolicy("VM", 2);
        VM = auraTigonAuthPolicy3;
        AuraTigonAuthPolicy[] auraTigonAuthPolicyArr = {auraTigonAuthPolicy, auraTigonAuthPolicy2, auraTigonAuthPolicy3};
        $VALUES = auraTigonAuthPolicyArr;
        $ENTRIES = C3cG.A0w(auraTigonAuthPolicyArr);
    }

    public static Ey9<AuraTigonAuthPolicy> getEntries() {
        return $ENTRIES;
    }

    public static AuraTigonAuthPolicy valueOf(String str) {
        return (AuraTigonAuthPolicy) Enum.valueOf(AuraTigonAuthPolicy.class, str);
    }

    public static AuraTigonAuthPolicy[] values() {
        return (AuraTigonAuthPolicy[]) $VALUES.clone();
    }

    public AuraTigonAuthPolicy(String str, int i) {
    }
}
