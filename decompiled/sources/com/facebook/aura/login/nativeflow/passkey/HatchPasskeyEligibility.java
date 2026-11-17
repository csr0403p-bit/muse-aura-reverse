package com.facebook.aura.login.nativeflow.passkey;

import X.AnonymousClass002;
import X.C3cG;
import X.Ey9;
import com.facebook.aura.confidentialvm.model.ConfidentialVmEligibility;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class HatchPasskeyEligibility {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ HatchPasskeyEligibility[] $VALUES;
    public static final HatchPasskeyEligibility CREDENTIAL_MANAGER_UNAVAILABLE;
    public static final HatchPasskeyEligibility ELIGIBLE;
    public static final HatchPasskeyEligibility NO_CREDENTIAL_PROVIDER;
    public static final HatchPasskeyEligibility NO_SCREEN_LOCK;

    static {
        HatchPasskeyEligibility hatchPasskeyEligibility = new HatchPasskeyEligibility(ConfidentialVmEligibility.STATE_ELIGIBLE, 0);
        ELIGIBLE = hatchPasskeyEligibility;
        HatchPasskeyEligibility hatchPasskeyEligibility2 = new HatchPasskeyEligibility("CREDENTIAL_MANAGER_UNAVAILABLE", 1);
        CREDENTIAL_MANAGER_UNAVAILABLE = hatchPasskeyEligibility2;
        HatchPasskeyEligibility hatchPasskeyEligibility3 = new HatchPasskeyEligibility("NO_SCREEN_LOCK", 2);
        NO_SCREEN_LOCK = hatchPasskeyEligibility3;
        HatchPasskeyEligibility hatchPasskeyEligibility4 = new HatchPasskeyEligibility("NO_CREDENTIAL_PROVIDER", 3);
        NO_CREDENTIAL_PROVIDER = hatchPasskeyEligibility4;
        HatchPasskeyEligibility[] hatchPasskeyEligibilityArr = {hatchPasskeyEligibility, hatchPasskeyEligibility2, hatchPasskeyEligibility3, hatchPasskeyEligibility4};
        $VALUES = hatchPasskeyEligibilityArr;
        $ENTRIES = C3cG.A0w(hatchPasskeyEligibilityArr);
    }

    public static Ey9<HatchPasskeyEligibility> getEntries() {
        return $ENTRIES;
    }

    public static HatchPasskeyEligibility valueOf(String str) {
        return (HatchPasskeyEligibility) Enum.valueOf(HatchPasskeyEligibility.class, str);
    }

    public static HatchPasskeyEligibility[] values() {
        return (HatchPasskeyEligibility[]) $VALUES.clone();
    }

    public final boolean isEligible() {
        return AnonymousClass002.A1Z(this, ELIGIBLE);
    }

    public HatchPasskeyEligibility(String str, int i) {
    }
}
