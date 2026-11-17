package X;

import java.lang.annotation.Annotation;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: X.Gmk, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9971Gmk implements InterfaceC10076Gox {
    public HashMap<Class<?>, Annotation> A00;

    public static C9971Gmk A00(C9971Gmk c9971Gmk, C9971Gmk c9971Gmk2) {
        HashMap<Class<?>, Annotation> map;
        HashMap<Class<?>, Annotation> map2;
        if (c9971Gmk == null || (map = c9971Gmk.A00) == null || map.isEmpty()) {
            return c9971Gmk2;
        }
        if (c9971Gmk2 == null || (map2 = c9971Gmk2.A00) == null || map2.isEmpty()) {
            return c9971Gmk;
        }
        HashMap<Class<?>, Annotation> mapA0u = BV4.A0u();
        Iterator itA0x = BV5.A0x(map2);
        while (itA0x.hasNext()) {
            Annotation annotation = (Annotation) itA0x.next();
            mapA0u.put(annotation.annotationType(), annotation);
        }
        Iterator itA0x2 = BV5.A0x(c9971Gmk.A00);
        while (itA0x2.hasNext()) {
            Annotation annotation2 = (Annotation) itA0x2.next();
            mapA0u.put(annotation2.annotationType(), annotation2);
        }
        C9971Gmk c9971Gmk3 = new C9971Gmk();
        c9971Gmk3.A00 = mapA0u;
        return c9971Gmk3;
    }

    @Override // X.InterfaceC10076Gox
    public final <A extends Annotation> A AC0(Class<A> cls) {
        HashMap<Class<?>, Annotation> map = this.A00;
        if (map == null) {
            return null;
        }
        return (A) map.get(cls);
    }

    @Override // X.InterfaceC10076Gox
    public final boolean AND(Class<? extends Annotation>[] clsArr) {
        if (this.A00 == null) {
            return false;
        }
        for (Class<? extends Annotation> cls : clsArr) {
            if (this.A00.containsKey(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC10076Gox
    public final int size() {
        HashMap<Class<?>, Annotation> map = this.A00;
        if (map == null) {
            return 0;
        }
        return map.size();
    }

    public final String toString() {
        HashMap<Class<?>, Annotation> map = this.A00;
        return map == null ? "[null]" : map.toString();
    }
}
