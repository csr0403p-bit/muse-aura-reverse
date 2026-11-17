package X;

/* renamed from: X.GoW, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public enum EnumC10052GoW implements InterfaceC9827GiL {
    CAN_WRITE_BINARY_NATIVELY,
    CAN_WRITE_FORMATTED_NUMBERS;

    public final boolean _defaultState = false;
    public final int _mask = AbstractC7609F5w.A0F(this);

    EnumC10052GoW() {
    }

    @Override // X.InterfaceC9827GiL
    public final boolean AA2() {
        return this._defaultState;
    }

    @Override // X.InterfaceC9827GiL
    public final int AHO() {
        return this._mask;
    }

    @Override // X.InterfaceC9827GiL
    public final boolean AA3(int i) {
        throw F60.createAndThrow();
    }
}
