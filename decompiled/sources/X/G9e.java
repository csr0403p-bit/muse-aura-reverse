package X;

import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes6.dex */
public abstract class G9e {
    public static final Object A00 = C3cG.A0T();
    public static final ConcurrentHashMap<Class<?>, Object> A01 = C60O.A1C();

    public static final <T> G50<T> A00(Class<T> cls) {
        C7384Etj.A0Y(cls, 0);
        Object objComputeIfAbsent = A01.computeIfAbsent(cls, G9d.A00);
        C7384Etj.A0U(objComputeIfAbsent);
        if (objComputeIfAbsent == A00) {
            return null;
        }
        return (G50) objComputeIfAbsent;
    }
}
