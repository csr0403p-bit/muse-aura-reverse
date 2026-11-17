package X;

import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentMap;

/* renamed from: X.GFs, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9359GFs {
    public static final C9359GFs A02 = new C9359GFs();
    public final ConcurrentMap<Class<?>, GG0<?>> A00 = C60O.A1C();
    public final InterfaceC9358GFr A01 = new C9355GFo();

    public final <T> GG0<T> A00(Class<T> cls) {
        GHI ghi;
        InterfaceC9301GDd interfaceC9301GDd;
        GG8<?, ?> gg8;
        InterfaceC10618HzY interfaceC10618HzY;
        GG8<?, ?> gg82;
        C9362GFy<?> c9362GFy;
        Class<?> cls2;
        Charset charset = AbstractC9351GFk.A04;
        if (cls == null) {
            throw BV4.A0a("messageType");
        }
        ConcurrentMap<Class<?>, GG0<?>> concurrentMap = this.A00;
        GG0<T> gg0A0B = (GG0) concurrentMap.get(cls);
        if (gg0A0B == null) {
            C9355GFo c9355GFo = (C9355GFo) this.A01;
            GG8<?, ?> gg83 = GG2.A01;
            if (!GF0.class.isAssignableFrom(cls) && (cls2 = GG2.A02) != null && !cls2.isAssignableFrom(cls)) {
                throw C60O.A0i("Message classes must extend GeneratedMessage or GeneratedMessageLite");
            }
            GFw gFwAQk = c9355GFo.A00.AQk(cls);
            C9360GFt c9360GFt = (C9360GFt) gFwAQk;
            int i = c9360GFt.A00;
            int i2 = i & 2;
            boolean zIsAssignableFrom = GF0.class.isAssignableFrom(cls);
            if (i2 == 2) {
                if (zIsAssignableFrom) {
                    gg82 = GG2.A01;
                    c9362GFy = AbstractC9361GFu.A01;
                } else {
                    gg82 = GG2.A00;
                    c9362GFy = AbstractC9361GFu.A00;
                    if (c9362GFy == null) {
                        throw C3cG.A0Q("Protobuf runtime is not correctly loaded.");
                    }
                }
                gg0A0B = new C9363GFz<>(c9362GFy, c9360GFt.A01, gg82);
            } else {
                if (AnonymousClass002.A1L(zIsAssignableFrom ? 1 : 0)) {
                    ghi = GFv.A01;
                    interfaceC9301GDd = AbstractC9304GDg.A01;
                    gg8 = GG2.A01;
                    c9362GFy = AbstractC7611F5y.A0T(i).intValue() != 1 ? AbstractC9361GFu.A01 : null;
                    interfaceC10618HzY = AbstractC10465Hjv.A01;
                } else {
                    ghi = GFv.A00;
                    interfaceC9301GDd = AbstractC9304GDg.A00;
                    gg8 = GG2.A00;
                    if (AbstractC7611F5y.A0T(i).intValue() != 1 && (c9362GFy = AbstractC9361GFu.A00) == null) {
                        throw C3cG.A0Q("Protobuf runtime is not correctly loaded.");
                    }
                    interfaceC10618HzY = AbstractC10465Hjv.A00;
                }
                gg0A0B = GG1.A0B(c9362GFy, interfaceC9301GDd, interfaceC10618HzY, gFwAQk, ghi, gg8);
            }
            GG0<T> gg0 = (GG0) concurrentMap.putIfAbsent(cls, gg0A0B);
            if (gg0 != null) {
                return gg0;
            }
        }
        return gg0A0B;
    }
}
