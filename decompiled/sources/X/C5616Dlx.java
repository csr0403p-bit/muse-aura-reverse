package X;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.PerformanceHintManager;
import android.os.Trace;
import android.text.TextUtils;
import com.facebook.forker.Process;
import com.facebook.video.heroplayer.service.ServiceEventCallbackImpl;
import com.facebook.video.heroplayer.service.live.HeroDashLiveManagerImpl;
import com.facebook.video.heroplayer.setting.HeroPlayerSetting;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.Dlx, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5616Dlx implements ECU {
    public static C5616Dlx A0a;
    public Handler A00;
    public HandlerThread A01;
    public DXS A02;
    public DwB A03;
    public DFE A04;
    public DDR A05;
    public DDV A06;
    public C5092DXa A07;
    public C5805Dpp A08;
    public InterfaceC6035DuU A09;
    public C5668Dmx A0A;
    public HeroDashLiveManagerImpl A0B;
    public BZ2 A0C;
    public AtomicReference A0D;
    public final Context A0E;
    public final InterfaceC5637DmL A0F;
    public final BY6 A0G;
    public final ServiceEventCallbackImpl A0H;
    public final HeroPlayerSetting A0I;
    public final InterfaceC6113Dvs A0J;
    public final Object A0K = C3cG.A0T();
    public final Map<String, String> A0L;
    public final CopyOnWriteArraySet A0M;
    public final AtomicBoolean A0N;
    public final AtomicBoolean A0O;
    public final AtomicBoolean A0P;
    public final AtomicBoolean A0Q;
    public final AtomicReference<C5967Dt8> A0R;
    public final AtomicReference A0S;
    public final AtomicReference<DVC> A0T;
    public final AtomicReference A0U;
    public final AtomicReference A0V;
    public final AtomicBoolean A0W;
    public final AtomicReference A0X;
    public volatile C5605Dlk A0Y;
    public volatile DXW A0Z;

    public static Handler A00(C5616Dlx c5616Dlx) throws SecurityException, IllegalArgumentException {
        HandlerThread handlerThread;
        HandlerThread handlerThread2;
        PerformanceHintManager performanceHintManager;
        if (c5616Dlx.A00 == null) {
            synchronized (c5616Dlx.A0K) {
                if (c5616Dlx.A00 == null) {
                    if (c5616Dlx.A01 == null) {
                        HandlerThread handlerThread3 = new HandlerThread("HeroManagerBackgroundHandlerThread", 10);
                        c5616Dlx.A01 = handlerThread3;
                        handlerThread3.start();
                    }
                    HeroPlayerSetting heroPlayerSetting = c5616Dlx.A0I;
                    if (heroPlayerSetting != null && (handlerThread2 = c5616Dlx.A01) != null && heroPlayerSetting.gen.enable_thread_affinity_for_hero_threads) {
                        int threadId = handlerThread2.getThreadId();
                        if (Build.VERSION.SDK_INT >= 31 && (performanceHintManager = (PerformanceHintManager) c5616Dlx.A0E.getSystemService(PerformanceHintManager.class)) != null) {
                            performanceHintManager.createHintSession(new int[]{threadId}, 7200000000000L);
                        }
                    }
                    c5616Dlx.A00 = BV4.A09(c5616Dlx.A01.getLooper());
                }
            }
        }
        HeroPlayerSetting heroPlayerSetting2 = c5616Dlx.A0I;
        int iA00 = (heroPlayerSetting2 == null || TextUtils.isEmpty(heroPlayerSetting2.gen.hero_thread_priority_json_config)) ? Process.WAIT_RESULT_STOPPED : BYg.A00(BY0.A02, BYg.A05, false);
        if (iA00 <= 19 && iA00 >= -20 && (handlerThread = c5616Dlx.A01) != null) {
            int threadId2 = handlerThread.getThreadId();
            if (iA00 != android.os.Process.getThreadPriority(threadId2)) {
                android.os.Process.setThreadPriority(threadId2, iA00);
            }
        }
        return c5616Dlx.A00;
    }

    private final void A01() {
        Trace.beginSection("HeroManager.releaseResourcesAsync");
        try {
            A00(this).post(new Runnable() { // from class: X.DpN
                public static final String __redex_internal_original_name = "HeroManager$$ExternalSyntheticLambda9";

                @Override // java.lang.Runnable
                public final void run() {
                    C5616Dlx c5616Dlx = this.A00;
                    Trace.beginSection("HeroManager.releaseResourcesAsync.run");
                    try {
                        C5616Dlx.A03(c5616Dlx);
                        C5616Dlx.A04(c5616Dlx);
                        C5656Dmk c5656Dmk = c5616Dlx.A08.A00;
                        if (c5656Dmk != null) {
                            c5656Dmk.A04.set(null);
                        }
                        C5616Dlx.A02(c5616Dlx);
                    } finally {
                        Trace.endSection();
                    }
                }
            });
        } finally {
            Trace.endSection();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0009  */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A02(X.C5616Dlx r8) {
        /*
            Method dump skipped, instructions count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5616Dlx.A02(X.Dlx):void");
    }

    public static final void A03(C5616Dlx c5616Dlx) {
        Trace.beginSection("HeroManager.clearAllPlayers");
        try {
            DXW dxw = c5616Dlx.A0Z;
            if (dxw != null) {
                Trace.beginSection("HeroServicePlayerPool.clearAll");
                DXV dxv = dxw.A03;
                if (dxv instanceof C2988Br0) {
                    dxv.A05(0);
                } else {
                    CMu cMu = (CMu) dxv;
                    cMu.A03.clear();
                    cMu.A06 = true;
                    try {
                        cMu.A02.evictAll();
                        cMu.A06 = false;
                    } catch (Throwable th) {
                        cMu.A06 = false;
                        throw th;
                    }
                }
                dxw.A04("evictAll", -1L);
                Trace.endSection();
            }
            if (c5616Dlx.A0I.shouldCleanupHeroManagerThread) {
                synchronized (c5616Dlx.A0K) {
                    try {
                        HandlerThread handlerThread = c5616Dlx.A01;
                        if (handlerThread != null) {
                            c5616Dlx.A00 = null;
                            handlerThread.quit();
                            c5616Dlx.A01 = null;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        } catch (Throwable th3) {
            throw th3;
        } finally {
            Trace.endSection();
        }
    }

    public static final void A04(C5616Dlx c5616Dlx) {
        Trace.beginSection("HeroManager.clearWarmUpPool");
        try {
            C5664Dmt c5664Dmt = c5616Dlx.A08.A01;
            synchronized (c5664Dmt) {
                c5664Dmt.A06.clear();
                try {
                    c5664Dmt.A00.evictAll();
                    c5664Dmt.A01.evictAll();
                    C5828DqH c5828DqH = c5664Dmt.A05;
                    if (c5828DqH != null) {
                        synchronized (c5828DqH) {
                            try {
                                c5828DqH.A00.pollFirst();
                            } catch (Throwable th) {
                            }
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } finally {
            Trace.endSection();
        }
    }

    public static final void A05(C5616Dlx c5616Dlx) {
        Trace.beginSection("HeroManager.preallocateCodecsIfNotYet");
        try {
            if (!c5616Dlx.A0I.enableAlwaysCallPreallocateCodec && !c5616Dlx.A0O.get()) {
                c5616Dlx.A0N.get();
            }
        } finally {
            Trace.endSection();
        }
    }

    public final void A06(long j, boolean z) {
        Trace.beginSection("HeroManager.release");
        try {
            AbstractC5718DoA.A02("id [%d]: release", Long.valueOf(j));
            this.A0Z.A03(j, z);
        } finally {
            Trace.endSection();
        }
    }

    public final void A07(String str, String str2, boolean z) {
        Trace.beginSection("HeroManager.cancelPrefetchForVideo");
        try {
            AbstractC5718DoA.A02("cancelPrefetchForVideo %s, %b", str, Boolean.valueOf(z));
            BZ2 bz2 = this.A0C;
            if (bz2 != null) {
                synchronized (bz2) {
                    bz2.A00.remove(str);
                }
            }
            this.A09.A60(str, str2, z);
        } finally {
            Trace.endSection();
        }
    }

    public final boolean A08(long j, long j2) {
        Trace.beginSection("HeroManager.setRelativePosition");
        try {
            Long lValueOf = Long.valueOf(j);
            Long lValueOf2 = Long.valueOf(j2);
            Dlw dlwA00 = DXW.A00(this, "id [%d]: setRelativePosition %d", new Object[]{lValueOf, lValueOf2}, j);
            if (dlwA00 == null) {
                return false;
            }
            Trace.beginSection("HeroServicePlayer.setRelativePosition");
            Dlw.A0v(dlwA00, "Set relative position to %d", lValueOf2);
            Dlw.A0U(dlwA00.A0f, dlwA00, lValueOf2, 16);
            Trace.endSection();
            return true;
        } catch (Throwable th) {
            throw th;
        } finally {
            Trace.endSection();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004e, code lost:
    
        throw r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A09(android.view.Surface r6, java.lang.Object r7, int r8, int r9, long r10) {
        /*
            r5 = this;
            java.lang.String r0 = "HeroManager.setSurface"
            android.os.Trace.beginSection(r0)
            java.lang.String r2 = "id [%d]: setSurface: %s"
            java.lang.Long r0 = java.lang.Long.valueOf(r10)     // Catch: java.lang.Throwable -> L4a
            r1 = 0
            r4 = 1
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r6}     // Catch: java.lang.Throwable -> L4a
            X.Dlw r3 = X.DXW.A00(r5, r2, r0, r10)     // Catch: java.lang.Throwable -> L4a
            if (r3 != 0) goto L1b
            android.os.Trace.endSection()
            return r1
        L1b:
            java.lang.String r0 = "HeroServicePlayer.setSurface"
            android.os.Trace.beginSection(r0)     // Catch: java.lang.Throwable -> L4a
            java.lang.String r0 = "Set surface"
            X.Dlw.A0s(r3, r0)     // Catch: java.lang.Throwable -> L45
            android.os.Handler r2 = r3.A0f     // Catch: java.lang.Throwable -> L45
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Throwable -> L45
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L45
            java.lang.Object[] r1 = new java.lang.Object[]{r6, r1, r0}     // Catch: java.lang.Throwable -> L45
            r0 = 6
            X.Dlw.A0U(r2, r3, r1, r0)     // Catch: java.lang.Throwable -> L45
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> L4a
            if (r7 == 0) goto L41
            r0 = 68
            X.Dlw.A0U(r2, r3, r7, r0)     // Catch: java.lang.Throwable -> L4a
        L41:
            android.os.Trace.endSection()
            return r4
        L45:
            r0 = move-exception
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> L4a
            throw r0     // Catch: java.lang.Throwable -> L4a
        L4a:
            r0 = move-exception
            android.os.Trace.endSection()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5616Dlx.A09(android.view.Surface, java.lang.Object, int, int, long):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0059, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005d, code lost:
    
        throw r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A0A(java.lang.String r11, long r12, long r14, long r16, boolean r18, boolean r19) {
        /*
            r10 = this;
            java.lang.String r0 = "HeroManager.seekTo"
            android.os.Trace.beginSection(r0)
            java.lang.String r2 = "id [%d]: seekTo %d"
            java.lang.Long r0 = java.lang.Long.valueOf(r12)     // Catch: java.lang.Throwable -> L59
            java.lang.Long r7 = java.lang.Long.valueOf(r14)     // Catch: java.lang.Throwable -> L59
            r1 = 0
            r9 = 1
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r7}     // Catch: java.lang.Throwable -> L59
            X.Dlw r8 = X.DXW.A00(r10, r2, r0, r12)     // Catch: java.lang.Throwable -> L59
            if (r8 != 0) goto L1f
            android.os.Trace.endSection()
            return r1
        L1f:
            java.lang.String r0 = "HeroServicePlayer.seekTo"
            android.os.Trace.beginSection(r0)     // Catch: java.lang.Throwable -> L59
            java.lang.String r1 = "Seek to %d"
            java.lang.Object[] r0 = new java.lang.Object[]{r7}     // Catch: java.lang.Throwable -> L54
            X.Dlw.A0v(r8, r1, r0)     // Catch: java.lang.Throwable -> L54
            android.os.Handler r6 = r8.A0f     // Catch: java.lang.Throwable -> L54
            java.lang.Long r5 = java.lang.Long.valueOf(r16)     // Catch: java.lang.Throwable -> L54
            r3 = 1
            long r0 = X.BV5.A06(r18)
            java.lang.Long r2 = java.lang.Long.valueOf(r0)     // Catch: java.lang.Throwable -> L54
            if (r19 != 0) goto L41
            r3 = 0
        L41:
            java.lang.Long r0 = java.lang.Long.valueOf(r3)     // Catch: java.lang.Throwable -> L54
            r1 = 4
            java.lang.Object[] r0 = new java.lang.Object[]{r7, r5, r2, r0, r11}     // Catch: java.lang.Throwable -> L54
            X.Dlw.A0U(r6, r8, r0, r1)     // Catch: java.lang.Throwable -> L54
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> L59
            android.os.Trace.endSection()
            return r9
        L54:
            r0 = move-exception
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> L59
            throw r0     // Catch: java.lang.Throwable -> L59
        L59:
            r0 = move-exception
            android.os.Trace.endSection()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5616Dlx.A0A(java.lang.String, long, long, long, boolean, boolean):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0045, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0049, code lost:
    
        throw r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A0B(java.lang.String r7, long r8, boolean r10) {
        /*
            r6 = this;
            java.lang.String r0 = "HeroManager.pause"
            android.os.Trace.beginSection(r0)
            java.lang.String r1 = "id [%d]: pause, finishPlayback: %b"
            java.lang.Long r0 = java.lang.Long.valueOf(r8)     // Catch: java.lang.Throwable -> L45
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r10)     // Catch: java.lang.Throwable -> L45
            r2 = 0
            r4 = 1
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r5}     // Catch: java.lang.Throwable -> L45
            X.Dlw r3 = X.DXW.A00(r6, r1, r0, r8)     // Catch: java.lang.Throwable -> L45
            if (r3 != 0) goto L1f
            android.os.Trace.endSection()
            return r2
        L1f:
            java.lang.String r0 = "HeroServicePlayer.pause"
            android.os.Trace.beginSection(r0)     // Catch: java.lang.Throwable -> L45
            java.lang.String r1 = "Pause: finishPlayback=%b"
            java.lang.Object[] r0 = new java.lang.Object[]{r5}     // Catch: java.lang.Throwable -> L40
            X.Dlw.A0v(r3, r1, r0)     // Catch: java.lang.Throwable -> L40
            r3.A2s = r2     // Catch: java.lang.Throwable -> L40
            android.os.Handler r2 = r3.A0f     // Catch: java.lang.Throwable -> L40
            java.lang.Object[] r1 = new java.lang.Object[]{r5, r7}     // Catch: java.lang.Throwable -> L40
            r0 = 3
            X.Dlw.A0U(r2, r3, r1, r0)     // Catch: java.lang.Throwable -> L40
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> L45
            android.os.Trace.endSection()
            return r4
        L40:
            r0 = move-exception
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> L45
            throw r0     // Catch: java.lang.Throwable -> L45
        L45:
            r0 = move-exception
            android.os.Trace.endSection()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5616Dlx.A0B(java.lang.String, long, boolean):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0047, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004b, code lost:
    
        throw r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0036 A[Catch: all -> 0x0047, TryCatch #1 {all -> 0x0047, all -> 0x0031, blocks: (B:4:0x0007, B:6:0x0015, B:8:0x001c, B:10:0x002d, B:12:0x0032, B:13:0x0035, B:18:0x0040, B:14:0x0036, B:16:0x003a, B:9:0x0021), top: B:26:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0040 A[Catch: all -> 0x0047, TRY_LEAVE, TryCatch #1 {all -> 0x0047, all -> 0x0031, blocks: (B:4:0x0007, B:6:0x0015, B:8:0x001c, B:10:0x002d, B:12:0x0032, B:13:0x0035, B:18:0x0040, B:14:0x0036, B:16:0x003a, B:9:0x0021), top: B:26:0x0007 }] */
    @Override // X.ECU
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void AhS(X.ECR r4) {
        /*
            r3 = this;
            java.lang.String r0 = "HeroManager.trim"
            android.os.Trace.beginSection(r0)
            if (r4 == 0) goto L36
            com.facebook.video.heroplayer.setting.HeroPlayerSetting r2 = r3.A0I     // Catch: java.lang.Throwable -> L47
            java.util.Set<java.lang.String> r1 = r2.allowedMemoryTrimTypes     // Catch: java.lang.Throwable -> L47
            java.lang.String r0 = r4.name()     // Catch: java.lang.Throwable -> L47
            boolean r0 = r1.contains(r0)     // Catch: java.lang.Throwable -> L47
            if (r0 == 0) goto L36
            X.Dlv r0 = r2.gen     // Catch: java.lang.Throwable -> L47
            long r0 = r0.memory_trim_action_mode     // Catch: java.lang.Throwable -> L47
            int r2 = (int) r0     // Catch: java.lang.Throwable -> L47
            if (r2 <= 0) goto L40
            java.lang.String r0 = "HeroManager.releaseResourcesSelectivelyAsync"
            android.os.Trace.beginSection(r0)     // Catch: java.lang.Throwable -> L47
            android.os.Handler r1 = A00(r3)     // Catch: java.lang.Throwable -> L31
            X.DXY r0 = new X.DXY     // Catch: java.lang.Throwable -> L31
            r0.<init>()     // Catch: java.lang.Throwable -> L31
            r1.post(r0)     // Catch: java.lang.Throwable -> L31
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> L47
            goto L43
        L31:
            r0 = move-exception
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> L47
            throw r0     // Catch: java.lang.Throwable -> L47
        L36:
            X.ECR r0 = X.ECR.A03     // Catch: java.lang.Throwable -> L47
            if (r4 != r0) goto L43
            com.facebook.video.heroplayer.setting.HeroPlayerSetting r0 = r3.A0I     // Catch: java.lang.Throwable -> L47
            boolean r0 = r0.releaseHeroManagerWhenLowMemInBg     // Catch: java.lang.Throwable -> L47
            if (r0 == 0) goto L43
        L40:
            r3.A01()     // Catch: java.lang.Throwable -> L47
        L43:
            android.os.Trace.endSection()
            return
        L47:
            r0 = move-exception
            android.os.Trace.endSection()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5616Dlx.AhS(X.ECR):void");
    }

    public final void finalize() {
        AbstractC5718DoA.A02("HeroService destroy", BV4.A1W());
        A01();
    }

    /* JADX WARN: Removed duplicated region for block: B:183:0x05a7  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0655  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0674  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0734  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0761  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x085e  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0a98  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C5616Dlx(android.content.Context r34, X.InterfaceC5637DmL r35, com.facebook.video.heroplayer.setting.HeroPlayerSetting r36, X.CXY r37, java.util.Map r38) {
        /*
            Method dump skipped, instructions count: 2752
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5616Dlx.<init>(android.content.Context, X.DmL, com.facebook.video.heroplayer.setting.HeroPlayerSetting, X.CXY, java.util.Map):void");
    }
}
