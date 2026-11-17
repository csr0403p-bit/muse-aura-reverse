package X;

/* renamed from: X.ARy, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1035ARy extends Ab8<ASN> {
    public final G0U<AST, ASR> A00;

    @Override // X.Ab8
    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C1035ARy) && this.A00 == ((C1035ARy) obj).A00);
    }

    @Override // X.Ab8
    public final /* bridge */ /* synthetic */ AbstractC1439Aj8 create() {
        return new ASN(new AST(), this.A00);
    }

    @Override // X.Ab8
    public final int hashCode() {
        return this.A00.hashCode();
    }

    @Override // X.Ab8
    public final void inspectableProperties(ASF asf) {
        asf.A01 = "drawWithCache";
        asf.A02.A01("onBuildDrawCache", this.A00);
    }

    @Override // X.Ab8
    public final /* bridge */ /* synthetic */ void update(AbstractC1439Aj8 abstractC1439Aj8) {
        ASN asn = (ASN) abstractC1439Aj8;
        asn.A01 = this.A00;
        asn.ANu();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1035ARy(G0U<? super AST, ASR> g0u) {
        this.A00 = g0u;
    }
}
