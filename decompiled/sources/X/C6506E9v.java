package X;

import android.os.SystemClock;
import java.lang.Exception;

/* renamed from: X.E9v, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6506E9v<T extends Exception> {
    public long A00;
    public long A01;
    public T A02;

    public final void A00() {
        this.A02 = null;
        this.A01 = 0L;
        this.A00 = 0L;
    }

    public final void A01(T t) {
        T t2;
        boolean zA1N;
        if (AbstractC5653Dmh.A03(EnumC5618Dlz.A0P)) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (this.A02 == null) {
                this.A02 = t;
            }
            if (this.A01 == 0) {
                synchronized (EA1.A0q) {
                    zA1N = AnonymousClass002.A1N(EA1.A0n);
                }
                if (!zA1N) {
                    this.A01 = 200 + jElapsedRealtime;
                }
            }
            long j = this.A01;
            if (j == 0 || jElapsedRealtime < j) {
                this.A00 = jElapsedRealtime + 50;
                return;
            }
            t2 = this.A02;
        } else {
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            t2 = this.A02;
            if (t2 == null) {
                this.A02 = t;
                t2 = t;
                this.A01 = 100 + jElapsedRealtime2;
            }
            if (jElapsedRealtime2 < this.A01) {
                return;
            }
        }
        if (t2 != t) {
            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(t2, t);
        }
        T t3 = this.A02;
        A00();
        throw t3;
    }

    public final boolean A02() {
        boolean zA1N;
        if (AbstractC5653Dmh.A03(EnumC5618Dlz.A0P) && this.A02 != null) {
            synchronized (EA1.A0q) {
                zA1N = AnonymousClass002.A1N(EA1.A0n);
            }
            if (zA1N || SystemClock.elapsedRealtime() < this.A00) {
                return true;
            }
        }
        return false;
    }
}
