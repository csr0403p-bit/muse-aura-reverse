package X;

import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes6.dex */
public final class GHP {
    public static final GHP A02 = new GHP();
    public final ConcurrentMap<Class<?>, GHV<?>> A00 = C60O.A1C();
    public final GHZ A01 = new GHZ();

    public final <T> GHV<T> A00(Class<T> cls) {
        C9396GHl c9396GHl;
        C9303GDf c9303GDf;
        GHT<?, ?> ght;
        C10605Hyc c10605Hyc;
        GHT<?, ?> ght2;
        C9395GHk<?> c9395GHk;
        Class<?> cls2;
        Charset charset = AbstractC9352GFl.A04;
        if (cls == null) {
            throw BV4.A0a("messageType");
        }
        ConcurrentMap<Class<?>, GHV<?>> concurrentMap = this.A00;
        GHV<T> ghvA0C = (GHV) concurrentMap.get(cls);
        if (ghvA0C == null) {
            GHZ ghz = this.A01;
            GHT<?, ?> ght3 = GHL.A01;
            if (!GHM.class.isAssignableFrom(cls) && (cls2 = GHL.A02) != null && !cls2.isAssignableFrom(cls)) {
                throw C60O.A0i("Message classes must extend GeneratedMessage or GeneratedMessageLite");
            }
            GHb gHbAQm = ghz.A00.AQm(cls);
            int i = gHbAQm.A00;
            int i2 = i & 2;
            boolean zIsAssignableFrom = GHM.class.isAssignableFrom(cls);
            if (i2 == 2) {
                if (zIsAssignableFrom) {
                    ght2 = GHL.A01;
                    c9395GHk = AbstractC9387GHc.A01;
                } else {
                    ght2 = GHL.A00;
                    c9395GHk = AbstractC9387GHc.A00;
                    if (c9395GHk == null) {
                        throw C3cG.A0Q("Protobuf runtime is not correctly loaded.");
                    }
                }
                ghvA0C = new GHO<>(c9395GHk, gHbAQm.A01, ght2);
            } else {
                if (AnonymousClass002.A1L(zIsAssignableFrom ? 1 : 0)) {
                    c9396GHl = AbstractC9389GHe.A01;
                    c9303GDf = AbstractC9388GHd.A01;
                    ght = GHL.A01;
                    c9395GHk = AbstractC7611F5y.A0T(i).intValue() != 1 ? AbstractC9387GHc.A01 : null;
                    c10605Hyc = HjX.A01;
                } else {
                    c9396GHl = AbstractC9389GHe.A00;
                    c9303GDf = AbstractC9388GHd.A00;
                    ght = GHL.A00;
                    if (AbstractC7611F5y.A0T(i).intValue() != 1 && (c9395GHk = AbstractC9387GHc.A00) == null) {
                        throw C3cG.A0Q("Protobuf runtime is not correctly loaded.");
                    }
                    c10605Hyc = HjX.A00;
                }
                ghvA0C = GHK.A0C(c9395GHk, c9303GDf, c10605Hyc, c9396GHl, gHbAQm, ght);
            }
            GHV<T> ghv = (GHV) concurrentMap.putIfAbsent(cls, ghvA0C);
            if (ghv != null) {
                return ghv;
            }
        }
        return ghvA0C;
    }
}
