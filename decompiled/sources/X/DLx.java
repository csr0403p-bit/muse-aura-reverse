package X;

/* loaded from: classes5.dex */
public final class DLx implements DMN {
    public DFW A00;
    public final DFX A01;

    @Override // X.DMN
    public final void A3A(String str, double d) {
        DFW dfw = this.A00;
        if (dfw == null) {
            throw BV4.A0U();
        }
        dfw.A08(str, Double.valueOf(d));
    }

    @Override // X.DMN
    public final void A3B(String str, long j) {
        DFW dfw = this.A00;
        if (dfw == null) {
            throw BV4.A0U();
        }
        dfw.A08(str, Long.valueOf(j));
    }

    public DLx(DFX dfx) {
        this.A01 = dfx;
    }
}
