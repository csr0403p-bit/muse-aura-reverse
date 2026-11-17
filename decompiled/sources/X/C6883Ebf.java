package X;

import java.io.EOFException;
import java.util.Arrays;

/* renamed from: X.Ebf, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6883Ebf {
    public int A00;
    public int A01;
    public boolean A05;
    public final C6818EaW A07;
    public int A04 = Integer.MAX_VALUE;
    public int A02 = 4096;
    public C6897Ebt[] A06 = new C6897Ebt[8];
    public int A03 = 7;

    public static final void A00(C6883Ebf c6883Ebf, int i) {
        int i2;
        int i3 = 0;
        if (i > 0) {
            int length = c6883Ebf.A06.length;
            while (true) {
                length--;
                i2 = c6883Ebf.A03;
                if (length < i2 || i <= 0) {
                    break;
                }
                C6897Ebt c6897Ebt = c6883Ebf.A06[length];
                C7384Etj.A0X(c6897Ebt);
                i -= c6897Ebt.A00;
                int i4 = c6883Ebf.A00;
                C6897Ebt c6897Ebt2 = c6883Ebf.A06[length];
                C7384Etj.A0X(c6897Ebt2);
                c6883Ebf.A00 = i4 - c6897Ebt2.A00;
                c6883Ebf.A01--;
                i3++;
            }
            C6897Ebt[] c6897EbtArr = c6883Ebf.A06;
            int i5 = i2 + 1;
            System.arraycopy(c6897EbtArr, i5, c6897EbtArr, i5 + i3, c6883Ebf.A01);
            C6897Ebt[] c6897EbtArr2 = c6883Ebf.A06;
            int i6 = c6883Ebf.A03 + 1;
            Arrays.fill(c6897EbtArr2, i6, i6 + i3, (Object) null);
            c6883Ebf.A03 += i3;
        }
    }

    public static final void A02(C6883Ebf c6883Ebf, C6788EZx c6788EZx) throws EOFException {
        C7384Etj.A0Y(c6788EZx, 0);
        int[] iArr = EcB.A02;
        int iA0C = c6788EZx.A0C();
        long j = 0;
        int i = 0;
        while (i < iA0C) {
            int i2 = i + 1;
            byte bA0B = c6788EZx.A0B(i);
            byte[] bArr = AbstractC6843Eav.A06;
            j += EcB.A01[bA0B & 255];
            i = i2;
        }
        int i3 = (int) ((j + 7) >> 3);
        int iA0C2 = c6788EZx.A0C();
        if (i3 < iA0C2) {
            C6818EaW c6818EaW = new C6818EaW();
            long j2 = 0;
            int i4 = 0;
            int i5 = 0;
            while (i4 < iA0C2) {
                int i6 = i4 + 1;
                byte bA0B2 = c6788EZx.A0B(i4);
                byte[] bArr2 = AbstractC6843Eav.A06;
                int i7 = bA0B2 & 255;
                int i8 = EcB.A02[i7];
                byte b = EcB.A01[i7];
                j2 = (j2 << b) | i8;
                i5 += b;
                while (i5 >= 8) {
                    i5 -= 8;
                    c6818EaW.Aif((int) (j2 >> i5));
                }
                i4 = i6;
            }
            if (i5 > 0) {
                c6818EaW.Aif((int) ((j2 << (8 - i5)) | (255 >>> i5)));
            }
            c6788EZx = c6818EaW.AZC(c6818EaW.A00);
            A01(c6883Ebf, c6788EZx.A0C(), 127, 128);
        } else {
            A01(c6883Ebf, iA0C2, 127, 0);
        }
        c6788EZx.A09(c6883Ebf.A07, c6788EZx.A0C());
    }

    public C6883Ebf(C6818EaW c6818EaW) {
        this.A07 = c6818EaW;
    }

    public static final void A01(C6883Ebf c6883Ebf, int i, int i2, int i3) {
        int i4;
        C6818EaW c6818EaW = c6883Ebf.A07;
        if (i < i2) {
            i4 = i | i3;
        } else {
            c6818EaW.Aif(i3 | i2);
            i4 = i - i2;
            while (i4 >= 128) {
                c6818EaW.Aif(128 | (i4 & 127));
                i4 >>>= 7;
            }
        }
        c6818EaW.Aif(i4);
    }
}
