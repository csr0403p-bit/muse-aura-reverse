package X;

import java.util.Set;

/* loaded from: classes5.dex */
public class DNB<E> extends DNY<E> implements Set<E> {
    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object object) {
        return DNa.A03(object, this);
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return DNa.A00(this);
    }
}
