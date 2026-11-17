package X;

import android.graphics.Typeface;

/* loaded from: classes5.dex */
public final class CPK {
    public int A00;
    public int[] A01;
    public int[] A02;
    public int[] A03;
    public int[] A04;
    public long[] A05;
    public CMN[] A06;
    public final Typeface A07;
    public final CLq A08;
    public final char[] A09;
    public final Object A0A = C3cG.A0T();

    /* JADX WARN: Removed duplicated region for block: B:10:0x0012  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x000a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int A00(X.CMM r9, X.CMM r10, X.CLq r11, X.CMN[] r12, int r13, int r14) {
        /*
            int r1 = r12.length
            r5 = 0
            r8 = 1
            if (r13 >= r1) goto La
            r0 = r12[r13]
            r7 = 1
            if (r0 != 0) goto Lb
        La:
            r7 = 0
        Lb:
            if (r14 >= r1) goto L12
            r0 = r12[r14]
            r6 = 1
            if (r0 != 0) goto L13
        L12:
            r6 = 0
        L13:
            if (r7 == 0) goto L66
            r0 = r12[r13]
            X.CMM r0 = X.CMN.A00(r0)
            r1 = 16
            int r4 = X.CLp.A01(r0, r1)
        L21:
            if (r6 == 0) goto L5e
            r0 = r12[r14]
            X.CMM r0 = X.CMN.A00(r0)
            int r3 = X.CLp.A01(r0, r1)
        L2d:
            int r2 = java.lang.Math.min(r4, r3)
        L31:
            if (r5 >= r2) goto L70
            if (r7 == 0) goto L59
            r0 = r12[r13]
            X.CMM r0 = X.CMN.A00(r0)
            int r1 = r0.A03(r5)
        L3f:
            if (r6 == 0) goto L54
            r0 = r12[r14]
            X.CMM r0 = X.CMN.A00(r0)
            int r0 = r0.A03(r5)
        L4b:
            if (r1 == r0) goto L51
            if (r1 >= r0) goto L50
            r8 = -1
        L50:
            return r8
        L51:
            int r5 = r5 + 1
            goto L31
        L54:
            int r0 = r10.A03(r5)
            goto L4b
        L59:
            int r1 = r9.A03(r5)
            goto L3f
        L5e:
            r11.A03(r10, r14)
            int r3 = X.CLp.A01(r10, r1)
            goto L2d
        L66:
            r11.A03(r9, r13)
            r1 = 16
            int r4 = X.CLp.A01(r9, r1)
            goto L21
        L70:
            int r8 = X.AbstractC7532Ezu.A00(r4, r3)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.CPK.A00(X.CMM, X.CMM, X.CLq, X.CMN[], int, int):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x015d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public CPK(android.graphics.Typeface r20, X.CLq r21) {
        /*
            Method dump skipped, instructions count: 421
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.CPK.<init>(android.graphics.Typeface, X.CLq):void");
    }

    public static void A01(CMM cmm, CMM cmm2, CLq cLq, int[] iArr, CMN[] cmnArr, int i, int i2) {
        if (i < i2) {
            int i3 = (i + i2) >>> 1;
            if (A00(cmm, cmm2, cLq, cmnArr, iArr[i3], iArr[i]) < 0) {
                int i4 = iArr[i];
                iArr[i] = iArr[i3];
                iArr[i3] = i4;
            }
            if (A00(cmm, cmm2, cLq, cmnArr, iArr[i2], iArr[i]) < 0) {
                int i5 = iArr[i];
                iArr[i] = iArr[i2];
                iArr[i2] = i5;
            }
            if (A00(cmm, cmm2, cLq, cmnArr, iArr[i2], iArr[i3]) < 0) {
                int i6 = iArr[i3];
                iArr[i3] = iArr[i2];
                iArr[i2] = i6;
            }
            int i7 = iArr[i3];
            iArr[i3] = iArr[i2];
            iArr[i2] = i7;
            int i8 = i - 1;
            for (int i9 = i; i9 < i2; i9++) {
                if (A00(cmm, cmm2, cLq, cmnArr, iArr[i9], i7) < 0) {
                    i8++;
                    int i10 = iArr[i8];
                    iArr[i8] = iArr[i9];
                    iArr[i9] = i10;
                }
            }
            int i11 = i8 + 1;
            int i12 = iArr[i11];
            iArr[i11] = iArr[i2];
            iArr[i2] = i12;
            A01(cmm, cmm2, cLq, iArr, cmnArr, i, i11 - 1);
            A01(cmm, cmm2, cLq, iArr, cmnArr, i11 + 1, i2);
        }
    }

    public static boolean A02(int i) {
        return i >= 128 ? i < 176 || (i > 8191 && (i < 13056 || (i > 65535 && i > 126975 && i <= 131071))) : i < 64 && ((1 << i) & 287953333581250560L) != 0;
    }

    public final CMN A03(int i) {
        CMN cmn;
        CMN[] cmnArr = this.A06;
        CMN cmn2 = cmnArr[i];
        if (cmn2 != null) {
            return cmn2;
        }
        synchronized (this.A0A) {
            cmn = cmnArr[i];
            if (cmn == null) {
                cmn = new CMN(this, i);
                cmnArr[i] = cmn;
            }
        }
        return cmn;
    }
}
