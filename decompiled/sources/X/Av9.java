package X;

import kotlin.Unit;

/* loaded from: classes4.dex */
public final class Av9 extends Ab8<C1966AvI> {
    public C1966AvI A00;
    public InterfaceC10560Hsz<Unit> A01;

    @Override // X.Ab8
    public final /* bridge */ /* synthetic */ void update(AbstractC1439Aj8 abstractC1439Aj8) {
    }

    public final Object A00(HtJ<? super Unit> htJ) {
        InterfaceC10560Hsz gAt = this.A01;
        if (gAt == null) {
            gAt = new GAt(null);
            this.A01 = gAt;
            C1966AvI c1966AvI = this.A00;
            if (c1966AvI != null && c1966AvI.isAttached) {
                c1966AvI.A00 = AbstractC1462AjV.A01(c1966AvI, BTA.A01(c1966AvI.A01, c1966AvI, 31), 0L, 0L);
            }
        }
        Object objA0W = C3cG.A0W(gAt, htJ);
        return objA0W != EnumC10460Hji.A02 ? Unit.INSTANCE : objA0W;
    }

    @Override // X.Ab8
    public final /* bridge */ /* synthetic */ AbstractC1439Aj8 create() {
        return new C1966AvI(this);
    }

    @Override // X.Ab8
    public final int hashCode() {
        return 234;
    }

    @Override // X.Ab8
    public final void inspectableProperties(ASF asf) {
        asf.A01 = "AwaitFirstLayoutModifier";
    }

    @Override // X.Ab8
    public final boolean equals(Object obj) {
        return AnonymousClass002.A1Z(obj, this);
    }
}
