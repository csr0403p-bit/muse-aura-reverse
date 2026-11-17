package com.facebook.aura.vds.compose.ext;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.B6A;
import X.BFM;
import X.HDi;
import X.HxS;
import android.util.TypedValue;
import com.facebook.aura.vds.compose.theme.AuraContentAlphaKt;

/* loaded from: classes.dex */
public abstract class ColorExtKt {
    /* renamed from: applyContentAlpha-ek8zF_U, reason: not valid java name */
    public static final long m2544applyContentAlphaek8zF_U(long j, BFM bfm, int i) {
        if (j == B6A.A07 || j == B6A.A06 || B6A.A00(j) != 1.0f) {
            AnonymousClass004.A1A(bfm, -1488780707);
            return j;
        }
        bfm.AgE(-1488840072);
        long jA04 = HxS.A04(HDi.A0O[(int) (j & 63)], B6A.A03(j), B6A.A02(j), B6A.A01(j), AnonymousClass001.A02(bfm.A6v(AuraContentAlphaKt.LocalAuraContentAlpha)));
        AnonymousClass002.A19(bfm);
        return jA04;
    }

    public static final long resolveColor(int i, BFM bfm, int i2) {
        long jResolveColorAttribute = resolveColorAttribute(i, bfm, i2 & 14) << 32;
        long j = B6A.A01;
        return jResolveColorAttribute;
    }

    public static final int resolveColorAttribute(int i, BFM bfm, int i2) {
        TypedValue typedValue = new TypedValue();
        AnonymousClass002.A0H(bfm).getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.data;
    }

    /* renamed from: applyState-M3jwhU8, reason: not valid java name */
    public static final long m2545applyStateM3jwhU8(long j, boolean z, long j2, BFM bfm, int i) {
        return HxS.A04(HDi.A0O[(int) (j & 63)], B6A.A03(j), B6A.A02(j), B6A.A01(j), B6A.A00(j) * AnonymousClass001.A02(bfm.A6v(AuraContentAlphaKt.LocalAuraContentAlpha)));
    }
}
