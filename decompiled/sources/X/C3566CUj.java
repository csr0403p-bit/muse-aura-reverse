package X;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.CUj, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3566CUj<T> {
    public int A00;
    public int A01;
    public CUY<T> A02;
    public Set<Class<?>> A03;
    public final Set<C3567CUm> A04;
    public final Set<Class<? super T>> A05;

    public static C3566CUj A00(Class cls) {
        return new C3566CUj(cls, new Class[0]);
    }

    public static void A02(C3566CUj c3566CUj, Class cls, int i) {
        c3566CUj.A04(new C3567CUm(cls, i, 0));
    }

    public static C3565CUi A01(C3566CUj c3566CUj, CUY cuy) {
        c3566CUj.A02 = cuy;
        return c3566CUj.A03();
    }

    public final C3565CUi<T> A03() {
        if (this.A02 != null) {
            return new C3565CUi<>(this.A02, new HashSet(this.A05), new HashSet(this.A04), this.A03, this.A00, this.A01);
        }
        throw new IllegalStateException("Missing required property: factory.");
    }

    /* JADX WARN: Incorrect return type in method signature: (LX/CUm;)LX/CUj<TT;>; */
    public final void A04(C3567CUm c3567CUm) {
        if (!(!this.A05.contains(c3567CUm.A02))) {
            throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
        }
        this.A04.add(c3567CUm);
    }

    public C3566CUj(Class<T> cls, Class<? super T>... clsArr) {
        HashSet hashSet = new HashSet();
        this.A05 = hashSet;
        this.A04 = new HashSet();
        this.A00 = 0;
        this.A01 = 0;
        this.A03 = new HashSet();
        hashSet.add(cls);
        for (Class<? super T> cls2 : clsArr) {
            if (cls2 == null) {
                throw new NullPointerException("Null interface");
            }
        }
        Collections.addAll(this.A05, clsArr);
    }
}
