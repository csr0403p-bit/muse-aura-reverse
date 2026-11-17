package X;

import android.media.metrics.LogSessionId;
import android.os.Build;

/* loaded from: classes5.dex */
public final class E6Y {
    public static final E6Y A03 = new E6Y("");
    public final String A00;
    public final E70 A01;
    public final Object A02;

    public final synchronized LogSessionId A00() {
        E70 e70;
        e70 = this.A01;
        e70.getClass();
        return e70.A00;
    }

    public final synchronized void A01(LogSessionId logSessionId) {
        E70 e70 = this.A01;
        e70.getClass();
        e70.A00(logSessionId);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof E6Y) {
                E6Y e6y = (E6Y) obj;
                if (!C6xC.A00(this.A00, e6y.A00) || !C6xC.A00(this.A01, e6y.A01) || !C6xC.A00(this.A02, e6y.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return BV7.A0E(this.A00, this.A01, this.A02);
    }

    public E6Y(String str) {
        this.A00 = str;
        this.A01 = Build.VERSION.SDK_INT >= 31 ? new E70() : null;
        this.A02 = C3cG.A0T();
    }
}
