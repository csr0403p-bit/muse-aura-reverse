package com.facebook.aura.devices.token;

import X.C3cG;
import X.Ey9;
import com.facebook.aura.confidentialvm.vmswitch.CvmMigrationStatusJson;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class RevokeAttempt {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ RevokeAttempt[] $VALUES;
    public static final RevokeAttempt FAILED;
    public static final RevokeAttempt SETTLED;

    static {
        RevokeAttempt revokeAttempt = new RevokeAttempt("SETTLED", 0);
        SETTLED = revokeAttempt;
        RevokeAttempt revokeAttempt2 = new RevokeAttempt(CvmMigrationStatusJson.STAGE_FAILED, 1);
        FAILED = revokeAttempt2;
        RevokeAttempt[] revokeAttemptArr = {revokeAttempt, revokeAttempt2};
        $VALUES = revokeAttemptArr;
        $ENTRIES = C3cG.A0w(revokeAttemptArr);
    }

    public static Ey9<RevokeAttempt> getEntries() {
        return $ENTRIES;
    }

    public static RevokeAttempt valueOf(String str) {
        return (RevokeAttempt) Enum.valueOf(RevokeAttempt.class, str);
    }

    public static RevokeAttempt[] values() {
        return (RevokeAttempt[]) $VALUES.clone();
    }

    public RevokeAttempt(String str, int i) {
    }
}
