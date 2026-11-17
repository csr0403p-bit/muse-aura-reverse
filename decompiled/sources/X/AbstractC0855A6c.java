package X;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;

/* renamed from: X.A6c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC0855A6c {
    public static final <T extends AEs> T A00(Class<T> cls) throws IllegalAccessException, NoSuchMethodException, InstantiationException, SecurityException, IllegalArgumentException, InvocationTargetException {
        try {
            Constructor<T> declaredConstructor = cls.getDeclaredConstructor(null);
            if (!Modifier.isPublic(declaredConstructor.getModifiers())) {
                throw new RuntimeException(AnonymousClass007.A0a("Cannot create an instance of ", cls));
            }
            try {
                T tNewInstance = declaredConstructor.newInstance(null);
                C7384Etj.A0X(tNewInstance);
                return tNewInstance;
            } catch (IllegalAccessException e) {
                throw new RuntimeException(AnonymousClass007.A0a("Cannot create an instance of ", cls), e);
            } catch (InstantiationException e2) {
                throw new RuntimeException(AnonymousClass007.A0a("Cannot create an instance of ", cls), e2);
            }
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException(AnonymousClass007.A0a("Cannot create an instance of ", cls), e3);
        }
    }
}
