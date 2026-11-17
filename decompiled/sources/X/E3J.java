package X;

import androidx.media3.common.util.Util;
import com.facebook.aura.devices.pairing.LinkEncryptedPairingKt;
import com.facebook.aura.localbrowser.LocalBrowserCapacityKt;
import java.math.RoundingMode;

/* loaded from: classes5.dex */
public final class E3J {
    public long A00;
    public long A01;
    public long A02;
    public final ThreadLocal<Long> A03 = new ThreadLocal<>();

    public final synchronized long A00() {
        long j;
        j = this.A02;
        if (j == LinkEncryptedPairingKt.LINK_COUNTER_MAX || j == 9223372036854775806L) {
            j = -9223372036854775807L;
        }
        return j;
    }

    public final synchronized long A01() {
        return this.A01;
    }

    public final synchronized long A02(long j) {
        long j2;
        j2 = -9223372036854775807L;
        if (j != -9223372036854775807L) {
            if (this.A01 == -9223372036854775807L) {
                long jLongValue = this.A02;
                if (jLongValue == 9223372036854775806L) {
                    Long l = this.A03.get();
                    l.getClass();
                    jLongValue = l.longValue();
                }
                this.A01 = jLongValue - j;
                notifyAll();
            }
            this.A00 = j;
            j2 = j + this.A01;
        }
        return j2;
    }

    public final synchronized long A03(long j) {
        long jA02;
        long j2 = j;
        synchronized (this) {
            jA02 = -9223372036854775807L;
            if (j != -9223372036854775807L) {
                long j3 = this.A00;
                if (j3 != -9223372036854775807L) {
                    long jA0F = Util.A0F(RoundingMode.DOWN, j3, 90000L, 1000000L);
                    long j4 = (LocalBrowserCapacityKt.BACKGROUND_WAKE_MIN_RAM_BYTES + jA0F) / 8589934592L;
                    long j5 = ((j4 - 1) * 8589934592L) + j;
                    j2 = j + (j4 * 8589934592L);
                    if (BV6.A0J(j5, jA0F) < BV6.A0J(j2, jA0F)) {
                        j2 = j5;
                    }
                }
                jA02 = A02(Util.A0F(RoundingMode.DOWN, j2, 1000000L, 90000L));
            }
        }
        return jA02;
    }

    public final synchronized long A04(long j) {
        long jA02;
        long j2 = j;
        synchronized (this) {
            jA02 = -9223372036854775807L;
            if (j != -9223372036854775807L) {
                long j3 = this.A00;
                if (j3 != -9223372036854775807L) {
                    long jA0F = Util.A0F(RoundingMode.DOWN, j3, 90000L, 1000000L);
                    long j4 = jA0F / 8589934592L;
                    long j5 = (j4 * 8589934592L) + j;
                    j2 = j + ((j4 + 1) * 8589934592L);
                    if (j5 >= jA0F) {
                        j2 = j5;
                    }
                }
                jA02 = A02(Util.A0F(RoundingMode.DOWN, j2, 1000000L, 90000L));
            }
        }
        return jA02;
    }

    public final synchronized void A05(long j) {
        this.A02 = j;
        this.A01 = j == LinkEncryptedPairingKt.LINK_COUNTER_MAX ? 0L : -9223372036854775807L;
        this.A00 = -9223372036854775807L;
    }

    public E3J(long j) {
        A05(j);
    }
}
