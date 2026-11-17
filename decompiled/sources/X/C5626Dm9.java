package X;

import android.os.RemoteException;
import android.os.SystemClock;
import android.os.Trace;
import android.view.Surface;
import java.util.List;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.Dm9, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5626Dm9 {
    public int A00;
    public int A01;
    public long A04;
    public long A05;
    public Surface A06;
    public DmR A07;
    public C5616Dlx A08;
    public String A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public volatile Surface A0E;
    public volatile boolean A0F;
    public volatile boolean A0G;
    public final /* synthetic */ C5625Dm8 A0H;
    public String A09 = "";
    public int A03 = -1;
    public int A02 = -1;

    public static void A05(C5626Dm9 c5626Dm9) {
        c5626Dm9.A0D = false;
        c5626Dm9.A0G = false;
        c5626Dm9.A0F = false;
        c5626Dm9.A01 = 0;
        c5626Dm9.A00 = 0;
        c5626Dm9.A07 = null;
        c5626Dm9.A09 = "";
        c5626Dm9.A0A = null;
        c5626Dm9.A0C = false;
        C5625Dm8 c5625Dm8 = c5626Dm9.A0H;
        AtomicInteger atomicInteger = C5625Dm8.A0m;
        c5625Dm8.A0Y = 1.0f;
        c5625Dm8.A0X = 1.0f;
        c5626Dm9.A04 = 0L;
        c5626Dm9.A05 = 0L;
        c5625Dm8.A0c = 0L;
        c5625Dm8.A0i = false;
        c5625Dm8.A0U.set(new C5623Dm6());
        c5625Dm8.A0S.set(Dq8.A0D);
        List<C5960Dsv> list = c5625Dm8.A0N;
        synchronized (list) {
            list.clear();
            c5625Dm8.A00 = -1L;
        }
        c5625Dm8.A0R.set("");
    }

    public static void A07(C5626Dm9 c5626Dm9, C5625Dm8 c5625Dm8, String str) {
        C5625Dm8.A0A(c5625Dm8, str, new Object[0]);
        A0A(c5626Dm9, true);
    }

    public C5626Dm9(C5625Dm8 c5625Dm8) {
        this.A0H = c5625Dm8;
    }

    public static C5616Dlx A00(C5626Dm9 c5626Dm9) {
        C5616Dlx c5616Dlx = c5626Dm9.A08;
        if (c5616Dlx != null) {
            return c5616Dlx;
        }
        throw new RemoteException("No service api available");
    }

    private final /* synthetic */ void A01(C5630DmE c5630DmE) {
        Object objA0s;
        long jA0D = this.A0H.A0D();
        c5630DmE.A0C.A01();
        String strA01 = c5630DmE.A08;
        if (strA01 == null) {
            strA01 = C5630DmE.A01(c5630DmE);
        }
        InterfaceC5724DoJ interfaceC5724DoJ = c5630DmE.A0B;
        C5627DmA c5627DmA = (C5627DmA) interfaceC5724DoJ;
        C5623Dm6 c5623Dm6A0i = BV7.A0i(c5627DmA.A07);
        C5630DmE.A0H(c5630DmE, c5623Dm6A0i, strA01);
        C5654Dmi.A00(EnumC5667Dmw.A0E, c5630DmE.A0E, strA01);
        c5630DmE.A08 = null;
        C5699Dng c5699Dng = c5630DmE.A0F;
        if (c5699Dng.gen.enable_dropped_frames_metadata && c5623Dm6A0i != null) {
            try {
                DmR dmR = c5627DmA.A08;
                objA0s = dmR != null ? dmR.A09 : null;
            } catch (Throwable th) {
                objA0s = C3cG.A0s(th);
            }
            if (objA0s instanceof C10571Hud) {
                objA0s = null;
            }
            C5630DmE.A06(c5630DmE);
            C5630DmE.A05(c5630DmE);
            C5785DpT c5785DpT = c5699Dng.gen;
            c5630DmE.A0K(AbstractC5640DmU.A00(interfaceC5724DoJ, c5623Dm6A0i, interfaceC5724DoJ.ALH((String) objA0s, true), c5785DpT.enable_hdr_frame_count_metadata, c5785DpT.enable_inference_frame_count_metadata));
        }
        String str = c5699Dng.mEnableResetEvent ? "reset" : "requested_pause";
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        Boolean bool = c5623Dm6A0i != null ? c5623Dm6A0i.A0a : null;
        C5700Dnh c5700DnhA00 = c5630DmE.A0D.A00(c5630DmE.A0S, strA01);
        if (c5700DnhA00 != null) {
            c5700DnhA00.A02(null, null, null, null, bool, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, str, strA01, null, null, null, null, null, null, null, jA0D, c5630DmE.A03, jElapsedRealtime, false);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:187:0x03e9, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x03ed, code lost:
    
        throw r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:59:0x011d A[Catch: all -> 0x0227, Merged into TryCatch #6 {all -> 0x022c, all -> 0x0227, blocks: (B:25:0x0084, B:28:0x009f, B:30:0x00a5, B:32:0x00a9, B:36:0x00c2, B:100:0x0228, B:101:0x022b, B:39:0x00cb, B:40:0x00ce, B:69:0x019b, B:71:0x01aa, B:72:0x01ac, B:81:0x01e7, B:86:0x01f3, B:85:0x01f1, B:87:0x01f8, B:92:0x0208, B:91:0x0201, B:24:0x0080, B:33:0x00ae, B:35:0x00bb, B:41:0x00d3, B:43:0x00e1, B:46:0x00e9, B:48:0x00ed, B:50:0x00f5, B:51:0x00ff, B:53:0x0103, B:55:0x0109, B:65:0x0192, B:64:0x012a, B:57:0x0113, B:59:0x011d, B:61:0x0121, B:63:0x0127, B:68:0x0198), top: B:207:0x0080, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01aa A[Catch: all -> 0x022c, TryCatch #6 {all -> 0x022c, all -> 0x0227, blocks: (B:25:0x0084, B:28:0x009f, B:30:0x00a5, B:32:0x00a9, B:36:0x00c2, B:100:0x0228, B:101:0x022b, B:39:0x00cb, B:40:0x00ce, B:69:0x019b, B:71:0x01aa, B:72:0x01ac, B:81:0x01e7, B:86:0x01f3, B:85:0x01f1, B:87:0x01f8, B:92:0x0208, B:91:0x0201, B:24:0x0080, B:33:0x00ae, B:35:0x00bb, B:41:0x00d3, B:43:0x00e1, B:46:0x00e9, B:48:0x00ed, B:50:0x00f5, B:51:0x00ff, B:53:0x0103, B:55:0x0109, B:65:0x0192, B:64:0x012a, B:57:0x0113, B:59:0x011d, B:61:0x0121, B:63:0x0127, B:68:0x0198), top: B:207:0x0080, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0201 A[Catch: all -> 0x022c, TRY_ENTER, TryCatch #6 {all -> 0x022c, all -> 0x0227, blocks: (B:25:0x0084, B:28:0x009f, B:30:0x00a5, B:32:0x00a9, B:36:0x00c2, B:100:0x0228, B:101:0x022b, B:39:0x00cb, B:40:0x00ce, B:69:0x019b, B:71:0x01aa, B:72:0x01ac, B:81:0x01e7, B:86:0x01f3, B:85:0x01f1, B:87:0x01f8, B:92:0x0208, B:91:0x0201, B:24:0x0080, B:33:0x00ae, B:35:0x00bb, B:41:0x00d3, B:43:0x00e1, B:46:0x00e9, B:48:0x00ed, B:50:0x00f5, B:51:0x00ff, B:53:0x0103, B:55:0x0109, B:65:0x0192, B:64:0x012a, B:57:0x0113, B:59:0x011d, B:61:0x0121, B:63:0x0127, B:68:0x0198), top: B:207:0x0080, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A02(X.C5626Dm9 r34) {
        /*
            Method dump skipped, instructions count: 1042
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5626Dm9.A02(X.Dm9):void");
    }

    public static void A03(C5626Dm9 c5626Dm9) {
        C4904DDx c4904DDx;
        DmR dmR = c5626Dm9.A07;
        String.valueOf((dmR == null || (c4904DDx = dmR.A03) == null) ? null : c4904DDx.A0Q);
    }

    public static void A04(C5626Dm9 c5626Dm9) {
        C5625Dm8 c5625Dm8 = c5626Dm9.A0H;
        AtomicInteger atomicInteger = C5625Dm8.A0m;
        Dlv dlv = c5625Dm8.A06.gen;
        if (dlv == null || !dlv.use_lock_free_snapl_listener) {
            synchronized (c5625Dm8.A0M) {
                C5630DmE c5630DmE = c5625Dm8.A0e;
                if (c5630DmE != null) {
                    c5626Dm9.A01(c5630DmE);
                }
            }
        } else {
            C5630DmE c5630DmE2 = c5625Dm8.A0e;
            if (c5630DmE2 != null) {
                c5626Dm9.A01(c5630DmE2);
            }
        }
        try {
            try {
                if (AnonymousClass002.A1L((c5625Dm8.A0a > 0L ? 1 : (c5625Dm8.A0a == 0L ? 0 : -1)))) {
                    C5616Dlx c5616DlxA00 = A00(c5626Dm9);
                    long j = c5625Dm8.A0a;
                    Trace.beginSection("HeroManager.reset");
                    try {
                        Dlw dlwA00 = DXW.A00(c5616DlxA00, "id [%d]: reset", new Object[]{Long.valueOf(j)}, j);
                        if (dlwA00 == null) {
                            Trace.endSection();
                            A07(c5626Dm9, c5625Dm8, "When reset(), service player is noticed to be evicted earlier. Lazy recover at next play()");
                        } else {
                            dlwA00.A1P();
                            Trace.endSection();
                        }
                    } catch (Throwable th) {
                        Trace.endSection();
                        throw th;
                    }
                } else {
                    BV6.A13(c5625Dm8, "Before reset(), service player was evicted. Lazy recover at next play()");
                }
                c5625Dm8.hashCode();
                A03(c5626Dm9);
            } finally {
                A05(c5626Dm9);
            }
        } catch (RemoteException e) {
            BV6.A14(c5625Dm8, "Error occurs while pausing the video", e);
        }
    }

    public static void A06(C5626Dm9 c5626Dm9, float f, float f2) {
        if (f < 0.25f || f > 4.0f) {
            BV6.A13(c5626Dm9.A0H, "Trying to set playback speed with invalid value");
        }
        C5625Dm8 c5625Dm8 = c5626Dm9.A0H;
        float fA01 = BV7.A01(4.0f, f, 0.25f);
        AtomicInteger atomicInteger = C5625Dm8.A0m;
        c5625Dm8.A0Y = fA01;
        float fA012 = BV7.A01(4.0f, f2, 0.25f);
        c5625Dm8.A0X = fA012;
        try {
            if (!AnonymousClass002.A1L((c5625Dm8.A0a > 0L ? 1 : (c5625Dm8.A0a == 0L ? 0 : -1)))) {
                BV6.A13(c5625Dm8, "Before setPlaybackSpeed(), service player was evicted. Lazy recover at next play()");
                return;
            }
            C5616Dlx c5616DlxA00 = A00(c5626Dm9);
            long j = c5625Dm8.A0a;
            float f3 = c5625Dm8.A0Y;
            Trace.beginSection("HeroManager.setPlaybackSpeed");
            try {
                Dlw dlwA00 = DXW.A00(c5616DlxA00, "id [%d]: setPlaybackSpeed(speed, pitch)", new Object[]{Long.valueOf(j)}, j);
                if (dlwA00 == null) {
                    Trace.endSection();
                    A07(c5626Dm9, c5625Dm8, "When setPlaybackSpeed(), service player is noticed to be evicted earlier. Lazy recover at next play()");
                } else {
                    Trace.beginSection("HeroServicePlayer.setPlaybackSpeed");
                    Dlw.A0s(dlwA00, "Set playback speed and pitch");
                    Dlw.A0U(dlwA00.A0f, dlwA00, new float[]{f3, fA012}, 27);
                    Trace.endSection();
                }
            } catch (Throwable th) {
                throw th;
            } finally {
                Trace.endSection();
            }
        } catch (RemoteException e) {
            BV6.A14(c5625Dm8, "Error occurs while setting playback speed", e);
        }
    }

    public static void A08(C5626Dm9 c5626Dm9, Dq8 dq8, Dq8 dq82) {
        C5625Dm8 c5625Dm8 = c5626Dm9.A0H;
        AtomicInteger atomicInteger = C5625Dm8.A0m;
        TreeMap<Long, Integer> treeMap = c5625Dm8.A0O;
        if (treeMap.isEmpty() || dq8 == null || dq82.A00 != dq8.A00) {
            C8j4.A1O(Long.valueOf(dq82.A09), treeMap, dq82.A00);
        }
    }

    public static void A09(C5626Dm9 c5626Dm9, C5623Dm6 c5623Dm6) {
        boolean z;
        C5625Dm8 c5625Dm8 = c5626Dm9.A0H;
        AtomicInteger atomicInteger = C5625Dm8.A0m;
        AtomicReference<C5623Dm6> atomicReference = c5625Dm8.A0U;
        synchronized (atomicReference) {
            C5623Dm6 c5623Dm62 = atomicReference.get();
            if (c5623Dm62 == null || c5623Dm62.A0O <= c5623Dm6.A0O) {
                atomicReference.set(c5623Dm6);
                if (c5625Dm8.A06.gen.enable_sync_player_state_api) {
                    c5625Dm8.A0G.A02();
                }
                if (c5623Dm6.A0I >= c5625Dm8.A0c) {
                    z = c5623Dm6.A0o ? false : true;
                }
                c5625Dm8.A0j = z;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A0A(X.C5626Dm9 r8, boolean r9) {
        /*
            X.Dm8 r5 = r8.A0H
            r2 = 0
            java.util.concurrent.atomic.AtomicInteger r0 = X.C5625Dm8.A0m
            r5.A0c = r2
            long[] r4 = r5.A0W
            r0 = 1
            r4[r0] = r2
            r1 = 0
            r4[r1] = r2
            boolean r7 = r8.A0G
            com.facebook.video.heroplayer.setting.HeroPlayerSetting r4 = r5.A06
            X.Dlv r6 = r4.gen
            boolean r0 = r6.eager_player_recover_when_evicted
            if (r0 == 0) goto L1f
            if (r7 == 0) goto L1f
        L1c:
            if (r9 == 0) goto L43
            goto L36
        L1f:
            boolean r0 = r6.eager_recover_player_while_playing
            if (r0 == 0) goto L43
            java.util.concurrent.atomic.AtomicReference<X.Dm6> r6 = r5.A0U
            java.lang.Object r0 = r6.get()
            if (r0 == 0) goto L43
            java.lang.Object r0 = r6.get()
            X.Dm6 r0 = (X.C5623Dm6) r0
            boolean r0 = r0.A0o
            if (r0 == 0) goto L43
            goto L1c
        L36:
            A02(r8)     // Catch: android.os.RemoteException -> L3a
            return
        L3a:
            r2 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r0 = "Error occurs while ensureAndRecoverServicePlayer in handleServicePlayerRelease"
            X.C5625Dm8.A09(r5, r0, r2, r1)
            return
        L43:
            boolean r0 = r4.enableEvictedReleaseCallback
            if (r0 == 0) goto L4e
            if (r9 == 0) goto L4e
            X.DmF r0 = r5.A0I
            r0.ATQ()
        L4e:
            long r6 = r5.A0a
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            boolean r0 = X.AnonymousClass002.A1L(r0)
            if (r0 == 0) goto L8c
            r5.A0a = r2
            r0 = 0
            r8.A06 = r0
            X.Dm6 r0 = X.BV7.A0i(r5)
            if (r9 == 0) goto L86
            if (r0 == 0) goto L86
            boolean r0 = r0.A0o
            if (r0 == 0) goto L86
            X.Dlv r0 = r4.gen
            boolean r0 = r0.enable_evicted_while_playing_logging
            if (r0 == 0) goto L86
            X.DmW r4 = X.EnumC5642DmW.A0J
            X.Dm7 r3 = X.EnumC5624Dm7.A0S
            java.lang.String r2 = "evicted while playing"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r0 = "onWarn"
            X.C5625Dm8.A0A(r5, r0, r1)
            X.DmF r1 = r5.A0I
            X.DpZ r0 = new X.DpZ
            r0.<init>(r3, r4, r2)
            r1.AXP(r0)
        L86:
            r5.hashCode()
            A03(r8)
        L8c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5626Dm9.A0A(X.Dm9, boolean):void");
    }
}
