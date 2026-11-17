package X;

import com.google.gson.JsonIOException;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.MalformedJsonException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Map;

/* loaded from: classes5.dex */
public abstract class EYN<T, A> extends AbstractC6735EXt<T> {
    public final EYW A00;

    public A A00() {
        return ((EYT) this).A00.A6t();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.reflect.AccessibleObject] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object] */
    @Override // X.AbstractC6735EXt
    public final void write(C6733EXr c6733EXr, T t) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        T t2;
        if (t == null) {
            c6733EXr.A0B();
            return;
        }
        c6733EXr.A08();
        try {
            for (EYU eyu : this.A00.A00) {
                ?? Invoke = eyu.A06;
                if (Invoke != 0) {
                    try {
                        Invoke = Invoke.invoke(t, null);
                        t2 = Invoke;
                    } catch (InvocationTargetException e) {
                        throw new JsonIOException(FGI.A0U("Accessor ", EYR.A01(Invoke), " threw exception"), e.getCause());
                    }
                } else {
                    t2 = eyu.A02.get(t);
                }
                if (t2 != t) {
                    c6733EXr.A0G(eyu.A01);
                    eyu.A04.write(c6733EXr, t2);
                }
            }
            c6733EXr.A0A();
        } catch (IllegalAccessException e2) {
            throw BV4.A0d("Unexpected IllegalAccessException occurred (Gson 2.12.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e2);
        }
    }

    public EYN(EYW eyw) {
        this.A00 = eyw;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v4, types: [T, java.lang.Object] */
    @Override // X.AbstractC6735EXt
    public final T read(EY1 ey1) throws MalformedJsonException, IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        if (ey1.A0R() == C79.A0Z) {
            ey1.A0a();
            return null;
        }
        A aA00 = A00();
        Map<String, EYU> map = this.A00.A01;
        try {
            ey1.A0X();
            while (ey1.A0c()) {
                EYU eyu = map.get(ey1.A0U());
                if (eyu == null) {
                    ey1.A0b();
                } else if (this instanceof EYP) {
                    EYP eyp = (EYP) this;
                    Object[] objArr = (Object[]) aA00;
                    Map<String, Integer> map2 = eyp.A01;
                    String str = eyu.A00;
                    Number numberA0b = BV4.A0b(str, map2);
                    if (numberA0b == null) {
                        throw C3cG.A0Q(FGI.A0h("Could not find the index in the constructor '", EYR.A02(eyp.A00), "' for field with name '", str, "', unable to determine which argument in the constructor the field corresponds to. This is unexpected behavior, as we expect the RecordComponents to have the same names as the fields in the Java class, and that the order of the RecordComponents is the same as the order of the canonical constructor parameters."));
                    }
                    int iIntValue = numberA0b.intValue();
                    Object obj = eyu.A03.read(ey1);
                    if (obj == null && eyu.A07) {
                        throw new JsonParseException(FGI.A0d("null is not allowed as value for record component '", str, "' of primitive type; at path ", ey1.A0S()));
                    }
                    objArr[iIntValue] = obj;
                } else {
                    Object obj2 = eyu.A03.read(ey1);
                    if (obj2 != null || !eyu.A07) {
                        if (eyu.A08) {
                            throw new JsonIOException(FGI.A0M("Cannot set value of 'static final' ", EYR.A01(eyu.A02)));
                        }
                        eyu.A02.set(aA00, obj2);
                    }
                }
            }
            ey1.A0Z();
            if (!(this instanceof EYP)) {
                return aA00;
            }
            EYP eyp2 = (EYP) this;
            T tNewInstance = (T) ((Object[]) aA00);
            try {
                tNewInstance = eyp2.A00.newInstance(tNewInstance);
                return tNewInstance;
            } catch (IllegalAccessException e) {
                throw BV4.A0d("Unexpected IllegalAccessException occurred (Gson 2.12.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e);
            } catch (IllegalArgumentException | InstantiationException e2) {
                throw BV4.A0d(FGI.A0d("Failed to invoke constructor '", EYR.A02(eyp2.A00), "' with args ", Arrays.toString(tNewInstance)), e2);
            } catch (InvocationTargetException e3) {
                throw BV4.A0d(FGI.A0d("Failed to invoke constructor '", EYR.A02(eyp2.A00), "' with args ", Arrays.toString(tNewInstance)), e3.getCause());
            }
        } catch (IllegalAccessException e4) {
            throw BV4.A0d("Unexpected IllegalAccessException occurred (Gson 2.12.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e4);
        } catch (IllegalStateException e5) {
            throw new JsonSyntaxException(e5);
        }
    }
}
