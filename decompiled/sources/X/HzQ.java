package X;

import kotlinx.coroutines.flow.internal.ChildCancelledException;

/* loaded from: classes6.dex */
public final class HzQ<T> extends GAk<T> {
    @Override // X.GBM
    public final boolean A0S(Throwable th) {
        if (th instanceof ChildCancelledException) {
            return true;
        }
        return A0Q(th);
    }
}
