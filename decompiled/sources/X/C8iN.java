package X;

import java.util.Iterator;

/* renamed from: X.8iN, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C8iN implements C3b6 {
    public final int $t;
    public final Object A00;

    public C8iN(Object obj, int i) {
        this.$t = i;
        this.A00 = obj;
    }

    @Override // X.C3b6
    public final Iterator<T> iterator() {
        return this.$t != 0 ? new C7BD((CharSequence) this.A00) : ((Iterable) this.A00).iterator();
    }
}
