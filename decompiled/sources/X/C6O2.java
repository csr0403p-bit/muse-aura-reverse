package X;

import androidx.datastore.preferences.core.Preferences;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.6O2, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6O2 extends Preferences {
    public final Map<C6JZ<?>, Object> A00;
    public final AtomicBoolean A01;

    public static void A00(C6O2 c6o2) {
        C7384Etj.A0Y(c6o2, 0);
        A01(c6o2);
        c6o2.A00.clear();
    }

    @Override // androidx.datastore.preferences.core.Preferences
    public final <T> T A06(C6JZ<T> c6jz) {
        C7384Etj.A0Y(c6jz, 0);
        return (T) this.A00.get(c6jz);
    }

    /* JADX WARN: Incorrect return type in method signature: <T:Ljava/lang/Object;>(LX/6JZ<TT;>;)TT; */
    public final void A07(C6JZ c6jz) {
        C7384Etj.A0Y(c6jz, 0);
        A01(this);
        this.A00.remove(c6jz);
    }

    public final <T> void A08(C6JZ<T> c6jz, T t) {
        C7384Etj.A0Y(c6jz, 0);
        A01(this);
        if (t == null) {
            A07(c6jz);
            return;
        }
        boolean z = t instanceof Set;
        Map<C6JZ<?>, Object> map = this.A00;
        if (z) {
            t = (T) Collections.unmodifiableSet(AbstractC0878AGe.A0g((Iterable) t));
        }
        map.put(c6jz, t);
    }

    public static final void A01(C6O2 c6o2) {
        if (c6o2.A01.get()) {
            throw C3cG.A0Q("Do mutate preferences once returned to DataStore.");
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C6O2) {
            return C7384Etj.areEqual(this.A00, ((C6O2) obj).A00);
        }
        return false;
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        return AbstractC0878AGe.A0L(",\n", "{\n", "\n}", this.A00.entrySet(), new C07338im(3));
    }

    public C6O2(Map<C6JZ<?>, Object> map, boolean z) {
        this.A00 = map;
        this.A01 = new AtomicBoolean(z);
    }

    public static void A02(C6O2 c6o2, C6JZ c6jz, boolean z) {
        c6o2.A08(c6jz, Boolean.valueOf(z));
    }

    public C6O2() {
        this(C3cG.A0j(), true);
    }
}
