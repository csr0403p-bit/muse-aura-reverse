package X;

/* loaded from: classes6.dex */
public final class GHY implements InterfaceC9392GHh {
    public InterfaceC9392GHh[] A00;

    @Override // X.InterfaceC9392GHh
    public final boolean AP8(Class<?> clazz) {
        for (InterfaceC9392GHh interfaceC9392GHh : this.A00) {
            if (interfaceC9392GHh.AP8(clazz)) {
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC9392GHh
    public final GHb AQm(Class clazz) {
        for (InterfaceC9392GHh interfaceC9392GHh : this.A00) {
            if (interfaceC9392GHh.AP8(clazz)) {
                return interfaceC9392GHh.AQm(clazz);
            }
        }
        throw FGI.A0s(clazz, "No factory is available for message type: ");
    }
}
