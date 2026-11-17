package X;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes5.dex */
public final class DTL<K, V> extends AbstractMap<K, V> implements ConcurrentMap<K, V>, Serializable {
    public static final int A03;
    public static final int A04;
    public static final long serialVersionUID = 1;
    public transient Collection<V> A00;
    public transient Set<Map.Entry<K, V>> A01;
    public transient Set<K> A02;
    public final AtomicLong capacity;
    public final int concurrencyLevel;
    public final ConcurrentMap<K, DTP<K, V>> data;
    public final AtomicLongArray readBufferDrainAtWriteCount;
    public final long[] readBufferReadCount;
    public final AtomicLongArray readBufferWriteCount;
    public final AtomicReferenceArray<DTP<K, V>> readBuffers;
    public final Lock evictionLock = new ReentrantLock();
    public final AtomicLong weightedSize = new AtomicLong();
    public final DTM<DTP<K, V>> evictionDeque = new DTM<>();
    public final Queue<Runnable> writeBuffer = new ConcurrentLinkedQueue();
    public final AtomicReference<DTS> drainStatus = BV4.A16(DTS.A01);

    private final void A00() {
        if (this.evictionLock.tryLock()) {
            try {
                AtomicReference<DTS> atomicReference = this.drainStatus;
                DTS dts = DTS.A02;
                atomicReference.lazySet(dts);
                int iA0Q = (int) BV7.A0Q();
                int i = A03 + iA0Q;
                while (iA0Q < i) {
                    int i2 = A04 & iA0Q;
                    long j = this.readBufferWriteCount.get(i2);
                    int i3 = 0;
                    do {
                        int i4 = (i2 * 16) + ((int) (this.readBufferReadCount[i2] & 15));
                        DTP<K, V> dtp = this.readBuffers.get(i4);
                        if (dtp != null) {
                            this.readBuffers.lazySet(i4, null);
                            DTM<DTP<K, V>> dtm = this.evictionDeque;
                            if (dtm.A04(dtp) && dtp != dtm.A01) {
                                DTM.A03(dtp, dtm);
                                DTM.A02(dtp, dtm);
                            }
                            long[] jArr = this.readBufferReadCount;
                            jArr[i2] = jArr[i2] + 1;
                            i3++;
                        }
                        this.readBufferDrainAtWriteCount.lazySet(i2, j);
                        iA0Q++;
                    } while (i3 < 8);
                    this.readBufferDrainAtWriteCount.lazySet(i2, j);
                    iA0Q++;
                }
                int i5 = 0;
                do {
                    Runnable runnablePoll = this.writeBuffer.poll();
                    if (runnablePoll == null) {
                        break;
                    }
                    runnablePoll.run();
                    i5++;
                } while (i5 < 16);
                Bs8.A00(dts, DTS.A01, this.drainStatus);
                this.evictionLock.unlock();
            } catch (Throwable th) {
                Bs8.A00(DTS.A02, DTS.A01, this.drainStatus);
                this.evictionLock.unlock();
                throw th;
            }
        }
    }

    private final void A02(Runnable runnable) {
        this.writeBuffer.add(runnable);
        this.drainStatus.lazySet(DTS.A03);
        A00();
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Proxy required");
    }

    public final void A03() {
        DTP<K, V> dtp;
        while (this.weightedSize.get() > this.capacity.get() && (dtp = (DTP) BV8.A0f(this.evictionDeque)) != null) {
            this.data.remove(dtp.key, dtp);
            A04(dtp);
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        Object obj;
        this.evictionLock.lock();
        while (true) {
            try {
                DTM<DTP<K, V>> dtm = this.evictionDeque;
                if (dtm.isEmpty()) {
                    obj = null;
                } else {
                    obj = dtm.A00;
                    DTP dtp = (DTP) obj;
                    DTP<K, V> dtp2 = dtp.next;
                    dtp.next = null;
                    dtm.A00 = dtp2;
                    if (dtp2 == null) {
                        dtm.A01 = null;
                    } else {
                        dtp2.prev = null;
                    }
                }
                DTP<K, V> dtp3 = (DTP) obj;
                if (dtp3 == null) {
                    break;
                }
                this.data.remove(dtp3.key, dtp3);
                A04(dtp3);
            } finally {
                this.evictionLock.unlock();
            }
        }
        for (int i = 0; i < this.readBuffers.length(); i++) {
            this.readBuffers.lazySet(i, null);
        }
        while (true) {
            Runnable runnablePoll = this.writeBuffer.poll();
            if (runnablePoll == null) {
                return;
            } else {
                runnablePoll.run();
            }
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return this.data.containsKey(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.A01;
        if (set != null) {
            return set;
        }
        DTK dtk = new DTK(this);
        this.A01 = dtk;
        return dtk;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V get(Object obj) {
        DTP<K, V> dtp = this.data.get(obj);
        if (dtp == null) {
            return null;
        }
        A01(dtp);
        return ((DTW) dtp.get()).A01;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return this.data.isEmpty();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<K> keySet() {
        Set<K> set = this.A02;
        if (set != null) {
            return set;
        }
        DTE dte = new DTE(this);
        this.A02 = dte;
        return dte;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        DTW dtw;
        int i;
        DTP<K, V> dtpRemove = this.data.remove(obj);
        if (dtpRemove == null) {
            return null;
        }
        do {
            dtw = (DTW) dtpRemove.get();
            i = dtw.A00;
            if (i <= 0) {
                break;
            }
        } while (!dtpRemove.compareAndSet(dtw, new DTW(dtw.A01, -i)));
        A02(new DTR(dtpRemove, this));
        return ((DTW) dtpRemove.get()).A01;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.data.size();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection<V> values() {
        Collection<V> collection = this.A00;
        if (collection != null) {
            return collection;
        }
        DTG dtg = new DTG(this);
        this.A00 = dtg;
        return dtg;
    }

    public Object writeReplace() {
        return new DTN(this);
    }

    static {
        int iMin = Math.min(4, 1 << (32 - Integer.numberOfLeadingZeros(BV5.A00() - 1)));
        A03 = iMin;
        A04 = iMin - 1;
    }

    public DTL(int i, int i2, long j) {
        this.concurrencyLevel = i;
        this.capacity = BV4.A14(Math.min(j, 9223372034707292160L));
        this.data = new ConcurrentHashMap(i2, 0.75f, i);
        int i3 = A03;
        this.readBufferReadCount = new long[i3];
        this.readBufferWriteCount = new AtomicLongArray(i3);
        this.readBufferDrainAtWriteCount = new AtomicLongArray(i3);
        this.readBuffers = new AtomicReferenceArray<>(i3 * 16);
    }

    private final void A01(DTP<K, V> dtp) {
        int iA0Q = A04 & ((int) BV7.A0Q());
        long j = this.readBufferWriteCount.get(iA0Q);
        this.readBufferWriteCount.lazySet(iA0Q, 1 + j);
        this.readBuffers.lazySet((iA0Q * 16) + ((int) (15 & j)), dtp);
        boolean zA1R = C8j3.A1R(((j - this.readBufferDrainAtWriteCount.get(iA0Q)) > 4L ? 1 : ((j - this.readBufferDrainAtWriteCount.get(iA0Q)) == 4L ? 0 : -1)));
        DTS dts = this.drainStatus.get();
        if (dts instanceof DTZ) {
            return;
        }
        if ((dts instanceof DTX) || (!zA1R)) {
            A00();
        }
    }

    public final void A04(DTP<K, V> dtp) {
        DTW dtw;
        do {
            dtw = (DTW) dtp.get();
        } while (!dtp.compareAndSet(dtw, new DTW(dtw.A01, 0)));
        AtomicLong atomicLong = this.weightedSize;
        atomicLong.lazySet(atomicLong.get() - Math.abs(dtw.A00));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        obj.getClass();
        Iterator itA10 = BV5.A10(this.data);
        while (itA10.hasNext()) {
            if (((DTW) ((AtomicReference) itA10.next()).get()).A01.equals(obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V put(K k, V v) {
        DTW dtw;
        int i;
        k.getClass();
        v.getClass();
        DTW dtw2 = new DTW(v, 1);
        DTP<K, V> dtp = new DTP<>(dtw2, k);
        while (true) {
            DTP<K, V> dtpPutIfAbsent = this.data.putIfAbsent(dtp.key, dtp);
            if (dtpPutIfAbsent == null) {
                A02(new DTO(dtp, this));
                return null;
            }
            do {
                dtw = (DTW) dtpPutIfAbsent.get();
                i = dtw.A00;
                if (i > 0) {
                }
            } while (!dtpPutIfAbsent.compareAndSet(dtw, dtw2));
            int i2 = 1 - i;
            if (i2 == 0) {
                A01(dtpPutIfAbsent);
            } else {
                A02(new DTQ(dtpPutIfAbsent, this, i2));
            }
            return dtw.A01;
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public final V putIfAbsent(K k, V v) {
        k.getClass();
        v.getClass();
        DTP<K, V> dtp = new DTP<>(new DTW(v, 1), k);
        DTP<K, V> dtpPutIfAbsent = this.data.putIfAbsent(dtp.key, dtp);
        if (dtpPutIfAbsent == null) {
            A02(new DTO(dtp, this));
            return null;
        }
        A01(dtpPutIfAbsent);
        return ((DTW) dtpPutIfAbsent.get()).A01;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public final V replace(K k, V v) {
        DTW dtw;
        int i;
        k.getClass();
        v.getClass();
        DTW dtw2 = new DTW(v, 1);
        DTP<K, V> dtp = this.data.get(k);
        if (dtp != null) {
            do {
                dtw = (DTW) dtp.get();
                i = dtw.A00;
                if (i > 0) {
                }
            } while (!dtp.compareAndSet(dtw, dtw2));
            int i2 = 1 - i;
            if (i2 == 0) {
                A01(dtp);
            } else {
                A02(new DTQ(dtp, this, i2));
            }
            return dtw.A01;
        }
        return null;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public final boolean remove(Object obj, Object obj2) {
        DTP<K, V> dtp = this.data.get(obj);
        if (dtp == null || obj2 == null) {
            return false;
        }
        DTW dtw = (DTW) dtp.get();
        do {
            V v = dtw.A01;
            if (obj2 != v && !v.equals(obj2)) {
                return false;
            }
            int i = dtw.A00;
            if (i > 0 && dtp.compareAndSet(dtw, new DTW(dtw.A01, -i))) {
                if (!this.data.remove(obj, dtp)) {
                    return false;
                }
                A02(new DTR(dtp, this));
                return true;
            }
            dtw = (DTW) dtp.get();
        } while (dtw.A00 > 0);
        return false;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public final boolean replace(K k, V v, V v2) {
        DTW dtw;
        int i;
        V v3;
        k.getClass();
        v.getClass();
        v2.getClass();
        DTW dtw2 = new DTW(v2, 1);
        DTP<K, V> dtp = this.data.get(k);
        if (dtp != null) {
            do {
                dtw = (DTW) dtp.get();
                i = dtw.A00;
                if (i <= 0 || (v != (v3 = dtw.A01) && !v3.equals(v))) {
                }
            } while (!dtp.compareAndSet(dtw, dtw2));
            int i2 = 1 - i;
            if (i2 == 0) {
                A01(dtp);
                return true;
            }
            A02(new DTQ(dtp, this, i2));
            return true;
        }
        return false;
    }
}
