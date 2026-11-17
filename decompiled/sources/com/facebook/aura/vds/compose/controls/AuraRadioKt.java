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
public abstract class AuraRadioKt {
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.G0U<java.lang.Boolean, kotlin.Unit> withSelectionHaptic(X.G0U<? super java.lang.Boolean, kotlin.Unit> r5, X.BFM r6, int r7) {
        /*
            r0 = 0
            X.C7384Etj.A0Y(r5, r0)
            X.0dx r4 = X.AnonymousClass002.A0T(r6)
            boolean r3 = r6.A67(r4)
            r0 = r7 & 14
            r0 = r0 ^ 6
            r2 = 4
            if (r0 <= r2) goto L19
            boolean r0 = r6.A65(r5)
            if (r0 != 0) goto L1e
        L19:
            r0 = r7 & 6
            r1 = 0
            if (r0 != r2) goto L1f
        L1e:
            r1 = 1
        L1f:
            r1 = r1 | r3
            java.lang.Object r0 = r6.AaT()
            if (r1 != 0) goto L2a
            java.lang.Object r1 = X.C78N.A00
            if (r0 != r1) goto L32
        L2a:
            com.facebook.aura.vds.compose.controls.AuraRadioKt$withSelectionHaptic$1$1 r0 = new com.facebook.aura.vds.compose.controls.AuraRadioKt$withSelectionHaptic$1$1
            r0.<init>(r4, r5)
            r6.Ai0(r0)
        L32:
            X.G0U r0 = (X.G0U) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.vds.compose.controls.AuraRadioKt.withSelectionHaptic(X.G0U, X.BFM, int):X.G0U");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00fb  */
    /* renamed from: AuraRadio-V-9fs2A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m2530AuraRadioV9fs2A(X.BRg r18, boolean r19, boolean r20, X.G0U<? super java.lang.Boolean, kotlin.Unit> r21, X.InterfaceC1072AWd r22, long r23, X.BFM r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.vds.compose.controls.AuraRadioKt.m2530AuraRadioV9fs2A(X.BRg, boolean, boolean, X.G0U, X.AWd, long, X.BFM, int, int):void");
    }

    /* renamed from: radioColor-RPmYEkk, reason: not valid java name */
    public static final long m2531radioColorRPmYEkk(boolean z, long j, BFM bfm, int i) {
        return HxS.A04(HDi.A0O[(int) (j & 63)], B6A.A03(j), B6A.A02(j), B6A.A01(j), z ? 1.0f : 0.3f);
    }

    public static final int radioDrawable(boolean z, BFM bfm, int i) {
        int i2 = z ? AnonymousClass006.A0j(bfm, -30216809).radioChecked : AnonymousClass006.A0j(bfm, -30215591).radioUnchecked;
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
