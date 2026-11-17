package X;

/* renamed from: X.1Z4, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1Z4 extends Ab8<C1AE> {
    public final Object A00;

    @Override // X.Ab8
    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C1Z4) && C7384Etj.areEqual(this.A00, ((C1Z4) obj).A00));
    }

    public static BRg A00(BRg bRg, Object obj) {
        return bRg.then(new C1Z4(obj));
    }

    @Override // X.Ab8
    public final /* bridge */ /* synthetic */ AbstractC1439Aj8 create() {
        Object obj = this.A00;
        C1AE c1ae = new C1AE();
        c1ae.A00 = obj;
        return c1ae;
    }

    @Override // X.Ab8
    public final int hashCode() {
        return this.A00.hashCode();
    }

    @Override // X.Ab8
    public final void inspectableProperties(ASF asf) {
        asf.A01 = "layoutId";
        asf.A00 = this.A00;
    }

    public final String toString() {
        return AnonymousClass007.A0Z(this.A00, new StringBuilder("LayoutIdElement(layoutId="));
    }

    @Override // X.Ab8
    public final /* bridge */ /* synthetic */ void update(AbstractC1439Aj8 abstractC1439Aj8) {
        ((C1AE) abstractC1439Aj8).A00 = this.A00;
    }

    public C1Z4(Object obj) {
        this.A00 = obj;
    }
}
