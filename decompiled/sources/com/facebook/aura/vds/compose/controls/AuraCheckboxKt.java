package com.facebook.aura.vds.compose.controls;

import X.AVy;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass006;
import X.B6A;
import X.BFM;
import X.BRg;
import X.HDi;
import X.HxS;

/* loaded from: classes.dex */
public abstract class AuraCheckboxKt {
    /* JADX WARN: Removed duplicated region for block: B:23:0x0054  */
    /* renamed from: AuraCheckbox-O-7ixnI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m2528AuraCheckboxO7ixnI(X.BRg r21, boolean r22, boolean r23, X.G0U<? super java.lang.Boolean, kotlin.Unit> r24, X.InterfaceC1072AWd r25, long r26, X.B6A r28, X.BFM r29, int r30, int r31) {
        /*
            Method dump skipped, instructions count: 353
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.vds.compose.controls.AuraCheckboxKt.m2528AuraCheckboxO7ixnI(X.BRg, boolean, boolean, X.G0U, X.AWd, long, X.B6A, X.BFM, int, int):void");
    }

    /* renamed from: checkboxColor-RVB81NI, reason: not valid java name */
    public static final long m2529checkboxColorRVB81NI(boolean z, boolean z2, long j, B6A b6a, BFM bfm, int i) {
        if (z2 && b6a != null) {
            j = b6a.A00;
        }
        return HxS.A04(HDi.A0O[(int) (j & 63)], B6A.A03(j), B6A.A02(j), B6A.A01(j), z ? 1.0f : 0.3f);
    }

    public static final int checkboxDrawable(boolean z, BFM bfm, int i) {
        int i2 = z ? AnonymousClass006.A0j(bfm, -1853797544).checkboxChecked : AnonymousClass006.A0j(bfm, -1853796230).checkboxUnchecked;
        AnonymousClass002.A19(bfm);
        return i2;
    }

    public static final BRg defaultSizeFor(BRg bRg, AVy aVy) {
        boolean zA1M = AnonymousClass002.A1M((aVy.mo0getIntrinsicSizeNHjbRc() > 9205357640488583168L ? 1 : (aVy.mo0getIntrinsicSizeNHjbRc() == 9205357640488583168L ? 0 : -1)));
        BRg bRgA0S = BRg.A00;
        if (zA1M) {
            bRgA0S = AnonymousClass001.A0S(bRgA0S);
        }
        return bRg.then(bRgA0S);
    }
}
