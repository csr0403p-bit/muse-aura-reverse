package X;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/* renamed from: X.Dd6, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5194Dd6<T> extends FutureTask<C5195Dd7<T>> {
    public Dd5<T> A00;

    @Override // java.util.concurrent.FutureTask
    public final void done() {
        try {
            if (!isCancelled()) {
                try {
                    Dd5.A00(get(), this.A00);
                } catch (InterruptedException | ExecutionException e) {
                    Dd5.A00(new C5195Dd7(e), this.A00);
                }
            }
        } finally {
            this.A00 = null;
        }
    }
}
