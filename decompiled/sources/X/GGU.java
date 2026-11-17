package X;

/* loaded from: classes6.dex */
public final class GGU implements InterfaceC9381GGu {
    public static final GGU A00 = new GGU();

    @Override // X.InterfaceC9381GGu
    public final boolean AP8(Class<?> cls) {
        return AbstractC9339GEw.class.isAssignableFrom(cls);
    }

    @Override // X.InterfaceC9381GGu
    public final GHD AQj(Class<?> cls) {
        if (!AbstractC9339GEw.class.isAssignableFrom(cls)) {
            throw C60Q.A0U("Unsupported message type: ", cls.getName());
        }
        try {
            Class<? extends U> clsAsSubclass = cls.asSubclass(AbstractC9339GEw.class);
            AbstractC9339GEw<?, ?> abstractC9339GEw = AbstractC9339GEw.defaultInstanceMap.get(clsAsSubclass);
            if (abstractC9339GEw == null) {
                try {
                    AbstractC7610F5x.A1H(clsAsSubclass);
                    abstractC9339GEw = AbstractC9339GEw.defaultInstanceMap.get(clsAsSubclass);
                    if (abstractC9339GEw == null) {
                        abstractC9339GEw = (AbstractC9339GEw) ((AbstractC9339GEw) C9400GHp.A02(clsAsSubclass)).A04(C79.A0T);
                        if (abstractC9339GEw == null) {
                            throw new IllegalStateException();
                        }
                        AbstractC9339GEw.defaultInstanceMap.put(clsAsSubclass, abstractC9339GEw);
                    }
                } catch (ClassNotFoundException e) {
                    throw new IllegalStateException("Class initialization cannot fail.", e);
                }
            }
            return (GHD) abstractC9339GEw.A04(C79.A0C);
        } catch (Exception e2) {
            throw FGI.A06(cls, e2);
        }
    }
}
