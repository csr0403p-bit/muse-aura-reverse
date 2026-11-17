package X;

/* renamed from: X.Gnl, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public enum EnumC10013Gnl implements InterfaceC9827GiL {
    /* JADX INFO: Fake field, exist only in values array */
    EF3(0),
    /* JADX INFO: Fake field, exist only in values array */
    EF4(1),
    /* JADX INFO: Fake field, exist only in values array */
    EF5(2),
    /* JADX INFO: Fake field, exist only in values array */
    EF6(3),
    A02(4),
    A01(5);

    public final boolean _defaultState;
    public final EnumC10012Gnk _mappedFeature;
    public final int _mask;

    @Override // X.InterfaceC9827GiL
    public final boolean AA2() {
        return this._defaultState;
    }

    @Override // X.InterfaceC9827GiL
    public final int AHO() {
        return this._mask;
    }

    EnumC10013Gnl(int i) {
        this._mappedFeature = enumC10012Gnk;
        this._mask = enumC10012Gnk._mask;
        this._defaultState = enumC10012Gnk._defaultState;
    }

    @Override // X.InterfaceC9827GiL
    public final boolean AA3(int i) {
        throw F60.createAndThrow();
    }
}
