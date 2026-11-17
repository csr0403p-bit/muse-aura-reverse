package X;

/* loaded from: classes4.dex */
public final class A6G implements Dg3 {
    public final A6E A00;

    public A6G(A6E a6e) {
        this.A00 = a6e;
    }

    @Override // X.Dg3
    public final void onStateChanged(C1HY c1hy, EnumC3085Bxl enumC3085Bxl) {
        AnonymousClass003.A0u(c1hy, enumC3085Bxl);
        if (enumC3085Bxl != EnumC3085Bxl.ON_CREATE) {
            throw C3cG.A0Q(AnonymousClass007.A0a("Next event must be ON_CREATE, it was ", enumC3085Bxl));
        }
        c1hy.getLifecycle().A05(this);
        this.A00.A00();
    }
}
