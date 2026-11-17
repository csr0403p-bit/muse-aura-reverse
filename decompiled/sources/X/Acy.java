package X;

import X.InterfaceC1174Add;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import java.util.List;

/* loaded from: classes4.dex */
public final class Acy<T extends InterfaceC1174Add> {
    public int A00;
    public Ae1 A01;
    public InterfaceC1332AhJ A02;
    public final C0918AHu<Object, Acy<T>.ItemInfo> A03;
    public final BRg A04;
    public final List<C1073AWe> A05;
    public final C0917AHt<Object> A06;
    public final List<T> A07;
    public final List<T> A08;
    public final List<T> A09;
    public final List<T> A0A;

    /* JADX WARN: Incorrect inner types in method signature: (TT;ILX/Acy<TT;>.ItemInfo;)V */
    public static final void A01(Ad4 ad4, InterfaceC1174Add interfaceC1174Add, int i) {
        long j;
        long j2;
        long j3;
        int i2 = 0;
        long jAID = interfaceC1174Add.AID(0);
        if (interfaceC1174Add.APG()) {
            j2 = ((int) (jAID >> 32)) << 32;
            j3 = i;
            j = 4294967295L;
        } else {
            j = 4294967295L;
            j2 = i << 32;
            j3 = (int) (4294967295L & jAID);
        }
        long j4 = j2 | (j3 & j);
        C1073AWe[] c1073AWeArr = ad4.A06;
        int length = c1073AWeArr.length;
        int i3 = 0;
        while (i2 < length) {
            C1073AWe c1073AWe = c1073AWeArr[i2];
            int i4 = i3 + 1;
            if (c1073AWe != null) {
                c1073AWe.A02 = C2ae.A02(j4, C2ae.A01(interfaceC1174Add.AID(i3), jAID));
            }
            i2++;
            i3 = i4;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A03(X.Acy r15) {
        /*
            X.AHu<java.lang.Object, X.Acy<T>$ItemInfo> r11 = r15.A03
            int r0 = r11.A01
            if (r0 == 0) goto L5d
            java.lang.Object[] r10 = r11.A05
            long[] r9 = r11.A03
            int r0 = r9.length
            int r8 = r0 + (-2)
            if (r8 < 0) goto L5a
            r7 = 0
        L10:
            r14 = r9[r7]
            r3 = -1
            long r3 = r3 ^ r14
            r0 = 7
            long r3 = r3 << r0
            long r3 = r3 & r14
            r1 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r3 = r3 & r1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L55
            int r0 = r7 - r8
            r0 = r0 ^ (-1)
            int r0 = r0 >>> 31
            r6 = 8
            int r5 = 8 - r0
            r4 = 0
        L2d:
            if (r4 >= r5) goto L53
            r12 = 255(0xff, double:1.26E-321)
            long r12 = r12 & r14
            r1 = 128(0x80, double:6.32E-322)
            int r0 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r0 >= 0) goto L4f
            int r0 = r7 << 3
            int r0 = r0 + r4
            r0 = r10[r0]
            X.Ad4 r0 = (X.Ad4) r0
            X.AWe[] r3 = r0.A06
            int r2 = r3.length
            r1 = 0
        L43:
            if (r1 >= r2) goto L4f
            r0 = r3[r1]
            if (r0 == 0) goto L4c
            r0.A01()
        L4c:
            int r1 = r1 + 1
            goto L43
        L4f:
            long r14 = r14 >> r6
            int r4 = r4 + 1
            goto L2d
        L53:
            if (r5 != r6) goto L5a
        L55:
            if (r7 == r8) goto L5a
            int r7 = r7 + 1
            goto L10
        L5a:
            r11.A0D()
        L5d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Acy.A03(X.Acy):void");
    }

    private final void A04(T t, boolean z) {
        Ad4 ad4A05 = this.A03.A05(t.getKey());
        C7384Etj.A0X(ad4A05);
        C1073AWe[] c1073AWeArr = ad4A05.A06;
        int length = c1073AWeArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            C1073AWe c1073AWe = c1073AWeArr[i];
            int i3 = i2 + 1;
            if (c1073AWe != null) {
                long jAID = t.AID(i2);
                long j = c1073AWe.A02;
                if (j != C1073AWe.A0I && j != jAID) {
                    long jA01 = C2ae.A01(jAID, j);
                    AOe<C2ae> aOe = c1073AWe.A05;
                    if (aOe != null) {
                        MutableState mutableState = c1073AWe.A0E;
                        long jA012 = C2ae.A01(((C2ae) mutableState.getValue()).A00, jA01);
                        mutableState.Af8(C8j3.A0l(jA012));
                        MutableState.A09(true, c1073AWe.A0D);
                        c1073AWe.A07 = z;
                        AnonymousClass001.A1J(new BUD(aOe, c1073AWe, null, jA012), c1073AWe.A0G);
                    }
                }
                c1073AWe.A02 = jAID;
            }
            i++;
            i2 = i3;
        }
    }

    private final void A05(Object obj) {
        C1073AWe[] c1073AWeArr;
        Ad4 ad4A0B = this.A03.A0B(obj);
        if (ad4A0B == null || (c1073AWeArr = ad4A0B.A06) == null) {
            return;
        }
        for (C1073AWe c1073AWe : c1073AWeArr) {
            if (c1073AWe != null) {
                c1073AWe.A01();
            }
        }
    }

    public final long A06() {
        long jMax = 0;
        List<C1073AWe> list = this.A05;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C1073AWe c1073AWe = list.get(i);
            GraphicsLayer graphicsLayer = c1073AWe.A06;
            if (graphicsLayer != null) {
                jMax = (Math.max((int) (jMax & 4294967295L), AnonymousClass002.A09(r6) + ((int) (r4 & 4294967295L))) & 4294967295L) | (Math.max((int) (jMax >> 32), ((int) (c1073AWe.A02 >> 32)) + ((int) (graphicsLayer.A05 >> 32))) << 32);
            }
        }
        return jMax;
    }

    public final C1073AWe A07(Object obj, int i) {
        C1073AWe[] c1073AWeArr;
        Ad4 ad4A05 = this.A03.A05(obj);
        if (ad4A05 == null || (c1073AWeArr = ad4A05.A06) == null) {
            return null;
        }
        return c1073AWeArr[i];
    }

    public Acy() {
        C0918AHu c0918AHu = AbstractC0977AKq.A00;
        this.A03 = new C0918AHu<>(6);
        C0917AHt<Object> c0917AHt = HsU.A00;
        this.A06 = new C0917AHt<>(6);
        this.A0A = C3cG.A0h();
        this.A09 = C3cG.A0h();
        this.A08 = C3cG.A0h();
        this.A07 = C3cG.A0h();
        this.A05 = C3cG.A0h();
        this.A04 = new AdD(this);
    }

    /* JADX WARN: Incorrect types in method signature: ([ITT;)I */
    public static final int A00(InterfaceC1174Add interfaceC1174Add, int[] iArr) {
        int iAGt = interfaceC1174Add.AGt();
        int iAKq = interfaceC1174Add.AKq() + iAGt;
        int iMax = 0;
        while (iAGt < iAKq) {
            int iAHM = iArr[iAGt] + interfaceC1174Add.AHM();
            iArr[iAGt] = iAHM;
            iMax = Math.max(iMax, iAHM);
            iAGt++;
        }
        return iMax;
    }

    public static void A02(Acy acy) {
        A03(acy);
        acy.A01 = null;
        acy.A00 = -1;
    }

    /* JADX WARN: Incorrect types in method signature: (IIILjava/util/List<TT;>;LX/Ae1;LX/Acx<TT;>;ZZIZIILX/3UX;LX/ASQ;)V */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0176  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A08(X.Ae1 r51, X.AbstractC1164Acx r52, X.ASQ r53, java.util.List r54, X.C3UX r55, int r56, int r57, int r58, int r59, int r60, int r61, boolean r62, boolean r63, boolean r64) {
        /*
            Method dump skipped, instructions count: 1249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Acy.A08(X.Ae1, X.Acx, X.ASQ, java.util.List, X.3UX, int, int, int, int, int, int, boolean, boolean, boolean):void");
    }
}
