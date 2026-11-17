package X;

/* loaded from: classes6.dex */
public final class GFP implements GFU {
    public GFU[] A00;

    @Override // X.GFU
    public final boolean AP8(Class<?> clazz) {
        for (GFU gfu : this.A00) {
            if (gfu.AP8(clazz)) {
                return true;
            }
        }
        return false;
    }

    @Override // X.GFU
    public final InterfaceC9342GFa AQl(Class<?> clazz) {
        for (GFU gfu : this.A00) {
            if (gfu.AP8(clazz)) {
                return gfu.AQl(clazz);
            }
        }
        throw FGI.A0s(clazz, "No factory is available for message type: ");
    }
}
