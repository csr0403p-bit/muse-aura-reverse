package com.meta.maps.time;

import X.C06H;
import X.C7384Etj;
import com.facebook.aura.devices.pairing.LinkEncryptedPairingKt;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class Duration implements Comparable<Duration> {
    public static final Companion Companion = new Companion();
    public static final long MILLIS_PER_SECOND = 1000;
    public static final int NANOS_PER_MILLIS = 1000000;
    public static final long NANOS_PER_SECOND = 1000000000;
    public int mNanos;
    public long mSeconds;

    public final class Companion {
        public final Duration ofSeconds(long j) {
            return new Duration(j, 0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final long divFloor(long j, long j2) {
            long j3 = j / j2;
            return ((j ^ j2) >= 0 || j2 * j3 == j) ? j3 : j3 - 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final long exactAdd(long j, long j2) {
            if (j2 < 0 && j < Long.MIN_VALUE - j2) {
                throw new ArithmeticException("Integer underflow");
            }
            if (j2 <= 0 || j <= LinkEncryptedPairingKt.LINK_COUNTER_MAX - j2) {
                return j + j2;
            }
            throw new ArithmeticException("Integer overflow");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final long exactMultiply(long j, long j2) {
            if ((j2 == -1 && j == Long.MIN_VALUE) || (j == -1 && j2 == Long.MIN_VALUE)) {
                throw new ArithmeticException("Integer overflow");
            }
            if (j2 > 0 && j > LinkEncryptedPairingKt.LINK_COUNTER_MAX / j2) {
                throw new ArithmeticException("Integer overflow");
            }
            if (j2 > 0 && j < Long.MIN_VALUE / j2) {
                throw new ArithmeticException("Integer underflow");
            }
            if (j2 < -1 && j > Long.MIN_VALUE / j2) {
                throw new ArithmeticException("Integer underflow");
            }
            if (j2 >= -1 || j >= LinkEncryptedPairingKt.LINK_COUNTER_MAX / j2) {
                return j * j2;
            }
            throw new ArithmeticException("Integer overflow");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final long modFloor(long j, long j2) {
            long j3 = j % j2;
            return ((j ^ j2) >= 0 || j3 == 0) ? j3 : j3 + j2;
        }

        public final Duration ofDays(long j) {
            return ofHours(exactMultiply(j, 24L));
        }

        public final Duration ofHours(long j) {
            return ofMinutes(exactMultiply(j, 60L));
        }

        public final Duration ofMillis(long j) {
            return ofNanos(j * Duration.NANOS_PER_MILLIS);
        }

        public final Duration ofMinutes(long j) {
            return new Duration(exactMultiply(j, 60L), 0);
        }

        public final Duration ofNanos(long j) {
            long j2 = Duration.NANOS_PER_SECOND;
            long j3 = j / j2;
            int i = (int) (j % j2);
            if (i < 0) {
                i += (int) j2;
                j3--;
            }
            return new Duration(j3, i);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }

        public final Duration ofSeconds(long j, long j2) {
            long j3 = Duration.NANOS_PER_SECOND;
            return new Duration(exactAdd(j, divFloor(j2, j3)), (int) modFloor(j2, j3));
        }
    }

    public static final Duration ofSeconds(long j) {
        return new Duration(j, 0);
    }

    @Override // java.lang.Comparable
    public int compareTo(Duration duration) {
        C7384Etj.A0Y(duration, 0);
        long j = this.mSeconds;
        long j2 = duration.mSeconds;
        if (j < j2) {
            return -1;
        }
        if (j > j2) {
            return 1;
        }
        int i = this.mNanos;
        int i2 = duration.mNanos;
        if (i < i2) {
            return -1;
        }
        return i > i2 ? 1 : 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                Duration duration = (Duration) obj;
                if (this.mSeconds != duration.mSeconds || this.mNanos != duration.mNanos) {
                }
            }
            return false;
        }
        return true;
    }

    public static final long divFloor(long j, long j2) {
        return Companion.divFloor(j, j2);
    }

    public static final long exactAdd(long j, long j2) {
        return Companion.exactAdd(j, j2);
    }

    public static final long exactMultiply(long j, long j2) {
        return Companion.exactMultiply(j, j2);
    }

    public static final long modFloor(long j, long j2) {
        return Companion.modFloor(j, j2);
    }

    public static final Duration ofDays(long j) {
        return Companion.ofDays(j);
    }

    public static final Duration ofHours(long j) {
        return Companion.ofHours(j);
    }

    public static final Duration ofMillis(long j) {
        return Companion.ofMillis(j);
    }

    public static final Duration ofMinutes(long j) {
        return Companion.ofMinutes(j);
    }

    public static final Duration ofNanos(long j) {
        return Companion.ofNanos(j);
    }

    public final int getNano() {
        return this.mNanos;
    }

    public final long getSeconds() {
        return this.mSeconds;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.mSeconds), Integer.valueOf(this.mNanos)});
    }

    public final long toDays() {
        return ((this.mSeconds / 60) / 60) / 24;
    }

    public final long toHours() {
        return (this.mSeconds / 60) / 60;
    }

    public final int toHoursPart() {
        return (int) (((this.mSeconds / 60) / 60) % 24);
    }

    public final long toMillis() {
        Companion companion = Companion;
        return companion.exactAdd(companion.exactMultiply(this.mSeconds, MILLIS_PER_SECOND), this.mNanos / NANOS_PER_MILLIS);
    }

    public final int toMillisPart() {
        return this.mNanos / NANOS_PER_MILLIS;
    }

    public final long toMinutes() {
        return this.mSeconds / 60;
    }

    public final int toMinutesPart() {
        return (int) ((this.mSeconds / 60) % 60);
    }

    public final long toNanos() {
        Companion companion = Companion;
        return companion.exactAdd(companion.exactMultiply(this.mSeconds, NANOS_PER_SECOND), this.mNanos);
    }

    public final int toNanosPart() {
        return this.mNanos;
    }

    public final long toSeconds() {
        return this.mSeconds;
    }

    public final int toSecondsPart() {
        return (int) (this.mSeconds % 60);
    }

    public final long toDaysPart() {
        return toDays();
    }

    public /* synthetic */ Duration(long j, int i, C06H c06h) {
        this(j, i);
    }

    public Duration(long j, int i) {
        this.mSeconds = j;
        this.mNanos = i;
    }

    public static final Duration ofSeconds(long j, long j2) {
        return Companion.ofSeconds(j, j2);
    }
}
