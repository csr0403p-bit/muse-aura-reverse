package X;

/* renamed from: X.GFm, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9353GFm implements InterfaceC9357GFq {
    public static final C9353GFm A00 = new C9353GFm();

    @Override // X.InterfaceC9357GFq
    public final boolean AP8(Class<?> messageType) {
        return GF0.class.isAssignableFrom(messageType);
    }

    @Override // X.InterfaceC9357GFq
    public final GFw AQk(Class<?> messageType) {
        if (!GF0.class.isAssignableFrom(messageType)) {
            throw C60Q.A0U("Unsupported message type: ", messageType.getName());
        }
        try {
            Class<? extends U> clsAsSubclass = messageType.asSubclass(GF0.class);
            GF0<?, ?> gf0 = GF0.defaultInstanceMap.get(clsAsSubclass);
            if (gf0 == null) {
                try {
                    AbstractC7610F5x.A1H(clsAsSubclass);
                    gf0 = GF0.defaultInstanceMap.get(clsAsSubclass);
                    if (gf0 == null) {
                        gf0 = (GF0) ((GF0) C9399GHo.A01(clsAsSubclass)).A05(C79.A0T);
                        if (gf0 == null) {
                            throw new IllegalStateException();
                        }
                        GF0.defaultInstanceMap.put(clsAsSubclass, gf0);
                    }
                } catch (ClassNotFoundException e) {
                    throw new IllegalStateException("Class initialization cannot fail.", e);
                }
            }
            return (GFw) gf0.A05(C79.A0C);
        } catch (Exception e2) {
            throw FGI.A06(messageType, e2);
        }
    }
}
