package X;

/* loaded from: classes6.dex */
public abstract class HxS {
    public static final float A00(long j) {
        long j2 = B6A.A01;
        Hw7 hw7 = HDi.A0O[(int) (j & 63)];
        long j3 = hw7.A01;
        if (j3 != AbstractC10598Hxv.A01) {
            throw C60O.A0i(C8j3.A14(AbstractC10598Hxv.A00(j3), C60O.A0x("The specified color must be encoded in an RGB color space. The supplied color space is ")));
        }
        InterfaceC10545Hqy interfaceC10545Hqy = ((C10376HDg) hw7).A02;
        float fANv = (float) ((interfaceC10545Hqy.ANv(B6A.A03(j)) * 0.2126d) + (interfaceC10545Hqy.ANv(B6A.A02(j)) * 0.7152d) + (interfaceC10545Hqy.ANv(B6A.A01(j)) * 0.0722d));
        if (fANv < 0.0f) {
            return 0.0f;
        }
        if (fANv > 1.0f) {
            return 1.0f;
        }
        return fANv;
    }

    public static final int A01(long j) {
        return (int) (B6A.A05(HDi.A0I, j) >>> 32);
    }

    public static final long A02(long j, long j2) {
        long j3 = B6A.A01;
        int i = (int) (j2 & 63);
        Hw7[] hw7Arr = HDi.A0O;
        long jA05 = B6A.A05(hw7Arr[i], j);
        float fA00 = B6A.A00(j2);
        float fA002 = B6A.A00(jA05);
        float f = 1.0f - fA002;
        float f2 = (fA00 * f) + fA002;
        return A05(hw7Arr[i], f2 == 0.0f ? 0.0f : ((B6A.A03(jA05) * fA002) + ((B6A.A03(j2) * fA00) * f)) / f2, f2 == 0.0f ? 0.0f : ((B6A.A02(jA05) * fA002) + ((B6A.A02(j2) * fA00) * f)) / f2, f2 != 0.0f ? ((B6A.A01(jA05) * fA002) + ((B6A.A01(j2) * fA00) * f)) / f2 : 0.0f, f2);
    }

    public static final long A03(long j, long j2, float f) {
        Hw7 hw7 = HDi.A02;
        long jA05 = B6A.A05(hw7, j);
        long jA052 = B6A.A05(hw7, j2);
        float fA00 = B6A.A00(jA05);
        float fA03 = B6A.A03(jA05);
        float fA02 = B6A.A02(jA05);
        float fA01 = B6A.A01(jA05);
        float fA002 = B6A.A00(jA052);
        float fA032 = B6A.A03(jA052);
        float fA022 = B6A.A02(jA052);
        float fA012 = B6A.A01(jA052);
        if (f < 0.0f) {
            f = 0.0f;
        } else if (f > 1.0f) {
            f = 1.0f;
        }
        float f2 = 1.0f - f;
        return B6A.A05(HDi.A0O[(int) (j2 & 63)], A05(hw7, C8j3.A03(f2, fA03, f, fA032), C8j3.A03(f2, fA02, f, fA022), C8j3.A03(f2, fA01, f, fA012), C8j3.A03(f2, fA00, f, fA002)));
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0061 A[PHI: r18
  0x0061: PHI (r18v3 float) = (r18v0 float), (r18v4 float) binds: [B:20:0x004d, B:22:0x0053] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x013c A[PHI: r18
  0x013c: PHI (r18v1 float) = (r18v0 float), (r18v2 float) binds: [B:70:0x010e, B:72:0x0114] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x016b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long A04(X.Hw7 r19, float r20, float r21, float r22, float r23) {
        /*
            Method dump skipped, instructions count: 466
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.HxS.A04(X.Hw7, float, float, float, float):long");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long A05(X.Hw7 r17, float r18, float r19, float r20, float r21) {
        /*
            Method dump skipped, instructions count: 334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.HxS.A05(X.Hw7, float, float, float, float):long");
    }
}
