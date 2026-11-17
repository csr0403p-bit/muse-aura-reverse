package X;

import java.util.function.Function;

/* loaded from: classes6.dex */
public final class G9d<T, R> implements Function {
    public static final G9d<T, R> A00 = new G9d<>();

    @Override // java.util.function.Function
    public final /* bridge */ /* synthetic */ Object apply(Object obj) throws IllegalAccessException, IllegalArgumentException {
        Class cls = (Class) obj;
        C7384Etj.A0Y(cls, 0);
        try {
            Object obj2 = cls.getDeclaredField("CONVERTER").get(null);
            return obj2 == null ? G9e.A00 : obj2;
        } catch (NoSuchFieldException unused) {
            return G9e.A00;
        }
    }
}
