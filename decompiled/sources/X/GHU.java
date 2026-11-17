package X;

/* loaded from: classes6.dex */
public final class GHU implements InterfaceC9392GHh {
    public static final GHU A00 = new GHU();

    @Override // X.InterfaceC9392GHh
    public final boolean AP8(Class<?> messageType) {
        return GHM.class.isAssignableFrom(messageType);
    }

    @Override // X.InterfaceC9392GHh
    public final GHb AQm(Class messageType) {
        if (!GHM.class.isAssignableFrom(messageType)) {
            throw C60Q.A0U("Unsupported message type: ", messageType.getName());
        }
        try {
            Class<?> clsAsSubclass = messageType.asSubclass(GHM.class);
            GHM<?, ?> ghm = GHM.defaultInstanceMap.get(clsAsSubclass);
            if (ghm == null) {
                try {
                    AbstractC7610F5x.A1H(clsAsSubclass);
                    ghm = GHM.defaultInstanceMap.get(clsAsSubclass);
                    if (ghm == null) {
                        ghm = (GHM) ((GHM) C9402GHr.A01(clsAsSubclass)).A0E(C79.A0T);
                        if (ghm == null) {
                            throw new IllegalStateException();
                        }
                        GHM.defaultInstanceMap.put(clsAsSubclass, ghm);
                    }
                } catch (ClassNotFoundException e) {
                    throw new IllegalStateException("Class initialization cannot fail.", e);
                }
            }
            return (GHb) ghm.A0E(C79.A0C);
        } catch (Exception e2) {
            throw FGI.A06(messageType, e2);
        }
    }
}
