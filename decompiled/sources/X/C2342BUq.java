package X;

/* renamed from: X.BUq, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2342BUq extends AbstractC7559F3s implements G0U {
    public final int $t;
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C2342BUq(Object obj, C1506AkD c1506AkD, C1506AkD c1506AkD2, C1506AkD c1506AkD3, int i, G0U<? super C1506AkD, Boolean> g0u) {
        super(1);
        this.$t = g0u;
        this.A01 = obj;
        this.A04 = c1506AkD;
        this.A02 = c1506AkD2;
        this.A00 = i;
        this.A03 = c1506AkD3;
    }

    @Override // X.G0U
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        boolean zA00;
        int i = this.$t;
        InterfaceC1505AkC interfaceC1505AkC = (InterfaceC1505AkC) obj;
        Object obj2 = this.A01;
        Object obj3 = this.A04;
        if (i != 0) {
            C1506AkD c1506AkD = (C1506AkD) obj3;
            if (obj2 != AbstractC1414Aij.A01(c1506AkD).ACD()) {
                return AnonymousClass001.A0i();
            }
            zA00 = AbstractC1504AkB.A04(c1506AkD, (AaC) this.A02, (G0U) this.A03, this.A00);
        } else {
            C1506AkD c1506AkD2 = (C1506AkD) obj3;
            if (obj2 != AbstractC1414Aij.A01(c1506AkD2).ACD()) {
                return AnonymousClass001.A0i();
            }
            zA00 = AbstractC1503AkA.A00(c1506AkD2, (C1506AkD) this.A02, (G0U) this.A03, this.A00);
        }
        Boolean boolValueOf = Boolean.valueOf(zA00);
        if (zA00 || !interfaceC1505AkC.AG6()) {
            return boolValueOf;
        }
        return null;
    }
}
