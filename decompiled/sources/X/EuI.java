package X;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Deprecated;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public abstract class EuI implements InterfaceC7542F0w {
    public static volatile boolean A01;
    public final ConcurrentHashMap<Class<?>, F0C<Object>> A00 = C60O.A1C();

    public final <T> T A03(Class<T> cls, Function0<? extends T> function0) {
        C5322DgG c5322DgG;
        C7384Etj.A0Y(function0, 1);
        ConcurrentHashMap<Class<?>, F0C<Object>> concurrentHashMap = this.A00;
        F0C<Object> f0cPutIfAbsent = concurrentHashMap.get(cls);
        if (f0cPutIfAbsent == null && (f0cPutIfAbsent = concurrentHashMap.putIfAbsent(cls, (c5322DgG = new C5322DgG(null, function0)))) == null) {
            f0cPutIfAbsent = c5322DgG;
        }
        return (T) f0cPutIfAbsent.getValue();
    }

    @Deprecated(message = "Use getScopedClassIfExists<ClassName>()")
    public final <T> T A02(Class<T> cls) {
        F0C<Object> f0c = this.A00.get(cls);
        if (f0c != null) {
            return (T) f0c.getValue();
        }
        return null;
    }

    public final void A04() {
        InterfaceC7549F2g interfaceC7549F2g;
        if (A01) {
            Iterator itA0x = BV5.A0x(this.A00);
            while (itA0x.hasNext()) {
                F0C f0c = (F0C) C7384Etj.A0F(itA0x);
                if (f0c.AOX()) {
                    Object value = f0c.getValue();
                    if ((value instanceof InterfaceC7549F2g) && (interfaceC7549F2g = (InterfaceC7549F2g) value) != null) {
                        interfaceC7549F2g.clearUserData();
                    }
                }
            }
        }
        this.A00.clear();
    }
}
