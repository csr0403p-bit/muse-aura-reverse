package com.facebook.aura.vds.compose.accessibility;

import X.AnonymousClass002;
import X.BRg;
import X.C7384Etj;
import android.os.Build;

/* loaded from: classes4.dex */
public abstract class AuraHapticsKt {
    /* renamed from: auraHaptic-ZShFqVg, reason: not valid java name */
    public static final BRg m2392auraHapticZShFqVg(BRg bRg, int i, boolean z) {
        C7384Etj.A0Y(bRg, 0);
        return bRg.then(new HatchHapticElement(i, z));
    }

    /* renamed from: mapToViewConstant-CdsT49E, reason: not valid java name */
    public static final int m2394mapToViewConstantCdsT49E(int i) {
        int i2;
        int i3 = Build.VERSION.SDK_INT;
        int i4 = 6;
        if (i3 < 34) {
            i2 = 4;
            if (!AnonymousClass002.A1Q(i, 26) && i != 23) {
                if (i != 13 && i != 21) {
                    if (i != 22) {
                    }
                }
                return i4;
            }
            return i2;
        }
        if (i3 < 30) {
            if (i != 16) {
                if (i != 17) {
                }
                return 0;
            }
            return i4;
        }
        i2 = 1;
        if (!AnonymousClass002.A1Q(i, 1)) {
            if (i != 6) {
                i4 = 26;
                if (i != 26) {
                    i4 = 16;
                    if (i != 16) {
                        i4 = 17;
                        if (i != 17) {
                            if (i != 0) {
                                i4 = 23;
                                if (i != 23) {
                                    i4 = 13;
                                    if (i != 13) {
                                        i4 = 21;
                                        if (i != 21) {
                                            i4 = 22;
                                            if (i == 22) {
                                            }
                                        }
                                    }
                                }
                            }
                            return 0;
                        }
                    }
                }
            }
            return i4;
        }
        return i2;
    }
}
