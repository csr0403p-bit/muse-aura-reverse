package X;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.Chd, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3946Chd {
    public final Handler A00;
    public final C3960Ci3 A01;
    public final AtomicReference<RunnableC3943ChZ> A02 = BV4.A15();

    public C3946Chd(Looper looper, C3960Ci3 c3960Ci3) {
        this.A01 = c3960Ci3;
        this.A00 = BV4.A09(looper);
    }
}
