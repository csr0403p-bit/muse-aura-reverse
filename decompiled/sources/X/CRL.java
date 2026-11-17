package X;

import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: classes5.dex */
public abstract class CRL extends CR8 implements ListenableFuture {
    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.a instanceof CRI;
    }
}
