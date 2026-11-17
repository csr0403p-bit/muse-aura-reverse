package X;

/* renamed from: X.GGh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9371GGh implements InterfaceC9381GGu {
    public InterfaceC9381GGu[] A00;

    @Override // X.InterfaceC9381GGu
    public final boolean AP8(Class<?> cls) {
        for (InterfaceC9381GGu interfaceC9381GGu : this.A00) {
            if (interfaceC9381GGu.AP8(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC9381GGu
    public final GHD AQj(Class<?> cls) {
        for (InterfaceC9381GGu interfaceC9381GGu : this.A00) {
            if (interfaceC9381GGu.AP8(cls)) {
                return interfaceC9381GGu.AQj(cls);
            }
        }
        throw FGI.A0s(cls, "No factory is available for message type: ");
    }
}
