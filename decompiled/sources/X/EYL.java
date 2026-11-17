package X;

import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* loaded from: classes5.dex */
public final class EYL<T> extends AbstractC6735EXt<T> {
    public final EYC A00;
    public final AbstractC6735EXt<T> A01;
    public final Type A02;

    @Override // X.AbstractC6735EXt
    public final T read(EY1 ey1) {
        return this.A01.read(ey1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.reflect.Type] */
    @Override // X.AbstractC6735EXt
    public final void write(C6733EXr c6733EXr, T t) {
        AbstractC6735EXt<T> abstractC6735EXtA00 = this.A01;
        ?? r2 = this.A02;
        Class<?> cls = r2;
        if (t != null && ((r2 instanceof Class) || (r2 instanceof TypeVariable))) {
            cls = t.getClass();
        }
        if (cls != r2) {
            abstractC6735EXtA00 = C6753EYn.A00(this.A00, cls);
            if (abstractC6735EXtA00 instanceof EYN) {
                AbstractC6735EXt<T> abstractC6735EXt = abstractC6735EXtA00;
                while (abstractC6735EXt instanceof AbstractC6748EYi) {
                    AbstractC6735EXt<T> abstractC6735EXt2 = ((EYM) ((AbstractC6748EYi) abstractC6735EXt)).A00;
                    if (abstractC6735EXt2 == null) {
                        throw C3cG.A0Q("Adapter for type with cyclic dependency has been used before dependency has been resolved");
                    }
                    if (abstractC6735EXt2 == abstractC6735EXt) {
                        break;
                    } else {
                        abstractC6735EXt = abstractC6735EXt2;
                    }
                }
                if (!(abstractC6735EXt instanceof EYN)) {
                    abstractC6735EXtA00 = abstractC6735EXtA00;
                }
            }
        }
        abstractC6735EXtA00.write(c6733EXr, t);
    }

    public EYL(EYC eyc, AbstractC6735EXt<T> abstractC6735EXt, Type type) {
        this.A00 = eyc;
        this.A01 = abstractC6735EXt;
        this.A02 = type;
    }
}
