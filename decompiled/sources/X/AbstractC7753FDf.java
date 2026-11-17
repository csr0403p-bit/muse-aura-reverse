package X;

import java.util.concurrent.CancellationException;

/* renamed from: X.FDf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract /* synthetic */ class AbstractC7753FDf {
    /* JADX WARN: Incorrect types in method signature: (LX/HxV<*>;Ljava/lang/Throwable;)V */
    public static final void A00(Throwable th, HxV hxV) {
        CancellationException cancellationException;
        if (!(th instanceof CancellationException) || (cancellationException = (CancellationException) th) == null) {
            cancellationException = new CancellationException("Channel was consumed, consumer had failed");
            cancellationException.initCause(th);
        }
        hxV.A5w(cancellationException);
    }
}
