package X;

import com.facebook.aura.commands.photos.PhotosSearchHandlerKt;
import com.facebook.aura.qpl.AuraDebugAndTestConfig;
import com.facebook.aura.qpl.AuraQplNameProvider;
import com.facebook.common.time.AwakeTimeSinceBootClock;
import com.facebook.common.util.TriState;
import com.facebook.quicklog.EventBuilder;
import com.facebook.quicklog.MarkerEditor;
import com.facebook.quicklog.QuickEventImpl;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.facebook.quicklog.QuickPerformanceLoggerGKs;
import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes5.dex */
public final class DHu implements QuickPerformanceLogger {
    public DGY A00;
    public InterfaceC3472COx A01;
    public QuickEventImpl A02;
    public C4955DHq A03;
    public DJF[] A04;
    public final AwakeTimeSinceBootClock A05;
    public final InterfaceC7539F0o A06;
    public final DHv A07;
    public final QuickPerformanceLoggerGKs A08;
    public final Integer A09;
    public final ConcurrentLinkedQueue<Exception> A0A;
    public final F18 A0B;
    public final F18 A0C;
    public final F18 A0D;
    public final DIL A0E;
    public final InterfaceC4945DGj A0F;
    public final DJe A0G;
    public final Random A0H;
    public final ConcurrentLinkedQueue<QuickEventImpl> A0I;
    public final AtomicInteger A0J;
    public final ReentrantLock A0K;
    public final F18<DGY> A0L;
    public final F18<DIF> A0M;
    public final F18 A0N;
    public final F18<InterfaceC3472COx> A0O;
    public final F18<DHy> A0P;
    public final F18 A0Q;
    public final F18<DIA> A0R;
    public final F18<Collection<DJF>> A0S;
    public final boolean A0T;
    public volatile int A0U;
    public volatile TriState A0V;
    public volatile DIF A0W;
    public volatile DIA A0X;
    public volatile TriState A0Y;
    public volatile TriState A0Z;
    public volatile DHy A0a;

    /* JADX WARN: Removed duplicated region for block: B:42:0x0090 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private long A02(java.lang.String r7, java.lang.String r8, int r9, long r10, boolean r12, boolean r13) {
        /*
            r6 = this;
            r3 = 1
            if (r12 == 0) goto L9
            r0 = 7
            long r10 = X.DJP.A00(r3, r0, r3)
        L8:
            return r10
        L9:
            if (r13 == 0) goto L18
            X.COx r0 = r6.A01
            if (r0 == 0) goto La8
            com.facebook.aura.qpl.AuraDebugAndTestConfig r0 = (com.facebook.aura.qpl.AuraDebugAndTestConfig) r0
            boolean r0 = r0.isLocalBuild
            if (r0 == 0) goto La8
            long r10 = X.DJP.A00
            return r10
        L18:
            r0 = 48
            long r0 = r10 >> r0
            r4 = 255(0xff, double:1.26E-321)
            long r0 = r0 & r4
            int r2 = (int) r0
            r0 = 19
            if (r2 != r0) goto L5c
            com.facebook.quicklog.QuickPerformanceLoggerGKs r0 = r6.A08
            if (r0 == 0) goto L2e
            boolean r0 = r0.isAppIdBasedConfigWithSamplingFallbackEnabled()
            if (r0 != 0) goto L5c
        L2e:
            X.F0C r0 = X.AbstractC3076BxH.A00
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L5c
            X.F0C r0 = X.AbstractC3076BxH.A02
            java.lang.Object r0 = r0.getValue()
            X.C7384Etj.A0U(r0)
            java.util.Set r0 = (java.util.Set) r0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
            boolean r0 = r0.add(r1)
            if (r0 == 0) goto L5c
            X.F0C r0 = X.AbstractC3076BxH.A01
            java.lang.Object r0 = r0.getValue()
            java.util.AbstractCollection r0 = (java.util.AbstractCollection) r0
            r0.add(r1)
        L5c:
            r0 = 32
            long r0 = r10 >> r0
            long r0 = r0 & r4
            int r4 = (int) r0
            if (r4 == r3) goto L71
            r0 = 2
            if (r4 == r0) goto L6d
            r0 = 3
            if (r4 == r0) goto L6d
        L6a:
            long r10 = X.DJP.A01
            return r10
        L6d:
            int r0 = (int) r10
            if (r0 != 0) goto L8
            goto L6a
        L71:
            if (r7 == 0) goto L91
            int r2 = (int) r10
            if (r2 == 0) goto L6a
            if (r2 == r3) goto L8
            java.util.zip.CRC32 r1 = new java.util.zip.CRC32
            r1.<init>()
            byte[] r0 = r7.getBytes()
        L81:
            r1.update(r0)
            long r3 = r1.getValue()
            long r0 = (long) r2
            long r3 = r3 % r0
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L6a
            return r10
        L91:
            if (r8 == 0) goto Lb7
            boolean r0 = r8.isEmpty()
            if (r0 != 0) goto Lb7
            int r2 = (int) r10
            if (r2 == 0) goto L6a
            if (r2 == r3) goto L8
            java.util.zip.CRC32 r1 = new java.util.zip.CRC32
            r1.<init>()
            byte[] r0 = r8.getBytes()
            goto L81
        La8:
            X.DIF r1 = r6.A0W
            r0 = 2147483647(0x7fffffff, float:NaN)
            int r1 = r1.randomlySample(r0)
            r0 = 3
            long r10 = X.DJP.A00(r1, r0, r3)
            return r10
        Lb7:
            X.DIF r1 = r6.A0W
            int r0 = (int) r10
            int r0 = r1.randomlySample(r0)
            long r10 = X.DJP.A00(r0, r2, r3)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DHu.A02(java.lang.String, java.lang.String, int, long, boolean, boolean):long");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x004e, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0052, code lost:
    
        throw r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A0A(int r8, int r9, int r10, int r11, java.lang.String r12) {
        /*
            r7 = this;
            r4 = r8
            java.lang.String r1 = "qpl.markerAnnotate(int)"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            X.DI8.A02(r1, r0)
            r3 = r12
            boolean r0 = A0c(r12)     // Catch: java.lang.Throwable -> L4e
            if (r0 == 0) goto L4a
            X.DHv r1 = r7.A07     // Catch: java.lang.Throwable -> L4e
            X.DI1 r2 = A07(r7)     // Catch: java.lang.Throwable -> L4e
            r5 = r9
            r6 = r10
            r1.A0A(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L4e
            java.lang.String r0 = "qpl.crashResiliency.annotate(int)"
            X.DI8.A01(r0)     // Catch: java.lang.Throwable -> L4e
            X.DIA r2 = r7.A0X     // Catch: java.lang.Throwable -> L45
            if (r2 == 0) goto L41
            X.DJJ r0 = r7.A05(r8, r9)     // Catch: java.lang.Throwable -> L45
            if (r0 == 0) goto L2d
            int r4 = r0.A01     // Catch: java.lang.Throwable -> L45
        L2d:
            r0 = r11 & 2
            if (r0 != 0) goto L3e
            X.DIF r0 = r7.A0W     // Catch: java.lang.Throwable -> L45
            X.DJL r0 = r0.getCrashResiliencyConfig()     // Catch: java.lang.Throwable -> L45
            int r1 = r0.ABS(r4, r12)     // Catch: java.lang.Throwable -> L45
            r0 = -1
            if (r1 == r0) goto L41
        L3e:
            r2.AaK(r4, r9, r12, r10)     // Catch: java.lang.Throwable -> L45
        L41:
            X.DI8.A00()     // Catch: java.lang.Throwable -> L4e
            goto L4a
        L45:
            r0 = move-exception
            X.DI8.A00()     // Catch: java.lang.Throwable -> L4e
            throw r0     // Catch: java.lang.Throwable -> L4e
        L4a:
            X.DI8.A00()
            return
        L4e:
            r0 = move-exception
            X.DI8.A00()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DHu.A0A(int, int, int, int, java.lang.String):void");
    }

    /* JADX WARN: Incorrect types in method signature: (IISJLjava/util/concurrent/TimeUnit;ILjava/lang/String;LX/DJv<*>;LX/DI1;I)V */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d4 A[Catch: all -> 0x0121, TRY_LEAVE, TryCatch #0 {all -> 0x0121, blocks: (B:3:0x000d, B:11:0x0025, B:13:0x002d, B:21:0x0049, B:23:0x004e, B:68:0x011c, B:25:0x0055, B:26:0x0059, B:28:0x006b, B:46:0x00bf, B:50:0x00c9, B:51:0x00cd, B:53:0x00d4, B:63:0x0109, B:65:0x010e, B:67:0x0119, B:6:0x0017, B:29:0x0072, B:32:0x007f, B:34:0x0084, B:39:0x0094, B:54:0x00db, B:56:0x00ea, B:59:0x00f6, B:62:0x0102, B:37:0x008f, B:40:0x00a0, B:42:0x00aa, B:43:0x00b4, B:44:0x00bd, B:14:0x0032, B:16:0x0036, B:18:0x003a, B:20:0x0046), top: B:74:0x000d, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A0Q(X.DI1 r12, X.DHu r13, java.lang.String r14, java.util.concurrent.TimeUnit r15, int r16, int r17, int r18, int r19, long r20, short r22) {
        /*
            Method dump skipped, instructions count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DHu.A0Q(X.DI1, X.DHu, java.lang.String, java.util.concurrent.TimeUnit, int, int, int, int, long, short):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x004e, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0052, code lost:
    
        throw r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A0W(java.lang.String r8, int r9, java.lang.String r10, int r11, int r12) {
        /*
            r7 = this;
            r5 = r9
            java.lang.String r1 = "qpl.markerAnnotate(String)"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)
            X.DI8.A02(r1, r0)
            r3 = r8
            boolean r0 = A0c(r8)     // Catch: java.lang.Throwable -> L4e
            if (r0 == 0) goto L4a
            X.DHv r1 = r7.A07     // Catch: java.lang.Throwable -> L4e
            X.DI1 r2 = A07(r7)     // Catch: java.lang.Throwable -> L4e
            r4 = r10
            r6 = r11
            r1.A0B(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L4e
            java.lang.String r0 = "qpl.crashResiliency.annotate(string)"
            X.DI8.A01(r0)     // Catch: java.lang.Throwable -> L4e
            X.DIA r2 = r7.A0X     // Catch: java.lang.Throwable -> L45
            if (r2 == 0) goto L41
            X.DJJ r0 = r7.A05(r9, r11)     // Catch: java.lang.Throwable -> L45
            if (r0 == 0) goto L2d
            int r5 = r0.A01     // Catch: java.lang.Throwable -> L45
        L2d:
            r0 = r12 & 2
            if (r0 != 0) goto L3e
            X.DIF r0 = r7.A0W     // Catch: java.lang.Throwable -> L45
            X.DJL r0 = r0.getCrashResiliencyConfig()     // Catch: java.lang.Throwable -> L45
            int r1 = r0.ABS(r5, r8)     // Catch: java.lang.Throwable -> L45
            r0 = -1
            if (r1 == r0) goto L41
        L3e:
            r2.AaL(r5, r11, r8, r10)     // Catch: java.lang.Throwable -> L45
        L41:
            X.DI8.A00()     // Catch: java.lang.Throwable -> L4e
            goto L4a
        L45:
            r0 = move-exception
            X.DI8.A00()     // Catch: java.lang.Throwable -> L4e
            throw r0     // Catch: java.lang.Throwable -> L4e
        L4a:
            X.DI8.A00()
            return
        L4e:
            r0 = move-exception
            X.DI8.A00()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DHu.A0W(java.lang.String, int, java.lang.String, int, int):void");
    }

    private final void A0X(String str, TimeUnit timeUnit, int i, int i2, int i3, int i4, long j, long j2, boolean z, boolean z2) {
        QuickEventImpl quickEventImplA09 = A09(A07(this), this, null, str, timeUnit, i, i2, i3, -1, i4, j, z);
        A0B(i, i2, j2);
        if (!z2 || quickEventImplA09 == null) {
            return;
        }
        DHv.A00(A07(this), quickEventImplA09, "sampling_basis", str, false);
    }

    private boolean A0Z(DIF dif, QuickEventImpl quickEventImpl) {
        long jA02 = quickEventImpl.A08;
        int i = (int) ((jA02 >> 48) & 255);
        if (i != 4) {
            if (i != 10) {
                return quickEventImpl.A0K;
            }
            InterfaceC3472COx interfaceC3472COx = this.A01;
            DJJ djj = quickEventImpl.A0B;
            int i2 = djj != null ? djj.A01 : quickEventImpl.mMarkerId;
            long samplingSpecForMarker = dif.getSamplingSpecForMarker(i2);
            boolean zA1Q = AnonymousClass002.A1Q((int) samplingSpecForMarker, -1);
            boolean zA0Y = A0Y();
            jA02 = A02(quickEventImpl.A0G, quickEventImpl.A0H, i2, samplingSpecForMarker, (A0a(this) || zA0Y || (interfaceC3472COx != null && ((AuraDebugAndTestConfig) interfaceC3472COx).isRunningInPerfTest)) && (!this.A0W.isMarkerBlocked(i2) || zA0Y), zA1Q);
            quickEventImpl.A08 = jA02;
        }
        int i3 = (int) jA02;
        boolean z = (i3 == Integer.MAX_VALUE || i3 == 0) ? false : true;
        quickEventImpl.A0K = z;
        return z;
    }

    public final int A0e(QuickEventImpl quickEventImpl, String str, String str2, TimeUnit timeUnit, int i, int i2, long j, boolean z) {
        CPI cpi;
        DI8.A02("qpl.markerPointEvent", Integer.valueOf(quickEventImpl.mMarkerId));
        try {
            if (!A0c(str)) {
                DI8.A00();
                return -1;
            }
            boolean zA1M = AnonymousClass002.A1M((j > (-1L) ? 1 : (j == (-1L) ? 0 : -1)));
            long jA01 = A01(this, timeUnit, j);
            DHv dHv = this.A07;
            TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
            boolean z2 = !zA1M;
            DI1 di1A07 = A07(this);
            if (str2 != null) {
                cpi = new CPI();
                cpi.A00("__key", str2, 1);
                cpi.A03 = true;
            } else {
                cpi = null;
            }
            int iA05 = dHv.A05(cpi, di1A07, quickEventImpl, str, timeUnit2, i, i2, jA01, z2, z);
            if (iA05 >= 0) {
                A0T(this, "markerPoint", str, str2, quickEventImpl.mMarkerId);
            }
            return iA05;
        } finally {
            DI8.A00();
        }
    }

    public final void A0j(int i, String str, String str2) {
        if (A0c(str)) {
            this.A07.A0B(DI1.A07, str, str2, i, 0);
        }
    }

    @Override // com.facebook.quicklog.QuickPerformanceLogger
    public final boolean isMarkerOn(int i) {
        return isMarkerOn(i, 0);
    }

    @Override // com.facebook.quicklog.QuickPerformanceLogger, com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final EventBuilder markEventBuilder(int i, String str) {
        return A03(null, str, i);
    }

    @Override // com.facebook.quicklog.QuickPerformanceLogger, com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerAnnotateCrucialForUserFlow(int i, int i2, String str, int i3) {
        A0A(i, i2, i3, 2, str);
    }

    @Override // com.facebook.quicklog.QuickPerformanceLogger, com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerDrop(int i) {
        markerDrop(i, 0);
    }

    @Override // com.facebook.quicklog.QuickPerformanceLogger, com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerDropForUserFlow(int i, int i2) {
        A0C(i, i2, currentMonotonicTimestampNanos(), TimeUnit.NANOSECONDS, 2);
    }

    @Override // com.facebook.quicklog.QuickPerformanceLogger
    public final void markerStartForE2E(int i, int i2, String str, boolean z, long j, TimeUnit timeUnit) {
        QuickEventImpl quickEventImplA09;
        if (str == null || (quickEventImplA09 = A09(A07(this), this, str, null, timeUnit, i, i2, 0, -1, 0, j, z)) == null) {
            return;
        }
        DHv.A00(A07(this), quickEventImplA09, "join_id", str, false);
        DHv.A00(A07(this), quickEventImplA09, PhotosSearchHandlerKt.PARAM_SOURCE, "client", false);
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerStartWithCancelPolicy(int i, boolean z) {
        markerStartWithCancelPolicy(i, z, 0);
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final MarkerEditor withMarker(int i) {
        return withMarker(i, 0);
    }

    private int A00() {
        return (this.A0T ? ThreadLocalRandom.current() : this.A0H).nextInt(Integer.MAX_VALUE);
    }

    public static final long A01(DHu dHu, TimeUnit timeUnit, long j) {
        return j == -1 ? dHu.A05.nowNanos() : timeUnit.toNanos(j);
    }

    private EventBuilder A03(DJJ djj, String str, int i) {
        QuickEventImpl quickEventImplA00;
        EventBuilder eventBuilder;
        DHx dHx;
        A0L(i, "qpl.markEventBuilderInternal");
        try {
            long jCurrentMonotonicTimestampNanos = currentMonotonicTimestampNanos();
            long jNow = this.A06.now();
            DIF dif = this.A0W;
            long samplingSpecForMarker = dif.getSamplingSpecForMarker(i);
            InterfaceC3472COx interfaceC3472COx = this.A01;
            long metadataConfigForMarker = dif.getMetadataConfigForMarker(i);
            boolean zA1Q = AnonymousClass002.A1Q((int) samplingSpecForMarker, -1);
            boolean zA0Y = A0Y();
            boolean z = (A0a(this) || zA0Y || (interfaceC3472COx != null && ((AuraDebugAndTestConfig) interfaceC3472COx).isRunningInPerfTest)) && (!dif.isMarkerBlocked(i) || zA0Y);
            long jA02 = A02(null, null, i, samplingSpecForMarker, z, zA1Q);
            DI1 di1A07 = A07(this);
            if (((int) jA02) == Integer.MAX_VALUE) {
                if (di1A07 != null) {
                    C4956DHw c4956DHw = di1A07.A03;
                    if (c4956DHw != null && (c4956DHw.A02(i) != 0 || (djj != null && c4956DHw.A02(djj.A00) != 0))) {
                        quickEventImplA00 = QuickEventImpl.A00(this.A05, TimeUnit.NANOSECONDS, i, 0, A00(), 0, jCurrentMonotonicTimestampNanos, jNow, true, true);
                    } else if (di1A07.A05(djj, i)) {
                        quickEventImplA00 = QuickEventImpl.A00(this.A05, TimeUnit.NANOSECONDS, i, 0, A00(), 0, jCurrentMonotonicTimestampNanos, jNow, true, true);
                        quickEventImplA00.A0E = this.A07.A07(i, 0, metadataConfigForMarker);
                    }
                }
                eventBuilder = DIC.A00;
                return eventBuilder;
            }
            int iA00 = A00();
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            AwakeTimeSinceBootClock awakeTimeSinceBootClock = this.A05;
            DI8.A01("qpl.QuickEvent.allocateActiveEvent");
            quickEventImplA00 = new QuickEventImpl(awakeTimeSinceBootClock);
            quickEventImplA00.mMarkerId = i;
            quickEventImplA00.A08 = jA02;
            quickEventImplA00.A06 = metadataConfigForMarker;
            quickEventImplA00.A0L = z;
            quickEventImplA00.A0M = zA1Q;
            quickEventImplA00.A07 = timeUnit.toNanos(jCurrentMonotonicTimestampNanos);
            quickEventImplA00.A0P = true;
            quickEventImplA00.mTimestampMs = jNow;
            quickEventImplA00.A02 = 0;
            quickEventImplA00.A04 = iA00;
            quickEventImplA00.A01 = 0;
            quickEventImplA00.A0K = true;
            quickEventImplA00.A0N = true;
            quickEventImplA00.A05 = 0L;
            quickEventImplA00.A0G = null;
            quickEventImplA00.A0H = null;
            DI8.A00();
            quickEventImplA00.A0E = this.A07.A07(i, 0, metadataConfigForMarker);
            quickEventImplA00.A0B = djj;
            quickEventImplA00.A00 = 7;
            quickEventImplA00.A06 = metadataConfigForMarker;
            quickEventImplA00.A0I = str;
            ThreadLocal<DHx> threadLocal = DHx.A02;
            DHx dHx2 = threadLocal.get();
            if (dHx2 == null) {
                dHx = new DHx();
            } else {
                threadLocal.set(null);
                dHx = dHx2;
            }
            dHx.A00 = quickEventImplA00;
            dHx.A01 = this;
            eventBuilder = dHx;
            return eventBuilder;
        } finally {
            DI8.A00();
        }
    }

    private DJJ A04(int i, int i2) {
        DI8.A02("qpl.resolveAndDeletePivotData", Integer.valueOf(i));
        try {
            return this.A0E.A00.remove(Long.valueOf(DHv.A01(i, i2)));
        } finally {
            DI8.A00();
        }
    }

    private final DJJ A05(int i, int i2) {
        DI8.A02("qpl.resolvePivotData", Integer.valueOf(i));
        try {
            return this.A0E.A00.get(Long.valueOf(DHv.A01(i, i2)));
        } finally {
            DI8.A00();
        }
    }

    public static final DI1 A07(DHu dHu) {
        DI8.A01("qpl.getListenersList");
        try {
            DHy dHy = dHu.A0a;
            return dHy == null ? DI1.A07 : dHy.A02;
        } finally {
            DI8.A00();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x006a A[Catch: all -> 0x00cd, TryCatch #0 {all -> 0x00cd, blocks: (B:22:0x004b, B:24:0x0051, B:26:0x006a, B:30:0x0079, B:29:0x0073, B:9:0x001f, B:12:0x002b, B:16:0x0039, B:18:0x003f, B:8:0x001c), top: B:38:0x001c }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.facebook.quicklog.QuickEventImpl A08(X.DJJ r20, java.lang.String r21, java.lang.String r22, java.util.concurrent.TimeUnit r23, int r24, int r25, int r26, int r27, long r28, boolean r30, boolean r31) {
        /*
            r19 = this;
            java.lang.String r1 = "qpl.maybeStartTrace"
            r7 = r24
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
            X.DI8.A02(r1, r0)
            r0 = r20
            if (r20 != 0) goto L1c
            r12 = r7
        L10:
            r5 = -1
            r3 = 8
            r11 = 0
            r10 = 1
            r2 = r19
            r1 = r27
            if (r1 != r5) goto L4b
            goto L1f
        L1c:
            int r12 = r0.A01     // Catch: java.lang.Throwable -> Lcd
            goto L10
        L1f:
            X.COx r6 = r2.A01     // Catch: java.lang.Throwable -> Lcd
            X.DIF r0 = r2.A0W     // Catch: java.lang.Throwable -> Lcd
            long r0 = r0.getSamplingSpecForMarker(r12)     // Catch: java.lang.Throwable -> Lcd
            int r4 = (int) r0     // Catch: java.lang.Throwable -> Lcd
            if (r4 != r5) goto L2b
            r11 = 1
        L2b:
            boolean r5 = r2.A0Y()     // Catch: java.lang.Throwable -> Lcd
            boolean r4 = A0a(r2)     // Catch: java.lang.Throwable -> Lcd
            if (r4 != 0) goto L3f
            if (r5 != 0) goto L3f
            if (r6 == 0) goto L50
            com.facebook.aura.qpl.AuraDebugAndTestConfig r6 = (com.facebook.aura.qpl.AuraDebugAndTestConfig) r6     // Catch: java.lang.Throwable -> Lcd
            boolean r4 = r6.isRunningInPerfTest     // Catch: java.lang.Throwable -> Lcd
            if (r4 == 0) goto L50
        L3f:
            X.DIF r4 = r2.A0W     // Catch: java.lang.Throwable -> Lcd
            boolean r4 = r4.isMarkerBlocked(r7)     // Catch: java.lang.Throwable -> Lcd
            if (r4 == 0) goto L49
            if (r5 == 0) goto L50
        L49:
            r9 = 1
            goto L51
        L4b:
            r0 = 4
            long r0 = X.DJP.A00(r1, r0, r10)     // Catch: java.lang.Throwable -> Lcd
        L50:
            r9 = 0
        L51:
            r16 = r21
            r14 = r22
            r21 = r9
            r22 = r11
            r17 = r14
            r18 = r12
            r19 = r0
            r15 = r2
            long r6 = r15.A02(r16, r17, r18, r19, r21, r22)     // Catch: java.lang.Throwable -> Lcd
            int r1 = (int) r6     // Catch: java.lang.Throwable -> Lcd
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r1 == r0) goto Lc8
            r13 = r26
            r0 = r26 & 8
            if (r0 != r3) goto L73
            r0 = 0
            goto L79
        L73:
            X.DIF r0 = r2.A0W     // Catch: java.lang.Throwable -> Lcd
            long r0 = r0.getMetadataConfigForMarker(r12)     // Catch: java.lang.Throwable -> Lcd
        L79:
            int r8 = r2.A00()     // Catch: java.lang.Throwable -> Lcd
            X.F0o r3 = r2.A06     // Catch: java.lang.Throwable -> Lcd
            long r4 = r3.now()     // Catch: java.lang.Throwable -> Lcd
            r3 = r31 ^ 1
            com.facebook.common.time.AwakeTimeSinceBootClock r15 = r2.A05     // Catch: java.lang.Throwable -> Lcd
            java.lang.String r2 = "qpl.QuickEvent.allocateActiveEvent"
            X.DI8.A01(r2)     // Catch: java.lang.Throwable -> Lcd
            com.facebook.quicklog.QuickEventImpl r2 = new com.facebook.quicklog.QuickEventImpl     // Catch: java.lang.Throwable -> Lcd
            r2.<init>(r15)     // Catch: java.lang.Throwable -> Lcd
            r2.mMarkerId = r12     // Catch: java.lang.Throwable -> Lcd
            r2.A08 = r6     // Catch: java.lang.Throwable -> Lcd
            r2.A06 = r0     // Catch: java.lang.Throwable -> Lcd
            r2.A0L = r9     // Catch: java.lang.Throwable -> Lcd
            r2.A0M = r11     // Catch: java.lang.Throwable -> Lcd
            r6 = r23
            r0 = r28
            long r0 = r6.toNanos(r0)     // Catch: java.lang.Throwable -> Lcd
            r2.A07 = r0     // Catch: java.lang.Throwable -> Lcd
            r0 = r30
            r2.A0P = r0     // Catch: java.lang.Throwable -> Lcd
            r2.mTimestampMs = r4     // Catch: java.lang.Throwable -> Lcd
            r0 = r25
            r2.A02 = r0     // Catch: java.lang.Throwable -> Lcd
            r2.A04 = r8     // Catch: java.lang.Throwable -> Lcd
            r2.A01 = r13     // Catch: java.lang.Throwable -> Lcd
            r2.A0K = r10     // Catch: java.lang.Throwable -> Lcd
            r2.A0N = r3     // Catch: java.lang.Throwable -> Lcd
            r0 = 0
            r2.A05 = r0     // Catch: java.lang.Throwable -> Lcd
            r0 = r16
            r2.A0G = r0     // Catch: java.lang.Throwable -> Lcd
            r2.A0H = r14     // Catch: java.lang.Throwable -> Lcd
            X.DI8.A00()     // Catch: java.lang.Throwable -> Lcd
            X.DI8.A00()
            return r2
        Lc8:
            X.DI8.A00()
            r2 = 0
            return r2
        Lcd:
            r0 = move-exception
            X.DI8.A00()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DHu.A08(X.DJJ, java.lang.String, java.lang.String, java.util.concurrent.TimeUnit, int, int, int, int, long, boolean, boolean):com.facebook.quicklog.QuickEventImpl");
    }

    private void A0B(int i, int i2, long j) {
        DHv dHv = this.A07;
        if (j != -1) {
            QuickEventImpl quickEventImplA01 = dHv.A02.A01(DHv.A01(i, i2));
            if (quickEventImplA01 != null) {
                DHr dHr = quickEventImplA01.A0S;
                dHr.A01();
                try {
                    quickEventImplA01.A09 = j;
                } finally {
                    dHr.A02();
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x004e, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0052, code lost:
    
        throw r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A0C(int r12, int r13, long r14, java.util.concurrent.TimeUnit r16, int r17) {
        /*
            r11 = this;
            java.lang.String r0 = "qpl.markerDrop"
            r7 = r12
            A0L(r12, r0)
            r3 = 0
            r8 = r13
            X.DJJ r0 = r11.A04(r12, r13)     // Catch: java.lang.Throwable -> L4e
            if (r0 != 0) goto L10
            r2 = r12
            goto L12
        L10:
            int r2 = r0.A01     // Catch: java.lang.Throwable -> L4e
        L12:
            java.lang.String r0 = "qpl.crashResiliency"
            X.DI8.A01(r0)     // Catch: java.lang.Throwable -> L4e
            X.DIA r1 = r11.A0X     // Catch: java.lang.Throwable -> L49
            if (r1 == 0) goto L2e
            r0 = r17 & 2
            if (r0 != 0) goto L2b
            X.DIF r0 = r11.A0W     // Catch: java.lang.Throwable -> L49
            X.DJL r0 = r0.getCrashResiliencyConfig()     // Catch: java.lang.Throwable -> L49
            boolean r0 = r0.AOj(r2)     // Catch: java.lang.Throwable -> L49
            if (r0 == 0) goto L2e
        L2b:
            r1.AaM(r2, r13)     // Catch: java.lang.Throwable -> L49
        L2e:
            X.DI8.A00()     // Catch: java.lang.Throwable -> L4e
            X.DHv r4 = r11.A07     // Catch: java.lang.Throwable -> L4e
            X.DI1 r5 = A07(r11)     // Catch: java.lang.Throwable -> L4e
            r9 = r14
            r6 = r16
            com.facebook.quicklog.QuickEventImpl r0 = r4.A06(r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L4e
            if (r0 == 0) goto L45
            java.lang.String r0 = "markerDrop"
            A0T(r11, r0, r3, r3, r12)     // Catch: java.lang.Throwable -> L4e
        L45:
            X.DI8.A00()
            return
        L49:
            r0 = move-exception
            X.DI8.A00()     // Catch: java.lang.Throwable -> L4e
            throw r0     // Catch: java.lang.Throwable -> L4e
        L4e:
            r0 = move-exception
            X.DI8.A00()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DHu.A0C(int, int, long, java.util.concurrent.TimeUnit, int):void");
    }

    private final void A0D(int i, int i2, String str, double d) {
        QuickEventImpl quickEventImplA01;
        A0L(i, "qpl.markerAnnotate(double)");
        try {
            if (A0c(str)) {
                DHv dHv = this.A07;
                DI1 di1A07 = A07(this);
                long jA01 = DHv.A01(i, i2);
                DI3 di3 = dHv.A02;
                if (di3.A04(di1A07, jA01) && (quickEventImplA01 = di3.A01(jA01)) != null) {
                    DHr dHr = quickEventImplA01.A0S;
                    dHr.A01();
                    try {
                        if (DI3.A00(di1A07, quickEventImplA01)) {
                            di1A07.A01(quickEventImplA01, quickEventImplA01.A0R.A09(str, d));
                        }
                        dHr.A02();
                    } catch (Throwable th) {
                        dHr.A02();
                        throw th;
                    }
                }
            }
        } finally {
            DI8.A00();
        }
    }

    private final void A0E(int i, int i2, String str, long j) {
        QuickEventImpl quickEventImplA01;
        A0L(i, "qpl.markerAnnotate(long)");
        try {
            if (A0c(str)) {
                DHv dHv = this.A07;
                DI1 di1A07 = A07(this);
                long jA01 = DHv.A01(i, i2);
                DI3 di3 = dHv.A02;
                if (di3.A04(di1A07, jA01) && (quickEventImplA01 = di3.A01(jA01)) != null) {
                    DHr dHr = quickEventImplA01.A0S;
                    dHr.A01();
                    try {
                        if (DI3.A00(di1A07, quickEventImplA01)) {
                            di1A07.A01(quickEventImplA01, quickEventImplA01.A0R.A0B(str, j));
                        }
                        dHr.A02();
                    } catch (Throwable th) {
                        dHr.A02();
                        throw th;
                    }
                }
            }
        } finally {
            DI8.A00();
        }
    }

    private final void A0F(int i, int i2, String str, boolean z) {
        QuickEventImpl quickEventImplA01;
        DI8.A02("qpl.markerAnnotate(boolean)", Integer.valueOf(i));
        try {
            if (A0c(str)) {
                DHv dHv = this.A07;
                DI1 di1A07 = A07(this);
                long jA01 = DHv.A01(i, i2);
                DI3 di3 = dHv.A02;
                if (di3.A04(di1A07, jA01) && (quickEventImplA01 = di3.A01(jA01)) != null) {
                    DHr dHr = quickEventImplA01.A0S;
                    dHr.A01();
                    try {
                        if (DI3.A00(di1A07, quickEventImplA01)) {
                            di1A07.A01(quickEventImplA01, quickEventImplA01.A0R.A0D(str, z));
                        }
                        dHr.A02();
                    } catch (Throwable th) {
                        dHr.A02();
                        throw th;
                    }
                }
            }
        } finally {
            DI8.A00();
        }
    }

    private final void A0G(int i, int i2, String str, double[] dArr) {
        QuickEventImpl quickEventImplA01;
        A0L(i, "qpl.markerAnnotate(double[])");
        try {
            if (A0c(str)) {
                DHv dHv = this.A07;
                DI1 di1A07 = A07(this);
                long jA01 = DHv.A01(i, i2);
                DI3 di3 = dHv.A02;
                if (di3.A04(di1A07, jA01) && (quickEventImplA01 = di3.A01(jA01)) != null) {
                    DHr dHr = quickEventImplA01.A0S;
                    dHr.A01();
                    try {
                        if (DI3.A00(di1A07, quickEventImplA01)) {
                            di1A07.A01(quickEventImplA01, quickEventImplA01.A0R.A0E(str, dArr));
                        }
                        dHr.A02();
                    } catch (Throwable th) {
                        dHr.A02();
                        throw th;
                    }
                }
            }
        } finally {
            DI8.A00();
        }
    }

    private final void A0H(int i, int i2, String str, int[] iArr) {
        QuickEventImpl quickEventImplA01;
        A0L(i, "qpl.markerAnnotate(int[])");
        try {
            if (A0c(str)) {
                DHv dHv = this.A07;
                DI1 di1A07 = A07(this);
                long jA01 = DHv.A01(i, i2);
                DI3 di3 = dHv.A02;
                if (di3.A04(di1A07, jA01) && (quickEventImplA01 = di3.A01(jA01)) != null) {
                    DHr dHr = quickEventImplA01.A0S;
                    dHr.A01();
                    try {
                        if (DI3.A00(di1A07, quickEventImplA01)) {
                            di1A07.A01(quickEventImplA01, quickEventImplA01.A0R.A0F(str, iArr));
                        }
                        dHr.A02();
                    } catch (Throwable th) {
                        dHr.A02();
                        throw th;
                    }
                }
            }
        } finally {
            DI8.A00();
        }
    }

    private final void A0I(int i, int i2, String str, long[] jArr) {
        QuickEventImpl quickEventImplA01;
        A0L(i, "qpl.markerAnnotate(long[])");
        try {
            if (A0c(str)) {
                DHv dHv = this.A07;
                DI1 di1A07 = A07(this);
                long jA01 = DHv.A01(i, i2);
                DI3 di3 = dHv.A02;
                if (di3.A04(di1A07, jA01) && (quickEventImplA01 = di3.A01(jA01)) != null) {
                    DHr dHr = quickEventImplA01.A0S;
                    dHr.A01();
                    try {
                        if (DI3.A00(di1A07, quickEventImplA01)) {
                            di1A07.A01(quickEventImplA01, quickEventImplA01.A0R.A0G(str, jArr));
                        }
                        dHr.A02();
                    } catch (Throwable th) {
                        dHr.A02();
                        throw th;
                    }
                }
            }
        } finally {
            DI8.A00();
        }
    }

    private final void A0J(int i, int i2, String str, String[] strArr) {
        QuickEventImpl quickEventImplA01;
        A0L(i, "qpl.markerAnnotate(String[])");
        try {
            if (A0c(str)) {
                DHv dHv = this.A07;
                DI1 di1A07 = A07(this);
                long jA01 = DHv.A01(i, i2);
                DI3 di3 = dHv.A02;
                if (di3.A04(di1A07, jA01) && (quickEventImplA01 = di3.A01(jA01)) != null) {
                    DHr dHr = quickEventImplA01.A0S;
                    dHr.A01();
                    try {
                        if (DI3.A00(di1A07, quickEventImplA01)) {
                            di1A07.A01(quickEventImplA01, quickEventImplA01.A0R.A0I(strArr, str));
                        }
                        dHr.A02();
                    } catch (Throwable th) {
                        dHr.A02();
                        throw th;
                    }
                }
            }
        } finally {
            DI8.A00();
        }
    }

    private final void A0K(int i, int i2, String str, boolean[] zArr) {
        QuickEventImpl quickEventImplA01;
        A0L(i, "qpl.markerAnnotate(boolean[])");
        try {
            if (A0c(str)) {
                DHv dHv = this.A07;
                DI1 di1A07 = A07(this);
                long jA01 = DHv.A01(i, i2);
                DI3 di3 = dHv.A02;
                if (di3.A04(di1A07, jA01) && (quickEventImplA01 = di3.A01(jA01)) != null) {
                    DHr dHr = quickEventImplA01.A0S;
                    dHr.A01();
                    try {
                        if (DI3.A00(di1A07, quickEventImplA01)) {
                            di1A07.A01(quickEventImplA01, quickEventImplA01.A0R.A0H(str, zArr));
                        }
                        dHr.A02();
                    } catch (Throwable th) {
                        dHr.A02();
                        throw th;
                    }
                }
            }
        } finally {
            DI8.A00();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A0M(X.CPI r22, java.lang.String r23, java.util.concurrent.TimeUnit r24, int r25, int r26, int r27, int r28, int r29, long r30) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DHu.A0M(X.CPI, java.lang.String, java.util.concurrent.TimeUnit, int, int, int, int, int, long):void");
    }

    private void A0N(DIF dif, DI1 di1) {
        while (true) {
            QuickEventImpl quickEventImplPoll = this.A0I.poll();
            if (quickEventImplPoll == null) {
                return;
            }
            this.A0J.decrementAndGet();
            if (!dif.isMarkerBlocked(quickEventImplPoll.mMarkerId)) {
                if (di1 != null) {
                    A0P(di1, quickEventImplPoll, true);
                }
                if (A0Z(dif, quickEventImplPoll)) {
                    A0R(quickEventImplPoll, this, false);
                }
            }
        }
    }

    private void A0O(DI1 di1) {
        DI3 di3 = this.A07.A02;
        DI8.A01("qpl.activeTraces.forEachOpenTrace");
        try {
            Iterator itA0x = BV5.A0x(di3.A00.A00);
            while (itA0x.hasNext()) {
                Object next = itA0x.next();
                C7384Etj.A0U(next);
                QuickEventImpl quickEventImpl = (QuickEventImpl) next;
                try {
                    DHr dHr = quickEventImpl.A0S;
                    dHr.A01();
                    A0P(di1, quickEventImpl, false);
                    dHr.A02();
                } finally {
                }
            }
        } finally {
            DI8.A00();
        }
    }

    public static final void A0R(final QuickEventImpl quickEventImpl, final DHu dHu, boolean z) {
        if (!z) {
            final DGY dgy = dHu.A00;
            A0V(dgy, "BackgroundExecution", "MATURE");
            dgy.execute(new Runnable() { // from class: X.DHj
                public static final String __redex_internal_original_name = "QuickPerformanceLoggerImpl$$ExternalSyntheticLambda1";

                @Override // java.lang.Runnable
                public final void run() {
                    final DHu dHu2 = dHu;
                    final QuickEventImpl quickEventImpl2 = quickEventImpl;
                    DGY dgy2 = dgy;
                    final SettableFuture settableFuture = new SettableFuture();
                    final DGY dgy3 = dHu2.A00;
                    DHu.A0V(dgy3, "BackgroundExecution", "mature");
                    F18 f18 = dHu2.A0C;
                    if (f18 != null && quickEventImpl2.A06 != 0) {
                        QuickPerformanceLoggerGKs quickPerformanceLoggerGKs = dHu2.A08;
                        if (quickPerformanceLoggerGKs != null) {
                            quickPerformanceLoggerGKs.getMetadataGKs();
                        }
                        Iterator it = ((Collection) f18.AMN()).iterator();
                        if (it.hasNext()) {
                            it.next();
                            throw new NullPointerException("metadataCategory");
                        }
                    }
                    ListenableFuture<?> listenableFuture = CPZ.A01;
                    final C4955DHq c4955DHq = dHu2.A03;
                    if (c4955DHq != null && quickEventImpl2.A06 != 0) {
                        QuickPerformanceLoggerGKs quickPerformanceLoggerGKs2 = dHu2.A08;
                        final InterfaceC3173C1c metadataGKs = quickPerformanceLoggerGKs2 != null ? quickPerformanceLoggerGKs2.getMetadataGKs() : null;
                        for (final int i : c4955DHq.A00) {
                            if ((quickEventImpl2.A06 & (1 << (i - 1))) != 0) {
                                final SettableFuture settableFuture2 = new SettableFuture();
                                new C3481CPp(ImmutableList.copyOf(new ListenableFuture[]{listenableFuture})).A00(new Runnable() { // from class: X.DHm
                                    public static final String __redex_internal_original_name = "QuickPerformanceLoggerImpl$$ExternalSyntheticLambda8";

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        DHu dHu3 = dHu2;
                                        C4955DHq c4955DHq2 = c4955DHq;
                                        int i2 = i;
                                        InterfaceC3173C1c interfaceC3173C1c = metadataGKs;
                                        final SettableFuture settableFuture3 = settableFuture2;
                                        QuickEventImpl quickEventImpl3 = quickEventImpl2;
                                        DGY dgy4 = dgy3;
                                        try {
                                            DHp<?, ?> dHp = c4955DHq2.A01[i2];
                                            if (dHp == null) {
                                                throw BV5.A0Q("Unknown provider with id = ", i2);
                                            }
                                            if (interfaceC3173C1c != null && !dHp.isEnabled(interfaceC3173C1c)) {
                                                settableFuture3.set(null);
                                                return;
                                            }
                                            int providerTypeId = dHp.getProviderTypeId();
                                            InterfaceC4978DJv<?> interfaceC4978DJv = quickEventImpl3.A0D;
                                            Object obj = interfaceC4978DJv == null ? null : interfaceC4978DJv.get(providerTypeId);
                                            InterfaceC4978DJv<?> interfaceC4978DJv2 = quickEventImpl3.A0E;
                                            Object obj2 = interfaceC4978DJv2 == null ? null : interfaceC4978DJv2.get(providerTypeId);
                                            EtT etTAHg = quickEventImpl3.AHg();
                                            String providerName = dHp.getProviderName();
                                            EtT.A00(etTAHg);
                                            etTAHg.A01.add(providerName);
                                            dHp.decorateEvent(quickEventImpl3, dHp.getStartType().cast(obj), dHp.getSnapshotType().cast(obj2)).addListener(new Runnable() { // from class: X.DIy
                                                public static final String __redex_internal_original_name = "QuickPerformanceLoggerImpl$$ExternalSyntheticLambda4";

                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    settableFuture3.set(null);
                                                }
                                            }, dgy4);
                                        } catch (Exception unused) {
                                            QuickPerformanceLoggerGKs quickPerformanceLoggerGKs3 = dHu3.A08;
                                            if (quickPerformanceLoggerGKs3 == null || !quickPerformanceLoggerGKs3.isMetadataProvidersFixEnabled()) {
                                                return;
                                            }
                                            settableFuture3.set(null);
                                        }
                                    }
                                }, dgy3);
                                listenableFuture = settableFuture2;
                            }
                        }
                    }
                    CQD.A01(new F55(dHu2, 0), new C3481CPp(ImmutableList.copyOf(new ListenableFuture[]{listenableFuture})).A00(new Runnable() { // from class: X.DHz
                        public static final String __redex_internal_original_name = "QuickPerformanceLoggerImpl$$ExternalSyntheticLambda6";

                        @Override // java.lang.Runnable
                        public final void run() {
                            DI6[] di6Arr;
                            DHu dHu3 = dHu2;
                            QuickEventImpl quickEventImpl3 = quickEventImpl2;
                            SettableFuture settableFuture3 = settableFuture;
                            try {
                                DIJ dij = DHu.A07(dHu3).A02;
                                if (dij != null) {
                                    DJJ djj = quickEventImpl3.A0B;
                                    int i2 = 0;
                                    long jA03 = djj == null ? dij.A03(quickEventImpl3.getMarkerId(), 0) : dij.A03(djj.A00, 0) | dij.A03(djj.A01, 0);
                                    if (jA03 != 0 && (di6Arr = dij.A02) != null) {
                                        long j = 1;
                                        while (i2 < di6Arr.length) {
                                            if ((jA03 & j) != 0) {
                                                di6Arr[i2].onMetadataCollected(quickEventImpl3);
                                            }
                                            i2++;
                                            j <<= 1;
                                        }
                                    }
                                }
                                if (C9X.A04()) {
                                    F18 f182 = dHu3.A0D;
                                    String markerName = ((AuraQplNameProvider) f182.AMN()).getMarkerName(quickEventImpl3.mMarkerId);
                                    f182.AMN();
                                    short s = quickEventImpl3.A0J;
                                    CFK.A00(markerName, Integer.valueOf(quickEventImpl3.mMarkerId), AbstractC10411Hbi.A00(s), Short.valueOf(s), "QuickPerformanceLoggerImpl", "E2E QPL Send: %s (%d) %s (%d)");
                                }
                                DJF[] djfArr = dHu3.A04;
                                if (djfArr != null) {
                                    for (DJF djf : djfArr) {
                                        djf.visit(quickEventImpl3);
                                    }
                                }
                            } finally {
                                settableFuture3.set(quickEventImpl3);
                            }
                        }
                    }, dgy2), dgy2);
                    new C3481CPp(ImmutableList.copyOf(new ListenableFuture[]{settableFuture})).A00(new Runnable() { // from class: X.DHi
                        public static final String __redex_internal_original_name = "QuickPerformanceLoggerImpl$$ExternalSyntheticLambda0";

                        /* JADX WARN: Removed duplicated region for block: B:25:0x005d  */
                        /* JADX WARN: Removed duplicated region for block: B:50:0x00dd  */
                        /* JADX WARN: Removed duplicated region for block: B:6:0x001a  */
                        @Override // java.lang.Runnable
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final void run() {
                            /*
                                Method dump skipped, instructions count: 464
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: X.DHi.run():void");
                        }
                    }, dgy2);
                }
            });
            return;
        }
        if (dHu.A0U == 3) {
            if (((int) ((quickEventImpl.A08 >> 48) & 255)) != 10 || dHu.A0Z(dHu.A0W, quickEventImpl)) {
                A0R(quickEventImpl, dHu, false);
            }
            dHu.A0N(dHu.A0W, null);
            return;
        }
        AtomicInteger atomicInteger = dHu.A0J;
        if (atomicInteger.incrementAndGet() <= 15000) {
            dHu.A0I.add(quickEventImpl);
            return;
        }
        do {
            atomicInteger.decrementAndGet();
        } while (dHu.A0I.poll() != null);
        RuntimeException runtimeException = new RuntimeException("Postponed events queue is full");
        ConcurrentLinkedQueue<Exception> concurrentLinkedQueue = dHu.A0A;
        if (concurrentLinkedQueue.size() < 10) {
            concurrentLinkedQueue.add(runtimeException);
        } else {
            CFK.A08("QuickPerformanceLoggerImpl", "SoftError occurred, but was not reported: error queue is full", runtimeException);
        }
    }

    /* JADX WARN: In static synchronized method top region not synchronized by class const: (r7v0 X.DHu) */
    public static synchronized void A0S(DHu dHu, String str, int i) {
        synchronized (dHu) {
            int length = str.length();
            int i2 = (length + EIN.MAX_BIND_PARAMETER_CNT) / 1000;
            int i3 = 0;
            while (i3 < i2) {
                String str2 = i3 > 0 ? "..." : "";
                int i4 = i3 * 1000;
                i3++;
                String strA0M = FGI.A0M(str2, str.substring(i4, Math.min(i3 * 1000, length)));
                if (i != 2) {
                    CFK.A06("QuickPerformanceLoggerImpl", strA0M);
                }
            }
        }
    }

    /* JADX WARN: Incorrect return type in method signature: <T:Ljava/lang/Object;>(TT;Ljava/lang/String;)TT; */
    public static void A0U(Object obj, String str) {
        if (obj == null) {
            throw BV4.A0a(FGI.A0M(str, " must not be null"));
        }
    }

    /* JADX WARN: Incorrect return type in method signature: <T:Ljava/lang/Object;>(TT;Ljava/lang/String;Ljava/lang/String;)TT; */
    public static void A0V(Object obj, String str, String str2) {
        if (obj == null) {
            throw new IllegalStateException(FGI.A0h("Component ", str, " should already be resolved, but was not. Check if the ", str2, " is a correct stage, or a stack trace: why it is called earlier then expected?"));
        }
    }

    private boolean A0Y() {
        InterfaceC3472COx interfaceC3472COx = this.A01;
        if (interfaceC3472COx == null) {
            return false;
        }
        if (this.A0Z == TriState.A03) {
            this.A0Z = ((AuraDebugAndTestConfig) interfaceC3472COx).isSendingAllMarkersEnabled;
        }
        return this.A0Z.A00();
    }

    public static boolean A0b(DHu dHu) {
        InterfaceC3472COx interfaceC3472COx = dHu.A01;
        if (interfaceC3472COx == null) {
            return false;
        }
        if (dHu.A0Y == TriState.A03) {
            dHu.A0Y = ((AuraDebugAndTestConfig) interfaceC3472COx).isOutputToLogcatEnabled;
        }
        return dHu.A0Y.A00();
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0009  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean A0c(java.lang.String r1) {
        /*
            if (r1 == 0) goto L9
            boolean r1 = r1.isEmpty()
            r0 = 0
            if (r1 == 0) goto La
        L9:
            r0 = 1
        La:
            r0 = r0 ^ 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DHu.A0c(java.lang.String):boolean");
    }

    public final int A0d(QuickEventImpl quickEventImpl, String str, int i, boolean z) {
        DI8.A02("qpl.markerAnnotateEvent(int)", Integer.valueOf(quickEventImpl.mMarkerId));
        try {
            if (!A0c(str)) {
                return -1;
            }
            DI1 di1A06 = A06(quickEventImpl, this, z ? 1 : 0);
            try {
                int iA0A = quickEventImpl.A0R.A0A(str, i);
                if (!z) {
                    di1A06.A01(quickEventImpl, iA0A);
                    DHr.A00(quickEventImpl);
                }
                DI8.A01("qpl.crashResiliency.annotate(int)");
                try {
                    DIA dia = this.A0X;
                    if (dia != null && this.A0W.getCrashResiliencyConfig().ABS(quickEventImpl.getMarkerId(), str) != -1) {
                        dia.AaK(quickEventImpl.getMarkerId(), quickEventImpl.A02, str, i);
                    }
                    DI8.A00();
                    return iA0A;
                } catch (Throwable th) {
                    DI8.A00();
                    throw th;
                }
            } catch (Throwable th2) {
                if (z) {
                    throw th2;
                }
                DHr.A00(quickEventImpl);
                throw th2;
            }
        } finally {
            DI8.A00();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004c, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0050, code lost:
    
        throw r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int A0f(com.facebook.quicklog.QuickEventImpl r6, java.lang.String r7, java.lang.String r8, boolean r9) {
        /*
            r5 = this;
            int r0 = r6.mMarkerId
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "qpl.markerAnnotateEvent(String)"
            X.DI8.A02(r0, r1)
            boolean r0 = A0c(r7)     // Catch: java.lang.Throwable -> L4c
            r4 = -1
            if (r0 != 0) goto L16
            X.DI8.A00()
            return r4
        L16:
            X.DI1 r0 = A07(r5)     // Catch: java.lang.Throwable -> L4c
            int r3 = X.DHv.A00(r0, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L4c
            java.lang.String r0 = "qpl.crashResiliency.annotate(string)"
            X.DI8.A01(r0)     // Catch: java.lang.Throwable -> L4c
            X.DIA r2 = r5.A0X     // Catch: java.lang.Throwable -> L47
            if (r2 == 0) goto L40
            X.DIF r0 = r5.A0W     // Catch: java.lang.Throwable -> L47
            X.DJL r1 = r0.getCrashResiliencyConfig()     // Catch: java.lang.Throwable -> L47
            int r0 = r6.getMarkerId()     // Catch: java.lang.Throwable -> L47
            int r0 = r1.ABS(r0, r7)     // Catch: java.lang.Throwable -> L47
            if (r0 == r4) goto L40
            int r1 = r6.getMarkerId()     // Catch: java.lang.Throwable -> L47
            int r0 = r6.A02     // Catch: java.lang.Throwable -> L47
            r2.AaL(r1, r0, r7, r8)     // Catch: java.lang.Throwable -> L47
        L40:
            X.DI8.A00()     // Catch: java.lang.Throwable -> L4c
            X.DI8.A00()
            return r3
        L47:
            r0 = move-exception
            X.DI8.A00()     // Catch: java.lang.Throwable -> L4c
            throw r0     // Catch: java.lang.Throwable -> L4c
        L4c:
            r0 = move-exception
            X.DI8.A00()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DHu.A0f(com.facebook.quicklog.QuickEventImpl, java.lang.String, java.lang.String, boolean):int");
    }

    public final void A0g() {
        DI8.A01("qpl.transitToEarlyStage");
        try {
            ReentrantLock reentrantLock = this.A0K;
            reentrantLock.lock();
            try {
                if (this.A0U != 0) {
                    throw C3cG.A0Q("transitToEarlyStage can be done as first transition");
                }
                this.A0U = 1;
                QuickPerformanceLoggerGKs quickPerformanceLoggerGKs = this.A08;
                if (quickPerformanceLoggerGKs != null) {
                    quickPerformanceLoggerGKs.useEarlyConfigInEarlyStage();
                }
                DJX.A00 = new DJ3(this);
                if (quickPerformanceLoggerGKs != null && quickPerformanceLoggerGKs.getHealthCountersInitStage() == 0) {
                    quickPerformanceLoggerGKs.enableHealthCounters();
                }
            } finally {
                reentrantLock.unlock();
            }
        } finally {
            DI8.A00();
        }
    }

    public final void A0h() {
        InterfaceC4945DGj interfaceC4945DGj;
        DI6[] di6Arr;
        DI6[] di6Arr2;
        int length;
        AwakeTimeSinceBootClock awakeTimeSinceBootClock;
        InterfaceC4945DGj interfaceC4945DGj2;
        DI8.A01("qpl.transitToMatureStage");
        try {
            ReentrantLock reentrantLock = this.A0K;
            reentrantLock.lock();
            try {
                if (this.A0U != 2) {
                    throw C3cG.A0Q("transitToMatureStage can be done only after warm stage");
                }
                QuickPerformanceLoggerGKs quickPerformanceLoggerGKs = this.A08;
                if (quickPerformanceLoggerGKs != null && quickPerformanceLoggerGKs.getHealthCountersInitStage() == 2) {
                    quickPerformanceLoggerGKs.enableHealthCounters();
                }
                DIF dif = this.A0M.AMN();
                A0U(dif, "QPLConfiguration");
                this.A0W = dif;
                F18 f18 = this.A0Q;
                if (f18 != null) {
                    f18.AMN();
                }
                DHy dHy = this.A0a;
                A0V(dHy, "QPLListenerListHolder", "Mature");
                DI1 di1 = dHy.A02;
                DGY dgy = this.A0L.AMN();
                this.A00 = dgy;
                synchronized (dHy) {
                    try {
                        DI1 di12 = dHy.A02;
                        if (di12.A01 != dgy && (awakeTimeSinceBootClock = di12.A00) != null && (interfaceC4945DGj2 = di12.A05) != null) {
                            di12 = new DI1(awakeTimeSinceBootClock, dgy, di12.A04, interfaceC4945DGj2, di12.A06);
                        }
                        dHy.A02 = di12;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                F18 f182 = this.A0N;
                C4955DHq c4955DHq = (C4955DHq) (f182 == null ? null : f182.AMN());
                this.A03 = c4955DHq;
                DHv dHv = this.A07;
                C7384Etj.A0Y(dif, 1);
                dHv.A00 = c4955DHq;
                DIA dia = this.A0R.AMN();
                if (dia != null) {
                    dia.AeJ(this);
                }
                this.A0X = dia;
                DI1 di13 = dHy.A02;
                C7384Etj.A0Y(di1, 0);
                AwakeTimeSinceBootClock awakeTimeSinceBootClock2 = di13.A00;
                if (awakeTimeSinceBootClock2 != null && (interfaceC4945DGj = di13.A05) != null && (di6Arr = di13.A06) != null && (di6Arr2 = di1.A06) != null && (length = di6Arr2.length) != 0) {
                    HashSet hashSetA0x = BV4.A0x(AbstractC0885AGm.A11(Arrays.copyOf(di6Arr2, length)));
                    ArrayList arrayListA0h = C3cG.A0h();
                    for (DI6 di6 : di6Arr) {
                        if (!hashSetA0x.contains(di6)) {
                            arrayListA0h.add(di6);
                        }
                    }
                    di13 = new DI1(awakeTimeSinceBootClock2, di13.A01, di13.A04, interfaceC4945DGj, (DI6[]) arrayListA0h.toArray(new DI6[0]));
                }
                try {
                    DJF[] djfArr = (DJF[]) this.A0S.AMN().toArray(new DJF[0]);
                    this.A04 = djfArr;
                    Arrays.sort(djfArr, DJF.A00);
                } catch (Exception e) {
                    ConcurrentLinkedQueue<Exception> concurrentLinkedQueue = this.A0A;
                    if (concurrentLinkedQueue.size() < 10) {
                        concurrentLinkedQueue.add(e);
                    } else {
                        CFK.A08("QuickPerformanceLoggerImpl", "SoftError occurred, but was not reported: error queue is full", e);
                    }
                    this.A04 = null;
                }
                A0N(dif, di13);
                A0O(di13);
                if (quickPerformanceLoggerGKs != null && quickPerformanceLoggerGKs.replayEarlyEventsToCrashResiliency()) {
                    DJL crashResiliencyConfig = dif.getCrashResiliencyConfig();
                    if (dia != null && crashResiliencyConfig != null) {
                        DI3 di3 = dHv.A02;
                        DI8.A01("qpl.activeTraces.forEachOpenTrace");
                        try {
                            Iterator itA0x = BV5.A0x(di3.A00.A00);
                            while (itA0x.hasNext()) {
                                Object next = itA0x.next();
                                C7384Etj.A0U(next);
                                QuickEventImpl quickEventImpl = (QuickEventImpl) next;
                                try {
                                    DHr dHr = quickEventImpl.A0S;
                                    dHr.A01();
                                    int markerId = quickEventImpl.getMarkerId();
                                    int i = quickEventImpl.A02;
                                    if ((quickEventImpl.A01 & 2) > 0 || crashResiliencyConfig.AOj(markerId)) {
                                        dia.AaP(markerId, i, !quickEventImpl.A0N);
                                        String str = null;
                                        int i2 = 0;
                                        for (String str2 : quickEventImpl.A0R.A0P()) {
                                            if (i2 % 2 == 0) {
                                                str = str2;
                                            } else if (crashResiliencyConfig.ABS(markerId, str != null ? str : "") != -1) {
                                                dia.AaL(markerId, i, str, str2);
                                            }
                                            i2++;
                                        }
                                        DHo dHo = quickEventImpl.A0A;
                                        if (dHo != null) {
                                            int i3 = dHo.A01;
                                            for (int i4 = 0; i4 < i3; i4++) {
                                                String str3 = dHo.A06[i4];
                                                if (str3 != null) {
                                                    long j = dHo.A03[i4];
                                                    if (crashResiliencyConfig.ABT(markerId, str3) != -1) {
                                                        dia.AaO(markerId, i, str3, j - quickEventImpl.A07);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    dHr.A02();
                                } catch (Throwable th2) {
                                    DHr.A00(quickEventImpl);
                                    throw th2;
                                }
                            }
                            DI8.A00();
                        } catch (Throwable th3) {
                            DI8.A00();
                            throw th3;
                        }
                    }
                }
                DI3 di32 = dHv.A02;
                DI8.A01("qpl.activeTraces.forEachOpenTrace");
                try {
                    Iterator itA0x2 = BV5.A0x(di32.A00.A00);
                    while (itA0x2.hasNext()) {
                        Object next2 = itA0x2.next();
                        C7384Etj.A0U(next2);
                        QuickEventImpl quickEventImpl2 = (QuickEventImpl) next2;
                        try {
                            DHr dHr2 = quickEventImpl2.A0S;
                            dHr2.A01();
                            A0Z(dif, quickEventImpl2);
                            dHr2.A02();
                        } catch (Throwable th4) {
                            DHr.A00(quickEventImpl2);
                            throw th4;
                        }
                    }
                    DI8.A00();
                    this.A0U = 3;
                    ConcurrentLinkedQueue<Exception> concurrentLinkedQueue2 = this.A0A;
                    Iterator<Exception> it = concurrentLinkedQueue2.iterator();
                    while (it.hasNext()) {
                        CFK.A08("QuickPerformanceLoggerImpl", "SoftError occurred, but was not reported: health monitor is off", it.next());
                    }
                    concurrentLinkedQueue2.clear();
                    boolean z = quickPerformanceLoggerGKs == null || !quickPerformanceLoggerGKs.isAppIdBasedConfigWithSamplingFallbackEnabled();
                    EventBuilder eventBuilderAnnotate = markEventBuilder(27792138, "app_init").setLevel(7).annotate("qpl_internal__missing_config_tracker_enabled", z);
                    if (z) {
                        eventBuilderAnnotate.annotate("qpl_internal__missing_config_tracker_within_ttl", AnonymousClass001.A1X(AbstractC3076BxH.A00.getValue()));
                    }
                    eventBuilderAnnotate.report();
                } catch (Throwable th5) {
                    throw th5;
                }
            } finally {
                reentrantLock.unlock();
            }
        } finally {
            DI8.A00();
        }
    }

    public final void A0i() {
        DI8.A01("qpl.transitToWarmStage");
        try {
            ReentrantLock reentrantLock = this.A0K;
            reentrantLock.lock();
            try {
                if (this.A0U != 1) {
                    throw C3cG.A0Q("transitToWarmStage can be done only after early stage");
                }
                QuickPerformanceLoggerGKs c3627CaA = this.A08;
                if (c3627CaA != null && c3627CaA.getHealthCountersInitStage() == 1) {
                    c3627CaA.enableHealthCounters();
                }
                DHy dHy = this.A0P.AMN();
                A0U(dHy, "QPLListenersHolder");
                this.A0a = dHy;
                AwakeTimeSinceBootClock awakeTimeSinceBootClock = this.A05;
                InterfaceC4945DGj interfaceC4945DGj = this.A0F;
                synchronized (dHy) {
                    try {
                        C7384Etj.A0Y(awakeTimeSinceBootClock, 2);
                        if (dHy.A00 != null) {
                            throw C3cG.A0Q("QPL listeners were already created");
                        }
                        DI6[] di6Arr = (DI6[]) dHy.A01.toArray(new DI6[0]);
                        if (di6Arr.length == 0) {
                            di6Arr = null;
                        }
                        if (c3627CaA == null) {
                            c3627CaA = new C3627CaA();
                        }
                        DI1 di1 = new DI1(awakeTimeSinceBootClock, null, c3627CaA, interfaceC4945DGj, di6Arr);
                        dHy.A02 = di1;
                        DI6[] di6Arr2 = di1.A06;
                        if (di6Arr2 != null) {
                            for (DI6 di6 : di6Arr2) {
                                try {
                                    di6.setQuickPerformanceLogger(this);
                                } catch (Exception unused) {
                                }
                            }
                        }
                        dHy.A00 = this;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                Iterator<QuickEventImpl> it = this.A0I.iterator();
                while (it.hasNext()) {
                    A0P(dHy.A02, it.next(), true);
                }
                A0O(dHy.A02);
                this.A01 = this.A0O.AMN();
                this.A0U = 2;
            } finally {
                reentrantLock.unlock();
            }
        } finally {
            DI8.A00();
        }
    }

    @Override // com.facebook.quicklog.QuickPerformanceLogger, com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final long currentMonotonicTimestamp() {
        return this.A05.now();
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final long currentMonotonicTimestampNanos() {
        return this.A05.nowNanos();
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0085, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0089, code lost:
    
        throw r0;
     */
    @Override // com.facebook.quicklog.QuickPerformanceLogger
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void endAllInstancesOfMarker(int r15, short r16) {
        /*
            r14 = this;
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.NANOSECONDS
            r12 = -1
            java.lang.String r0 = "qpl.endAllInstancesOfMarker"
            X.DI8.A01(r0)
            r5 = r14
            X.DHv r1 = r14.A07     // Catch: java.lang.Throwable -> L85
            java.lang.String r0 = "qpl.markersManager.getInstanceOfMarker"
            X.DI8.A01(r0)     // Catch: java.lang.Throwable -> L85
            java.util.ArrayList r4 = X.C3cG.A0h()     // Catch: java.lang.Throwable -> L85
            X.DI3 r1 = r1.A02     // Catch: java.lang.Throwable -> L80
            java.lang.String r0 = "qpl.activeTraces.forEachOpenTrace"
            X.DI8.A01(r0)     // Catch: java.lang.Throwable -> L80
            X.DIG r0 = r1.A00     // Catch: java.lang.Throwable -> L7b
            java.util.concurrent.ConcurrentHashMap<java.lang.Long, com.facebook.quicklog.QuickEventImpl> r0 = r0.A00     // Catch: java.lang.Throwable -> L7b
            java.util.Iterator r3 = X.BV5.A0x(r0)     // Catch: java.lang.Throwable -> L7b
        L24:
            boolean r0 = r3.hasNext()     // Catch: java.lang.Throwable -> L7b
            r8 = r15
            if (r0 == 0) goto L52
            java.lang.Object r2 = X.C7384Etj.A0F(r3)     // Catch: java.lang.Throwable -> L7b
            com.facebook.quicklog.QuickEventImpl r2 = (com.facebook.quicklog.QuickEventImpl) r2     // Catch: java.lang.Throwable -> L7b
            X.DHr r1 = r2.A0S     // Catch: java.lang.Throwable -> L4d
            r1.A01()     // Catch: java.lang.Throwable -> L4d
            int r0 = r2.getMarkerId()     // Catch: java.lang.Throwable -> L4d
            if (r0 == r15) goto L44
            X.DJJ r0 = r2.A0B     // Catch: java.lang.Throwable -> L4d
            if (r0 == 0) goto L49
            int r0 = r0.A00     // Catch: java.lang.Throwable -> L4d
            if (r0 != r15) goto L49
        L44:
            int r0 = r2.A02     // Catch: java.lang.Throwable -> L4d
            X.C60Q.A1P(r4, r0)     // Catch: java.lang.Throwable -> L4d
        L49:
            r1.A02()     // Catch: java.lang.Throwable -> L7b
            goto L24
        L4d:
            r0 = move-exception
            X.DHr.A00(r2)     // Catch: java.lang.Throwable -> L7b
            throw r0     // Catch: java.lang.Throwable -> L7b
        L52:
            X.DI8.A00()     // Catch: java.lang.Throwable -> L80
            X.DI8.A00()     // Catch: java.lang.Throwable -> L85
            java.util.Iterator r1 = r4.iterator()     // Catch: java.lang.Throwable -> L85
        L5c:
            boolean r0 = r1.hasNext()     // Catch: java.lang.Throwable -> L85
            if (r0 == 0) goto L77
            java.lang.Object r0 = r1.next()     // Catch: java.lang.Throwable -> L85
            int r9 = X.BV6.A07(r0)     // Catch: java.lang.Throwable -> L85
            X.DI1 r4 = A07(r5)     // Catch: java.lang.Throwable -> L85
            r10 = 0
            r6 = 0
            r14 = r16
            r11 = r10
            A0Q(r4, r5, r6, r7, r8, r9, r10, r11, r12, r14)     // Catch: java.lang.Throwable -> L85
            goto L5c
        L77:
            X.DI8.A00()
            return
        L7b:
            r0 = move-exception
            X.DI8.A00()     // Catch: java.lang.Throwable -> L80
            throw r0     // Catch: java.lang.Throwable -> L80
        L80:
            r0 = move-exception
            X.DI8.A00()     // Catch: java.lang.Throwable -> L85
            throw r0     // Catch: java.lang.Throwable -> L85
        L85:
            r0 = move-exception
            X.DI8.A00()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DHu.endAllInstancesOfMarker(int, short):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0068 A[Catch: all -> 0x0114, TryCatch #0 {all -> 0x0114, blocks: (B:17:0x005e, B:22:0x0068, B:24:0x0070, B:26:0x007f, B:28:0x0083, B:29:0x008b, B:20:0x0064), top: B:73:0x005e, outer: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0108 A[Catch: all -> 0x010f, TRY_LEAVE, TryCatch #3 {all -> 0x010f, blocks: (B:38:0x00b5, B:40:0x00d3, B:42:0x00e4, B:44:0x00e8, B:45:0x00f0, B:47:0x00f6, B:48:0x00fa, B:49:0x0108), top: B:78:0x00b5, outer: #4 }] */
    @Override // com.facebook.quicklog.QuickPerformanceLogger
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void endAllMarkers(short r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DHu.endAllMarkers(short, boolean):void");
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final boolean isMarkerCrashResilient(int i, int i2) {
        QuickEventImpl quickEventImplA01 = this.A07.A02.A01(DHv.A01(i, i2));
        if (this.A0X == null || quickEventImplA01 == null) {
            return false;
        }
        int i3 = quickEventImplA01.A01;
        if ((i3 & 16) == 0) {
            return (i3 & 2) > 0 || this.A0W.getCrashResiliencyConfig().AOj(quickEventImplA01.getMarkerId());
        }
        return false;
    }

    @Override // com.facebook.quicklog.QuickPerformanceLogger
    public final void markEvent(int i, String str, int i2) {
        A0L(i, "qpl.markEvent");
        try {
            markEventBuilder(i, str).setLevel(i2).report();
        } finally {
            DI8.A00();
        }
    }

    @Override // com.facebook.quicklog.QuickPerformanceLogger
    public final void markJoinRequestForE2E(int i, int i2, String str, long j, TimeUnit timeUnit) {
        markerPoint(i, i2, FGI.A0M("join_request_", str), j, timeUnit);
    }

    @Override // com.facebook.quicklog.QuickPerformanceLogger
    public final void markJoinResponseForE2E(int i, int i2, String str, long j, TimeUnit timeUnit) {
        markerPoint(i, i2, FGI.A0M("join_response_", str), j, timeUnit);
    }

    @Override // com.facebook.quicklog.QuickPerformanceLogger, com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerEnd(int i, short s) {
        markerEnd(i, 0, s, -1L, TimeUnit.NANOSECONDS);
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerEndAtPointForUserFlow(int i, int i2, short s, String str) {
        A0Q(null, this, str, TimeUnit.NANOSECONDS, i, i2, 2, 0, -1L, s);
    }

    @Override // com.facebook.quicklog.QuickPerformanceLogger, com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerEndForUserFlow(int i, String str, int i2, short s) {
        A0Q(null, this, str, TimeUnit.NANOSECONDS, i, i2, 2, 0, -1L, s);
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerGenerateWithAnnotations(int i, short s, long j, TimeUnit timeUnit, Map<String, String> map) {
        long nanos = j;
        if (j > 0) {
            nanos = timeUnit.toNanos(nanos);
        }
        QuickEventImpl quickEventImplA08 = A08(A05(i, 0), null, null, TimeUnit.NANOSECONDS, i, 0, 0, -1, -1L, true, true);
        if (quickEventImplA08 != null) {
            if (map != null) {
                Iterator itA0n = AnonymousClass002.A0n(map);
                while (itA0n.hasNext()) {
                    Map.Entry entryA0l = C3cH.A0l(itA0n);
                    quickEventImplA08.A0R.A0C(C60O.A0t(entryA0l), (String) entryA0l.getValue());
                }
            }
            quickEventImplA08.A05 = nanos;
            quickEventImplA08.A0J = s;
            quickEventImplA08.mTimestampMs = this.A06.now();
            quickEventImplA08.A07 = this.A05.nowNanos();
            A0R(quickEventImplA08, this, true);
        }
    }

    @Override // com.facebook.quicklog.QuickPerformanceLogger, com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerLinkPivot(int i, int i2, String str) {
        A0L(i, "qpl.markerLinkPivot");
        try {
            this.A0E.A00.put(Long.valueOf(DHv.A01(i, i2)), new DJJ(i, this.A0W.resolvePivotMarker(i, str), str));
        } finally {
            DI8.A00();
        }
    }

    @Override // com.facebook.quicklog.QuickPerformanceLogger, com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerStartForUserFlow(int i, int i2, String str, boolean z, long j) {
        QuickEventImpl quickEventImplA09 = A09(A07(this), this, null, str, TimeUnit.NANOSECONDS, i, i2, 2, -1, 0, -1L, z);
        A0B(i, i2, j);
        if (quickEventImplA09 != null) {
            DHv.A00(A07(this), quickEventImplA09, "sampling_basis", str, false);
        }
    }

    @Override // com.facebook.quicklog.QuickPerformanceLogger
    public final void markerStartWithSamplingBasis(int i, int i2, String str) {
        markerStartWithCancelPolicy(i, true, i2, -1L, TimeUnit.NANOSECONDS, str);
    }

    @Override // com.facebook.quicklog.QuickPerformanceLogger, com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerTag(int i, String str) {
        A0L(i, "qpl.markerTag");
        try {
            this.A07.A09(A07(this), str, i, 0);
        } finally {
            DI8.A00();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01ad  */
    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean passThroughOperation(X.DI9 r18) {
        /*
            Method dump skipped, instructions count: 754
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DHu.passThroughOperation(X.DI9):boolean");
    }

    @Override // com.facebook.quicklog.QuickPerformanceLogger
    public final int sampleRateForMarker(int i) {
        A0L(i, "qpl.sampleRateForMarker");
        try {
            InterfaceC3472COx interfaceC3472COx = this.A01;
            int samplingSpecForMarker = (int) this.A0W.getSamplingSpecForMarker(i);
            int iA00 = 1;
            boolean zA1Q = AnonymousClass002.A1Q(samplingSpecForMarker, -1);
            if (!A0a(this) && !A0Y() && (interfaceC3472COx == null || !((AuraDebugAndTestConfig) interfaceC3472COx).isRunningInPerfTest)) {
                if (!zA1Q) {
                    return samplingSpecForMarker;
                }
                InterfaceC3472COx interfaceC3472COx2 = this.A01;
                iA00 = (int) ((interfaceC3472COx2 == null || !((AuraDebugAndTestConfig) interfaceC3472COx2).isLocalBuild) ? DJP.A00(this.A0W.randomlySample(Integer.MAX_VALUE), 3, 1) : DJP.A00);
            }
            return iA00;
        } finally {
            DI8.A00();
        }
    }

    @Override // com.facebook.quicklog.QuickPerformanceLogger
    public final void updateListenerMarkers() {
        InterfaceC4945DGj interfaceC4945DGj;
        DI8.A01("qpl.updateListenersMarkers");
        try {
            DHy dHy = this.A0a;
            if (dHy != null) {
                synchronized (dHy) {
                    DI1 di1 = dHy.A02;
                    AwakeTimeSinceBootClock awakeTimeSinceBootClock = di1.A00;
                    if (awakeTimeSinceBootClock != null && (interfaceC4945DGj = di1.A05) != null) {
                        di1 = new DI1(awakeTimeSinceBootClock, di1.A01, di1.A04, interfaceC4945DGj, di1.A06);
                    }
                    dHy.A02 = di1;
                }
            }
        } finally {
            DI8.A00();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public DHu(com.facebook.common.time.AwakeTimeSinceBootClock r9, X.InterfaceC7539F0o r10, com.facebook.quicklog.QuickPerformanceLoggerGKs r11, X.InterfaceC4945DGj r12, java.lang.Integer r13, X.F18 r14, X.F18 r15, X.F18 r16, X.F18 r17, X.F18 r18, X.F18 r19, X.F18 r20, X.F18 r21, X.F18 r22, X.F18 r23, X.F18 r24, boolean r25) {
        /*
            r8 = this;
            r8.<init>()
            com.facebook.common.util.TriState r0 = com.facebook.common.util.TriState.A03
            r8.A0Y = r0
            r8.A0V = r0
            r8.A0Z = r0
            java.util.Random r0 = new java.util.Random
            r0.<init>()
            r8.A0H = r0
            java.util.concurrent.ConcurrentLinkedQueue r0 = new java.util.concurrent.ConcurrentLinkedQueue
            r0.<init>()
            r8.A0I = r0
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r0.<init>()
            r8.A0J = r0
            java.util.concurrent.ConcurrentLinkedQueue r0 = new java.util.concurrent.ConcurrentLinkedQueue
            r0.<init>()
            r8.A0A = r0
            r2 = 0
            r8.A0U = r2
            java.util.concurrent.locks.ReentrantLock r0 = new java.util.concurrent.locks.ReentrantLock
            r0.<init>()
            r8.A0K = r0
            r8.A0B = r14
            r8.A0M = r15
            r1 = 10
            X.DJC r0 = new X.DJC
            r0.<init>(r1)
            r8.A0W = r0
            r3 = r9
            r8.A05 = r9
            r8.A06 = r10
            r0 = r16
            r8.A0O = r0
            r0 = r17
            r8.A0L = r0
            r0 = r20
            r8.A0N = r0
            r0 = r21
            r8.A0C = r0
            r5 = r11
            r8.A08 = r11
            if (r11 == 0) goto L5f
            boolean r1 = r11.useThreadLocalRandom()
            r0 = 1
            if (r1 != 0) goto L60
        L5f:
            r0 = 0
        L60:
            r8.A0T = r0
            if (r11 == 0) goto L6b
            boolean r0 = r11.enableTracing()
            if (r0 == 0) goto L6b
            r2 = 1
        L6b:
            X.DI8.A00 = r2
            r0 = r22
            r8.A0D = r0
            r0 = r23
            r8.A0Q = r0
            r8.A09 = r13
            r6 = r12
            r8.A0F = r12
            X.DJe r7 = X.DJe.A00
            r8.A0G = r7
            X.DIL r0 = new X.DIL
            r0.<init>()
            r8.A0E = r0
            r0 = r19
            r8.A0S = r0
            X.DIG r4 = new X.DIG
            r4.<init>()
            X.DHv r2 = new X.DHv
            r2.<init>(r3, r4, r5, r6, r7)
            r8.A07 = r2
            r0 = r18
            r8.A0P = r0
            r0 = r24
            r8.A0R = r0
            if (r25 == 0) goto La8
            r8.A0g()
            r8.A0i()
            r8.A0h()
        La8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DHu.<init>(com.facebook.common.time.AwakeTimeSinceBootClock, X.F0o, com.facebook.quicklog.QuickPerformanceLoggerGKs, X.DGj, java.lang.Integer, X.F18, X.F18, X.F18, X.F18, X.F18, X.F18, X.F18, X.F18, X.F18, X.F18, X.F18, boolean):void");
    }

    public static DI1 A06(QuickEventImpl quickEventImpl, DHu dHu, int i) {
        DI1 di1A07 = A07(dHu);
        if (i == 0) {
            quickEventImpl.A0S.A01();
        }
        return di1A07;
    }

    public static void A0L(int i, String str) {
        DI8.A02(str, Integer.valueOf(i));
    }

    public static void A0P(DI1 di1, COt cOt, boolean z) {
        int i;
        QuickEventImpl quickEventImpl = (QuickEventImpl) cOt;
        if (di1.A06(quickEventImpl.A0B, cOt.getMarkerId(), quickEventImpl.A01)) {
            if (quickEventImpl.A0I != null) {
                di1.A00(cOt);
                return;
            }
            di1.A03(cOt, 0);
            AbstractC4952DHl abstractC4952DHl = quickEventImpl.A0R;
            synchronized (abstractC4952DHl) {
                i = abstractC4952DHl.A01;
            }
            for (int i2 = 0; i2 < i; i2++) {
                di1.A01(cOt, i2);
            }
            DHo dHo = quickEventImpl.A0A;
            if (dHo != null) {
                int i3 = dHo.A01;
                for (int i4 = 0; i4 < i3; i4++) {
                    di1.A04(cOt, i4, 0);
                }
            }
            if (z) {
                di1.A02(cOt, 0);
            }
        }
    }

    public static void A0T(DHu dHu, String str, String str2, String str3, int i) {
        if (A0a(dHu)) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(": ");
            sb.append(((AuraQplNameProvider) dHu.A0D.AMN()).getMarkerName(i));
            sb.append(" (");
            sb.append(i);
            sb.append(") ");
            if (str2 == null) {
                str2 = "";
            }
            sb.append(str2);
            sb.append(str3 == null ? "" : ":");
            if (str3 == null) {
                str3 = "";
            }
            sb.append(str3);
            A0S(dHu, sb.toString(), 2);
        }
    }

    public static boolean A0a(DHu dHu) {
        if (A0b(dHu)) {
            return true;
        }
        InterfaceC3472COx interfaceC3472COx = dHu.A01;
        if (interfaceC3472COx == null) {
            return false;
        }
        if (dHu.A0V == TriState.A03) {
            dHu.A0V = ((AuraDebugAndTestConfig) interfaceC3472COx).isOutputToLogcatJsonEnabled;
        }
        return dHu.A0V.A00();
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0127  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.facebook.quicklog.QuickEventImpl A09(X.DI1 r28, X.DHu r29, java.lang.String r30, java.lang.String r31, java.util.concurrent.TimeUnit r32, int r33, int r34, int r35, int r36, int r37, long r38, boolean r40) {
        /*
            Method dump skipped, instructions count: 624
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DHu.A09(X.DI1, X.DHu, java.lang.String, java.lang.String, java.util.concurrent.TimeUnit, int, int, int, int, int, long, boolean):com.facebook.quicklog.QuickEventImpl");
    }

    @Override // com.facebook.quicklog.QuickPerformanceLogger, com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerAnnotate(int i, int i2, String str, double d) {
        A0D(i, i2, str, d);
    }

    @Override // com.facebook.quicklog.QuickPerformanceLogger, com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerAnnotate(int i, int i2, String str, int i3) {
        A0A(i, i2, i3, 0, str);
    }

    @Override // com.facebook.quicklog.QuickPerformanceLogger, com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerAnnotate(int i, int i2, String str, long j) {
        A0E(i, i2, str, j);
    }

    @Override // com.facebook.quicklog.QuickPerformanceLogger, com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerAnnotate(int i, int i2, String str, String str2) {
        A0W(str, i, str2, i2, 0);
    }

    @Override // com.facebook.quicklog.QuickPerformanceLogger, com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerAnnotate(int i, int i2, String str, boolean z) {
        A0F(i, i2, str, z);
    }

    @Override // com.facebook.quicklog.QuickPerformanceLogger, com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerAnnotate(int i, int i2, String str, double[] dArr) {
        A0G(i, i2, str, dArr);
    }

    @Override // com.facebook.quicklog.QuickPerformanceLogger, com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerAnnotate(int i, int i2, String str, int[] iArr) {
        A0H(i, i2, str, iArr);
    }

    @Override // com.facebook.quicklog.QuickPerformanceLogger, com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerAnnotate(int i, int i2, String str, long[] jArr) {
        A0I(i, i2, str, jArr);
    }

    @Override // com.facebook.quicklog.QuickPerformanceLogger, com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerAnnotate(int i, int i2, String str, String[] strArr) {
        A0J(i, i2, str, strArr);
    }

    @Override // com.facebook.quicklog.QuickPerformanceLogger, com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerAnnotate(int i, int i2, String str, boolean[] zArr) {
        A0K(i, i2, str, zArr);
    }

    @Override // com.facebook.quicklog.QuickPerformanceLogger, com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerAnnotate(int i, String str, double d) {
        A0D(i, 0, str, d);
    }

    @Override // com.facebook.quicklog.QuickPerformanceLogger, com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerAnnotate(int i, String str, int i2) {
        A0A(i, 0, i2, 0, str);
    }

    @Override // com.facebook.quicklog.QuickPerformanceLogger, com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerAnnotate(int i, String str, long j) {
        A0E(i, 0, str, j);
    }

    @Override // com.facebook.quicklog.QuickPerformanceLogger, com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerAnnotate(int i, String str, String str2) {
        A0W(str, i, str2, 0, 0);
    }

    @Override // com.facebook.quicklog.QuickPerformanceLogger, com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerAnnotate(int i, String str, boolean z) {
        A0F(i, 0, str, z);
    }

    @Override // com.facebook.quicklog.QuickPerformanceLogger, com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerAnnotate(int i, String str, double[] dArr) {
        A0G(i, 0, str, dArr);
    }

    @Override // com.facebook.quicklog.QuickPerformanceLogger, com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerAnnotate(int i, String str, int[] iArr) {
        A0H(i, 0, str, iArr);
    }

    @Override // com.facebook.quicklog.QuickPerformanceLogger, com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerAnnotate(int i, String str, long[] jArr) {
        A0I(i, 0, str, jArr);
    }

    @Override // com.facebook.quicklog.QuickPerformanceLogger, com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerAnnotate(int i, String str, String[] strArr) {
        A0J(i, 0, str, strArr);
    }

    @Override // com.facebook.quicklog.QuickPerformanceLogger, com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerAnnotate(int i, String str, boolean[] zArr) {
        A0K(i, 0, str, zArr);
    }

    @Override // com.facebook.quicklog.QuickPerformanceLogger
    public final void markerPoint(int i, int i2, int i3, String str, CPI cpi, long j, TimeUnit timeUnit, int i4) {
        CPI cpi2 = cpi;
        if (cpi == null) {
            cpi2 = null;
        } else {
            cpi.A03 = true;
        }
        A0M(cpi2, str, timeUnit, i, i2, i3, i4, 0, j);
    }

    @Override // com.facebook.quicklog.QuickPerformanceLogger, com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerPoint(int i, int i2, String str) {
        markerPoint(i, i2, str, null, -1L, TimeUnit.NANOSECONDS);
    }

    @Override // com.facebook.quicklog.QuickPerformanceLogger, com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerPoint(int i, int i2, String str, long j, TimeUnit timeUnit) {
        markerPoint(i, i2, str, null, j, timeUnit);
    }

    @Override // com.facebook.quicklog.QuickPerformanceLogger, com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerPoint(int i, int i2, String str, String str2) {
        markerPoint(i, i2, str, str2, -1L, TimeUnit.NANOSECONDS);
    }

    @Override // com.facebook.quicklog.QuickPerformanceLogger, com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerPoint(int i, int i2, String str, String str2, long j, TimeUnit timeUnit) {
        markerPoint(i, i2, str, str2, j, timeUnit, 0);
    }

    @Override // com.facebook.quicklog.QuickPerformanceLogger, com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerPoint(int i, int i2, String str, String str2, long j, TimeUnit timeUnit, int i3) {
        CPI cpi;
        if (str2 == null) {
            cpi = null;
        } else {
            cpi = new CPI();
            cpi.A00("__key", str2, 1);
            cpi.A03 = true;
        }
        A0M(cpi, str, timeUnit, i, i2, 7, i3, 0, j);
    }

    @Override // com.facebook.quicklog.QuickPerformanceLogger, com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerPoint(int i, String str) {
        markerPoint(i, 0, str, null, -1L, TimeUnit.NANOSECONDS);
    }

    @Override // com.facebook.quicklog.QuickPerformanceLogger, com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerPoint(int i, String str, long j, TimeUnit timeUnit) {
        markerPoint(i, 0, str, null, j, timeUnit);
    }

    @Override // com.facebook.quicklog.QuickPerformanceLogger, com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerPoint(int i, String str, String str2) {
        markerPoint(i, 0, str, str2, -1L, TimeUnit.NANOSECONDS);
    }

    @Override // com.facebook.quicklog.QuickPerformanceLogger, com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerPoint(int i, String str, String str2, long j, TimeUnit timeUnit) {
        markerPoint(i, 0, str, str2, j, timeUnit);
    }

    @Override // com.facebook.quicklog.QuickPerformanceLogger, com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerStart(int i) {
        markerStart(i, 0, -1L, TimeUnit.NANOSECONDS, 0);
    }

    @Override // com.facebook.quicklog.QuickPerformanceLogger, com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerStart(int i, int i2) {
        markerStart(i, i2, -1L, TimeUnit.NANOSECONDS, 0);
    }

    @Override // com.facebook.quicklog.QuickPerformanceLogger, com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerStart(int i, int i2, long j, TimeUnit timeUnit) {
        markerStart(i, i2, j, timeUnit, 0);
    }

    @Override // com.facebook.quicklog.QuickPerformanceLogger, com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerStart(int i, int i2, long j, TimeUnit timeUnit, int i3) {
        A09(A07(this), this, null, null, timeUnit, i, i2, i3, -1, 0, j, true);
    }

    @Override // com.facebook.quicklog.QuickPerformanceLogger, com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerStart(int i, int i2, String str, String str2) {
        markerStart(i, i2);
        markerAnnotate(i, i2, str, str2);
    }

    @Override // com.facebook.quicklog.QuickPerformanceLogger, com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerStart(int i, int i2, String str, String str2, long j, TimeUnit timeUnit) {
        markerStart(i, i2, j, timeUnit);
        markerAnnotate(i, i2, str, str2);
    }

    @Override // com.facebook.quicklog.QuickPerformanceLogger
    public final void markerStart(int i, int i2, boolean z) {
        markerStartWithCancelPolicy(i, z, i2);
    }

    @Override // com.facebook.quicklog.QuickPerformanceLogger, com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerStart(int i, String str, String str2) {
        markerStart(i);
        markerAnnotate(i, str, str2);
    }

    @Override // com.facebook.quicklog.QuickPerformanceLogger, com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerStart(int i, String str, String str2, long j, TimeUnit timeUnit) {
        markerStart(i, 0, j, timeUnit);
        markerAnnotate(i, str, str2);
    }

    @Override // com.facebook.quicklog.QuickPerformanceLogger
    public final void markerStart(int i, boolean z) {
        markerStartWithCancelPolicy(i, z);
    }

    @Override // com.facebook.quicklog.QuickPerformanceLogger, com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final boolean isMarkerOn(int i, int i2, boolean z) {
        return isMarkerOn(i, i2);
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final EventBuilder markEventBuilder(int i, int i2, String str) {
        A0L(i, "qpl.markEventBuilder");
        try {
            DJJ djjA04 = A04(i, i2);
            if (djjA04 != null) {
                i = djjA04.A01;
            }
            EventBuilder eventBuilderA03 = A03(djjA04, str, i);
            if (djjA04 != null) {
                eventBuilderA03.annotate("qpl_pivot_name", djjA04.A02);
                eventBuilderA03.annotate("qpl_pivot_host", djjA04.A00);
            }
            return eventBuilderA03;
        } finally {
            DI8.A00();
        }
    }

    @Override // com.facebook.quicklog.QuickPerformanceLogger, com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerAnnotateCrucialForUserFlow(int i, int i2, String str, String str2) {
        A0W(str, i, str2, i2, 2);
    }

    @Override // com.facebook.quicklog.QuickPerformanceLogger, com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerDrop(int i, int i2) {
        A0C(i, i2, currentMonotonicTimestampNanos(), TimeUnit.NANOSECONDS, 0);
    }

    @Override // com.facebook.quicklog.QuickPerformanceLogger, com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerEnd(int i, int i2, short s) {
        markerEnd(i, i2, s, -1L, TimeUnit.NANOSECONDS);
    }

    @Override // com.facebook.quicklog.QuickPerformanceLogger, com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerEndForUserFlow(int i, int i2, short s) {
        markerEndForUserFlow(i, null, i2, s);
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerStartForUserFlow(int i, int i2, String str, boolean z, long j, long j2, TimeUnit timeUnit) {
        QuickEventImpl quickEventImplA09 = A09(A07(this), this, null, str, timeUnit, i, i2, 2, -1, 0, j2, z);
        A0B(i, i2, j);
        if (quickEventImplA09 != null) {
            DHv.A00(A07(this), quickEventImplA09, "sampling_basis", str, false);
        }
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerStartWithCancelPolicy(int i, boolean z, int i2) {
        markerStartWithCancelPolicy(i, z, i2, -1L, TimeUnit.NANOSECONDS);
    }

    @Override // com.facebook.quicklog.QuickPerformanceLogger, com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerTag(int i, int i2, String str) {
        A0L(i, "qpl.markerTag");
        try {
            this.A07.A09(A07(this), str, i, i2);
        } finally {
            DI8.A00();
        }
    }

    @Override // com.facebook.quicklog.QuickPerformanceLogger, com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final MarkerEditor withMarker(int i, int i2) {
        MarkerEditor dHt;
        DI8.A02("qpl.withMarker", Integer.valueOf(i));
        try {
            QuickEventImpl quickEventImplA01 = this.A07.A02.A01(DHv.A01(i, i2));
            if (quickEventImplA01 == null) {
                dHt = C7414EvG.A00;
            } else {
                dHt = new DHt(A07(this), quickEventImplA01, this.A08, this);
            }
            return dHt;
        } finally {
            DI8.A00();
        }
    }

    @Override // com.facebook.quicklog.QuickPerformanceLogger
    public final boolean isMarkerOn(int i, int i2) {
        DHv dHv = this.A07;
        return dHv.A02.A04(A07(this), DHv.A01(i, i2));
    }

    @Override // com.facebook.quicklog.QuickPerformanceLogger, com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerEnd(int i, short s, long j, TimeUnit timeUnit) {
        markerEnd(i, 0, s, j, timeUnit);
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerStartForUserFlow(int i, int i2, boolean z, long j) {
        A09(A07(this), this, null, null, TimeUnit.NANOSECONDS, i, i2, 2, -1, 0, -1L, z);
        A0B(i, i2, j);
    }

    @Override // com.facebook.quicklog.QuickPerformanceLogger, com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerStartWithCancelPolicy(int i, boolean z, int i2, long j, TimeUnit timeUnit) {
        A09(A07(this), this, null, null, timeUnit, i, i2, 0, -1, 0, j, z);
    }

    @Override // com.facebook.quicklog.QuickPerformanceLogger, com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final boolean isMarkerOn(int i, boolean z) {
        return isMarkerOn(i);
    }

    @Override // com.facebook.quicklog.QuickPerformanceLogger, com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerEnd(int i, int i2, short s, long j, TimeUnit timeUnit) {
        A0Q(null, this, null, timeUnit, i, i2, 0, 0, j, s);
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerStartForUserFlow(int i, int i2, long j, TimeUnit timeUnit, boolean z) {
        A09(A07(this), this, null, null, timeUnit, i, i2, 2, -1, 0, j, z);
    }

    @Override // com.facebook.quicklog.QuickPerformanceLogger
    public final void markerStartWithCancelPolicy(int i, boolean z, int i2, long j, TimeUnit timeUnit, String str) {
        QuickEventImpl quickEventImplA09 = A09(A07(this), this, null, str, timeUnit, i, i2, 0, -1, 0, j, z);
        if (quickEventImplA09 != null) {
            DHv.A00(A07(this), quickEventImplA09, "sampling_basis", str, false);
        }
    }

    @Override // com.facebook.quicklog.LightweightQuickPerformanceLogger
    public final void markerStartForUserFlow(int i, int i2, boolean z, long j, long j2, TimeUnit timeUnit) {
        A09(A07(this), this, null, null, timeUnit, i, i2, 2, -1, 0, j2, z);
        A0B(i, i2, j);
    }
}
