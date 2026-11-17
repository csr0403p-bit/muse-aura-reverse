package X;

import java.net.SocketTimeoutException;

/* renamed from: X.Ebo, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6892Ebo extends C6903Ebz {
    public final /* synthetic */ C6878Eba A00;

    public C6892Ebo(C6878Eba c6878Eba) {
        this.A00 = c6878Eba;
    }

    public final void A09() {
        if (A08()) {
            throw new SocketTimeoutException("timeout");
        }
    }
}
