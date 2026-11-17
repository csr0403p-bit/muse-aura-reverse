package X;

/* loaded from: classes6.dex */
public class HDj {
    public final Hw7 A00;
    public final Hw7 A01;
    public final Hw7 A02;
    public final Hw7 A03;

    public static final Hw7 A00(HOP hop, Hw7 hw7, C9193G4w c9193G4w) {
        if (hw7.A01 != AbstractC10598Hxv.A01) {
            return hw7;
        }
        C10376HDg c10376HDg = (C10376HDg) hw7;
        C9193G4w c9193G4w2 = c10376HDg.A07;
        if (HDm.A01(c9193G4w2, c9193G4w)) {
            return hw7;
        }
        float[] fArrA03 = HDm.A03(HDm.A04(hop.A00, c9193G4w2.A00(), c9193G4w.A00()), c10376HDg.A0C);
        String str = ((Hw7) c10376HDg).A02;
        float[] fArr = c10376HDg.A0B;
        return new C10376HDg(c10376HDg.A05, c10376HDg.A03, c10376HDg.A06, c9193G4w, str, fArr, fArrA03, c10376HDg.A01, c10376HDg.A00, -1);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public HDj(Hw7 hw7, Hw7 hw72) {
        Hw7 hw7A00;
        Hw7 hw7A002;
        long j = hw7.A01;
        long j2 = AbstractC10598Hxv.A01;
        if (j == j2) {
            hw7A00 = A00(HOP.A01, hw7, HDp.A01);
        } else {
            hw7A00 = hw7;
        }
        if (hw72.A01 == j2) {
            hw7A002 = A00(HOP.A01, hw72, HDp.A01);
        } else {
            hw7A002 = hw72;
        }
        this(hw7, hw72, hw7A00, hw7A002);
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x01b6 A[PHI: r2 r4 r6 r7
  0x01b6: PHI (r2v22 float) = (r2v17 float), (r2v12 float) binds: [B:70:0x019c, B:39:0x00c1] A[DONT_GENERATE, DONT_INLINE]
  0x01b6: PHI (r4v29 float) = (r4v24 float), (r4v31 float) binds: [B:70:0x019c, B:39:0x00c1] A[DONT_GENERATE, DONT_INLINE]
  0x01b6: PHI (r6v23 float) = (r6v19 float), (r6v26 float) binds: [B:70:0x019c, B:39:0x00c1] A[DONT_GENERATE, DONT_INLINE]
  0x01b6: PHI (r7v18 float) = (r7v13 float), (r7v21 float) binds: [B:70:0x019c, B:39:0x00c1] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long A01(long r18) {
        /*
            Method dump skipped, instructions count: 918
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.HDj.A01(long):long");
    }

    public HDj(Hw7 hw7, Hw7 hw72, Hw7 hw73, Hw7 hw74) {
        this.A01 = hw7;
        this.A00 = hw72;
        this.A03 = hw73;
        this.A02 = hw74;
    }
}
