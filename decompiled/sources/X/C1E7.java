package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.1E7, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1E7<T> implements C3Sn<T> {
    public final Map<T, Float> A00;

    @Override // X.C3Sn
    public final T A6U(float f) {
        Object next;
        Iterator itA0n = AnonymousClass002.A0n(this.A00);
        if (itA0n.hasNext()) {
            next = itA0n.next();
            if (itA0n.hasNext()) {
                float fAbs = Math.abs(f - AnonymousClass001.A02(((Map.Entry) next).getValue()));
                do {
                    Object next2 = itA0n.next();
                    float fAbs2 = Math.abs(f - AnonymousClass001.A02(((Map.Entry) next2).getValue()));
                    if (Float.compare(fAbs, fAbs2) > 0) {
                        next = next2;
                        fAbs = fAbs2;
                    }
                } while (itA0n.hasNext());
            }
        } else {
            next = null;
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return (T) entry.getKey();
        }
        return null;
    }

    @Override // X.C3Sn
    public final T A6V(float f, boolean z) {
        Object next;
        Iterator itA0n = AnonymousClass002.A0n(this.A00);
        if (itA0n.hasNext()) {
            next = itA0n.next();
            if (itA0n.hasNext()) {
                float fA02 = AnonymousClass001.A02(((Map.Entry) next).getValue());
                float f2 = z ? fA02 - f : f - fA02;
                if (f2 < 0.0f) {
                    f2 = Float.POSITIVE_INFINITY;
                }
                do {
                    Object next2 = itA0n.next();
                    float fA022 = AnonymousClass001.A02(((Map.Entry) next2).getValue());
                    float f3 = z ? fA022 - f : f - fA022;
                    if (f3 < 0.0f) {
                        f3 = Float.POSITIVE_INFINITY;
                    }
                    if (Float.compare(f2, f3) > 0) {
                        next = next2;
                        f2 = f3;
                    }
                } while (itA0n.hasNext());
            }
        } else {
            next = null;
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return (T) entry.getKey();
        }
        return null;
    }

    @Override // X.C3Sn
    public final float AQn() {
        Collection<Float> collectionValues = this.A00.values();
        C7384Etj.A0Y(collectionValues, 0);
        Iterator<Float> it = collectionValues.iterator();
        if (!it.hasNext()) {
            return Float.NaN;
        }
        float fA02 = AnonymousClass001.A02(it.next());
        while (it.hasNext()) {
            fA02 = Math.min(fA02, AnonymousClass001.A02(it.next()));
        }
        return Float.valueOf(fA02).floatValue();
    }

    @Override // X.C3Sn
    public final float AYD(T t) {
        Float f = this.A00.get(t);
        if (f != null) {
            return f.floatValue();
        }
        return Float.NaN;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1E7) {
            return this.A00.equals(((C1E7) obj).A00);
        }
        return false;
    }

    public final int hashCode() {
        return AnonymousClass005.A0E(this.A00);
    }

    public final String toString() {
        return AnonymousClass007.A0Z(this.A00, new StringBuilder("MapDraggableAnchors("));
    }

    public C1E7(Map<T, Float> map) {
        this.A00 = map;
    }
}
