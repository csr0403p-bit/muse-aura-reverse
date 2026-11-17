package X;

import java.util.List;

/* renamed from: X.Ebe, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6882Ebe {
    public int A00;
    public int A01;
    public final InterfaceC6831Eaj A06;
    public int A02 = 4096;
    public final List<C6897Ebt> A05 = C3cG.A0h();
    public C6897Ebt[] A04 = new C6897Ebt[8];
    public int A03 = 7;

    public static final int A00(C6882Ebe c6882Ebe, int i, int i2) {
        int i3 = i & i2;
        if (i3 < i2) {
            return i3;
        }
        int i4 = 0;
        while (true) {
            byte b = c6882Ebe.A06.readByte();
            byte[] bArr = AbstractC6843Eav.A06;
            int i5 = b & 255;
            if ((i5 & 128) == 0) {
                return i2 + (i5 << i4);
            }
            i2 += (i5 & 127) << i4;
            i4 += 7;
        }
    }

    public static final void A03(C6882Ebe c6882Ebe, int i) {
        int i2;
        int i3 = 0;
        if (i > 0) {
            int length = c6882Ebe.A04.length;
            while (true) {
                length--;
                i2 = c6882Ebe.A03;
                if (length < i2 || i <= 0) {
                    break;
                }
                C6897Ebt c6897Ebt = c6882Ebe.A04[length];
                C7384Etj.A0X(c6897Ebt);
                int i4 = c6897Ebt.A00;
                i -= i4;
                c6882Ebe.A00 -= i4;
                c6882Ebe.A01--;
                i3++;
            }
            C6897Ebt[] c6897EbtArr = c6882Ebe.A04;
            int i5 = i2 + 1;
            System.arraycopy(c6897EbtArr, i5, c6897EbtArr, i5 + i3, c6882Ebe.A01);
            c6882Ebe.A03 += i3;
        }
    }

    public C6882Ebe(InterfaceC6834Eam interfaceC6834Eam) {
        this.A06 = new C6819EaX(interfaceC6834Eam);
    }

    public static final C6788EZx A01(C6882Ebe c6882Ebe) {
        int i;
        InterfaceC6831Eaj interfaceC6831Eaj = c6882Ebe.A06;
        byte b = interfaceC6831Eaj.readByte();
        byte[] bArr = AbstractC6843Eav.A06;
        int i2 = b & 255;
        boolean zA1Q = AnonymousClass002.A1Q(i2 & 128, 128);
        long jA00 = A00(c6882Ebe, i2, 127);
        if (!zA1Q) {
            return interfaceC6831Eaj.AZC(jA00);
        }
        C6818EaW c6818EaW = new C6818EaW();
        EcO ecO = EcB.A00;
        int i3 = 0;
        long j = 0;
        int i4 = 0;
        while (j < jA00) {
            j++;
            i3 = (i3 << 8) | (interfaceC6831Eaj.readByte() & 255);
            i4 += 8;
            while (i4 >= 8) {
                EcO[] ecOArr = ecO.A02;
                C7384Etj.A0X(ecOArr);
                ecO = ecOArr[(i3 >>> (i4 - 8)) & 255];
                C7384Etj.A0X(ecO);
                if (ecO.A02 == null) {
                    c6818EaW.Aif(ecO.A00);
                    i4 -= ecO.A01;
                    ecO = ecO;
                } else {
                    i4 -= 8;
                }
            }
        }
        while (i4 > 0) {
            EcO[] ecOArr2 = ecO.A02;
            C7384Etj.A0X(ecOArr2);
            EcO ecO2 = ecOArr2[(i3 << (8 - i4)) & 255];
            C7384Etj.A0X(ecO2);
            if (ecO2.A02 != null || (i = ecO2.A01) > i4) {
                break;
            }
            c6818EaW.Aif(ecO2.A00);
            i4 -= i;
            ecO = ecO;
        }
        return c6818EaW.AZC(c6818EaW.A00);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C6788EZx A02(X.C6882Ebe r3, int r4) {
        /*
            if (r4 < 0) goto L26
            r1 = 1
            r0 = 60
            if (r4 > r0) goto L26
        L7:
            X.Ebt[] r0 = X.AbstractC6876EbY.A01
            if (r1 == 0) goto L10
            r0 = r0[r4]
        Ld:
            X.EZx r0 = r0.A01
            return r0
        L10:
            r0 = 61
            int r1 = r4 - r0
            int r0 = r3.A03
            int r2 = r0 + 1
            int r2 = r2 + r1
            if (r2 < 0) goto L28
            X.Ebt[] r1 = r3.A04
            int r0 = r1.length
            if (r2 >= r0) goto L28
            r0 = r1[r2]
            X.C7384Etj.A0X(r0)
            goto Ld
        L26:
            r1 = 0
            goto L7
        L28:
            int r0 = r4 + 1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "Header index too large "
            java.io.IOException r0 = X.C7384Etj.A0C(r1, r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6882Ebe.A02(X.Ebe, int):X.EZx");
    }
}
