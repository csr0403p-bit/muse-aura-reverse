package X;

/* renamed from: X.Acn, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1155Acn implements InterfaceC1055ATc {
    public final C1156Aco A00;

    @Override // X.InterfaceC1055ATc
    public final float AC9() {
        return 0.0f;
    }

    @Override // X.InterfaceC1055ATc
    public final long AEw(float f) {
        return ((long) (Math.exp(C1156Aco.A00(this.A00, f) / (AbstractC1158Acq.A00 - 1.0d)) * 1000.0d)) * 1000000;
    }

    @Override // X.InterfaceC1055ATc
    public final float ALX(float f, float f2) {
        double dA00 = C1156Aco.A00(this.A00, f2);
        double d = AbstractC1158Acq.A00;
        return f + (((float) (r2.A00 * r2.A01 * Math.exp((d / (d - 1.0d)) * dA00))) * Math.signum(f2));
    }

    public C1155Acn(AXN axn) {
        this.A00 = new C1156Aco(axn, AZn.A00);
    }

    @Override // X.InterfaceC1055ATc
    public final float AMS(float f, float f2, long j) {
        long j2 = j / 1000000;
        double dA00 = C1156Aco.A00(this.A00, f2);
        double d = AbstractC1158Acq.A00;
        double d2 = d - 1.0d;
        float fExp = (float) (r2.A00 * r2.A01 * Math.exp((d / d2) * dA00));
        long jExp = (long) (Math.exp(dA00 / d2) * 1000.0d);
        float f3 = jExp > 0 ? j2 / jExp : 1.0f;
        float fSignum = fExp * Math.signum(f2);
        float f4 = 1.0f;
        float fA03 = ATD.A03(f3, 0.0f, 1.0f);
        int i = (int) (100.0f * fA03);
        if (i < 100) {
            float f5 = i / 100.0f;
            int i2 = i + 1;
            float[] fArr = AbstractC1157Acp.A00;
            float f6 = fArr[i];
            f4 = ((fA03 - f5) * ((fArr[i2] - f6) / ((i2 / 100.0f) - f5))) + f6;
        }
        return f + (fSignum * f4);
    }

    @Override // X.InterfaceC1055ATc
    public final float AMY(long j, float f) {
        long j2 = j / 1000000;
        double dA00 = C1156Aco.A00(this.A00, f);
        double d = AbstractC1158Acq.A00;
        double d2 = d - 1.0d;
        float fExp = (float) (r2.A00 * r2.A01 * Math.exp((d / d2) * dA00));
        long jExp = (long) (Math.exp(dA00 / d2) * 1000.0d);
        float f2 = 0.0f;
        int iA03 = (int) (ATD.A03(jExp > 0 ? j2 / jExp : 1.0f, 0.0f, 1.0f) * 100.0f);
        if (iA03 < 100) {
            int i = iA03 + 1;
            float[] fArr = AbstractC1157Acp.A00;
            f2 = (fArr[i] - fArr[iA03]) / ((i / 100.0f) - (iA03 / 100.0f));
        }
        return (((f2 * Math.signum(f)) * fExp) / jExp) * 1000.0f;
    }
}
