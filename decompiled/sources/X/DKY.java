package X;

import com.facebook.aura.ccv.nativeflow.ui.HatchCcvLoggingKt;
import com.facebook.aura.model.ReplyAttributionSerializer;
import com.facebook.debug.tracer.Tracer;
import com.facebook.quicklog.EventBuilder;
import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import com.facebook.quicklog.MarkerEditor;
import com.facebook.quicklog.QplPointNotFoundException;
import com.facebook.systrace.Systrace;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes5.dex */
public final class DKY implements FNA {
    public long A00;
    public long A01;
    public Integer A02;
    public String A03;
    public boolean A04;
    public final int A05;
    public final int A06;
    public final C4983DKa A07;
    public final F8H A08;
    public final LightweightQuickPerformanceLogger A09;
    public final HashMap<String, C4984DKc> A0A;
    public final HashMap<String, DKZ> A0B;
    public final List<String> A0C;
    public final List<String> A0D;
    public final HrW A0E;
    public final DKe A0F;
    public final List<String> A0G;
    public final AtomicBoolean A0H;
    public final AtomicBoolean A0I;

    /* JADX WARN: Removed duplicated region for block: B:28:0x010c A[Catch: all -> 0x0151, TryCatch #0 {all -> 0x0151, blocks: (B:26:0x00f2, B:28:0x010c, B:29:0x0116, B:31:0x011e, B:33:0x0139), top: B:39:0x00f2 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x011e A[Catch: all -> 0x0151, TryCatch #0 {all -> 0x0151, blocks: (B:26:0x00f2, B:28:0x010c, B:29:0x0116, B:31:0x011e, B:33:0x0139), top: B:39:0x00f2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public DKY(X.HrW r24, X.DKe r25, X.F8H r26, com.facebook.quicklog.LightweightQuickPerformanceLogger r27, java.lang.String r28, int r29, int r30, long r31, long r33, boolean r35) {
        /*
            Method dump skipped, instructions count: 342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DKY.<init>(X.HrW, X.DKe, X.F8H, com.facebook.quicklog.LightweightQuickPerformanceLogger, java.lang.String, int, int, long, long, boolean):void");
    }

    private final synchronized DKZ A00(String str) {
        return this.A0B.get(str);
    }

    private final synchronized C4984DKc A01(String str) {
        return this.A0A.get(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0047, code lost:
    
        if (A0A() == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0049, code lost:
    
        A02();
        A05(r5);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final synchronized void A06(java.lang.String r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            boolean r3 = A09()     // Catch: java.lang.Throwable -> L5f
            if (r3 == 0) goto Lc
            java.lang.String r0 = "TTRCTraceImpl.endMarkerIfAllQueriesSatisfiedAndAdditionalStepsCompleted"
            com.facebook.debug.tracer.Tracer.A01(r0)     // Catch: java.lang.Throwable -> L5f
        Lc:
            java.util.concurrent.atomic.AtomicBoolean r0 = r4.A0I     // Catch: java.lang.Throwable -> L58
            boolean r0 = r0.get()     // Catch: java.lang.Throwable -> L58
            if (r0 == 0) goto L1d
            java.util.concurrent.atomic.AtomicBoolean r0 = r4.A0H     // Catch: java.lang.Throwable -> L58
            boolean r0 = r0.get()     // Catch: java.lang.Throwable -> L58
            if (r0 != 0) goto L1d
            goto L4f
        L1d:
            boolean r0 = r4.A0B()     // Catch: java.lang.Throwable -> L56
            if (r0 == 0) goto L4f
            java.util.HashMap<java.lang.String, X.DKZ> r0 = r4.A0B     // Catch: java.lang.Throwable -> L56
            java.util.Iterator r2 = X.BV5.A0x(r0)     // Catch: java.lang.Throwable -> L56
        L29:
            boolean r0 = r2.hasNext()     // Catch: java.lang.Throwable -> L56
            if (r0 == 0) goto L43
            java.lang.Object r0 = r2.next()     // Catch: java.lang.Throwable -> L56
            X.C7384Etj.A0U(r0)     // Catch: java.lang.Throwable -> L56
            X.DKZ r0 = (X.DKZ) r0     // Catch: java.lang.Throwable -> L56
            java.lang.Integer r1 = r0.A00     // Catch: java.lang.Throwable -> L56
            java.lang.Integer r0 = X.C79.A0K     // Catch: java.lang.Throwable -> L56
            if (r1 == r0) goto L29
            java.lang.Integer r0 = X.C79.A0P     // Catch: java.lang.Throwable -> L56
            if (r1 == r0) goto L29
            goto L4f
        L43:
            boolean r0 = r4.A0A()     // Catch: java.lang.Throwable -> L56
            if (r0 == 0) goto L4f
            r4.A02()     // Catch: java.lang.Throwable -> L58
            r4.A05(r5)     // Catch: java.lang.Throwable -> L58
        L4f:
            if (r3 == 0) goto L54
            com.facebook.debug.tracer.Tracer.A00()     // Catch: java.lang.Throwable -> L5f
        L54:
            monitor-exit(r4)
            return
        L56:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L58
        L58:
            r0 = move-exception
            if (r3 == 0) goto L5e
            com.facebook.debug.tracer.Tracer.A00()     // Catch: java.lang.Throwable -> L5f
        L5e:
            throw r0     // Catch: java.lang.Throwable -> L5f
        L5f:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L5f
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DKY.A06(java.lang.String):void");
    }

    private final boolean A0A() {
        Integer num;
        Iterator itA0i = C3cG.A0i(this.A0A);
        while (itA0i.hasNext()) {
            Map.Entry entry = (Map.Entry) itA0i.next();
            Object key = entry.getKey();
            C4984DKc c4984DKc = (C4984DKc) entry.getValue();
            if (!C7384Etj.areEqual(key, null) && (num = c4984DKc.A00) != C79.A01 && num != C79.A0C) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final synchronized boolean A0B() {
        /*
            r3 = this;
            monitor-enter(r3)
            java.lang.Integer r1 = r3.ALs()     // Catch: java.lang.Throwable -> L1d
            java.lang.Integer r0 = X.C79.A00     // Catch: java.lang.Throwable -> L1d
            if (r1 == r0) goto L1a
            java.lang.Integer r1 = r3.ALs()     // Catch: java.lang.Throwable -> L1d
            java.lang.Integer r0 = X.C79.A01     // Catch: java.lang.Throwable -> L1d
            if (r1 == r0) goto L1a
            java.lang.Integer r2 = r3.ALs()     // Catch: java.lang.Throwable -> L1d
            java.lang.Integer r1 = X.C79.A0C     // Catch: java.lang.Throwable -> L1d
            r0 = 0
            if (r2 != r1) goto L1b
        L1a:
            r0 = 1
        L1b:
            monitor-exit(r3)
            return r0
        L1d:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L1d
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DKY.A0B():boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x007a, code lost:
    
        if (r7 == X.C79.A0K) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00af A[Catch: all -> 0x00c2, DONT_GENERATE, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0007, B:40:0x00af, B:44:0x00b6, B:49:0x00be, B:50:0x00c1, B:6:0x000c, B:11:0x001d, B:13:0x0021, B:15:0x0025, B:37:0x007c, B:29:0x006c, B:31:0x0070, B:33:0x0074, B:35:0x0078, B:38:0x007f, B:18:0x002a, B:20:0x002e, B:22:0x0032, B:24:0x0036, B:26:0x003a, B:28:0x003e), top: B:54:0x0001, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b6 A[Catch: all -> 0x00c2, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0007, B:40:0x00af, B:44:0x00b6, B:49:0x00be, B:50:0x00c1, B:6:0x000c, B:11:0x001d, B:13:0x0021, B:15:0x0025, B:37:0x007c, B:29:0x006c, B:31:0x0070, B:33:0x0074, B:35:0x0078, B:38:0x007f, B:18:0x002a, B:20:0x002e, B:22:0x0032, B:24:0x0036, B:26:0x003a, B:28:0x003e), top: B:54:0x0001, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final synchronized boolean A0C(java.lang.Integer r7) {
        /*
            r6 = this;
            monitor-enter(r6)
            boolean r5 = A09()     // Catch: java.lang.Throwable -> Lc2
            if (r5 == 0) goto Lc
            java.lang.String r0 = "TTRCTraceImpl.changeStateOfTrace"
            com.facebook.debug.tracer.Tracer.A01(r0)     // Catch: java.lang.Throwable -> Lc2
        Lc:
            java.lang.Integer r0 = r6.ALs()     // Catch: java.lang.Throwable -> Lbb
            int r1 = r0.intValue()     // Catch: java.lang.Throwable -> Lbb
            r3 = 1
            r4 = 0
            if (r1 == r4) goto L2a
            if (r1 == r3) goto L6c
            r0 = 2
            if (r1 != r0) goto Lb4
            java.lang.Integer r0 = X.C79.A0K     // Catch: java.lang.Throwable -> Lbb
            if (r7 == r0) goto L7c
            java.lang.Integer r0 = X.C79.A0T     // Catch: java.lang.Throwable -> Lbb
            if (r7 == r0) goto L7c
            java.lang.Integer r0 = X.C79.A0P     // Catch: java.lang.Throwable -> Lbb
            if (r7 != r0) goto Lb4
            goto L7c
        L2a:
            java.lang.Integer r0 = X.C79.A01     // Catch: java.lang.Throwable -> Lbb
            if (r7 == r0) goto L7c
            java.lang.Integer r0 = X.C79.A0K     // Catch: java.lang.Throwable -> Lbb
            if (r7 == r0) goto L7c
            java.lang.Integer r0 = X.C79.A0T     // Catch: java.lang.Throwable -> Lbb
            if (r7 == r0) goto L7c
            java.lang.Integer r0 = X.C79.A0P     // Catch: java.lang.Throwable -> Lbb
            if (r7 == r0) goto L7c
            java.lang.Integer r0 = X.C79.A0C     // Catch: java.lang.Throwable -> Lbb
            if (r7 != r0) goto Lb4
            java.lang.String r1 = "cache_and_network_queries"
            java.util.List<java.lang.String> r0 = r6.A0C     // Catch: java.lang.Throwable -> Lbb
            java.lang.String[] r0 = X.BV4.A1b(r0)     // Catch: java.lang.Throwable -> Lbb
            r6.A07(r1, r0)     // Catch: java.lang.Throwable -> Lbb
            java.lang.String r1 = "network_only_queries"
            java.util.List<java.lang.String> r0 = r6.A0D     // Catch: java.lang.Throwable -> Lbb
            java.lang.String[] r0 = X.BV4.A1b(r0)     // Catch: java.lang.Throwable -> Lbb
            r6.A07(r1, r0)     // Catch: java.lang.Throwable -> Lbb
            java.lang.String r2 = "steps"
            java.util.HashMap<java.lang.String, X.DKc> r0 = r6.A0A     // Catch: java.lang.Throwable -> Lbb
            java.util.Set r1 = r0.keySet()     // Catch: java.lang.Throwable -> Lbb
            X.C7384Etj.A0U(r1)     // Catch: java.lang.Throwable -> Lbb
            java.lang.String[] r0 = new java.lang.String[r4]     // Catch: java.lang.Throwable -> Lbb
            java.lang.Object[] r0 = r1.toArray(r0)     // Catch: java.lang.Throwable -> Lbb
            java.lang.String[] r0 = (java.lang.String[]) r0     // Catch: java.lang.Throwable -> Lbb
            r6.A07(r2, r0)     // Catch: java.lang.Throwable -> Lbb
            goto L7c
        L6c:
            java.lang.Integer r0 = X.C79.A0C     // Catch: java.lang.Throwable -> Lbb
            if (r7 == r0) goto L7f
            java.lang.Integer r0 = X.C79.A0T     // Catch: java.lang.Throwable -> Lbb
            if (r7 == r0) goto L7f
            java.lang.Integer r0 = X.C79.A0P     // Catch: java.lang.Throwable -> Lbb
            if (r7 == r0) goto L7f
            java.lang.Integer r0 = X.C79.A0K     // Catch: java.lang.Throwable -> Lbb
            if (r7 != r0) goto Lb4
        L7c:
            r6.A02 = r7     // Catch: java.lang.Throwable -> Lbb
            goto Lad
        L7f:
            java.lang.String r1 = "cache_and_network_queries"
            java.util.List<java.lang.String> r0 = r6.A0C     // Catch: java.lang.Throwable -> Lbb
            java.lang.String[] r0 = X.BV4.A1b(r0)     // Catch: java.lang.Throwable -> Lbb
            r6.A07(r1, r0)     // Catch: java.lang.Throwable -> Lbb
            java.lang.String r1 = "network_only_queries"
            java.util.List<java.lang.String> r0 = r6.A0D     // Catch: java.lang.Throwable -> Lbb
            java.lang.String[] r0 = X.BV4.A1b(r0)     // Catch: java.lang.Throwable -> Lbb
            r6.A07(r1, r0)     // Catch: java.lang.Throwable -> Lbb
            java.lang.String r2 = "steps"
            java.util.HashMap<java.lang.String, X.DKc> r0 = r6.A0A     // Catch: java.lang.Throwable -> Lbb
            java.util.Set r1 = r0.keySet()     // Catch: java.lang.Throwable -> Lbb
            X.C7384Etj.A0U(r1)     // Catch: java.lang.Throwable -> Lbb
            java.lang.String[] r0 = new java.lang.String[r4]     // Catch: java.lang.Throwable -> Lbb
            java.lang.Object[] r0 = r1.toArray(r0)     // Catch: java.lang.Throwable -> Lbb
            java.lang.String[] r0 = (java.lang.String[]) r0     // Catch: java.lang.Throwable -> Lbb
            r6.A07(r2, r0)     // Catch: java.lang.Throwable -> Lbb
            goto L7c
        Lad:
            if (r5 == 0) goto Lb2
            com.facebook.debug.tracer.Tracer.A00()     // Catch: java.lang.Throwable -> Lc2
        Lb2:
            monitor-exit(r6)
            return r3
        Lb4:
            if (r5 == 0) goto Lb9
            com.facebook.debug.tracer.Tracer.A00()     // Catch: java.lang.Throwable -> Lc2
        Lb9:
            monitor-exit(r6)
            return r4
        Lbb:
            r0 = move-exception
            if (r5 == 0) goto Lc1
            com.facebook.debug.tracer.Tracer.A00()     // Catch: java.lang.Throwable -> Lc2
        Lc1:
            throw r0     // Catch: java.lang.Throwable -> Lc2
        Lc2:
            r0 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> Lc2
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DKY.A0C(java.lang.Integer):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final synchronized boolean A0D(java.lang.Integer r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            java.lang.Integer r0 = r2.ALs()     // Catch: java.lang.Throwable -> L11
            if (r0 == r3) goto Le
            boolean r1 = r2.A0C(r3)     // Catch: java.lang.Throwable -> L11
            r0 = 0
            if (r1 == 0) goto Lf
        Le:
            r0 = 1
        Lf:
            monitor-exit(r2)
            return r0
        L11:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L11
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DKY.A0D(java.lang.Integer):boolean");
    }

    private final synchronized void A0E(String str, long j) {
        boolean zA09 = A09();
        if (zA09) {
            Tracer.A01(FGI.A0M("TTRCTraceImpl.markerPoint.", str));
        }
        try {
            LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = this.A09;
            int i = this.A06;
            int i2 = this.A05;
            lightweightQuickPerformanceLogger.markerPoint(i, i2, str, null, j, TimeUnit.MILLISECONDS);
            this.A07.AU7(str == null ? "Unknown name" : str, i, i2, null, j);
            this.A0G.add(str);
        } finally {
            if (zA09) {
                Tracer.A00();
            }
        }
    }

    @Override // X.FNA
    public final synchronized void A3i(String str) {
        A3q(str, TimeUnit.MILLISECONDS, -1L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0039, code lost:
    
        if (r2 != r4) goto L23;
     */
    @Override // X.FNA
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void A5f(long r11, java.lang.String r13, boolean r14, long r15) {
        /*
            r10 = this;
            monitor-enter(r10)
            r8 = 0
            java.lang.String r6 = "cached_content_displayed_"
            boolean r9 = A09()     // Catch: java.lang.Throwable -> L91
            if (r9 == 0) goto Lf
            java.lang.String r0 = "TTRCTraceImpl.cachedContentDisplayedForQueryInternal"
            com.facebook.debug.tracer.Tracer.A01(r0)     // Catch: java.lang.Throwable -> L91
        Lf:
            java.lang.Integer r4 = X.C79.A0C     // Catch: java.lang.Throwable -> L8a
            boolean r0 = r10.A0D(r4)     // Catch: java.lang.Throwable -> L8a
            if (r0 == 0) goto L36
            r3 = 1
            boolean r7 = X.C8j3.A1S(r14)
            X.DKZ r5 = r10.A00(r13)     // Catch: java.lang.Throwable -> L8a
            if (r5 == 0) goto L36
            if (r7 == 0) goto L25
            goto L27
        L25:
            r2 = r4
            goto L29
        L27:
            java.lang.Integer r2 = X.C79.A0K     // Catch: java.lang.Throwable -> L8a
        L29:
            java.lang.Integer r0 = r5.A00     // Catch: java.lang.Throwable -> L8a
            int r1 = r0.intValue()     // Catch: java.lang.Throwable -> L8a
            r0 = 2
            if (r1 == r0) goto L3b
            if (r1 == r8) goto L39
            if (r1 == r3) goto L3b
        L36:
            if (r9 == 0) goto L88
            goto L85
        L39:
            if (r2 == r4) goto L40
        L3b:
            java.lang.Integer r0 = X.C79.A0K     // Catch: java.lang.Throwable -> L8a
            if (r2 == r0) goto L40
            goto L36
        L40:
            r5.A00 = r2     // Catch: java.lang.Throwable -> L8a
            r4 = 0
            r5.A03 = r3     // Catch: java.lang.Throwable -> L8a
            long r0 = r5.A04     // Catch: java.lang.Throwable -> L8a
            int r2 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r2 <= 0) goto L4c
            r4 = 1
        L4c:
            r5.A01 = r4     // Catch: java.lang.Throwable -> L8a
            X.DKY r2 = r5.A06     // Catch: java.lang.Throwable -> L8a
            java.lang.String r3 = r5.A05     // Catch: java.lang.Throwable -> L8a
            java.lang.String r0 = "cache_was_recent_for_"
            java.lang.String r1 = X.FGI.A0M(r0, r3)     // Catch: java.lang.Throwable -> L8a
            r0 = r4 ^ 1
            r2.AQG(r1, r0)     // Catch: java.lang.Throwable -> L8a
            java.lang.String r0 = "cache_age_ms_for_"
            java.lang.String r0 = X.FGI.A0M(r0, r3)     // Catch: java.lang.Throwable -> L8a
            r2.AQE(r0, r11)     // Catch: java.lang.Throwable -> L8a
            java.lang.String r0 = "ttcc_for_"
            java.lang.String r0 = X.FGI.A0M(r0, r3)     // Catch: java.lang.Throwable -> L8a
            r2.A03 = r0     // Catch: java.lang.Throwable -> L8a
            r3 = r15
            r2.A00 = r15     // Catch: java.lang.Throwable -> L8a
            r2.A0E(r0, r3)     // Catch: java.lang.Throwable -> L8a
            r10.A03(r3)     // Catch: java.lang.Throwable -> L8a
            if (r7 == 0) goto L36
            r5.A00()     // Catch: java.lang.Throwable -> L8a
            java.lang.String r0 = X.FGI.A0M(r6, r13)     // Catch: java.lang.Throwable -> L8a
            r10.A06(r0)     // Catch: java.lang.Throwable -> L8a
            goto L36
        L85:
            com.facebook.debug.tracer.Tracer.A00()     // Catch: java.lang.Throwable -> L91
        L88:
            monitor-exit(r10)
            return
        L8a:
            r0 = move-exception
            if (r9 == 0) goto L90
            com.facebook.debug.tracer.Tracer.A00()     // Catch: java.lang.Throwable -> L91
        L90:
            throw r0     // Catch: java.lang.Throwable -> L91
        L91:
            r0 = move-exception
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L91
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DKY.A5f(long, java.lang.String, boolean, long):void");
    }

    @Override // X.FNA
    public final synchronized Integer AJK(String str) {
        DKZ dkzA00 = A00(str);
        if (dkzA00 == null) {
            A04(this, "getQueryState for non-existent identifier");
            return null;
        }
        return dkzA00.A00;
    }

    @Override // X.FNA
    public final synchronized Integer AL5(String str) {
        C4984DKc c4984DKcA01 = A01(str);
        if (c4984DKcA01 == null) {
            A04(this, "getStepState for non-existent identifier");
            return null;
        }
        return c4984DKcA01.A00;
    }

    @Override // X.FNA
    public final synchronized Integer ALs() {
        return this.A02;
    }

    @Override // X.FNA
    public final synchronized void APa(String str) {
        long jNow = this.A0E.now();
        if (A0B()) {
            A02();
            boolean zA09 = A09();
            if (zA09) {
                Tracer.A01("TTRCTraceImpl.shouldMarkSuccessAtLeftSurface");
            }
            try {
                HashMap<String, DKZ> map = this.A0B;
                boolean z = false;
                if (!map.isEmpty() || !this.A0A.isEmpty()) {
                    Iterator itA0x = BV5.A0x(map);
                    boolean z2 = true;
                    while (itA0x.hasNext()) {
                        DKZ dkz = (DKZ) C7384Etj.A0F(itA0x);
                        Integer num = dkz.A00;
                        if (num != C79.A0C || dkz.A01) {
                            if (num != C79.A0K && num != C79.A0P) {
                                z2 = false;
                            }
                        }
                    }
                    if (z2) {
                        if (A0A()) {
                            z = true;
                        }
                    }
                }
                if (z) {
                    Iterator itA0x2 = BV5.A0x(map);
                    while (itA0x2.hasNext()) {
                        DKZ dkz2 = (DKZ) C7384Etj.A0F(itA0x2);
                        if (dkz2.A00 == C79.A0C) {
                            dkz2.A00();
                        }
                    }
                    A05(str);
                } else {
                    A0C(C79.A0T);
                    A08((short) 4, str);
                    long j = jNow - this.A01;
                    if (j > 5000) {
                        this.A09.markEventBuilder(21364739, String.valueOf(this.A06)).annotate("duration", j).setLevel(5).report();
                    }
                }
            } finally {
                if (zA09) {
                    Tracer.A00();
                }
            }
        }
    }

    @Override // X.FNA
    public final synchronized void AR7(String str, boolean z) {
        DKZ dkzA00;
        long jNow = this.A0E.now();
        boolean zA09 = A09();
        if (zA09) {
            Tracer.A01("TTRCTraceImpl.networkContentDisplayedForQueryInternal");
        }
        try {
            if (A0D(C79.A0C) && (dkzA00 = A00(str)) != null) {
                Integer num = C79.A0K;
                int iIntValue = dkzA00.A00.intValue();
                if (iIntValue == 2 || iIntValue == 0 || iIntValue == 1) {
                    dkzA00.A00 = num;
                    dkzA00.A02 = z;
                    String strA0M = FGI.A0M("ttnc_for_", dkzA00.A05);
                    if (!dkzA00.A03 || z) {
                        DKY dky = dkzA00.A06;
                        dky.A03 = strA0M;
                        dky.A00 = jNow;
                    }
                    dkzA00.A06.A0E(strA0M, jNow);
                    dkzA00.A00();
                    A03(jNow);
                    A06(FGI.A0M("network_content_displayed_", str));
                }
            }
            if (zA09) {
                Tracer.A00();
            }
        } catch (Throwable th) {
            if (zA09) {
                Tracer.A00();
            }
            throw th;
        }
    }

    @Override // X.FNA
    public final synchronized void AYw(String str) {
        DKZ dkzA00;
        long jNow = this.A0E.now();
        if (A0D(C79.A0C) && (dkzA00 = A00(str)) != null) {
            Integer num = C79.A0P;
            int iIntValue = dkzA00.A00.intValue();
            if (iIntValue == 2 || iIntValue == 0 || iIntValue == 1) {
                dkzA00.A00 = num;
                A03(jNow);
                A06(FGI.A0U(AnonymousClass001.A0u("QUERY_NOT_NEEDED"), "_", str));
            }
        }
    }

    @Override // X.FNA
    public final synchronized void AgO(String str) {
        C4984DKc c4984DKcA01;
        long jNow = this.A0E.now();
        if (A0D(C79.A0C) && (c4984DKcA01 = A01(str)) != null && c4984DKcA01.A00 == C79.A00) {
            c4984DKcA01.A00 = C79.A01;
            String strA0M = FGI.A0M("step_completed_", str);
            if (this.A00 <= jNow) {
                this.A03 = strA0M;
                this.A00 = jNow;
            }
            A0E(strA0M, jNow);
            A03(this.A00);
            A06(FGI.A0M("step_completed_", str));
        }
    }

    @Override // X.FNA
    public final synchronized void AgP(String str) {
        C4984DKc c4984DKcA01;
        long jNow = this.A0E.now();
        Integer num = C79.A0C;
        if (A0D(num) && (c4984DKcA01 = A01(str)) != null && c4984DKcA01.A00 == C79.A00) {
            c4984DKcA01.A00 = num;
            A03(Math.max(this.A00, jNow));
            A06(FGI.A0M("step_not_needed_", str));
        }
    }

    @Override // X.FNA
    public final synchronized void fail(String str) {
        long jNow = this.A0E.now();
        if (A0B()) {
            A0C(C79.A0P);
            A02();
            A08((short) 3, str);
            EventBuilder level = this.A09.markEventBuilder(21364738, String.valueOf(this.A06)).annotate("duration", jNow - this.A01).setLevel(3);
            if (str != null) {
                level.annotate(ReplyAttributionSerializer.TYPE_MESSAGE, str);
            }
            level.report();
        }
    }

    private final void A02() {
        boolean zA09;
        boolean zA092 = Systrace.A09(32L);
        if (zA092) {
            Tracer.A01("TTRCTraceImpl.addAnnotationsBeforeMarkerEnd");
        }
        try {
            ArrayList arrayListA0h = C3cG.A0h();
            ArrayList arrayListA0h2 = C3cG.A0h();
            ArrayList arrayListA0h3 = C3cG.A0h();
            ArrayList arrayListA0h4 = C3cG.A0h();
            ArrayList arrayListA0h5 = C3cG.A0h();
            HashMap<String, DKZ> map = this.A0B;
            Iterator itA0x = BV5.A0x(map);
            while (itA0x.hasNext()) {
                Object next = itA0x.next();
                C7384Etj.A0U(next);
                DKZ dkz = (DKZ) next;
                int iIntValue = dkz.A00.intValue();
                if (iIntValue == 4) {
                    arrayListA0h.add(dkz.A05);
                } else if (iIntValue == 0) {
                    arrayListA0h3.add(dkz.A05);
                } else if (iIntValue == 1 || iIntValue == 2) {
                    arrayListA0h4.add(dkz.A05);
                }
            }
            Iterator itA0i = C3cG.A0i(this.A0A);
            while (itA0i.hasNext()) {
                Map.Entry entry = (Map.Entry) itA0i.next();
                String str = (String) entry.getKey();
                Integer num = ((C4984DKc) entry.getValue()).A00;
                if (num == C79.A0C) {
                    arrayListA0h2.add(str);
                } else if (num == C79.A00) {
                    arrayListA0h5.add(str);
                }
            }
            A07("revoked_queries", BV5.A1b(arrayListA0h, 0));
            A07("revoked_steps", BV5.A1b(arrayListA0h2, 0));
            A07("pending_cache_and_network_queries", BV5.A1b(arrayListA0h3, 0));
            A07("pending_network_queries", BV5.A1b(arrayListA0h4, 0));
            A07("pending_steps", BV5.A1b(arrayListA0h5, 0));
            boolean zA093 = Systrace.A09(32L);
            if (zA093) {
                Tracer.A01("TTRCTraceImpl.annotateSource");
            }
            try {
                ArrayList arrayListA0h6 = C3cG.A0h();
                ArrayList arrayListA0h7 = C3cG.A0h();
                Iterator itA0x2 = BV5.A0x(map);
                while (itA0x2.hasNext()) {
                    Object next2 = itA0x2.next();
                    C7384Etj.A0U(next2);
                    DKZ dkz2 = (DKZ) next2;
                    if (dkz2.A00 == C79.A0K) {
                        if (!dkz2.A03 || dkz2.A02) {
                            arrayListA0h7.add(dkz2.A05);
                        } else {
                            arrayListA0h6.add(dkz2.A05);
                        }
                    }
                }
                if (!arrayListA0h6.isEmpty() || !arrayListA0h7.isEmpty()) {
                    if (arrayListA0h7.isEmpty()) {
                        AQF("ttrc_source", "CACHE");
                    } else if (arrayListA0h6.isEmpty()) {
                        AQF("ttrc_source", "NETWORK");
                    } else {
                        if (arrayListA0h6.size() > 1) {
                            Collections.sort(arrayListA0h6);
                        }
                        if (arrayListA0h7.size() > 1) {
                            Collections.sort(arrayListA0h7);
                        }
                        AQF("ttrc_source", FGI.A0U(AbstractC0878AGe.A0L(", ", "", "", arrayListA0h6, new EY5(11)), ", ", AbstractC0878AGe.A0L(", ", "", "", arrayListA0h7, new EY5(12))));
                    }
                }
                if (zA093) {
                    Tracer.A00();
                }
                zA09 = Systrace.A09(32L);
                if (zA09) {
                    Tracer.A01("TTRCTraceImpl.annotateCacheRendered");
                }
            } catch (Throwable th) {
                th = th;
                if (!zA093) {
                    throw th;
                }
            }
            try {
                ArrayList arrayListA0h8 = C3cG.A0h();
                Iterator itA0x3 = BV5.A0x(map);
                while (itA0x3.hasNext()) {
                    Object next3 = itA0x3.next();
                    C7384Etj.A0U(next3);
                    DKZ dkz3 = (DKZ) next3;
                    if (dkz3.A03) {
                        arrayListA0h8.add(dkz3.A05);
                    }
                }
                if (!arrayListA0h8.isEmpty()) {
                    if (arrayListA0h8.size() > 1) {
                        Collections.sort(arrayListA0h8);
                    }
                    AQF("ttrc_cache_rendered", AbstractC06907md.A01(", ", arrayListA0h8, null));
                }
                if (zA09) {
                    Tracer.A00();
                }
            } catch (Throwable th2) {
                th = th2;
                if (!zA09) {
                    throw th;
                }
                Tracer.A00();
                throw th;
            }
        } finally {
            if (zA092) {
                Tracer.A00();
            }
        }
    }

    /* JADX WARN: In static synchronized method top region not synchronized by class const: (r8v0 X.DKY) */
    public static final synchronized void A04(DKY dky, String str) {
        synchronized (dky) {
            boolean zA09 = A09();
            if (zA09) {
                Tracer.A01("TTRCTraceImpl.softReportAndMaybeFailHarder");
            }
            try {
                dky.A08((short) 3, str);
                if (dky.A0B()) {
                    dky.A0C(C79.A0P);
                }
                int i = dky.A06;
                String strA0W = FGI.A0W("marker_id:", ",error:", str, i);
                int i2 = dky.A05;
                StringBuilder sbA0y = C60O.A0y("marker_id:", i);
                sbA0y.append(",instance_key:");
                sbA0y.append(i2);
                String strA1M = C60P.A1M(",error:", str, sbA0y);
                dky.A0F.report(FGI.A0M("TTRCTrace|", String.valueOf(i)), strA0W, new Throwable(strA1M));
            } finally {
                if (zA09) {
                    Tracer.A00();
                }
            }
        }
    }

    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0059: INVOKE (r2 I:X.DKY), (r0 I:short), (r1 I:java.lang.String) DIRECT call: X.DKY.A08(short, java.lang.String):void A[Catch: all -> 0x00b8, MD:(short, java.lang.String):void (m)] (LINE:89), block:B:17:0x0056 */
    private final void A05(String str) {
        DKY dkyA08;
        String strA0B;
        LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger;
        int i;
        int i2;
        boolean zA09 = Systrace.A09(32L);
        if (zA09) {
            Tracer.A01("TTRCTraceImpl.endTraceSuccessfully");
        }
        try {
            try {
                lightweightQuickPerformanceLogger = this.A09;
                i = this.A06;
                i2 = this.A05;
                lightweightQuickPerformanceLogger.markerAnnotate(i, i2, "end_reason", str);
                zA09 = Systrace.A09(32L);
                if (zA09) {
                    Tracer.A01("TTRCTraceImpl.endMarkerSuccessfullyAtPoint");
                }
            } catch (QplPointNotFoundException e) {
                dkyA08.A08((short) 3, "Point not found");
                dkyA08.A0C(C79.A0P);
                int i3 = dkyA08.A06;
                String strA0M = FGI.A0M("TTRCTrace | ", String.valueOf(i3));
                String[] strArr = e.knownPoints;
                if (strArr == null || (strA0B = BFI.A0B(", ", "", "", null, strArr)) == null) {
                    strA0B = HatchCcvLoggingKt.NO_POSTAL_FIELD;
                }
                DKe dKe = dkyA08.A0F;
                dKe.putCustomData("ttrc_qpl_points_known", strA0B);
                dKe.putCustomData("ttrc_qpl_points_submitted", AbstractC06907md.A01(", ", dkyA08.A0G, null));
                dKe.putCustomData("ttrc_qpl_markerid_sumbited", FGI.A07(i3, dkyA08.A05, ":"));
                dKe.putCustomData("ttrc_qpl_markerid_known", FGI.A07(e.markerId, e.instanceKey, ":"));
                dKe.report(strA0M, "Error while ending trace", e);
            }
            try {
                lightweightQuickPerformanceLogger.markerEndAtPointForUserFlow(i, i2, (short) 2, this.A03);
                this.A07.AU6(i, i2, this.A01, this.A00, (short) 2);
                this.A08.Aac(this);
                if (zA09) {
                    Tracer.A00();
                }
                A0C(C79.A0K);
            } finally {
                if (zA09) {
                    Tracer.A00();
                }
            }
        } finally {
            if (zA09) {
                Tracer.A00();
            }
        }
    }

    private final void A07(String str, String[] strArr) {
        LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = this.A09;
        int i = this.A06;
        int i2 = this.A05;
        lightweightQuickPerformanceLogger.markerAnnotate(i, i2, str, strArr);
        if (strArr != null) {
            this.A07.AU5(i, i2, str, strArr);
        }
    }

    public static boolean A09() {
        return Systrace.A09(32L);
    }

    @Override // X.FNA
    public final synchronized void A3q(String str, TimeUnit timeUnit, long j) {
        if (A0D(C79.A01)) {
            HashMap<String, DKZ> map = this.A0B;
            if (map.containsKey(str)) {
                A04(this, FGI.A0M("Attempted to Add Query Twice for: ", str));
            } else {
                map.put(str, j == -1 ? new DKZ(this, str) : new DKZ(this, str, timeUnit.toMillis(j)));
            }
        }
    }

    @Override // X.FNA
    public final synchronized void A3x(String str) {
        if (A0D(C79.A01)) {
            HashMap<String, C4984DKc> map = this.A0A;
            if (map.containsKey(str)) {
                A04(this, FGI.A0M("Attempted to Add Additional Step Twice for: ", str));
            } else {
                map.put(str, new C4984DKc());
            }
        }
    }

    @Override // X.FNA
    public final int AGc() {
        return this.A05;
    }

    @Override // X.FNA
    public final long AM7() {
        return (this.A05 & 4294967295L) | ((this.A06 << 32) & (-4294967296L));
    }

    @Override // X.FNA
    public final void APZ() {
        APa("leftSurface");
    }

    @Override // X.FNA
    public final void AQC(String str, double d) {
        LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = this.A09;
        int i = this.A06;
        int i2 = this.A05;
        lightweightQuickPerformanceLogger.markerAnnotate(i, i2, str, d);
        if (str != null) {
            this.A07.AU0(i, i2, str, d);
        }
    }

    @Override // X.FNA
    public final void AQD(String str, int i) {
        LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = this.A09;
        int i2 = this.A06;
        int i3 = this.A05;
        lightweightQuickPerformanceLogger.markerAnnotate(i2, i3, str, i);
        if (str != null) {
            this.A07.AU1(i2, i3, str, i);
        }
    }

    @Override // X.FNA
    public final void AQE(String str, long j) {
        LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = this.A09;
        int i = this.A06;
        int i2 = this.A05;
        lightweightQuickPerformanceLogger.markerAnnotate(i, i2, str, j);
        if (str != null) {
            this.A07.AU2(i, i2, str, j);
        }
    }

    @Override // X.FNA
    public final void AQF(String str, String str2) {
        LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = this.A09;
        int i = this.A06;
        int i2 = this.A05;
        lightweightQuickPerformanceLogger.markerAnnotate(i, i2, str, str2);
        if (str == null || str2 == null) {
            return;
        }
        this.A07.AU3(i, i2, str, str2);
    }

    @Override // X.FNA
    public final void AQG(String str, boolean z) {
        LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = this.A09;
        int i = this.A06;
        int i2 = this.A05;
        lightweightQuickPerformanceLogger.markerAnnotate(i, i2, str, z);
        if (str != null) {
            this.A07.AU4(i, i2, str, z);
        }
    }

    @Override // X.FNA
    public final synchronized void AQI(String str, long j) {
        boolean zA09 = A09();
        if (zA09) {
            Tracer.A01(FGI.A0M("TTRCTraceImpl.markerPoint.", str));
        }
        try {
            LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = this.A09;
            int i = this.A06;
            int i2 = this.A05;
            lightweightQuickPerformanceLogger.markerPoint(i, i2, str, null, j, TimeUnit.MILLISECONDS);
            this.A07.AU7(str == null ? "Unknown name" : str, i, i2, null, j);
            this.A0G.add(str);
        } finally {
            if (zA09) {
                Tracer.A00();
            }
        }
    }

    @Override // X.FNA
    public final int getMarkerId() {
        return this.A06;
    }

    @Override // X.FNA
    public final synchronized void markerPoint(String str) {
        boolean zA09 = A09();
        if (zA09) {
            Tracer.A01(FGI.A0M("TTRCTraceImpl.markerPoint.", str));
        }
        try {
            LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = this.A09;
            int i = this.A06;
            int i2 = this.A05;
            lightweightQuickPerformanceLogger.markerPoint(i, i2, str);
            this.A07.AU7(str == null ? "Unknown name" : str, i, i2, null, this.A0E.now());
            this.A0G.add(str);
        } finally {
            if (zA09) {
                Tracer.A00();
            }
        }
    }

    public final String toString() {
        return FGI.A07(this.A06, this.A05, "_");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x004a, code lost:
    
        A0E("time_to_initial_content", r6);
        r5.A04 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A03(long r6) {
        /*
            r5 = this;
            boolean r4 = A09()
            if (r4 == 0) goto Lb
            java.lang.String r0 = "TTRCTraceImpl.maybeMarkTTICPoint"
            com.facebook.debug.tracer.Tracer.A01(r0)
        Lb:
            boolean r0 = r5.A04     // Catch: java.lang.Throwable -> L58
            if (r0 != 0) goto L52
            r3 = 1
            boolean r0 = r5.A0A()     // Catch: java.lang.Throwable -> L58
            if (r0 == 0) goto L52
            java.lang.Integer r1 = r5.ALs()     // Catch: java.lang.Throwable -> L58
            java.lang.Integer r0 = X.C79.A00     // Catch: java.lang.Throwable -> L58
            if (r1 == r0) goto L26
            java.lang.Integer r1 = r5.ALs()     // Catch: java.lang.Throwable -> L58
            java.lang.Integer r0 = X.C79.A0C     // Catch: java.lang.Throwable -> L58
            if (r1 != r0) goto L52
        L26:
            java.util.HashMap<java.lang.String, X.DKZ> r0 = r5.A0B     // Catch: java.lang.Throwable -> L58
            java.util.Iterator r2 = X.BV5.A0x(r0)     // Catch: java.lang.Throwable -> L58
        L2c:
            boolean r0 = r2.hasNext()     // Catch: java.lang.Throwable -> L58
            if (r0 == 0) goto L4a
            java.lang.Object r0 = r2.next()     // Catch: java.lang.Throwable -> L58
            X.C7384Etj.A0U(r0)     // Catch: java.lang.Throwable -> L58
            X.DKZ r0 = (X.DKZ) r0     // Catch: java.lang.Throwable -> L58
            java.lang.Integer r1 = r0.A00     // Catch: java.lang.Throwable -> L58
            java.lang.Integer r0 = X.C79.A0K     // Catch: java.lang.Throwable -> L58
            if (r1 == r0) goto L2c
            java.lang.Integer r0 = X.C79.A0P     // Catch: java.lang.Throwable -> L58
            if (r1 == r0) goto L2c
            java.lang.Integer r0 = X.C79.A0C     // Catch: java.lang.Throwable -> L58
            if (r1 == r0) goto L2c
            goto L52
        L4a:
            java.lang.String r0 = "time_to_initial_content"
            r5.A0E(r0, r6)     // Catch: java.lang.Throwable -> L58
            r5.A04 = r3     // Catch: java.lang.Throwable -> L58
        L52:
            if (r4 == 0) goto L57
            com.facebook.debug.tracer.Tracer.A00()
        L57:
            return
        L58:
            r0 = move-exception
            if (r4 == 0) goto L5e
            com.facebook.debug.tracer.Tracer.A00()
        L5e:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DKY.A03(long):void");
    }

    private final void A08(short s, String str) {
        boolean zA09 = A09();
        if (zA09) {
            Tracer.A01("TTRCTraceImpl.endMarker");
        }
        if (str != null) {
            try {
                if (str.length() != 0) {
                    MarkerEditor markerEditorWithMarker = this.A09.withMarker(this.A06, this.A05);
                    markerEditorWithMarker.annotate("end_reason", str);
                    markerEditorWithMarker.markerEditingCompleted();
                }
            } finally {
                if (zA09) {
                    Tracer.A00();
                }
            }
        }
        LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = this.A09;
        int i = this.A06;
        int i2 = this.A05;
        lightweightQuickPerformanceLogger.markerEndForUserFlow(i, i2, s);
        this.A07.AU6(i, i2, this.A01, this.A00, s);
        this.A08.Aac(this);
    }
}
