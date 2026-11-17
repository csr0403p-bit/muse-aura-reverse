package X;

import com.google.common.collect.Sets$UnmodifiableNavigableSet;
import java.util.Set;

/* renamed from: X.DNd, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC5001DNd<E> extends DNX<E> implements Set<E> {
    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object object) {
        if (object != this) {
            if (!(this instanceof Sets$UnmodifiableNavigableSet ? ((Sets$UnmodifiableNavigableSet) this).unmodifiableDelegate : ((DOS) this).A00.A00).equals(object)) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return (this instanceof Sets$UnmodifiableNavigableSet ? ((Sets$UnmodifiableNavigableSet) this).unmodifiableDelegate : ((DOS) this).A00.A00).hashCode();
    }
}
