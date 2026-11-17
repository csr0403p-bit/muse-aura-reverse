package X;

import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* renamed from: X.CPp, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3481CPp<V> {
    public final ImmutableList<ListenableFuture<? extends V>> A00;

    public final ListenableFuture<?> A00(final Runnable combiner, Executor executor) {
        CallableC7565F4e callableC7565F4e = new CallableC7565F4e(7, this, combiner);
        CPn cPn = new CPn(this.A00, false, false);
        cPn.A00 = new CPq(cPn, callableC7565F4e, executor);
        cPn.A04();
        return cPn;
    }

    public C3481CPp(ImmutableList immutableList) {
        this.A00 = immutableList;
    }
}
