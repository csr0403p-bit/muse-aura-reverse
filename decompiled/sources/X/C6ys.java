package X;

import java.io.Serializable;

/* renamed from: X.6ys, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6ys implements C78T, Serializable {
    public static final C6ys A00 = new C6ys();
    public static final long serialVersionUID = 0;

    @Override // X.C78T
    public final C78T plus(C78T c78t) {
        C7384Etj.A0Y(c78t, 0);
        return c78t;
    }

    private final Object readResolve() {
        return A00;
    }

    @Override // X.C78T
    public final <E extends C78X> E get(C78I<E> c78i) {
        return null;
    }

    public final int hashCode() {
        return 0;
    }

    @Override // X.C78T
    public final C78T minusKey(C78I<?> c78i) {
        return this;
    }

    public final String toString() {
        return "EmptyCoroutineContext";
    }

    @Override // X.C78T
    public final <R> R fold(R r, G0V<? super R, ? super C78X, ? extends R> g0v) {
        return r;
    }
}
