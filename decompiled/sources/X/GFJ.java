package X;

import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes6.dex */
public final class GFJ {
    public static final GFJ A02 = new GFJ();
    public final ConcurrentMap<Class<?>, GF4<?>> A00 = C60O.A1C();
    public final InterfaceC9347GFg A01 = new GFO();

    public final <T> GF4<T> A00(Class<T> cls) {
        InterfaceC9348GFh interfaceC9348GFh;
        InterfaceC9346GFf interfaceC9346GFf;
        GFA<?, ?> gfa;
        InterfaceC10617HzX interfaceC10617HzX;
        GFA<?, ?> gfa2;
        GFB<?> gfb;
        Class<?> cls2;
        Charset charset = AbstractC9349GFi.A04;
        if (cls == null) {
            throw BV4.A0a("messageType");
        }
        ConcurrentMap<Class<?>, GF4<?>> concurrentMap = this.A00;
        GF4<T> gf4A0C = (GF4) concurrentMap.get(cls);
        if (gf4A0C == null) {
            GFO gfo = (GFO) this.A01;
            GFA<?, ?> gfa3 = GFG.A01;
            if (!GF2.class.isAssignableFrom(cls) && (cls2 = GFG.A02) != null && !cls2.isAssignableFrom(cls)) {
                throw C60O.A0i("Message classes must extend GeneratedMessage or GeneratedMessageLite");
            }
            InterfaceC9342GFa interfaceC9342GFaAQl = gfo.A00.AQl(cls);
            GFM gfm = (GFM) interfaceC9342GFaAQl;
            int i = gfm.A00;
            int i2 = i & 2;
            boolean zIsAssignableFrom = GF2.class.isAssignableFrom(cls);
            if (i2 == 2) {
                if (zIsAssignableFrom) {
                    gfa2 = GFG.A01;
                    gfb = GFC.A01;
                } else {
                    gfa2 = GFG.A00;
                    gfb = GFC.A00;
                    if (gfb == null) {
                        throw C3cG.A0Q("Protobuf runtime is not correctly loaded.");
                    }
                }
                gf4A0C = new GF9<>(gfb, gfm.A01, gfa2);
            } else {
                if (AnonymousClass002.A1L(zIsAssignableFrom ? 1 : 0)) {
                    interfaceC9348GFh = GFT.A01;
                    interfaceC9346GFf = GFS.A01;
                    gfa = GFG.A01;
                    gfb = AbstractC7611F5y.A0T(i).intValue() != 1 ? GFC.A01 : null;
                    interfaceC10617HzX = AbstractC10485Hlf.A01;
                } else {
                    interfaceC9348GFh = GFT.A00;
                    interfaceC9346GFf = GFS.A00;
                    gfa = GFG.A00;
                    if (AbstractC7611F5y.A0T(i).intValue() != 1 && (gfb = GFC.A00) == null) {
                        throw C3cG.A0Q("Protobuf runtime is not correctly loaded.");
                    }
                    interfaceC10617HzX = AbstractC10485Hlf.A00;
                }
                gf4A0C = GFH.A0C(gfb, interfaceC9346GFf, interfaceC10617HzX, interfaceC9342GFaAQl, interfaceC9348GFh, gfa);
            }
            GF4<T> gf4 = (GF4) concurrentMap.putIfAbsent(cls, gf4A0C);
            if (gf4 != null) {
                return gf4;
            }
        }
        return gf4A0C;
    }
}
