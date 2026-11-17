package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.AGu, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0893AGu<T> extends AH7<T> {
    public final List<T> A00;

    @Override // X.AH7, X.AbstractC0890AGr, java.util.Collection, java.lang.Iterable
    public final Iterator<T> iterator() {
        return listIterator(0);
    }

    @Override // X.AbstractC0890AGr
    public final int A0D() {
        return this.A00.size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0893AGu(List<? extends T> list) {
        this.A00 = list;
    }
}
