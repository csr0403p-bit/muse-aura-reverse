package X;

/* renamed from: X.EnU, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7357EnU extends AbstractC7362EnZ implements InterfaceC7356EnT, InterfaceC7359EnW {
    @Override // X.AbstractC7349EnM
    public final InterfaceC7350EnN computeReflected() {
        return this;
    }

    @Override // X.InterfaceC7356EnT
    public final Object get(Object obj) {
        getGetter();
        throw F60.createAndThrow();
    }

    @Override // X.InterfaceC7356EnT
    public final Object getDelegate(Object obj) {
        ((InterfaceC7356EnT) getReflected()).getDelegate(obj);
        throw null;
    }

    @Override // X.InterfaceC7356EnT
    public final InterfaceC7360EnX getGetter() {
        ((InterfaceC7356EnT) getReflected()).getGetter();
        throw null;
    }

    @Override // X.G0U
    public final Object invoke(Object obj) {
        getGetter();
        throw F60.createAndThrow();
    }
}
