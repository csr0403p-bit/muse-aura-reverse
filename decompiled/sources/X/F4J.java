package X;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Date;

/* loaded from: classes5.dex */
public final class F4J implements EYY {
    public final int $t;

    public F4J(int i) {
        this.$t = i;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.EYY
    public final <T> AbstractC6735EXt<T> create(EYC eyc, C6753EYn<T> c6753EYn) {
        switch (this.$t) {
            case 0:
                Type type = c6753EYn.A02;
                boolean z = type instanceof GenericArrayType;
                if (z || ((type instanceof Class) && ((Class) type).isArray())) {
                    Type genericComponentType = z ? ((GenericArrayType) type).getGenericComponentType() : ((Class) type).getComponentType();
                    return new EYE(eyc, C6753EYn.A00(eyc, genericComponentType), AbstractC6754EYo.A00(genericComponentType));
                }
                return null;
            case 1:
                if (c6753EYn.A01 == Date.class) {
                    return new C6742EYc(AbstractC6745EYf.A00);
                }
                return null;
            case 2:
                Class<? super T> superclass = c6753EYn.A01;
                if (!Enum.class.isAssignableFrom(superclass) || superclass == Enum.class) {
                    return null;
                }
                if (!superclass.isEnum()) {
                    superclass = superclass.getSuperclass();
                }
                return new EYS(superclass);
            case 3:
                if (c6753EYn.A01 == java.sql.Date.class) {
                    return new EYa();
                }
                return null;
            case 4:
                if (c6753EYn.A01 == Time.class) {
                    return new C6741EYb();
                }
                return null;
            case 5:
                if (c6753EYn.A01 == Timestamp.class) {
                    return new C6744EYe(C6753EYn.A00(eyc, Date.class));
                }
                return null;
            default:
                return null;
        }
    }

    public final String toString() {
        return 1 - this.$t != 0 ? super.toString() : "DefaultDateTypeAdapter#DEFAULT_STYLE_FACTORY";
    }
}
