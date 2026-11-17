package X;

import android.os.Build;

/* loaded from: classes5.dex */
public final class E9b {
    public final E9X A00;
    public final boolean A01 = BV5.A1P(Build.VERSION.SDK_INT, 35);
    public volatile E9T A02;
    public volatile CPK A03;

    public final void A00() {
        if (this.A01) {
            this.A00.A04();
            return;
        }
        try {
            this.A00.A02.APg(new E9Y(this));
        } catch (Throwable th) {
            this.A00.A07(th);
        }
    }

    public E9b(E9X e9x) {
        this.A00 = e9x;
    }
}
