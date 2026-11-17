package kotlinx.coroutines;

import X.AnonymousClass006;
import X.C3cG;
import X.C78T;
import X.GBK;

/* loaded from: classes6.dex */
public final class DispatchException extends Exception {
    public final Throwable cause;

    public DispatchException(Throwable th, C78T c78t, GBK gbk) {
        super(AnonymousClass006.A0y(c78t, " threw an exception, context = ", C3cG.A0f(gbk, "Coroutine dispatcher ")), th);
        this.cause = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.cause;
    }
}
