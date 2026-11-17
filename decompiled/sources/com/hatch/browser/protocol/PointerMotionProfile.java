package com.hatch.browser.protocol;

import X.C06H;
import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class PointerMotionProfile {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ PointerMotionProfile[] $VALUES;
    public static final Companion Companion;
    public static final PointerMotionProfile NATURAL;
    public static final PointerMotionProfile SUBTLE;

    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    static {
        PointerMotionProfile pointerMotionProfile = new PointerMotionProfile("SUBTLE", 0);
        SUBTLE = pointerMotionProfile;
        PointerMotionProfile pointerMotionProfile2 = new PointerMotionProfile("NATURAL", 1);
        NATURAL = pointerMotionProfile2;
        PointerMotionProfile[] pointerMotionProfileArr = {pointerMotionProfile, pointerMotionProfile2};
        $VALUES = pointerMotionProfileArr;
        $ENTRIES = C3cG.A0w(pointerMotionProfileArr);
        Companion = new Companion();
    }

    public static Ey9<PointerMotionProfile> getEntries() {
        return $ENTRIES;
    }

    public static PointerMotionProfile valueOf(String str) {
        return (PointerMotionProfile) Enum.valueOf(PointerMotionProfile.class, str);
    }

    public static PointerMotionProfile[] values() {
        return (PointerMotionProfile[]) $VALUES.clone();
    }

    public PointerMotionProfile(String str, int i) {
    }
}
