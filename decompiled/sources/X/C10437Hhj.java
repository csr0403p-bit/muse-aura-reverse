package X;

import java.lang.reflect.GenericDeclaration;
import java.security.GeneralSecurityException;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Logger;

/* renamed from: X.Hhj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10437Hhj {
    public ConcurrentMap A00 = C60O.A1C();
    public ConcurrentMap<String, Boolean> A01 = C60O.A1C();
    public static final Logger A03 = BV5.A1B(C10437Hhj.class);
    public static final C10437Hhj A02 = new C10437Hhj();

    public final synchronized void A02(EnumC7335ElD enumC7335ElD, GKT gkt) throws GeneralSecurityException {
        if (!enumC7335ElD.A00()) {
            throw BV6.A0u("Cannot register key manager: FIPS compatibility insufficient");
        }
        try {
            String str = gkt.A03;
            ConcurrentMap<String, Boolean> concurrentMap = this.A01;
            if (concurrentMap.containsKey(str) && !AnonymousClass001.A1X(concurrentMap.get(str))) {
                throw BV6.A0u(FGI.A0M("New keys are already disallowed for key type ", str));
            }
            ConcurrentMap concurrentMap2 = this.A00;
            GKT gkt2 = (GKT) concurrentMap2.get(str);
            if (gkt2 != null) {
                Class<?> cls = gkt2.getClass();
                Class<?> cls2 = gkt.getClass();
                if (!cls.equals(cls2)) {
                    A03.warning(FGI.A0M("Attempted overwrite of a registered key manager for key type ", str));
                    throw AbstractC7609F5w.A0v("typeUrl (%s) is already registered with %s, cannot be re-registered with %s", new Object[]{str, cls.getName(), cls2.getName()});
                }
            }
            concurrentMap2.putIfAbsent(str, gkt);
            concurrentMap.put(str, true);
        } catch (Throwable th) {
        }
    }

    public final synchronized void A03(GKT gkt) {
        A02(EnumC7335ElD.A01, gkt);
    }

    /* JADX WARN: In static synchronized method top region not synchronized by class const: (r3v0 X.Hhj) */
    public static synchronized GKT A00(C10437Hhj c10437Hhj, String str) {
        GKT gkt;
        synchronized (c10437Hhj) {
            ConcurrentMap concurrentMap = c10437Hhj.A00;
            if (!concurrentMap.containsKey(str)) {
                throw BV6.A0u(FGI.A0U("No key manager found for key type ", str, ", see https://developers.google.com/tink/faq/registration_errors"));
            }
            gkt = (GKT) concurrentMap.get(str);
        }
        return gkt;
    }

    public final GKT A01(Class typeUrl, String primitiveClass) throws GeneralSecurityException {
        GKT gktA00 = A00(this, primitiveClass);
        GenericDeclaration genericDeclaration = gktA00.A02;
        if (genericDeclaration.equals(typeUrl)) {
            return gktA00;
        }
        StringBuilder sbA0x = C60O.A0x("Primitive type ");
        BV6.A18(typeUrl, sbA0x);
        sbA0x.append(" not supported by key manager of type ");
        sbA0x.append(gktA00.getClass());
        throw BV6.A0u(AnonymousClass006.A0y(genericDeclaration, ", which only supports: ", sbA0x));
    }
}
