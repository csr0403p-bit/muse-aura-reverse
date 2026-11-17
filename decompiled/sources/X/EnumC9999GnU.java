package X;

/* renamed from: X.GnU, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public enum EnumC9999GnU implements InterfaceC9827GiL {
    /* JADX INFO: Fake field, exist only in values array */
    EF5(0, true),
    /* JADX INFO: Fake field, exist only in values array */
    EF6(1, true),
    /* JADX INFO: Fake field, exist only in values array */
    EF7(2, false),
    A02(3, false),
    /* JADX INFO: Fake field, exist only in values array */
    EF9(4, true),
    A01(5, false),
    /* JADX INFO: Fake field, exist only in values array */
    EF71(6, false);

    public final boolean _defaultState;
    public final EnumC9998GnS _mappedFeature;
    public final int _mask = AbstractC7609F5w.A0F(this);

    @Override // X.InterfaceC9827GiL
    public final boolean AA2() {
        return this._defaultState;
    }

    @Override // X.InterfaceC9827GiL
    public final int AHO() {
        return this._mask;
    }

    EnumC9999GnU(int i, boolean z) {
        this._defaultState = z;
        this._mappedFeature = enumC9998GnS;
    }

    @Override // X.InterfaceC9827GiL
    public final boolean AA3(int i) {
        throw F60.createAndThrow();
    }
}
