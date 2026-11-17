package X;

/* renamed from: X.Dtr, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC6008Dtr extends AbstractC6010Dtt<Void> {
    public final InterfaceC6009Dts A00;

    @Override // X.InterfaceC6009Dts
    public final C5704Dnm AHb() {
        return this.A00.AHb();
    }

    public AbstractC6008Dtr(InterfaceC6009Dts interfaceC6009Dts) {
        this.A00 = interfaceC6009Dts;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [X.Dtr, X.Dtt] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    @Override // X.AbstractC6010Dtt, X.AbstractC6011Dtu
    public final void A0C(CXB cxb) {
        super.A0C(cxb);
        boolean z = this instanceof C6004Dtn;
        ?? r2 = this;
        if (z) {
            C6004Dtn c6004Dtn = (C6004Dtn) this;
            if (c6004Dtn.A07) {
                return;
            }
            c6004Dtn.A03 = true;
            r2 = c6004Dtn;
        }
        r2.A0D(r2.A00, null);
    }
}
