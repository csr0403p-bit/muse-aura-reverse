package X;

/* renamed from: X.GiJ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public enum EnumC9825GiJ implements InterfaceC9826GiK {
    READ_ENUM_KEYS_USING_INDEX,
    WRITE_ENUMS_TO_LOWERCASE;

    public final boolean _enabledByDefault = false;
    public final int _mask = AbstractC7609F5w.A0F(this);

    EnumC9825GiJ() {
    }

    @Override // X.InterfaceC9827GiL
    public final boolean AA2() {
        return this._enabledByDefault;
    }

    @Override // X.InterfaceC9827GiL
    public final boolean AA3(int i) {
        return AbstractC7609F5w.A1U(i, this._mask);
    }

    @Override // X.InterfaceC9826GiK
    public final int ABI() {
        return 0;
    }

    @Override // X.InterfaceC9827GiL
    public final int AHO() {
        return this._mask;
    }
}
