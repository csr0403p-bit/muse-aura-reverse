package X;

import java.util.Map;

/* loaded from: classes6.dex */
public final class GI3 {
    public final GIY A00;

    public GI3() {
        GIY giy = GIY.A00;
        byte[] bArr = AbstractC9307GDj.A00;
        this.A00 = giy;
    }

    public final GIK A00(Class cls) {
        Class cls2 = GI2.A01;
        if (!GI0.class.isAssignableFrom(cls) && cls2 != null && !cls2.isAssignableFrom(cls)) {
            throw C60O.A0i("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
        if (!GI0.class.isAssignableFrom(cls)) {
            throw C60Q.A0U("Full runtime messages are not supported by this schema factory: ", cls.getName());
        }
        if (!GI0.class.isAssignableFrom(cls)) {
            throw C60Q.A0U("Unsupported message type: ", cls.getName());
        }
        try {
            Class<?> clsAsSubclass = cls.asSubclass(GI0.class);
            Map<Class<?>, GI0> map = GI0.defaultInstanceMap;
            GI0 gi0 = map.get(clsAsSubclass);
            if (gi0 == null) {
                try {
                    AbstractC7610F5x.A1H(clsAsSubclass);
                    gi0 = map.get(clsAsSubclass);
                    if (gi0 == null) {
                        gi0 = (GI0) ((GI0) AbstractC9404GHt.A00(clsAsSubclass)).A0E(6);
                        if (gi0 == null) {
                            throw new IllegalStateException();
                        }
                        map.put(clsAsSubclass, gi0);
                    }
                } catch (ClassNotFoundException e) {
                    throw new IllegalStateException("Class initialization cannot fail.", e);
                }
            }
            GIM gim = (GIM) gi0.A0E(3);
            if ((gim.A00 & 2) == 2) {
                return new GI6(gim.A01, GI2.A00);
            }
            C9411GIa c9411GIa = GI2.A00;
            if (C9409GHy.A09 != null) {
                return C9409GHy.A0E(gim, c9411GIa);
            }
            throw BV4.A0c("Lite gencode is primarily intended for Android use and uses sun.misc.Unsafe which is not available in the current environment. To run in this environment, you may need to switch to standard gencode.");
        } catch (Exception e2) {
            throw BV4.A0d(FGI.A0M("Unable to get message info for ", cls.getName()), e2);
        }
    }
}
