package X;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public final class EYP<T> extends EYN<T, Object[]> {
    public static final Map<Class<?>, Object> A03;
    public final Constructor<T> A00;
    public final Map<String, Integer> A01;
    public final Object[] A02;

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.lang.Object[]] */
    @Override // X.EYN
    public final /* bridge */ /* synthetic */ Object[] A00() {
        return this.A02.clone();
    }

    static {
        HashMap mapA0u = BV4.A0u();
        mapA0u.put(Byte.TYPE, (byte) 0);
        mapA0u.put(Short.TYPE, (short) 0);
        C8j4.A1O(Integer.TYPE, mapA0u, 0);
        BV4.A1F(Long.TYPE, mapA0u, 0L);
        BV6.A1D(Float.TYPE, mapA0u, 0.0f);
        mapA0u.put(Double.TYPE, Double.valueOf(0.0d));
        mapA0u.put(Character.TYPE, (char) 0);
        BV4.A1G(Boolean.TYPE, mapA0u, false);
        A03 = mapA0u;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public EYP(EYW eyw, Class cls) throws NoSuchMethodException, SecurityException {
        super(eyw);
        this.A01 = BV4.A0u();
        Ev0 ev0 = EYR.A00;
        if (!(ev0 instanceof C7404Eui)) {
            throw C8j3.A18("Records are not supported on this JVM, this method should not be called");
        }
        C7404Eui c7404Eui = (C7404Eui) ev0;
        try {
            Method method = c7404Eui.A01;
            Object[] objArr = (Object[]) method.invoke(cls, null);
            int length = objArr.length;
            Class[] clsArr = new Class[length];
            for (int i = 0; i < length; i++) {
                clsArr[i] = c7404Eui.A02.invoke(objArr[i], null);
            }
            Constructor<T> declaredConstructor = cls.getDeclaredConstructor(clsArr);
            this.A00 = declaredConstructor;
            EYR.A04(declaredConstructor);
            try {
                Object[] objArr2 = (Object[]) method.invoke(cls, null);
                int length2 = objArr2.length;
                Object[] objArr3 = new String[length2];
                for (int i2 = 0; i2 < length2; i2++) {
                    objArr3[i2] = c7404Eui.A00.invoke(objArr2[i2], null);
                }
                for (int i3 = 0; i3 < length2; i3++) {
                    BV4.A1H(objArr3[i3], this.A01, i3);
                }
                Class<?>[] parameterTypes = this.A00.getParameterTypes();
                int length3 = parameterTypes.length;
                this.A02 = new Object[length3];
                for (int i4 = 0; i4 < length3; i4++) {
                    this.A02[i4] = A03.get(parameterTypes[i4]);
                }
            } catch (ReflectiveOperationException e) {
                throw BV4.A0d("Unexpected ReflectiveOperationException occurred (Gson 2.12.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e);
            }
        } catch (ReflectiveOperationException e2) {
            throw BV4.A0d("Unexpected ReflectiveOperationException occurred (Gson 2.12.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e2);
        }
    }
}
