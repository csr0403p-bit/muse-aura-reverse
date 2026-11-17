package X;

import android.os.Trace;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: X.C2o, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3190C2o {
    public static final long A00;
    public static final Method A01;
    public static final Method A02;
    public static volatile boolean A03;

    static {
        boolean z;
        Class<?> cls;
        Method method;
        Method method2;
        Field field;
        try {
            cls = Long.TYPE;
            method = Trace.class.getMethod("isTagEnabled", cls);
            method2 = Trace.class.getMethod("setAppTracingAllowed", Boolean.TYPE);
            field = Trace.class.getField("TRACE_TAG_APP");
        } catch (IllegalAccessException | NoSuchFieldException | NoSuchMethodException unused) {
        }
        if (field.getType() == cls) {
            long j = field.getLong(null);
            A01 = method;
            A02 = method2;
            A00 = j;
            z = true;
        } else {
            z = false;
        }
        A03 = z;
    }

    public static Object A00(Method method, Object... objArr) {
        Object objInvoke = null;
        try {
            objInvoke = method.invoke(null, objArr);
            return objInvoke;
        } catch (IllegalAccessException e) {
            BzX.A00("TraceInternal", "Failed to invoke Trace method", e);
            A03 = false;
            return objInvoke;
        } catch (InvocationTargetException e2) {
            Throwable targetException = e2.getTargetException();
            if ((targetException instanceof RuntimeException) || (targetException instanceof Error)) {
                throw targetException;
            }
            return objInvoke;
        }
    }
}
