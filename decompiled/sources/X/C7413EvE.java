package X;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: X.EvE, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7413EvE implements InvocationHandler {
    public final Object A00;

    public final boolean equals(Object obj) {
        Object obj2;
        if (obj == null) {
            return false;
        }
        if (obj instanceof C7413EvE) {
            obj2 = this.A00;
            obj = ((C7413EvE) obj).A00;
        } else {
            obj2 = this.A00;
        }
        return obj2.equals(obj);
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        Object obj2 = this.A00;
        try {
            return Class.forName(method.getDeclaringClass().getName(), true, obj2.getClass().getClassLoader()).getDeclaredMethod(method.getName(), method.getParameterTypes()).invoke(obj2, objArr);
        } catch (InvocationTargetException e) {
            throw e.getTargetException();
        } catch (ReflectiveOperationException e2) {
            throw BV4.A0d(AnonymousClass007.A0a("Reflection failed for method ", method), e2);
        }
    }

    public C7413EvE(Object obj) {
        this.A00 = obj;
    }
}
