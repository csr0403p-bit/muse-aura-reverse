package X;

/* renamed from: X.31u, reason: invalid class name */
/* loaded from: classes.dex */
public interface C31u<T, V> {
    /* JADX WARN: Multi-variable type inference failed */
    static Object A00(C31u c31u, InterfaceC7359EnW[] interfaceC7359EnWArr) {
        return c31u.getValue(null, interfaceC7359EnWArr[0]);
    }

    V getValue(T t, InterfaceC7359EnW<?> interfaceC7359EnW);

    /* JADX WARN: Multi-variable type inference failed */
    static boolean A01(Object obj, C31u c31u, InterfaceC7359EnW[] interfaceC7359EnWArr, int i) {
        return ((Boolean) c31u.getValue(obj, interfaceC7359EnWArr[i])).booleanValue();
    }
}
