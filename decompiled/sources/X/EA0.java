package X;

import android.os.SystemClock;
import java.lang.Exception;

/* loaded from: classes5.dex */
public final class EA0<T extends Exception> {
    public T A02;
    public long A01 = -9223372036854775807L;
    public long A00 = -9223372036854775807L;

    public final void A00() {
        this.A02 = null;
        this.A01 = -9223372036854775807L;
        this.A00 = -9223372036854775807L;
    }

    public final boolean A02() {
        boolean zA1N;
        if (this.A02 != null) {
            synchronized (EA2.A0u) {
                zA1N = AnonymousClass002.A1N(EA2.A0s);
            }
            if (zA1N || SystemClock.elapsedRealtime() < this.A00) {
                return true;
            }
        }
        return false;
    }

    public final void A01(T t) {
        boolean zA1N;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (this.A02 == null) {
            this.A02 = t;
        }
        if (this.A01 == -9223372036854775807L) {
            synchronized (EA2.A0u) {
                zA1N = AnonymousClass002.A1N(EA2.A0s);
            }
            if (!zA1N) {
                this.A01 = 200 + jElapsedRealtime;
            }
        }
        long j = this.A01;
        if (j == -9223372036854775807L || jElapsedRealtime < j) {
            this.A00 = jElapsedRealtime + 50;
            return;
        }
        T t2 = this.A02;
        if (t2 != t) {
            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(t2, t);
        }
        T t3 = this.A02;
        A00();
        throw t3;
    }
}
