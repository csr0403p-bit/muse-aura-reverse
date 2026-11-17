package X;

import java.util.Iterator;
import kotlin.jvm.functions.Function0;

/* renamed from: X.79x, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C79x<T> implements C3b6<T> {
    public final Function0<T> A00;
    public final G0U<T, T> A01;

    @Override // X.C3b6
    public final Iterator<T> iterator() {
        return new C8iC(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C79x(Function0<? extends T> function0, G0U<? super T, ? extends T> g0u) {
        this.A00 = function0;
        this.A01 = g0u;
    }
}
