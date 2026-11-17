package X;

import android.content.Context;
import android.os.Build;

/* renamed from: X.C6q, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3267C6q {
    public final Context A01;
    public C6I A00 = null;
    public volatile boolean A02 = false;

    public final C6I A00(int i) {
        C6I c6i;
        if (this.A02) {
            return this.A00;
        }
        synchronized (this) {
            if (this.A02) {
                c6i = this.A00;
            } else if (Build.VERSION.SDK_INT >= 30) {
                this.A00 = C6I.A00(this.A01, i, true);
                this.A02 = true;
                c6i = this.A00;
            } else {
                this.A02 = true;
                c6i = null;
            }
        }
        return c6i;
    }

    public C3267C6q(Context context) {
        this.A01 = context;
    }
}
