package X;

import android.app.Application;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class A6Z {
    public static final List<Class<?>> A00 = Arrays.asList(Application.class, A6N.class);
    public static final List<Class<?>> A01 = Collections.singletonList(A6N.class);

    public static final <T extends AEs> T A00(Class<T> cls, Constructor<T> constructor, Object... objArr) {
        try {
            return constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e) {
            throw new RuntimeException(AnonymousClass007.A0a("Failed to access ", cls), e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(AnonymousClass001.A0v(" cannot be instantiated.", C3cG.A0f(cls, "A ")), e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(AnonymousClass007.A0a("An exception happened in constructor of ", cls), e3.getCause());
        }
    }

    public static final <T> Constructor<T> A01(Class<T> cls, List<? extends Class<?>> list) {
        C7384Etj.A0Y(list, 1);
        Object[] constructors = cls.getConstructors();
        C7384Etj.A0U(constructors);
        for (Object obj : constructors) {
            Constructor<T> constructor = (Constructor<T>) obj;
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            C7384Etj.A0U(parameterTypes);
            List listA0G = BFI.A0G(parameterTypes);
            if (list.equals(listA0G)) {
                return constructor;
            }
            if (list.size() == listA0G.size() && listA0G.containsAll(list)) {
                StringBuilder sbA0x = C60O.A0x("Class ");
                sbA0x.append(cls.getSimpleName());
                throw C8j3.A18(AnonymousClass006.A0y(list, " must have parameters in the proper order: ", sbA0x));
            }
        }
        return null;
    }
}
