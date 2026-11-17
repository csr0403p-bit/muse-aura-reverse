package X;

/* loaded from: classes6.dex */
public final class FF9 extends FFL<FDW> {
    public final FFB A00;
    public final FES A01;

    public FF9(FBB fbb, FDW fdw, int i) {
        FFB ffb = new FFB(fbb, fdw, i);
        super(ffb.A00);
        this.A00 = ffb;
        if (!FBA.A0A(fbb)) {
            this.A01 = null;
        } else {
            this.A01 = new FES(fbb);
            FBA.A04(fbb);
        }
    }

    @Override // X.FFL
    public final void A05(FFN ffn) {
        super.A05(ffn);
    }
}
