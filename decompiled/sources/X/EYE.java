package X;

import com.google.gson.stream.MalformedJsonException;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;

/* loaded from: classes5.dex */
public final class EYE<E> extends AbstractC6735EXt<Object> {
    public static final EYY A02 = new F4J(0);
    public final AbstractC6735EXt<E> A00;
    public final Class<E> A01;

    @Override // X.AbstractC6735EXt
    public final void write(C6733EXr c6733EXr, Object obj) throws IOException, ArrayIndexOutOfBoundsException, IllegalArgumentException {
        if (obj == null) {
            c6733EXr.A0B();
            return;
        }
        c6733EXr.A07();
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            this.A00.write(c6733EXr, Array.get(obj, i));
        }
        c6733EXr.A09();
    }

    public EYE(EYC eyc, AbstractC6735EXt<E> abstractC6735EXt, Class<E> cls) {
        this.A00 = new EYL(eyc, abstractC6735EXt, cls);
        this.A01 = cls;
    }

    @Override // X.AbstractC6735EXt
    public final Object read(EY1 ey1) throws MalformedJsonException, ArrayIndexOutOfBoundsException, IllegalArgumentException, NegativeArraySizeException {
        if (ey1.A0R() == C79.A0Z) {
            ey1.A0a();
            return null;
        }
        ArrayList arrayListA0h = C3cG.A0h();
        ey1.A0W();
        while (ey1.A0c()) {
            arrayListA0h.add(this.A00.read(ey1));
        }
        ey1.A0Y();
        int size = arrayListA0h.size();
        Class<E> cls = this.A01;
        if (!cls.isPrimitive()) {
            return arrayListA0h.toArray((Object[]) Array.newInstance((Class<?>) cls, size));
        }
        Object objNewInstance = Array.newInstance((Class<?>) cls, size);
        for (int i = 0; i < size; i++) {
            Array.set(objNewInstance, i, arrayListA0h.get(i));
        }
        return objNewInstance;
    }
}
