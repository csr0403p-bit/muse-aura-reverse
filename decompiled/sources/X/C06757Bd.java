package X;

/* renamed from: X.7Bd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C06757Bd implements C78X {
    public static final C7Be A01 = new C7Be();
    public final InterfaceC10590Hxd A00;

    public C06757Bd(InterfaceC10590Hxd interfaceC10590Hxd) {
        C7384Etj.A0Y(interfaceC10590Hxd, 0);
        this.A00 = interfaceC10590Hxd;
    }

    @Override // X.C78T
    public final <R> R fold(R r, G0V<? super R, ? super C78X, ? extends R> g0v) {
        C7384Etj.A0Y(g0v, 2);
        return g0v.invoke(r, this);
    }

    @Override // X.C78X
    public final C78I<C06757Bd> getKey() {
        return A01;
    }

    @Override // X.C78X, X.C78T
    public final <E extends C78X> E get(C78I<E> c78i) {
        return (E) C78W.A00(this, c78i);
    }

    @Override // X.C78T
    public final C78T minusKey(C78I<?> c78i) {
        return C78W.A01(this, c78i);
    }

    @Override // X.C78T
    public final C78T plus(C78T c78t) {
        return C78W.A02(this, c78t);
    }
}
