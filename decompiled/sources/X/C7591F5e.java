package X;

import java.util.Enumeration;
import java.util.Iterator;

/* renamed from: X.F5e, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7591F5e implements Iterator, BOA {
    public final int $t = 0;
    public final Object A00;

    public C7591F5e(B0o b0o) {
        this.A00 = b0o.A08.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.$t != 0 ? ((Enumeration) this.A00).hasMoreElements() : ((Iterator) this.A00).hasNext();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [T, java.lang.Object] */
    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ T next() {
        return this.$t != 0 ? ((Enumeration) this.A00).nextElement() : ((Iterator) this.A00).next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.$t;
        throw C8j3.A18(C8j2.A00(0));
    }

    public C7591F5e(Enumeration<T> enumeration) {
        this.A00 = enumeration;
    }
}
