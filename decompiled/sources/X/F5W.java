package X;

import com.google.gson.JsonIOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.EnumMap;
import java.util.EnumSet;

/* loaded from: classes5.dex */
public final class F5W implements InterfaceC6739EXx {
    public final int $t;
    public final Object A00;

    public F5W(Object obj, int i) {
        this.$t = i;
        this.A00 = obj;
    }

    @Override // X.InterfaceC6739EXx
    public final Object A6t() {
        Method method;
        Object[] objArrA1a;
        switch (this.$t) {
            case 0:
                Class cls = (Class) this.A00;
                try {
                    C2L c2l = C2L.A00;
                    if (c2l instanceof BeA) {
                        throw C8j3.A18(AnonymousClass001.A0v(". Usage of JDK sun.misc.Unsafe is enabled, but it could not be used. Make sure your runtime is configured correctly.", C3cG.A0f(cls, "Cannot allocate ")));
                    }
                    if (c2l instanceof C2M) {
                        C2L.A00(cls);
                        method = ((C2M) c2l).A00;
                        objArrA1a = new Object[]{cls, Object.class};
                    } else {
                        if (!(c2l instanceof C2J)) {
                            C2K c2k = (C2K) c2l;
                            C2L.A00(cls);
                            return c2k.A01.invoke(c2k.A00, cls);
                        }
                        C2J c2j = (C2J) c2l;
                        C2L.A00(cls);
                        method = c2j.A01;
                        objArrA1a = BV5.A1a(cls, c2j.A00);
                    }
                    return method.invoke(null, objArrA1a);
                } catch (Exception e) {
                    throw BV4.A0d(AnonymousClass001.A0v(". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem.", C3cG.A0f(cls, "Unable to create instance of ")), e);
                }
            case 1:
                Type type = (Type) this.A00;
                if (!(type instanceof ParameterizedType)) {
                    throw new JsonIOException(BV4.A0k("Invalid EnumSet type: ", type));
                }
                Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
                if (type2 instanceof Class) {
                    return EnumSet.noneOf((Class) type2);
                }
                throw new JsonIOException(BV4.A0k("Invalid EnumSet type: ", type));
            case 2:
                Type type3 = (Type) this.A00;
                if (!(type3 instanceof ParameterizedType)) {
                    throw new JsonIOException(BV4.A0k("Invalid EnumMap type: ", type3));
                }
                Type type4 = ((ParameterizedType) type3).getActualTypeArguments()[0];
                if (type4 instanceof Class) {
                    return new EnumMap((Class) type4);
                }
                throw new JsonIOException(BV4.A0k("Invalid EnumMap type: ", type3));
            default:
                Constructor constructor = (Constructor) this.A00;
                try {
                    return constructor.newInstance(null);
                } catch (IllegalAccessException e2) {
                    throw BV4.A0d("Unexpected IllegalAccessException occurred (Gson 2.12.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e2);
                } catch (InstantiationException e3) {
                    throw BV4.A0d(FGI.A0U("Failed to invoke constructor '", EYR.A02(constructor), "' with no args"), e3);
                } catch (InvocationTargetException e4) {
                    throw BV4.A0d(FGI.A0U("Failed to invoke constructor '", EYR.A02(constructor), "' with no args"), e4.getCause());
                }
        }
    }
}
