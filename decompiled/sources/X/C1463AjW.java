package X;

import java.util.Arrays;

/* renamed from: X.AjW, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1463AjW {
    public int A00;
    public long[] A01 = new long[192];
    public long[] A02 = new long[192];

    public static final void A00(C1463AjW c1463AjW, int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z, boolean z2, boolean z3) {
        long[] jArr = c1463AjW.A01;
        int i8 = c1463AjW.A00;
        int i9 = i8 + 3;
        c1463AjW.A00 = i9;
        int length = jArr.length;
        if (length <= i9) {
            int iMax = Math.max(length * 2, i8 + 3);
            long[] jArrCopyOf = Arrays.copyOf(jArr, iMax);
            C7384Etj.A0U(jArrCopyOf);
            c1463AjW.A01 = jArrCopyOf;
            long[] jArrCopyOf2 = Arrays.copyOf(c1463AjW.A02, iMax);
            C7384Etj.A0U(jArrCopyOf2);
            c1463AjW.A02 = jArrCopyOf2;
        }
        long[] jArr2 = c1463AjW.A01;
        jArr2[i8] = (i2 << 32) | (i3 & 4294967295L);
        jArr2[i8 + 1] = (i4 << 32) | (i5 & 4294967295L);
        int i10 = i6 & 33554431;
        jArr2[i8 + 2] = ((z3 ? 1L : 0L) << 63) | ((z2 ? 1L : 0L) << 62) | ((z ? 1L : 0L) << 61) | (1 << 60) | (Math.min(0, 1023) << 50) | (i10 << 25) | (i & 33554431);
        if (i6 >= 0) {
            int i11 = i8 - 3;
            if (i7 != -1) {
                i11 = i7;
            }
            while (i11 >= 0) {
                int i12 = i11 + 2;
                long j = jArr2[i12];
                if ((((int) j) & 33554431) == i10) {
                    jArr2[i12] = (j & AbstractC1479Ajm.A00) | (Math.min((i8 - i11) / 3, 1023) << 50);
                    return;
                }
                i11 -= 3;
            }
        }
    }

    public final void A01(int i, boolean z) {
        int i2 = i & 33554431;
        long[] jArr = this.A01;
        int i3 = this.A00;
        for (int i4 = 0; i4 < jArr.length - 2 && i4 < i3; i4 += 3) {
            int i5 = i4 + 2;
            long j = jArr[i5];
            if ((((int) j) & 33554431) == i2) {
                long j2 = z ? 1L : 0L;
                jArr[i5] = (j2 * Long.MIN_VALUE) | (8070450532247928831L & j) | (j2 * 1152921504606846976L);
                return;
            }
        }
    }

    /* JADX WARN: Incorrect return type in method signature: (ILX/G2j<-Ljava/lang/Integer;-Ljava/lang/Integer;-Ljava/lang/Integer;-Ljava/lang/Integer;Lkotlin/Unit;>;)Z */
    public final void A02(G2j g2j, int i) {
        int i2 = i & 33554431;
        long[] jArr = this.A01;
        int i3 = this.A00;
        for (int i4 = 0; i4 < jArr.length - 2 && i4 < i3; i4 += 3) {
            if ((((int) jArr[i4 + 2]) & 33554431) == i2) {
                long j = jArr[i4];
                long j2 = jArr[i4 + 1];
                AnonymousClass001.A1F(Integer.valueOf((int) (j >> 32)), Integer.valueOf((int) j), Integer.valueOf((int) (j2 >> 32)), g2j, (int) j2);
                return;
            }
        }
    }
}
