package com.facebook.aura.status.view;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class HatchAvatarMotionPolicy {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ HatchAvatarMotionPolicy[] $VALUES;
    public static final HatchAvatarMotionPolicy ANIMATED;
    public static final HatchAvatarMotionPolicy CHECKING_DEVICE;
    public static final HatchAvatarMotionPolicy STATIC;

    static {
        HatchAvatarMotionPolicy hatchAvatarMotionPolicy = new HatchAvatarMotionPolicy("CHECKING_DEVICE", 0);
        CHECKING_DEVICE = hatchAvatarMotionPolicy;
        HatchAvatarMotionPolicy hatchAvatarMotionPolicy2 = new HatchAvatarMotionPolicy("STATIC", 1);
        STATIC = hatchAvatarMotionPolicy2;
        HatchAvatarMotionPolicy hatchAvatarMotionPolicy3 = new HatchAvatarMotionPolicy("ANIMATED", 2);
        ANIMATED = hatchAvatarMotionPolicy3;
        HatchAvatarMotionPolicy[] hatchAvatarMotionPolicyArr = {hatchAvatarMotionPolicy, hatchAvatarMotionPolicy2, hatchAvatarMotionPolicy3};
        $VALUES = hatchAvatarMotionPolicyArr;
        $ENTRIES = C3cG.A0w(hatchAvatarMotionPolicyArr);
    }

    public static Ey9<HatchAvatarMotionPolicy> getEntries() {
        return $ENTRIES;
    }

    public static HatchAvatarMotionPolicy valueOf(String str) {
        return (HatchAvatarMotionPolicy) Enum.valueOf(HatchAvatarMotionPolicy.class, str);
    }

    public static HatchAvatarMotionPolicy[] values() {
        return (HatchAvatarMotionPolicy[]) $VALUES.clone();
    }

    public HatchAvatarMotionPolicy(String str, int i) {
    }
}
