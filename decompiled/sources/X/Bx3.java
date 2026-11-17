package X;

import android.content.Context;
import android.os.Trace;
import androidx.startup.StartupException;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes5.dex */
public final class Bx3 {
    public static final Object A03 = C3cG.A0T();
    public static volatile Bx3 A04;
    public final Context A00;
    public final Set<Class<? extends Bx4<?>>> A02 = C60O.A13();
    public final Map<Class<?>, Object> A01 = BV4.A0u();

    public static Bx3 A00(Context context) {
        if (A04 == null) {
            synchronized (A03) {
                if (A04 == null) {
                    A04 = new Bx3(context);
                }
            }
        }
        return A04;
    }

    public Bx3(Context context) {
        this.A00 = context.getApplicationContext();
    }

    public static Object A01(Bx3 bx3, Class cls, Set set) {
        Object objA7V;
        if (Trace.isEnabled()) {
            try {
                AbstractC3136BzG.A00(cls.getSimpleName());
            } finally {
                Trace.endSection();
            }
        }
        if (set.contains(cls)) {
            throw BV5.A0W("Cannot initialize %s. Cycle detected.", new Object[]{cls.getName()});
        }
        Map<Class<?>, Object> map = bx3.A01;
        if (map.containsKey(cls)) {
            objA7V = map.get(cls);
        } else {
            set.add(cls);
            try {
                Bx4 bx4 = (Bx4) BV5.A0b(cls);
                List<Class<? extends Bx4<?>>> listA8o = bx4.A8o();
                if (!listA8o.isEmpty()) {
                    for (Class<? extends Bx4<?>> cls2 : listA8o) {
                        if (!map.containsKey(cls2)) {
                            A01(bx3, cls2, set);
                        }
                    }
                }
                objA7V = bx4.A7V(bx3.A00);
                set.remove(cls);
                map.put(cls, objA7V);
            } catch (Throwable th) {
                throw new StartupException(th);
            }
        }
        return objA7V;
    }
}
