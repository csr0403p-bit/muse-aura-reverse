package X;

import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes6.dex */
public final class GGS {
    public static final GGS A02 = new GGS();
    public final ConcurrentMap<Class<?>, InterfaceC9366GGc<?>> A00 = C60O.A1C();
    public final GHE A01 = new C9370GGg();

    public final <T> InterfaceC9366GGc<T> A00(Class<T> cls) {
        GHC ghc;
        AbstractC9300GDc abstractC9300GDc;
        GGX<?, ?> ggx;
        GHF<?> ghf;
        GH3 gh3;
        GGX<?, ?> ggx2;
        GHF<?> ghf2;
        Class<?> cls2;
        Charset charset = GGV.A03;
        if (cls == null) {
            throw BV4.A0a("messageType");
        }
        ConcurrentMap<Class<?>, InterfaceC9366GGc<?>> concurrentMap = this.A00;
        InterfaceC9366GGc<T> interfaceC9366GGcA03 = (InterfaceC9366GGc) concurrentMap.get(cls);
        if (interfaceC9366GGcA03 == null) {
            C9370GGg c9370GGg = (C9370GGg) this.A01;
            GGX<?, ?> ggx3 = GGM.A02;
            if (!AbstractC9339GEw.class.isAssignableFrom(cls) && (cls2 = GGM.A03) != null && !cls2.isAssignableFrom(cls)) {
                throw C60O.A0i("Message classes must extend GeneratedMessage or GeneratedMessageLite");
            }
            GHD ghdAQj = c9370GGg.A00.AQj(cls);
            C9379GGr c9379GGr = (C9379GGr) ghdAQj;
            int i = c9379GGr.A00;
            int i2 = i & 2;
            boolean zIsAssignableFrom = AbstractC9339GEw.class.isAssignableFrom(cls);
            if (i2 == 2) {
                if (zIsAssignableFrom) {
                    ggx2 = GGM.A02;
                    ghf2 = AbstractC9373GGj.A01;
                } else {
                    ggx2 = GGM.A00;
                    ghf2 = AbstractC9373GGj.A00;
                    if (ghf2 == null) {
                        throw C3cG.A0Q("Protobuf runtime is not correctly loaded.");
                    }
                }
                interfaceC9366GGcA03 = new GGR<>(ghf2, c9379GGr.A01, ggx2);
            } else {
                int i3 = i & 1;
                if (zIsAssignableFrom) {
                    boolean zA1Z = AnonymousClass002.A1Z(i3 == 1 ? C79.A00 : C79.A01, C79.A00);
                    ghc = AbstractC9376GGn.A01;
                    abstractC9300GDc = AbstractC9300GDc.A01;
                    ggx = GGM.A02;
                    ghf = zA1Z ? AbstractC9373GGj.A01 : null;
                    gh3 = AbstractC9375GGl.A01;
                } else {
                    boolean zA1Z2 = AnonymousClass002.A1Z(i3 == 1 ? C79.A00 : C79.A01, C79.A00);
                    ghc = AbstractC9376GGn.A00;
                    abstractC9300GDc = AbstractC9300GDc.A00;
                    if (zA1Z2) {
                        ggx = GGM.A00;
                        ghf = AbstractC9373GGj.A00;
                        if (ghf == null) {
                            throw C3cG.A0Q("Protobuf runtime is not correctly loaded.");
                        }
                    } else {
                        ggx = GGM.A01;
                        ghf = null;
                    }
                    gh3 = AbstractC9375GGl.A00;
                }
                interfaceC9366GGcA03 = GGO.A03(ghf, abstractC9300GDc, gh3, ghdAQj, ghc, ggx);
            }
            InterfaceC9366GGc<T> interfaceC9366GGc = (InterfaceC9366GGc) concurrentMap.putIfAbsent(cls, interfaceC9366GGcA03);
            if (interfaceC9366GGc != null) {
                return interfaceC9366GGc;
            }
        }
        return interfaceC9366GGcA03;
    }
}
