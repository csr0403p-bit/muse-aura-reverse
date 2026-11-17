package X;

import java.util.Iterator;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class AbK<T> implements Iterable<C2273BRq<? extends T>>, BOA {
    public final Function0<Iterator<T>> A00;

    @Override // java.lang.Iterable
    public final Iterator<C2273BRq<T>> iterator() {
        return new AbA(this.A00.invoke());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AbK(Function0<? extends Iterator<? extends T>> function0) {
        this.A00 = function0;
    }
}
