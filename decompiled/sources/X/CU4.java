package X;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes5.dex */
public abstract class CU4 {
    public List<Throwable> A00(Throwable th) {
        Object objInvoke;
        C7384Etj.A0Y(th, 0);
        Method method = CU8.A01;
        if (method == null || (objInvoke = method.invoke(th, null)) == null) {
            return C0881AGi.A00;
        }
        Object[] objArr = (Object[]) objInvoke;
        C7384Etj.A0Y(objArr, 0);
        return Arrays.asList(objArr);
    }

    public void A01(Throwable th, Throwable th2) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        AnonymousClass003.A0u(th, th2);
        Method method = CU8.A00;
        if (method != null) {
            method.invoke(th, th2);
        }
    }
}
