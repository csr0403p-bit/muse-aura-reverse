package X;

import com.google.firebase.components.DependencyException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes5.dex */
public final class CUP extends CUL {
    public final CUL A00;
    public final Set<Class<?>> A01;
    public final Set<Class<?>> A02;
    public final Set<Class<?>> A03;
    public final Set<Class<?>> A04;
    public final Set<Class<?>> A05;
    public final Set<Class<?>> A06;

    @Override // X.CUL
    public final <T> T A02(Class<T> cls) {
        if (!this.A04.contains(cls)) {
            throw new DependencyException(String.format("Attempting to request an undeclared dependency %s.", cls));
        }
        T t = (T) this.A00.A02(cls);
        if (!cls.equals(CTQ.class)) {
            return t;
        }
        return (T) new CUV((CTQ) t, this.A05);
    }

    @Override // X.CUL
    public final <T> Set<T> A03(Class<T> cls) {
        if (this.A06.contains(cls)) {
            return this.A00.A03(cls);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Set<%s>.", cls));
    }

    public CUP(CUL cul, C3565CUi c3565CUi) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        for (C3567CUm c3567CUm : c3565CUi.A03) {
            if (c3567CUm.A00 == 0) {
                boolean z = c3567CUm.A01 == 2;
                Class<?> cls = c3567CUm.A02;
                if (z) {
                    hashSet4.add(cls);
                } else {
                    hashSet.add(cls);
                }
            } else {
                boolean z2 = c3567CUm.A01 == 2;
                Class<?> cls2 = c3567CUm.A02;
                if (z2) {
                    hashSet5.add(cls2);
                } else {
                    hashSet2.add(cls2);
                }
            }
        }
        Set<Class<?>> set = c3565CUi.A05;
        if (!set.isEmpty()) {
            hashSet.add(CTQ.class);
        }
        this.A04 = Collections.unmodifiableSet(hashSet);
        this.A01 = Collections.unmodifiableSet(hashSet2);
        this.A03 = Collections.unmodifiableSet(hashSet3);
        this.A06 = Collections.unmodifiableSet(hashSet4);
        this.A02 = Collections.unmodifiableSet(hashSet5);
        this.A05 = set;
        this.A00 = cul;
    }
}
