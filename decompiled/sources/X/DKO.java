package X;

import com.facebook.quicklog.EventBuilder;
import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import com.facebook.quicklog.MarkerEditor;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes5.dex */
public final class DKO implements LightweightQuickPerformanceLogger {
    public final AtomicReference<DKW> A00;
    public final Lock A01;
    public final Lock A02;

    public static void A02(DKO dko, Object obj, Object obj2, String str, TimeUnit timeUnit, int i, int i2, int i3, long j) {
        dko.A01(new DI9(obj, obj2, str, null, timeUnit, i, i2, i3, j));
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final EventBuilder markEventBuilder(int i, String str) {
        return new DKT(this, str, i, 0);
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerEnd(int i, short s) {
        long jCurrentMonotonicTimestamp = currentMonotonicTimestamp();
        A02(this, Short.valueOf(s), null, "", TimeUnit.MILLISECONDS, 1, i, 0, jCurrentMonotonicTimestamp);
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerEndAtPointForUserFlow(int i, int i2, short s, String str) {
        long jCurrentMonotonicTimestamp = currentMonotonicTimestamp();
        A02(this, Short.valueOf(s), null, str, TimeUnit.MILLISECONDS, 20, i, i2, jCurrentMonotonicTimestamp);
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerEndForUserFlow(int i, String str, int i2, short s) {
        long jCurrentMonotonicTimestamp = currentMonotonicTimestamp();
        A02(this, str, Short.valueOf(s), "", TimeUnit.MILLISECONDS, 19, i, i2, jCurrentMonotonicTimestamp);
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerStart(int i) {
        long jCurrentMonotonicTimestamp = currentMonotonicTimestamp();
        A02(this, Boolean.TRUE, null, "", TimeUnit.MILLISECONDS, 0, i, 0, jCurrentMonotonicTimestamp);
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerStartWithCancelPolicy(int i, boolean z) {
        markerStartWithCancelPolicy(i, z, 0);
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final MarkerEditor withMarker(int i) {
        return new DKS(this, i, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:235:0x0054, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A00(com.facebook.quicklog.LightweightQuickPerformanceLogger r12, X.DI9 r13) {
        /*
            Method dump skipped, instructions count: 1564
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DKO.A00(com.facebook.quicklog.LightweightQuickPerformanceLogger, X.DI9):void");
    }

    private final void A01(DI9 di9) {
        Lock lock = this.A02;
        lock.lock();
        try {
            DKW dkw = this.A00.get();
            dkw.getClass();
            ConcurrentLinkedQueue<DI9> concurrentLinkedQueue = dkw.A01;
            if (concurrentLinkedQueue != null) {
                concurrentLinkedQueue.add(di9);
                return;
            }
            lock.unlock();
            LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = dkw.A00;
            if (lightweightQuickPerformanceLogger != null) {
                A00(lightweightQuickPerformanceLogger, di9);
            }
        } finally {
            lock.unlock();
        }
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerAnnotateCrucialForUserFlow(int i, int i2, String str, int i3) {
        A02(this, str, Integer.valueOf(i3), "", TimeUnit.MILLISECONDS, 30, i, i2, 0L);
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerDrop(int i) {
        A02(this, "", null, "", TimeUnit.MILLISECONDS, 12, i, 0, 0L);
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerDropForUserFlow(int i, int i2) {
        A02(this, "", null, "", TimeUnit.MILLISECONDS, 21, i, i2, 0L);
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerGenerateWithAnnotations(int i, short s, long j, TimeUnit timeUnit, Map<String, String> map) {
        A02(this, Short.valueOf(s), map, "", timeUnit, 29, i, 0, j);
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerLinkPivot(int i, int i2, String str) {
        A02(this, "", null, str, TimeUnit.MILLISECONDS, 23, i, i2, 0L);
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerStartForUserFlow(int i, int i2, String str, boolean z, long j) {
        A01(new DI9(Boolean.valueOf(z), Long.valueOf(j), "", str, TimeUnit.MILLISECONDS, 26, i, i2, 0L));
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    @Deprecated
    public final void markerTag(int i, String str) {
        A02(this, "", null, str, TimeUnit.MILLISECONDS, 7, i, 0, 0L);
    }

    public DKO() {
        ConcurrentLinkedQueue<DI9> concurrentLinkedQueue = new ConcurrentLinkedQueue<>();
        DKW dkw = new DKW();
        dkw.A01 = concurrentLinkedQueue;
        dkw.A00 = null;
        this.A00 = BV4.A16(dkw);
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.A02 = reentrantReadWriteLock.readLock();
        this.A01 = reentrantReadWriteLock.writeLock();
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final long currentMonotonicTimestamp() {
        return System.nanoTime() / 1000000;
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final long currentMonotonicTimestampNanos() {
        return System.nanoTime();
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final /* synthetic */ boolean passThroughOperation(DI9 di9) {
        return false;
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final /* synthetic */ boolean isMarkerCrashResilient(int i, int i2) {
        return false;
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final boolean isMarkerOn(int i, boolean z) {
        return z;
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerAnnotate(int i, int i2, String str, double d) {
        A02(this, Double.valueOf(d), null, str, TimeUnit.MILLISECONDS, 8, i, i2, 0L);
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerAnnotate(int i, int i2, String str, int i3) {
        A02(this, Integer.valueOf(i3), null, str, TimeUnit.MILLISECONDS, 5, i, i2, 0L);
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerAnnotate(int i, int i2, String str, long j) {
        A02(this, Long.valueOf(j), null, str, TimeUnit.MILLISECONDS, 11, i, i2, 0L);
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerAnnotate(int i, int i2, String str, String str2) {
        A02(this, str2, null, str, TimeUnit.MILLISECONDS, 4, i, i2, 0L);
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerAnnotate(int i, int i2, String str, boolean z) {
        A02(this, Boolean.valueOf(z), null, str, TimeUnit.MILLISECONDS, 6, i, i2, 0L);
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerAnnotate(int i, int i2, String str, double[] dArr) {
        A02(this, dArr, null, str, TimeUnit.MILLISECONDS, 17, i, i2, 0L);
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerAnnotate(int i, int i2, String str, int[] iArr) {
        A02(this, iArr, null, str, TimeUnit.MILLISECONDS, 10, i, i2, 0L);
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerAnnotate(int i, int i2, String str, long[] jArr) {
        A02(this, jArr, null, str, TimeUnit.MILLISECONDS, 15, i, i2, 0L);
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerAnnotate(int i, int i2, String str, String[] strArr) {
        A02(this, strArr, null, str, TimeUnit.MILLISECONDS, 9, i, i2, 0L);
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerAnnotate(int i, int i2, String str, boolean[] zArr) {
        A02(this, zArr, null, str, TimeUnit.MILLISECONDS, 16, i, i2, 0L);
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerAnnotate(int i, String str, double d) {
        A02(this, Double.valueOf(d), null, str, TimeUnit.MILLISECONDS, 8, i, 0, 0L);
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerAnnotate(int i, String str, int i2) {
        A02(this, Integer.valueOf(i2), null, str, TimeUnit.MILLISECONDS, 5, i, 0, 0L);
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerAnnotate(int i, String str, long j) {
        A02(this, Long.valueOf(j), null, str, TimeUnit.MILLISECONDS, 11, i, 0, 0L);
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerAnnotate(int i, String str, String str2) {
        A02(this, str2, null, str, TimeUnit.MILLISECONDS, 4, i, 0, 0L);
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerAnnotate(int i, String str, boolean z) {
        A02(this, Boolean.valueOf(z), null, str, TimeUnit.MILLISECONDS, 6, i, 0, 0L);
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerAnnotate(int i, String str, double[] dArr) {
        A02(this, dArr, null, str, TimeUnit.MILLISECONDS, 17, i, 0, 0L);
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerAnnotate(int i, String str, int[] iArr) {
        A02(this, iArr, null, str, TimeUnit.MILLISECONDS, 10, i, 0, 0L);
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerAnnotate(int i, String str, long[] jArr) {
        A02(this, jArr, null, str, TimeUnit.MILLISECONDS, 15, i, 0, 0L);
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerAnnotate(int i, String str, String[] strArr) {
        A02(this, strArr, null, str, TimeUnit.MILLISECONDS, 9, i, 0, 0L);
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerAnnotate(int i, String str, boolean[] zArr) {
        A02(this, zArr, null, str, TimeUnit.MILLISECONDS, 16, i, 0, 0L);
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerPoint(int i, int i2, String str) {
        A02(this, "", null, str, TimeUnit.MILLISECONDS, 2, i, i2, currentMonotonicTimestamp());
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerPoint(int i, int i2, String str, long j, TimeUnit timeUnit) {
        A02(this, "", null, str, timeUnit, 2, i, i2, j);
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerPoint(int i, int i2, String str, String str2) {
        A02(this, str2, null, str, TimeUnit.MILLISECONDS, 3, i, i2, currentMonotonicTimestamp());
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerPoint(int i, int i2, String str, String str2, long j, TimeUnit timeUnit) {
        A02(this, str2, null, str, timeUnit, 3, i, i2, j);
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerPoint(int i, int i2, String str, String str2, long j, TimeUnit timeUnit, int i3) {
        A02(this, str2, Integer.valueOf(i3), str, timeUnit, 22, i, i2, j);
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerPoint(int i, String str) {
        A02(this, "", null, str, TimeUnit.MILLISECONDS, 2, i, 0, currentMonotonicTimestamp());
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerPoint(int i, String str, long j, TimeUnit timeUnit) {
        A02(this, "", null, str, timeUnit, 2, i, 0, j);
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerPoint(int i, String str, String str2) {
        A02(this, str2, null, str, TimeUnit.MILLISECONDS, 3, i, 0, currentMonotonicTimestamp());
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerPoint(int i, String str, String str2, long j, TimeUnit timeUnit) {
        A02(this, str2, null, str, timeUnit, 3, i, 0, j);
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final EventBuilder markEventBuilder(int i, int i2, String str) {
        return new DKT(this, str, i, i2);
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerAnnotateCrucialForUserFlow(int i, int i2, String str, String str2) {
        A02(this, str, str2, "", TimeUnit.MILLISECONDS, 24, i, i2, 0L);
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerDrop(int i, int i2) {
        A02(this, "", null, "", TimeUnit.MILLISECONDS, 12, i, i2, 0L);
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerEnd(int i, int i2, short s) {
        long jCurrentMonotonicTimestamp = currentMonotonicTimestamp();
        A02(this, Short.valueOf(s), null, "", TimeUnit.MILLISECONDS, 1, i, i2, jCurrentMonotonicTimestamp);
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerEndForUserFlow(int i, int i2, short s) {
        markerEndForUserFlow(i, null, i2, s);
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerStart(int i, String str, String str2) {
        markerStart(i);
        markerAnnotate(i, str, str2);
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerStartForUserFlow(int i, int i2, String str, boolean z, long j, long j2, TimeUnit timeUnit) {
        A01(new DI9(Boolean.valueOf(z), Long.valueOf(j), "", str, timeUnit, 27, i, i2, j2));
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerStartWithCancelPolicy(int i, boolean z, int i2) {
        markerStartWithCancelPolicy(i, z, i2, currentMonotonicTimestampNanos(), TimeUnit.NANOSECONDS);
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    @Deprecated
    public final void markerTag(int i, int i2, String str) {
        A02(this, "", null, str, TimeUnit.MILLISECONDS, 7, i, i2, 0L);
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final MarkerEditor withMarker(int i, int i2) {
        return new DKS(this, i, i2);
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final boolean isMarkerOn(int i, int i2, boolean z) {
        return z;
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerEnd(int i, short s, long j, TimeUnit timeUnit) {
        A02(this, Short.valueOf(s), null, "", timeUnit, 1, i, 0, j);
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerStart(int i, int i2, long j, TimeUnit timeUnit) {
        A02(this, Boolean.TRUE, null, "", timeUnit, 0, i, i2, j);
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerStartForUserFlow(int i, int i2, boolean z, long j) {
        A02(this, Boolean.valueOf(z), Long.valueOf(j), "", TimeUnit.MILLISECONDS, 25, i, i2, 0L);
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerStartWithCancelPolicy(int i, boolean z, int i2, long j, TimeUnit timeUnit) {
        A02(this, Boolean.valueOf(z), null, "", timeUnit, 0, i, i2, j);
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerEnd(int i, int i2, short s, long j, TimeUnit timeUnit) {
        A02(this, Short.valueOf(s), null, "", timeUnit, 1, i, i2, j);
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerStart(int i, int i2, long j, TimeUnit timeUnit, int i3) {
        A02(this, Integer.valueOf(i3), null, "", timeUnit, 28, i, i2, j);
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerStartForUserFlow(int i, int i2, long j, TimeUnit timeUnit, boolean z) {
        A02(this, Boolean.valueOf(z), null, "", timeUnit, 18, i, i2, j);
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerStart(int i, String str, String str2, long j, TimeUnit timeUnit) {
        markerStart(i, 0, j, timeUnit);
        markerAnnotate(i, str, str2);
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerStartForUserFlow(int i, int i2, boolean z, long j, long j2, TimeUnit timeUnit) {
        A02(this, Boolean.valueOf(z), Long.valueOf(j), "", timeUnit, 31, i, i2, j2);
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerStart(int i, int i2) {
        long jCurrentMonotonicTimestamp = currentMonotonicTimestamp();
        A02(this, Boolean.TRUE, null, "", TimeUnit.MILLISECONDS, 0, i, i2, jCurrentMonotonicTimestamp);
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerStart(int i, int i2, String str, String str2, long j, TimeUnit timeUnit) {
        markerStart(i, i2, j, timeUnit);
        markerAnnotate(i, i2, str, str2);
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerStart(int i, int i2, String str, String str2) {
        markerStart(i, i2);
        markerAnnotate(i, i2, str, str2);
    }
}
