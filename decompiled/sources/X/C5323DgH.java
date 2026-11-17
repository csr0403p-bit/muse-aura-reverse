package X;

import java.io.Serializable;

/* renamed from: X.DgH, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5323DgH<T> implements F0C<T>, Serializable {
    public final T value;

    @Override // X.F0C
    public final boolean AOX() {
        return true;
    }

    @Override // X.F0C
    public final T getValue() {
        return this.value;
    }

    public final String toString() {
        return String.valueOf(this.value);
    }

    public C5323DgH(T t) {
        this.value = t;
    }
}
