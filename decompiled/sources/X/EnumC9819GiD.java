package X;

/* renamed from: X.GiD, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public enum EnumC9819GiD implements InterfaceC9826GiK {
    READ_NULL_PROPERTIES(true),
    WRITE_NULL_PROPERTIES(true),
    WRITE_PROPERTIES_SORTED(false),
    STRIP_TRAILING_BIGDECIMAL_ZEROES(true),
    FAIL_ON_NAN_TO_BIG_DECIMAL_COERCION(false);

    public final boolean _enabledByDefault;
    public final int _mask = AbstractC7609F5w.A0F(this);

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
        return 1;
    }

    @Override // X.InterfaceC9827GiL
    public final int AHO() {
        return this._mask;
    }

    EnumC9819GiD(boolean z) {
        this._enabledByDefault = z;
    }
}
