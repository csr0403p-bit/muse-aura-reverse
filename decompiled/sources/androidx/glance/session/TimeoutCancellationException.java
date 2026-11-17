package androidx.glance.session;

import X.AnonymousClass006;
import X.C60O;
import java.util.concurrent.CancellationException;

/* loaded from: classes3.dex */
public final class TimeoutCancellationException extends CancellationException {
    public final int block;
    public final String message;

    @Override // java.lang.Throwable
    public final /* bridge */ /* synthetic */ Throwable fillInStackTrace() {
        return this;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.message;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("TimeoutCancellationException(");
        sbA0x.append(this.message);
        sbA0x.append(", ");
        sbA0x.append(this.block);
        return AnonymousClass006.A0z(sbA0x);
    }

    public TimeoutCancellationException(String str, int i) {
        super(str);
        this.message = str;
        this.block = i;
    }
}
