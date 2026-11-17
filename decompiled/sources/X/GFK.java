package X;

/* loaded from: classes6.dex */
public final class GFK implements GFU {
    public static final GFK A00 = new GFK();

    @Override // X.GFU
    public final boolean AP8(Class<?> messageType) {
        return GF2.class.isAssignableFrom(messageType);
    }

    @Override // X.GFU
    public final InterfaceC9342GFa AQl(Class<?> messageType) {
        if (!GF2.class.isAssignableFrom(messageType)) {
            throw C60Q.A0U("Unsupported message type: ", messageType.getName());
        }
        try {
            Class<? extends U> clsAsSubclass = messageType.asSubclass(GF2.class);
            GF2<?, ?> gf2 = GF2.defaultInstanceMap.get(clsAsSubclass);
            if (gf2 == null) {
                try {
                    AbstractC7610F5x.A1H(clsAsSubclass);
                    gf2 = GF2.defaultInstanceMap.get(clsAsSubclass);
                    if (gf2 == null) {
                        gf2 = (GF2) ((GF2) C9401GHq.A01(clsAsSubclass)).A06(C79.A0T);
                        if (gf2 == null) {
                            throw new IllegalStateException();
                        }
                        GF2.defaultInstanceMap.put(clsAsSubclass, gf2);
                    }
                } catch (ClassNotFoundException e) {
                    throw new IllegalStateException("Class initialization cannot fail.", e);
                }
            }
            return (InterfaceC9342GFa) gf2.A06(C79.A0C);
        } catch (Exception e2) {
            throw FGI.A06(messageType, e2);
        }
    }
}
