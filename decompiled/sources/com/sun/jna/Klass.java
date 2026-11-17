package com.sun.jna;

import X.AnonymousClass006;
import X.BV4;
import X.BV5;
import X.C3cG;
import X.F60;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes5.dex */
public abstract class Klass {
    public static <T> T newInstance(Class<T> cls) throws Throwable {
        try {
            return (T) BV5.A0b(cls);
        } catch (IllegalAccessException | IllegalArgumentException | InstantiationException | NoSuchMethodException | SecurityException e) {
            throw BV4.A0Q(AnonymousClass006.A0y(e, ", requires a public no-arg constructor: ", C3cG.A0f(cls, "Can't create an instance of ")), e);
        } catch (InvocationTargetException e2) {
            if (e2.getCause() instanceof RuntimeException) {
                throw e2.getCause();
            }
            throw BV4.A0Q(AnonymousClass006.A0y(e2, ", requires a public no-arg constructor: ", C3cG.A0f(cls, "Can't create an instance of ")), e2);
        }
    }

    public Klass() {
        throw F60.createAndThrow();
    }
}
