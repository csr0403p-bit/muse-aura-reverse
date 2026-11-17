package X;

import com.google.common.base.Equivalence;
import com.google.common.base.Preconditions;
import com.google.common.base.Ticker;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.TimeUnit;

/* JADX WARN: Incorrect class signature: super class is equals to this class */
/* loaded from: classes5.dex */
public final class E8R<K, V> extends AbstractC3450CNv implements Serializable, Serializable {
    public static final long serialVersionUID = 1;
    public transient HsZ<K, V> A00;
    public final int concurrencyLevel;
    public final long expireAfterAccessNanos;
    public final long expireAfterWriteNanos;
    public final Equivalence<Object> keyEquivalence;
    public final E8V keyStrength;
    public final E97<? super K, V> loader;
    public final long maxWeight;
    public final CQN<? super K, ? super V> removalListener;
    public final Ticker ticker;
    public final Equivalence<Object> valueEquivalence;
    public final E8V valueStrength;
    public final E98<K, V> weigher;

    public E8R(E8S<K, V> e8s) {
        E8V e8v = e8s.A0E;
        E8V e8v2 = e8s.A0F;
        Equivalence<Object> equivalence = e8s.A09;
        Equivalence<Object> equivalence2 = e8s.A0A;
        long j = e8s.A07;
        long j2 = e8s.A06;
        long j3 = e8s.A08;
        E98<K, V> e98 = e8s.A0H;
        int i = e8s.A03;
        CQN<K, V> cqn = e8s.A0G;
        Ticker ticker = e8s.A0B;
        this.keyStrength = e8v;
        this.valueStrength = e8v2;
        this.keyEquivalence = equivalence;
        this.valueEquivalence = equivalence2;
        this.expireAfterWriteNanos = j;
        this.expireAfterAccessNanos = j2;
        this.maxWeight = j3;
        this.weigher = e98;
        this.concurrencyLevel = i;
        this.removalListener = cqn;
        this.ticker = (ticker == Ticker.SYSTEM_TICKER || ticker == E8Q.A0F) ? null : ticker;
        this.loader = null;
    }

    private Object readResolve() {
        return this.A00;
    }

    public final ConcurrentMap<K, V> A4o() {
        return this.A00.A4o();
    }

    public final long size() {
        return this.A00.size();
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        E8Q e8q = new E8Q();
        E8V e8v = this.keyStrength;
        E8V e8v2 = e8q.A09;
        if (!AnonymousClass002.A1Y(e8v2)) {
            throw BV7.A0m("Key strength was already set to %s", new Object[]{e8v2});
        }
        e8v.getClass();
        e8q.A09 = e8v;
        E8V e8v3 = this.valueStrength;
        E8V e8v4 = e8q.A0A;
        if (!AnonymousClass002.A1Y(e8v4)) {
            throw BV7.A0m("Value strength was already set to %s", new Object[]{e8v4});
        }
        e8v3.getClass();
        e8q.A0A = e8v3;
        Equivalence<Object> equivalence = this.keyEquivalence;
        Equivalence<Object> equivalence2 = e8q.A05;
        if (!AnonymousClass002.A1Y(equivalence2)) {
            throw BV7.A0m("key equivalence was already set to %s", new Object[]{equivalence2});
        }
        equivalence.getClass();
        e8q.A05 = equivalence;
        Equivalence<Object> equivalence3 = this.valueEquivalence;
        Equivalence<Object> equivalence4 = e8q.A06;
        if (!AnonymousClass002.A1Y(equivalence4)) {
            throw BV7.A0m("value equivalence was already set to %s", new Object[]{equivalence4});
        }
        equivalence3.getClass();
        e8q.A06 = equivalence3;
        int i = this.concurrencyLevel;
        int i2 = e8q.A00;
        if (!AnonymousClass002.A1Q(i2, -1)) {
            throw BV7.A0m("concurrency level was already set to %s", BV5.A1Y(i2));
        }
        Preconditions.checkArgument(i > 0);
        e8q.A00 = i;
        CQN<? super K, ? super V> cqn = this.removalListener;
        Preconditions.checkState(AnonymousClass002.A1Y(e8q.A0B));
        cqn.getClass();
        e8q.A0B = cqn;
        e8q.A0D = false;
        long j = this.expireAfterWriteNanos;
        if (j > 0) {
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            long j2 = e8q.A02;
            Preconditions.checkState(AnonymousClass002.A1M((j2 > (-1L) ? 1 : (j2 == (-1L) ? 0 : -1))), "expireAfterWrite was already set to %s ns", j2);
            if (!(j >= 0)) {
                throw BV7.A0k("duration cannot be negative: %s %s", new Object[]{Long.valueOf(j), timeUnit});
            }
            e8q.A02 = timeUnit.toNanos(j);
        }
        long j3 = this.expireAfterAccessNanos;
        if (j3 > 0) {
            TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
            long j4 = e8q.A01;
            Preconditions.checkState(AnonymousClass002.A1M((j4 > (-1L) ? 1 : (j4 == (-1L) ? 0 : -1))), "expireAfterAccess was already set to %s ns", j4);
            if (!(j3 >= 0)) {
                throw BV7.A0k("duration cannot be negative: %s %s", new Object[]{Long.valueOf(j3), timeUnit2});
            }
            e8q.A01 = timeUnit2.toNanos(j3);
        }
        E98<K, V> e98 = this.weigher;
        if (e98 != E8l.A01) {
            Preconditions.checkState(AnonymousClass002.A1Y(e8q.A0C));
            if (e8q.A0D) {
                long j5 = e8q.A03;
                Preconditions.checkState(j5 == -1, "weigher can not be combined with maximum size (%s provided)", j5);
            }
            e98.getClass();
            e8q.A0C = e98;
            long j6 = this.maxWeight;
            if (j6 != -1) {
                long j7 = e8q.A04;
                Preconditions.checkState(AnonymousClass002.A1M((j7 > (-1L) ? 1 : (j7 == (-1L) ? 0 : -1))), "maximum weight was already set to %s", j7);
                long j8 = e8q.A03;
                Preconditions.checkState(AnonymousClass002.A1M((j8 > (-1L) ? 1 : (j8 == (-1L) ? 0 : -1))), "maximum size was already set to %s", j8);
                Preconditions.checkArgument(j6 >= 0, "maximum weight must not be negative");
                e8q.A04 = j6;
            }
        } else {
            long j9 = this.maxWeight;
            if (j9 != -1) {
                long j10 = e8q.A03;
                Preconditions.checkState(AnonymousClass002.A1M((j10 > (-1L) ? 1 : (j10 == (-1L) ? 0 : -1))), "maximum size was already set to %s", j10);
                long j11 = e8q.A04;
                Preconditions.checkState(AnonymousClass002.A1M((j11 > (-1L) ? 1 : (j11 == (-1L) ? 0 : -1))), "maximum weight was already set to %s", j11);
                Preconditions.checkState(AnonymousClass002.A1Y(e8q.A0C), "maximum size can not be combined with weigher");
                Preconditions.checkArgument(j9 >= 0, "maximum size must not be negative");
                e8q.A03 = j9;
            }
        }
        Ticker ticker = this.ticker;
        if (ticker != null) {
            Preconditions.checkState(AnonymousClass002.A1Y(e8q.A08));
            e8q.A08 = ticker;
        }
        this.A00 = e8q.A00();
    }

    public E8R() {
    }
}
