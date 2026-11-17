package X;

/* renamed from: X.GFp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9356GFp implements InterfaceC9357GFq {
    public InterfaceC9357GFq[] A00;

    @Override // X.InterfaceC9357GFq
    public final boolean AP8(Class<?> clazz) {
        for (InterfaceC9357GFq interfaceC9357GFq : this.A00) {
            if (interfaceC9357GFq.AP8(clazz)) {
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC9357GFq
    public final GFw AQk(Class<?> clazz) {
        for (InterfaceC9357GFq interfaceC9357GFq : this.A00) {
            if (interfaceC9357GFq.AP8(clazz)) {
                return interfaceC9357GFq.AQk(clazz);
            }
        }
        throw FGI.A0s(clazz, "No factory is available for message type: ");
    }
}
