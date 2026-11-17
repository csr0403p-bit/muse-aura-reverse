package X;

/* renamed from: X.Aco, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1156Aco {
    public final float A00;
    public final float A01;
    public final AXN A02;

    public static final double A00(C1156Aco c1156Aco, float f) {
        return Math.log((Math.abs(f) * 0.35f) / (c1156Aco.A00 * c1156Aco.A01));
    }

    public C1156Aco(AXN axn, float f) {
        this.A00 = f;
        this.A02 = axn;
        float fAEm = axn.AEm();
        float f2 = AbstractC1158Acq.A00;
        this.A01 = fAEm * 386.0878f * 160.0f * 0.84f;
    }
}
