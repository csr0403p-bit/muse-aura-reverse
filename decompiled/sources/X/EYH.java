package X;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;

/* loaded from: classes5.dex */
public final class EYH implements EYY {
    public final EYQ A00;

    @Override // X.EYY
    public final <T> AbstractC6735EXt<T> create(EYC eyc, C6753EYn<T> c6753EYn) {
        Type type = c6753EYn.A02;
        Class<? super T> cls = c6753EYn.A01;
        if (!Collection.class.isAssignableFrom(cls)) {
            return null;
        }
        Type typeA02 = AbstractC6754EYo.A02(cls, Collection.class, type);
        Class cls2 = typeA02 instanceof ParameterizedType ? ((ParameterizedType) typeA02).getActualTypeArguments()[0] : Object.class;
        return new C6736EXu(new EYL(eyc, C6753EYn.A00(eyc, cls2), cls2), this.A00.A01(c6753EYn));
    }

    public EYH(EYQ eyq) {
        this.A00 = eyq;
    }
}
