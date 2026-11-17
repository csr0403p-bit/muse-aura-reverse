package X;

import java.security.GeneralSecurityException;
import java.util.Map;

/* loaded from: classes6.dex */
public final class GL8 {
    public final Map<C10478Hks, GLE<?, ?>> A00;
    public final Map<Class<?>, GKY<?, ?>> A01;

    public GL8(Map map, Map map2) {
        this.A00 = BV4.A0w(map);
        this.A01 = BV4.A0w(map2);
    }

    public final <KeyT extends AbstractC9465GKh, PrimitiveT> PrimitiveT A00(KeyT keyt, Class<PrimitiveT> cls) throws GeneralSecurityException {
        C10478Hks c10478Hks = new C10478Hks(keyt.getClass(), cls);
        Map<C10478Hks, GLE<?, ?>> map = this.A00;
        if (map.containsKey(c10478Hks)) {
            return (PrimitiveT) map.get(c10478Hks).A02.A6u(keyt);
        }
        throw AbstractC7610F5x.A14(" available, see https://developers.google.com/tink/faq/registration_errors", C3cG.A0f(c10478Hks, "No PrimitiveConstructor for "));
    }
}
