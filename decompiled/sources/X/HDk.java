package X;

/* loaded from: classes6.dex */
public final class HDk extends HDj {
    public final C10376HDg A00;
    public final C10376HDg A01;
    public final float[] A02;

    public HDk(C10376HDg c10376HDg, C10376HDg c10376HDg2) {
        float[] fArrA03;
        super(c10376HDg, c10376HDg2, c10376HDg, c10376HDg2);
        this.A01 = c10376HDg;
        this.A00 = c10376HDg2;
        C9193G4w c9193G4w = c10376HDg.A07;
        C9193G4w c9193G4w2 = c10376HDg2.A07;
        if (HDm.A01(c9193G4w, c9193G4w2)) {
            fArrA03 = HDm.A03(c10376HDg2.A0A, c10376HDg.A0C);
        } else {
            float[] fArr = c10376HDg.A0C;
            float[] fArr2 = c10376HDg2.A0A;
            float[] fArrA00 = c9193G4w.A00();
            float[] fArrA002 = c9193G4w2.A00();
            C9193G4w c9193G4w3 = HDp.A01;
            fArrA03 = HDm.A03(HDm.A01(c9193G4w2, c9193G4w3) ? fArr2 : HDm.A02(HDm.A03(HDm.A04(HOP.A01.A00, fArrA002, new float[]{0.964212f, 1.0f, 0.825188f}), c10376HDg2.A0C)), HDm.A01(c9193G4w, c9193G4w3) ? fArr : HDm.A03(HDm.A04(HOP.A01.A00, fArrA00, new float[]{0.964212f, 1.0f, 0.825188f}), fArr));
        }
        this.A02 = fArrA03;
    }
}
