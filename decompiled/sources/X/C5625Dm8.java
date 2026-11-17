package X;

import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import android.view.Surface;
import com.facebook.video.heroplayer.setting.HeroPlayerSetting;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.Dm8, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5625Dm8 implements Handler.Callback {
    public long A00;
    public long A01;
    public C1F A02;
    public C5980DtM A03;
    public C5875DrB A04;
    public InterfaceC5638DmM A05;
    public HeroPlayerSetting A06;
    public C6130DwX A07;
    public String A08;
    public List<C5841DqX> A09;
    public AtomicInteger A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public final Handler A0F;
    public final C5778DpK A0G;
    public final C5626Dm9 A0H;
    public final C5631DmF A0I;
    public final C5932DsR A0J;
    public final Object A0K;
    public final Object A0L;
    public final Object A0M;
    public final List<C5960Dsv> A0N;
    public final TreeMap<Long, Integer> A0O;
    public final AtomicBoolean A0P;
    public final AtomicInteger A0Q;
    public final AtomicReference<String> A0R;
    public final AtomicReference<Dq8> A0S;
    public final AtomicReference<Surface> A0T;
    public final AtomicReference<C5623Dm6> A0U;
    public final AtomicReference<C5918Ds3> A0V;
    public final long[] A0W;
    public volatile float A0X;
    public volatile float A0Y;
    public volatile float A0Z;
    public volatile long A0a;
    public volatile long A0b;
    public volatile long A0c;
    public volatile long A0d;
    public volatile C5630DmE A0e;
    public volatile String A0f;
    public volatile String A0g;
    public volatile boolean A0h;
    public volatile boolean A0i;
    public volatile boolean A0j;
    public static final AtomicLong A0n = BV5.A19();
    public static final AtomicInteger A0m = new AtomicInteger();
    public static final Set<C5625Dm8> A0k = Collections.synchronizedSet(Collections.newSetFromMap(BV4.A11()));
    public static final Set<Surface> A0l = Collections.synchronizedSet(Collections.newSetFromMap(BV4.A11()));

    /* JADX WARN: Removed duplicated region for block: B:9:0x001f A[PHI: r4
  0x001f: PHI (r4v2 X.DmE) = (r4v1 X.DmE), (r4v3 X.DmE) binds: [B:17:0x0046, B:8:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A07(X.C5625Dm8 r9, X.EnumC5624Dm7 r10, X.EnumC5642DmW r11, java.lang.String r12, java.lang.String r13, java.lang.Throwable r14) {
        /*
            r3 = r9
            r7 = r12
            X.BV6.A14(r9, r12, r14)
            com.facebook.video.heroplayer.setting.HeroPlayerSetting r2 = r9.A06
            boolean r0 = r2.logStallOnPauseOnError
            if (r0 == 0) goto L55
            X.Duv r12 = A02(r9)
        Lf:
            r1 = 1
            boolean r0 = A0C(r9)
            r5 = r10
            r6 = r11
            r8 = r13
            if (r0 == 0) goto L3c
            X.DmE r4 = A01(r9, r13, r1)
            if (r4 == 0) goto L3c
        L1f:
            r3.A04(r4, r5, r6, r7, r8)
        L22:
            X.DmF r9 = r9.A0I
            java.util.concurrent.atomic.AtomicReference<X.Dm6> r0 = r3.A0U
            java.lang.Object r10 = r0.get()
            X.Dm6 r10 = (X.C5623Dm6) r10
            X.Dq8 r11 = X.BV7.A0g(r3)
            java.lang.String r0 = ""
            X.DpZ r13 = new X.DpZ
            r13.<init>(r5, r6, r7, r0)
            r14 = r8
            r9.AUc(r10, r11, r12, r13, r14)
            return
        L3c:
            X.Dlv r0 = r2.gen
            if (r0 == 0) goto L49
            boolean r0 = r0.use_lock_free_snapl_listener
            if (r0 == 0) goto L49
            X.DmE r4 = r9.A0e
            if (r4 == 0) goto L22
            goto L1f
        L49:
            java.lang.Object r1 = r9.A0M
            monitor-enter(r1)
            X.DmE r4 = r9.A0e     // Catch: java.lang.Throwable -> L57
            if (r4 == 0) goto L53
            r3.A04(r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L57
        L53:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L57
            goto L22
        L55:
            r12 = 0
            goto Lf
        L57:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L57
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5625Dm8.A07(X.Dm8, X.Dm7, X.DmW, java.lang.String, java.lang.String, java.lang.Throwable):void");
    }

    public static long A00(C5625Dm8 c5625Dm8) {
        C5623Dm6 c5623Dm6A0i;
        if (!AnonymousClass002.A1L((c5625Dm8.A0a > 0L ? 1 : (c5625Dm8.A0a == 0L ? 0 : -1))) || (c5623Dm6A0i = BV7.A0i(c5625Dm8)) == null) {
            return 0L;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (!c5623Dm6A0i.A0o || c5623Dm6A0i.A0l) {
            return 0L;
        }
        return jElapsedRealtime - c5623Dm6A0i.A0O;
    }

    public static C5630DmE A01(C5625Dm8 c5625Dm8, String str, boolean z) {
        AtomicReference<C5918Ds3> atomicReference = c5625Dm8.A0V;
        C5918Ds3 c5918Ds3 = atomicReference.get();
        if (c5918Ds3 == null) {
            return null;
        }
        String str2 = c5918Ds3.A01;
        if (!str2.equals(str)) {
            return null;
        }
        if (z && !c5918Ds3.A02) {
            Bs8.A00(c5918Ds3, new C5918Ds3(c5918Ds3.A00, str2, true), atomicReference);
        }
        return c5918Ds3.A00;
    }

    public static final C6060Duv A02(C5625Dm8 c5625Dm8) {
        C4904DDx c4904DDx;
        List<C5960Dsv> list = c5625Dm8.A0N;
        synchronized (list) {
            for (C5960Dsv c5960Dsv : list) {
                long j = c5960Dsv.A00;
                long j2 = c5960Dsv.A01;
                if (j <= j2 || j2 <= 0 || j <= 0) {
                    A09(c5625Dm8, "stallStartMs = %d, stallEndMs = %d", C3cG.A0Q("Start stall time is greater or equal to end stall time"), Long.valueOf(j2), Long.valueOf(j));
                } else {
                    DmR dmR = c5625Dm8.A0H.A07;
                    if (dmR != null && (c4904DDx = dmR.A03) != null && c4904DDx.A04()) {
                        AbstractC3426CMt.A06(c5625Dm8.A0O, c5625Dm8.A06.staleManifestThreshold, j2, j);
                    }
                }
            }
            list.clear();
            c5625Dm8.A0O.clear();
            c5625Dm8.A00 = -1L;
        }
        return new C6060Duv();
    }

    public static void A05(C5625Dm8 c5625Dm8) {
        C5630DmE c5630DmE;
        if (c5625Dm8.A06.loggerSDKConfig.mEnableMoveRequestCloseToFbLegacy && (c5630DmE = c5625Dm8.A0e) != null) {
            C5623Dm6 c5623Dm6A0i = BV7.A0i(c5625Dm8);
            C5699Dng c5699Dng = c5630DmE.A0F;
            if (!c5699Dng.mEnableMoveRequestedPlayingCallback || c5699Dng.mEnableMoveRequestCloseToFbLegacy) {
                C5630DmE.A0F(c5630DmE, c5623Dm6A0i);
            }
        }
        c5625Dm8.A0I.AXE(BV7.A0i(c5625Dm8));
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A08(X.C5625Dm8 r23, X.C5623Dm6 r24, boolean r25) {
        /*
            Method dump skipped, instructions count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5625Dm8.A08(X.Dm8, X.Dm6, boolean):void");
    }

    public static void A09(C5625Dm8 c5625Dm8, String str, Throwable th, Object... objArr) {
        if (c5625Dm8.A0B) {
            StringBuilder sbA0w = C60O.A0w();
            sbA0w.append(c5625Dm8.hashCode());
            sbA0w.append(", playerId[");
            sbA0w.append(c5625Dm8.A0a);
            sbA0w.append("]: ");
            sbA0w.append(str);
            sbA0w.append(", message = ");
            BV6.A1J(AnonymousClass001.A0v(th.getMessage(), sbA0w), "HeroPlayer", th, objArr);
        }
    }

    public static void A0A(C5625Dm8 c5625Dm8, String str, Object... objArr) {
        if (c5625Dm8.A0B) {
            StringBuilder sbA0w = C60O.A0w();
            sbA0w.append(c5625Dm8.hashCode());
            sbA0w.append(", playerId[");
            sbA0w.append(c5625Dm8.A0a);
            AbstractC3426CMt.A04("HeroPlayer", C60P.A1M("]: ", str, sbA0w), objArr);
        }
    }

    public static boolean A0B(Message message, C5625Dm8 c5625Dm8) {
        if (c5625Dm8.A0C && c5625Dm8.A0B) {
            A0A(c5625Dm8, "what=%s trace=%s", Integer.valueOf(message.what), Log.getStackTraceString(new Exception()));
        }
        return c5625Dm8.A0F.sendMessage(message);
    }

    public static boolean A0C(C5625Dm8 c5625Dm8) {
        C5785DpT c5785DpT;
        C5699Dng c5699Dng = c5625Dm8.A06.loggerSDKConfig;
        return (c5699Dng == null || (c5785DpT = c5699Dng.gen) == null || !c5785DpT.snapl_session_bound_terminal_events) ? false : true;
    }

    public final long A0D() {
        DmR dmR;
        if (!AnonymousClass002.A1L((this.A0a > 0L ? 1 : (this.A0a == 0L ? 0 : -1)))) {
            return 0L;
        }
        C5626Dm9 c5626Dm9 = this.A0H;
        if (c5626Dm9.A07 != null && this.A0j && SystemClock.elapsedRealtime() - this.A0d <= this.A06.returnRequestedSeekTimeTimeoutMs && ((dmR = c5626Dm9.A07) == null || !C4904DDx.A00(dmR))) {
            return this.A0b;
        }
        C5623Dm6 c5623Dm6A0i = BV7.A0i(this);
        return (c5623Dm6A0i != null ? c5623Dm6A0i.A00() : 0L) + A00(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0E(X.DmR r14) {
        /*
            Method dump skipped, instructions count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5625Dm8.A0E(X.DmR):void");
    }

    public final boolean A0H() {
        DmR dmR;
        C4904DDx c4904DDx;
        C5626Dm9 c5626Dm9 = this.A0H;
        if (c5626Dm9 == null || (dmR = c5626Dm9.A07) == null || (c4904DDx = dmR.A03) == null) {
            AbstractC3426CMt.A02("HeroPlayer", "Couldn't find isProtectedContent status. Considering it as non-protected.");
            return false;
        }
        String str = c4904DDx.A0D;
        return str != null && str.contains("ContentProtection");
    }

    /* JADX WARN: Code restructure failed: missing block: B:136:0x02c9, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x02cd, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x032b, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x032f, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x03f5, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x03f9, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x04af, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x04b3, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x0511, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x0515, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x0604, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:282:0x0608, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:306:0x068c, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:308:0x0690, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:327:0x06fd, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:329:0x0701, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:363:0x07b2, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:365:0x07b6, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:384:0x081b, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:386:0x081f, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:426:0x08fb, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:428:0x08ff, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:450:0x0979, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:452:0x097d, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:490:0x0a3d, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:492:0x0a41, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:541:0x0b47, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:543:0x0b4b, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:561:0x0bbf, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:563:0x0bc3, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:665:0x0df7, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:667:0x0dfb, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:684:0x0e4f, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:686:0x0e53, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:704:0x0eb5, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:706:0x0eb9, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:817:0x10e6, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:819:0x10ea, code lost:
    
        throw r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x0592: IGET (r2 I:X.Dm8) = (r5 I:X.Dm9) A[Catch: all -> 0x1698] (LINE:1426) X.Dm9.A0H X.Dm8, block:B:263:0x0592 */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x0703: IGET (r2 I:X.Dm8) = (r5 I:X.Dm9) A[Catch: all -> 0x1698] (LINE:1795) X.Dm9.A0H X.Dm8, block:B:331:0x0703 */
    /* JADX WARN: Removed duplicated region for block: B:1040:0x14da A[Catch: all -> 0x1598, TryCatch #45 {all -> 0x1598, blocks: (B:977:0x1403, B:979:0x142c, B:981:0x1430, B:983:0x1438, B:985:0x143e, B:987:0x1442, B:990:0x1449, B:992:0x144d, B:994:0x1455, B:1000:0x1469, B:1002:0x146d, B:1004:0x1473, B:1006:0x1477, B:1008:0x147d, B:1013:0x148c, B:1015:0x1496, B:1017:0x149a, B:1019:0x14a0, B:1021:0x14a6, B:1023:0x14ac, B:1025:0x14b0, B:1026:0x14b2, B:1028:0x14ba, B:1030:0x14c0, B:1032:0x14c6, B:1046:0x14ff, B:1048:0x150b, B:1050:0x1511, B:1051:0x1519, B:1053:0x151d, B:1033:0x14c8, B:1035:0x14ce, B:1037:0x14d2, B:1038:0x14d6, B:1040:0x14da, B:1041:0x14ee, B:1043:0x14f2, B:1054:0x1523, B:1056:0x1528, B:1012:0x1486, B:999:0x1462, B:1057:0x152e, B:1059:0x153b, B:1062:0x1541, B:1064:0x154b, B:1065:0x155c, B:1069:0x1568, B:1070:0x1579, B:1067:0x1561), top: B:1195:0x1403, outer: #46, inners: #53, #57, #77 }] */
    /* JADX WARN: Removed duplicated region for block: B:1057:0x152e A[Catch: all -> 0x1598, TryCatch #45 {all -> 0x1598, blocks: (B:977:0x1403, B:979:0x142c, B:981:0x1430, B:983:0x1438, B:985:0x143e, B:987:0x1442, B:990:0x1449, B:992:0x144d, B:994:0x1455, B:1000:0x1469, B:1002:0x146d, B:1004:0x1473, B:1006:0x1477, B:1008:0x147d, B:1013:0x148c, B:1015:0x1496, B:1017:0x149a, B:1019:0x14a0, B:1021:0x14a6, B:1023:0x14ac, B:1025:0x14b0, B:1026:0x14b2, B:1028:0x14ba, B:1030:0x14c0, B:1032:0x14c6, B:1046:0x14ff, B:1048:0x150b, B:1050:0x1511, B:1051:0x1519, B:1053:0x151d, B:1033:0x14c8, B:1035:0x14ce, B:1037:0x14d2, B:1038:0x14d6, B:1040:0x14da, B:1041:0x14ee, B:1043:0x14f2, B:1054:0x1523, B:1056:0x1528, B:1012:0x1486, B:999:0x1462, B:1057:0x152e, B:1059:0x153b, B:1062:0x1541, B:1064:0x154b, B:1065:0x155c, B:1069:0x1568, B:1070:0x1579, B:1067:0x1561), top: B:1195:0x1403, outer: #46, inners: #53, #57, #77 }] */
    /* JADX WARN: Removed duplicated region for block: B:1061:0x1540  */
    /* JADX WARN: Removed duplicated region for block: B:1073:0x1583 A[Catch: all -> 0x1698, LOOP:1: B:1073:0x1583->B:1290:?, LOOP_START, TryCatch #46 {, blocks: (B:2:0x0000, B:3:0x000c, B:6:0x0011, B:8:0x0015, B:9:0x001b, B:11:0x002b, B:13:0x0035, B:119:0x0267, B:14:0x003d, B:15:0x003f, B:17:0x004d, B:18:0x0054, B:22:0x0081, B:24:0x0087, B:25:0x008a, B:27:0x008c, B:709:0x0ebf, B:28:0x0092, B:29:0x0096, B:31:0x00a4, B:32:0x00ab, B:34:0x00b1, B:36:0x00bb, B:37:0x00c1, B:38:0x00c5, B:40:0x00d3, B:41:0x00da, B:54:0x0117, B:56:0x011d, B:57:0x0120, B:59:0x0122, B:60:0x0128, B:61:0x012a, B:63:0x0138, B:64:0x013f, B:66:0x0145, B:331:0x0703, B:67:0x014e, B:68:0x0150, B:70:0x015e, B:71:0x0165, B:73:0x016b, B:74:0x0174, B:76:0x0178, B:77:0x017a, B:79:0x0188, B:81:0x0196, B:82:0x019e, B:84:0x01a4, B:86:0x01a7, B:87:0x01b1, B:89:0x01bf, B:91:0x01c5, B:93:0x01db, B:94:0x01e3, B:96:0x01e9, B:97:0x01eb, B:99:0x01f9, B:100:0x0200, B:102:0x0206, B:113:0x023c, B:103:0x020f, B:105:0x0215, B:106:0x0217, B:108:0x0225, B:109:0x022c, B:111:0x0232, B:114:0x0242, B:116:0x024a, B:118:0x0261, B:120:0x026c, B:122:0x0270, B:123:0x0276, B:125:0x0284, B:126:0x028b, B:135:0x02c4, B:137:0x02ca, B:138:0x02cd, B:140:0x02cf, B:141:0x02d5, B:142:0x02db, B:144:0x02e9, B:145:0x02f0, B:154:0x0326, B:156:0x032c, B:157:0x032f, B:159:0x0331, B:160:0x0337, B:162:0x033d, B:163:0x0347, B:165:0x0355, B:166:0x035c, B:258:0x0587, B:260:0x058d, B:261:0x0590, B:263:0x0592, B:171:0x038e, B:173:0x0394, B:174:0x039e, B:176:0x03ac, B:177:0x03b3, B:186:0x03f0, B:188:0x03f6, B:189:0x03f9, B:191:0x03fb, B:192:0x0401, B:194:0x0405, B:195:0x040b, B:197:0x0419, B:198:0x0420, B:470:0x09db, B:472:0x09e1, B:473:0x09e4, B:475:0x09e6, B:203:0x0452, B:205:0x0456, B:206:0x045c, B:208:0x046a, B:209:0x0471, B:218:0x04aa, B:220:0x04b0, B:221:0x04b3, B:223:0x04b5, B:224:0x04bb, B:225:0x04c1, B:227:0x04cf, B:228:0x04d6, B:237:0x050c, B:239:0x0512, B:240:0x0515, B:242:0x0517, B:243:0x051d, B:245:0x0523, B:246:0x0531, B:248:0x053f, B:249:0x0546, B:264:0x0598, B:266:0x059e, B:267:0x05a8, B:269:0x05b6, B:270:0x05bd, B:279:0x05ff, B:281:0x0605, B:282:0x0608, B:284:0x060a, B:285:0x0610, B:287:0x0616, B:288:0x061e, B:290:0x062c, B:291:0x0633, B:305:0x0687, B:307:0x068d, B:308:0x0690, B:310:0x0692, B:311:0x0698, B:313:0x069c, B:314:0x06a2, B:316:0x06b0, B:317:0x06b7, B:326:0x06f8, B:328:0x06fe, B:329:0x0701, B:332:0x0709, B:333:0x070b, B:335:0x0719, B:346:0x074e, B:1090:0x15ca, B:336:0x071f, B:340:0x073d, B:342:0x0742, B:343:0x0745, B:345:0x0747, B:347:0x0755, B:349:0x0759, B:350:0x075f, B:352:0x076d, B:353:0x0774, B:362:0x07ad, B:364:0x07b3, B:365:0x07b6, B:367:0x07b8, B:368:0x07be, B:370:0x07c2, B:371:0x07c8, B:373:0x07d6, B:374:0x07dd, B:383:0x0816, B:385:0x081c, B:386:0x081f, B:388:0x0821, B:389:0x0827, B:391:0x082b, B:392:0x083e, B:395:0x085d, B:398:0x0873, B:397:0x086a, B:400:0x0879, B:401:0x087c, B:900:0x1266, B:404:0x0882, B:405:0x0888, B:407:0x088c, B:410:0x08a6, B:412:0x08aa, B:413:0x08ac, B:414:0x08ae, B:417:0x08c9, B:422:0x08f1, B:421:0x08e7, B:427:0x08fc, B:428:0x08ff, B:431:0x0905, B:433:0x0909, B:435:0x0925, B:437:0x0929, B:438:0x092d, B:441:0x0948, B:446:0x096f, B:445:0x0966, B:451:0x097a, B:452:0x097d, B:455:0x0983, B:457:0x0987, B:458:0x098d, B:460:0x099b, B:461:0x09a2, B:476:0x09ec, B:477:0x09ee, B:479:0x09fc, B:480:0x0a03, B:489:0x0a38, B:491:0x0a3e, B:492:0x0a41, B:494:0x0a43, B:495:0x0a49, B:497:0x0a53, B:498:0x0a57, B:500:0x0a5d, B:501:0x0a6a, B:502:0x0a7b, B:503:0x0a86, B:505:0x0a92, B:506:0x0a99, B:508:0x0aa7, B:511:0x0ab3, B:513:0x0ab7, B:514:0x0aca, B:516:0x0ad6, B:517:0x0ada, B:518:0x0adf, B:521:0x0afa, B:537:0x0b38, B:542:0x0b48, B:543:0x0b4b, B:546:0x0b51, B:548:0x0b55, B:549:0x0b6a, B:552:0x0b85, B:557:0x0bb5, B:556:0x0bab, B:562:0x0bc0, B:563:0x0bc3, B:566:0x0bc9, B:568:0x0bcd, B:569:0x0bd7, B:571:0x0be3, B:572:0x0bea, B:575:0x0c09, B:577:0x0c16, B:579:0x0c1c, B:580:0x0c1f, B:583:0x0c25, B:584:0x0c2b, B:586:0x0c39, B:587:0x0c40, B:589:0x0c4f, B:591:0x0c57, B:592:0x0c5d, B:594:0x0c63, B:596:0x0c73, B:598:0x0c7b, B:605:0x0c8e, B:608:0x0c97, B:606:0x0c91, B:607:0x0c94, B:609:0x0c99, B:611:0x0ca4, B:613:0x0cb2, B:614:0x0cb9, B:616:0x0cc1, B:619:0x0ccd, B:621:0x0cd1, B:623:0x0cd5, B:625:0x0cdf, B:626:0x0ce2, B:627:0x0cff, B:629:0x0d03, B:631:0x0d0d, B:633:0x0d18, B:634:0x0d1b, B:636:0x0d27, B:618:0x0cc5, B:637:0x0d3a, B:639:0x0d42, B:640:0x0d46, B:642:0x0d4c, B:644:0x0d52, B:645:0x0d67, B:646:0x0d6a, B:647:0x0d8a, B:649:0x0d8e, B:651:0x0da7, B:652:0x0dad, B:654:0x0dbb, B:655:0x0dc2, B:664:0x0df2, B:666:0x0df8, B:667:0x0dfb, B:669:0x0dfd, B:670:0x0e03, B:671:0x0e05, B:673:0x0e13, B:674:0x0e1a, B:683:0x0e4a, B:685:0x0e50, B:686:0x0e53, B:688:0x0e55, B:689:0x0e5a, B:690:0x0e65, B:691:0x0e6b, B:693:0x0e79, B:694:0x0e80, B:703:0x0eb0, B:705:0x0eb6, B:706:0x0eb9, B:708:0x0ebb, B:710:0x0ec4, B:712:0x0eca, B:713:0x0edb, B:714:0x0ee6, B:716:0x0efc, B:718:0x0f00, B:720:0x0f10, B:739:0x0f52, B:741:0x0f58, B:742:0x0f5a, B:721:0x0f12, B:723:0x0f18, B:725:0x0f1e, B:726:0x0f22, B:728:0x0f2a, B:730:0x0f34, B:732:0x0f38, B:733:0x0f3c, B:734:0x0f48, B:735:0x0f4a, B:747:0x0f68, B:750:0x0f6d, B:1125:0x1697, B:757:0x0f85, B:759:0x0f89, B:760:0x0f8f, B:763:0x0f99, B:765:0x0f9f, B:768:0x0fbc, B:764:0x0f9c, B:767:0x0fb3, B:769:0x0fc2, B:771:0x0fc6, B:779:0x0ff8, B:784:0x1020, B:786:0x1032, B:788:0x103a, B:790:0x1044, B:793:0x105a, B:791:0x1047, B:783:0x100c, B:792:0x104e, B:794:0x105e, B:823:0x10f5, B:824:0x10fa, B:827:0x1103, B:828:0x110a, B:830:0x1110, B:832:0x1113, B:834:0x1121, B:835:0x1123, B:838:0x1130, B:840:0x1134, B:842:0x1142, B:844:0x114e, B:846:0x1154, B:861:0x11ae, B:860:0x11a9, B:847:0x115c, B:849:0x116a, B:850:0x116f, B:856:0x119b, B:851:0x1176, B:853:0x118e, B:854:0x1194, B:858:0x11a0, B:862:0x11b3, B:863:0x11ba, B:865:0x11c0, B:870:0x11dc, B:871:0x11e4, B:873:0x11f0, B:875:0x11f6, B:893:0x124e, B:894:0x1253, B:879:0x1202, B:881:0x1207, B:882:0x120d, B:885:0x122a, B:892:0x124a, B:896:0x125f, B:897:0x1262, B:869:0x11d5, B:901:0x126b, B:903:0x1271, B:905:0x128d, B:907:0x1297, B:908:0x129d, B:910:0x12ab, B:911:0x12b2, B:917:0x12da, B:912:0x12b9, B:914:0x12c8, B:916:0x12cf, B:918:0x12e1, B:919:0x12ed, B:921:0x12fb, B:922:0x1300, B:931:0x1328, B:923:0x130a, B:926:0x1314, B:928:0x131a, B:930:0x1321, B:932:0x132e, B:934:0x1332, B:936:0x133c, B:938:0x1347, B:939:0x134a, B:941:0x134e, B:945:0x1360, B:947:0x136a, B:948:0x136d, B:949:0x1374, B:951:0x1382, B:952:0x1387, B:953:0x138a, B:976:0x13fd, B:954:0x1391, B:957:0x13ac, B:970:0x13ec, B:972:0x13f1, B:973:0x13f4, B:975:0x13f6, B:943:0x1353, B:1071:0x157f, B:1073:0x1583, B:1075:0x158b, B:1077:0x1593, B:1086:0x15ae, B:1088:0x15be, B:1089:0x15c3, B:1091:0x15ce, B:1098:0x15f7, B:1100:0x1607, B:1102:0x1611, B:1105:0x1622, B:1104:0x161c, B:1123:0x168d, B:1124:0x1691, B:1079:0x1599, B:1081:0x159d, B:1083:0x15a5, B:1092:0x15de, B:1094:0x15ee, B:1108:0x1628, B:1115:0x1645, B:1117:0x165f, B:1119:0x166d, B:1120:0x1685, B:1121:0x168b, B:1114:0x1641, B:1109:0x162d, B:1111:0x1635, B:1112:0x163a, B:977:0x1403, B:979:0x142c, B:981:0x1430, B:983:0x1438, B:985:0x143e, B:987:0x1442, B:990:0x1449, B:992:0x144d, B:994:0x1455, B:1000:0x1469, B:1002:0x146d, B:1004:0x1473, B:1006:0x1477, B:1008:0x147d, B:1013:0x148c, B:1015:0x1496, B:1017:0x149a, B:1019:0x14a0, B:1021:0x14a6, B:1023:0x14ac, B:1025:0x14b0, B:1026:0x14b2, B:1028:0x14ba, B:1030:0x14c0, B:1032:0x14c6, B:1046:0x14ff, B:1048:0x150b, B:1050:0x1511, B:1051:0x1519, B:1053:0x151d, B:1033:0x14c8, B:1035:0x14ce, B:1037:0x14d2, B:1038:0x14d6, B:1040:0x14da, B:1041:0x14ee, B:1043:0x14f2, B:1054:0x1523, B:1056:0x1528, B:1012:0x1486, B:999:0x1462, B:1057:0x152e, B:1059:0x153b, B:1062:0x1541, B:1064:0x154b, B:1065:0x155c, B:1069:0x1568, B:1070:0x1579, B:1067:0x1561, B:795:0x1064, B:797:0x1079, B:798:0x107e, B:799:0x1085, B:802:0x10a0, B:808:0x10cf, B:821:0x10ec, B:818:0x10e7, B:819:0x10ea, B:772:0x0fcc, B:774:0x0fda, B:775:0x0fdf, B:776:0x0fe6, B:778:0x0ff1), top: B:1196:0x0000, inners: #1, #2, #4, #7, #8, #10, #11, #19, #20, #24, #29, #30, #36, #37, #38, #40, #41, #45, #47, #48, #49, #50, #52, #59, #63, #64, #67, #69, #70, #74, #75, #79, #92, #97, #98, #99, #100, #105 }] */
    /* JADX WARN: Removed duplicated region for block: B:1098:0x15f7 A[Catch: all -> 0x1698, TRY_ENTER, TryCatch #46 {, blocks: (B:2:0x0000, B:3:0x000c, B:6:0x0011, B:8:0x0015, B:9:0x001b, B:11:0x002b, B:13:0x0035, B:119:0x0267, B:14:0x003d, B:15:0x003f, B:17:0x004d, B:18:0x0054, B:22:0x0081, B:24:0x0087, B:25:0x008a, B:27:0x008c, B:709:0x0ebf, B:28:0x0092, B:29:0x0096, B:31:0x00a4, B:32:0x00ab, B:34:0x00b1, B:36:0x00bb, B:37:0x00c1, B:38:0x00c5, B:40:0x00d3, B:41:0x00da, B:54:0x0117, B:56:0x011d, B:57:0x0120, B:59:0x0122, B:60:0x0128, B:61:0x012a, B:63:0x0138, B:64:0x013f, B:66:0x0145, B:331:0x0703, B:67:0x014e, B:68:0x0150, B:70:0x015e, B:71:0x0165, B:73:0x016b, B:74:0x0174, B:76:0x0178, B:77:0x017a, B:79:0x0188, B:81:0x0196, B:82:0x019e, B:84:0x01a4, B:86:0x01a7, B:87:0x01b1, B:89:0x01bf, B:91:0x01c5, B:93:0x01db, B:94:0x01e3, B:96:0x01e9, B:97:0x01eb, B:99:0x01f9, B:100:0x0200, B:102:0x0206, B:113:0x023c, B:103:0x020f, B:105:0x0215, B:106:0x0217, B:108:0x0225, B:109:0x022c, B:111:0x0232, B:114:0x0242, B:116:0x024a, B:118:0x0261, B:120:0x026c, B:122:0x0270, B:123:0x0276, B:125:0x0284, B:126:0x028b, B:135:0x02c4, B:137:0x02ca, B:138:0x02cd, B:140:0x02cf, B:141:0x02d5, B:142:0x02db, B:144:0x02e9, B:145:0x02f0, B:154:0x0326, B:156:0x032c, B:157:0x032f, B:159:0x0331, B:160:0x0337, B:162:0x033d, B:163:0x0347, B:165:0x0355, B:166:0x035c, B:258:0x0587, B:260:0x058d, B:261:0x0590, B:263:0x0592, B:171:0x038e, B:173:0x0394, B:174:0x039e, B:176:0x03ac, B:177:0x03b3, B:186:0x03f0, B:188:0x03f6, B:189:0x03f9, B:191:0x03fb, B:192:0x0401, B:194:0x0405, B:195:0x040b, B:197:0x0419, B:198:0x0420, B:470:0x09db, B:472:0x09e1, B:473:0x09e4, B:475:0x09e6, B:203:0x0452, B:205:0x0456, B:206:0x045c, B:208:0x046a, B:209:0x0471, B:218:0x04aa, B:220:0x04b0, B:221:0x04b3, B:223:0x04b5, B:224:0x04bb, B:225:0x04c1, B:227:0x04cf, B:228:0x04d6, B:237:0x050c, B:239:0x0512, B:240:0x0515, B:242:0x0517, B:243:0x051d, B:245:0x0523, B:246:0x0531, B:248:0x053f, B:249:0x0546, B:264:0x0598, B:266:0x059e, B:267:0x05a8, B:269:0x05b6, B:270:0x05bd, B:279:0x05ff, B:281:0x0605, B:282:0x0608, B:284:0x060a, B:285:0x0610, B:287:0x0616, B:288:0x061e, B:290:0x062c, B:291:0x0633, B:305:0x0687, B:307:0x068d, B:308:0x0690, B:310:0x0692, B:311:0x0698, B:313:0x069c, B:314:0x06a2, B:316:0x06b0, B:317:0x06b7, B:326:0x06f8, B:328:0x06fe, B:329:0x0701, B:332:0x0709, B:333:0x070b, B:335:0x0719, B:346:0x074e, B:1090:0x15ca, B:336:0x071f, B:340:0x073d, B:342:0x0742, B:343:0x0745, B:345:0x0747, B:347:0x0755, B:349:0x0759, B:350:0x075f, B:352:0x076d, B:353:0x0774, B:362:0x07ad, B:364:0x07b3, B:365:0x07b6, B:367:0x07b8, B:368:0x07be, B:370:0x07c2, B:371:0x07c8, B:373:0x07d6, B:374:0x07dd, B:383:0x0816, B:385:0x081c, B:386:0x081f, B:388:0x0821, B:389:0x0827, B:391:0x082b, B:392:0x083e, B:395:0x085d, B:398:0x0873, B:397:0x086a, B:400:0x0879, B:401:0x087c, B:900:0x1266, B:404:0x0882, B:405:0x0888, B:407:0x088c, B:410:0x08a6, B:412:0x08aa, B:413:0x08ac, B:414:0x08ae, B:417:0x08c9, B:422:0x08f1, B:421:0x08e7, B:427:0x08fc, B:428:0x08ff, B:431:0x0905, B:433:0x0909, B:435:0x0925, B:437:0x0929, B:438:0x092d, B:441:0x0948, B:446:0x096f, B:445:0x0966, B:451:0x097a, B:452:0x097d, B:455:0x0983, B:457:0x0987, B:458:0x098d, B:460:0x099b, B:461:0x09a2, B:476:0x09ec, B:477:0x09ee, B:479:0x09fc, B:480:0x0a03, B:489:0x0a38, B:491:0x0a3e, B:492:0x0a41, B:494:0x0a43, B:495:0x0a49, B:497:0x0a53, B:498:0x0a57, B:500:0x0a5d, B:501:0x0a6a, B:502:0x0a7b, B:503:0x0a86, B:505:0x0a92, B:506:0x0a99, B:508:0x0aa7, B:511:0x0ab3, B:513:0x0ab7, B:514:0x0aca, B:516:0x0ad6, B:517:0x0ada, B:518:0x0adf, B:521:0x0afa, B:537:0x0b38, B:542:0x0b48, B:543:0x0b4b, B:546:0x0b51, B:548:0x0b55, B:549:0x0b6a, B:552:0x0b85, B:557:0x0bb5, B:556:0x0bab, B:562:0x0bc0, B:563:0x0bc3, B:566:0x0bc9, B:568:0x0bcd, B:569:0x0bd7, B:571:0x0be3, B:572:0x0bea, B:575:0x0c09, B:577:0x0c16, B:579:0x0c1c, B:580:0x0c1f, B:583:0x0c25, B:584:0x0c2b, B:586:0x0c39, B:587:0x0c40, B:589:0x0c4f, B:591:0x0c57, B:592:0x0c5d, B:594:0x0c63, B:596:0x0c73, B:598:0x0c7b, B:605:0x0c8e, B:608:0x0c97, B:606:0x0c91, B:607:0x0c94, B:609:0x0c99, B:611:0x0ca4, B:613:0x0cb2, B:614:0x0cb9, B:616:0x0cc1, B:619:0x0ccd, B:621:0x0cd1, B:623:0x0cd5, B:625:0x0cdf, B:626:0x0ce2, B:627:0x0cff, B:629:0x0d03, B:631:0x0d0d, B:633:0x0d18, B:634:0x0d1b, B:636:0x0d27, B:618:0x0cc5, B:637:0x0d3a, B:639:0x0d42, B:640:0x0d46, B:642:0x0d4c, B:644:0x0d52, B:645:0x0d67, B:646:0x0d6a, B:647:0x0d8a, B:649:0x0d8e, B:651:0x0da7, B:652:0x0dad, B:654:0x0dbb, B:655:0x0dc2, B:664:0x0df2, B:666:0x0df8, B:667:0x0dfb, B:669:0x0dfd, B:670:0x0e03, B:671:0x0e05, B:673:0x0e13, B:674:0x0e1a, B:683:0x0e4a, B:685:0x0e50, B:686:0x0e53, B:688:0x0e55, B:689:0x0e5a, B:690:0x0e65, B:691:0x0e6b, B:693:0x0e79, B:694:0x0e80, B:703:0x0eb0, B:705:0x0eb6, B:706:0x0eb9, B:708:0x0ebb, B:710:0x0ec4, B:712:0x0eca, B:713:0x0edb, B:714:0x0ee6, B:716:0x0efc, B:718:0x0f00, B:720:0x0f10, B:739:0x0f52, B:741:0x0f58, B:742:0x0f5a, B:721:0x0f12, B:723:0x0f18, B:725:0x0f1e, B:726:0x0f22, B:728:0x0f2a, B:730:0x0f34, B:732:0x0f38, B:733:0x0f3c, B:734:0x0f48, B:735:0x0f4a, B:747:0x0f68, B:750:0x0f6d, B:1125:0x1697, B:757:0x0f85, B:759:0x0f89, B:760:0x0f8f, B:763:0x0f99, B:765:0x0f9f, B:768:0x0fbc, B:764:0x0f9c, B:767:0x0fb3, B:769:0x0fc2, B:771:0x0fc6, B:779:0x0ff8, B:784:0x1020, B:786:0x1032, B:788:0x103a, B:790:0x1044, B:793:0x105a, B:791:0x1047, B:783:0x100c, B:792:0x104e, B:794:0x105e, B:823:0x10f5, B:824:0x10fa, B:827:0x1103, B:828:0x110a, B:830:0x1110, B:832:0x1113, B:834:0x1121, B:835:0x1123, B:838:0x1130, B:840:0x1134, B:842:0x1142, B:844:0x114e, B:846:0x1154, B:861:0x11ae, B:860:0x11a9, B:847:0x115c, B:849:0x116a, B:850:0x116f, B:856:0x119b, B:851:0x1176, B:853:0x118e, B:854:0x1194, B:858:0x11a0, B:862:0x11b3, B:863:0x11ba, B:865:0x11c0, B:870:0x11dc, B:871:0x11e4, B:873:0x11f0, B:875:0x11f6, B:893:0x124e, B:894:0x1253, B:879:0x1202, B:881:0x1207, B:882:0x120d, B:885:0x122a, B:892:0x124a, B:896:0x125f, B:897:0x1262, B:869:0x11d5, B:901:0x126b, B:903:0x1271, B:905:0x128d, B:907:0x1297, B:908:0x129d, B:910:0x12ab, B:911:0x12b2, B:917:0x12da, B:912:0x12b9, B:914:0x12c8, B:916:0x12cf, B:918:0x12e1, B:919:0x12ed, B:921:0x12fb, B:922:0x1300, B:931:0x1328, B:923:0x130a, B:926:0x1314, B:928:0x131a, B:930:0x1321, B:932:0x132e, B:934:0x1332, B:936:0x133c, B:938:0x1347, B:939:0x134a, B:941:0x134e, B:945:0x1360, B:947:0x136a, B:948:0x136d, B:949:0x1374, B:951:0x1382, B:952:0x1387, B:953:0x138a, B:976:0x13fd, B:954:0x1391, B:957:0x13ac, B:970:0x13ec, B:972:0x13f1, B:973:0x13f4, B:975:0x13f6, B:943:0x1353, B:1071:0x157f, B:1073:0x1583, B:1075:0x158b, B:1077:0x1593, B:1086:0x15ae, B:1088:0x15be, B:1089:0x15c3, B:1091:0x15ce, B:1098:0x15f7, B:1100:0x1607, B:1102:0x1611, B:1105:0x1622, B:1104:0x161c, B:1123:0x168d, B:1124:0x1691, B:1079:0x1599, B:1081:0x159d, B:1083:0x15a5, B:1092:0x15de, B:1094:0x15ee, B:1108:0x1628, B:1115:0x1645, B:1117:0x165f, B:1119:0x166d, B:1120:0x1685, B:1121:0x168b, B:1114:0x1641, B:1109:0x162d, B:1111:0x1635, B:1112:0x163a, B:977:0x1403, B:979:0x142c, B:981:0x1430, B:983:0x1438, B:985:0x143e, B:987:0x1442, B:990:0x1449, B:992:0x144d, B:994:0x1455, B:1000:0x1469, B:1002:0x146d, B:1004:0x1473, B:1006:0x1477, B:1008:0x147d, B:1013:0x148c, B:1015:0x1496, B:1017:0x149a, B:1019:0x14a0, B:1021:0x14a6, B:1023:0x14ac, B:1025:0x14b0, B:1026:0x14b2, B:1028:0x14ba, B:1030:0x14c0, B:1032:0x14c6, B:1046:0x14ff, B:1048:0x150b, B:1050:0x1511, B:1051:0x1519, B:1053:0x151d, B:1033:0x14c8, B:1035:0x14ce, B:1037:0x14d2, B:1038:0x14d6, B:1040:0x14da, B:1041:0x14ee, B:1043:0x14f2, B:1054:0x1523, B:1056:0x1528, B:1012:0x1486, B:999:0x1462, B:1057:0x152e, B:1059:0x153b, B:1062:0x1541, B:1064:0x154b, B:1065:0x155c, B:1069:0x1568, B:1070:0x1579, B:1067:0x1561, B:795:0x1064, B:797:0x1079, B:798:0x107e, B:799:0x1085, B:802:0x10a0, B:808:0x10cf, B:821:0x10ec, B:818:0x10e7, B:819:0x10ea, B:772:0x0fcc, B:774:0x0fda, B:775:0x0fdf, B:776:0x0fe6, B:778:0x0ff1), top: B:1196:0x0000, inners: #1, #2, #4, #7, #8, #10, #11, #19, #20, #24, #29, #30, #36, #37, #38, #40, #41, #45, #47, #48, #49, #50, #52, #59, #63, #64, #67, #69, #70, #74, #75, #79, #92, #97, #98, #99, #100, #105 }] */
    /* JADX WARN: Removed duplicated region for block: B:533:0x0b27  */
    /* JADX WARN: Removed duplicated region for block: B:823:0x10f5 A[Catch: all -> 0x1698, TRY_ENTER, TryCatch #46 {, blocks: (B:2:0x0000, B:3:0x000c, B:6:0x0011, B:8:0x0015, B:9:0x001b, B:11:0x002b, B:13:0x0035, B:119:0x0267, B:14:0x003d, B:15:0x003f, B:17:0x004d, B:18:0x0054, B:22:0x0081, B:24:0x0087, B:25:0x008a, B:27:0x008c, B:709:0x0ebf, B:28:0x0092, B:29:0x0096, B:31:0x00a4, B:32:0x00ab, B:34:0x00b1, B:36:0x00bb, B:37:0x00c1, B:38:0x00c5, B:40:0x00d3, B:41:0x00da, B:54:0x0117, B:56:0x011d, B:57:0x0120, B:59:0x0122, B:60:0x0128, B:61:0x012a, B:63:0x0138, B:64:0x013f, B:66:0x0145, B:331:0x0703, B:67:0x014e, B:68:0x0150, B:70:0x015e, B:71:0x0165, B:73:0x016b, B:74:0x0174, B:76:0x0178, B:77:0x017a, B:79:0x0188, B:81:0x0196, B:82:0x019e, B:84:0x01a4, B:86:0x01a7, B:87:0x01b1, B:89:0x01bf, B:91:0x01c5, B:93:0x01db, B:94:0x01e3, B:96:0x01e9, B:97:0x01eb, B:99:0x01f9, B:100:0x0200, B:102:0x0206, B:113:0x023c, B:103:0x020f, B:105:0x0215, B:106:0x0217, B:108:0x0225, B:109:0x022c, B:111:0x0232, B:114:0x0242, B:116:0x024a, B:118:0x0261, B:120:0x026c, B:122:0x0270, B:123:0x0276, B:125:0x0284, B:126:0x028b, B:135:0x02c4, B:137:0x02ca, B:138:0x02cd, B:140:0x02cf, B:141:0x02d5, B:142:0x02db, B:144:0x02e9, B:145:0x02f0, B:154:0x0326, B:156:0x032c, B:157:0x032f, B:159:0x0331, B:160:0x0337, B:162:0x033d, B:163:0x0347, B:165:0x0355, B:166:0x035c, B:258:0x0587, B:260:0x058d, B:261:0x0590, B:263:0x0592, B:171:0x038e, B:173:0x0394, B:174:0x039e, B:176:0x03ac, B:177:0x03b3, B:186:0x03f0, B:188:0x03f6, B:189:0x03f9, B:191:0x03fb, B:192:0x0401, B:194:0x0405, B:195:0x040b, B:197:0x0419, B:198:0x0420, B:470:0x09db, B:472:0x09e1, B:473:0x09e4, B:475:0x09e6, B:203:0x0452, B:205:0x0456, B:206:0x045c, B:208:0x046a, B:209:0x0471, B:218:0x04aa, B:220:0x04b0, B:221:0x04b3, B:223:0x04b5, B:224:0x04bb, B:225:0x04c1, B:227:0x04cf, B:228:0x04d6, B:237:0x050c, B:239:0x0512, B:240:0x0515, B:242:0x0517, B:243:0x051d, B:245:0x0523, B:246:0x0531, B:248:0x053f, B:249:0x0546, B:264:0x0598, B:266:0x059e, B:267:0x05a8, B:269:0x05b6, B:270:0x05bd, B:279:0x05ff, B:281:0x0605, B:282:0x0608, B:284:0x060a, B:285:0x0610, B:287:0x0616, B:288:0x061e, B:290:0x062c, B:291:0x0633, B:305:0x0687, B:307:0x068d, B:308:0x0690, B:310:0x0692, B:311:0x0698, B:313:0x069c, B:314:0x06a2, B:316:0x06b0, B:317:0x06b7, B:326:0x06f8, B:328:0x06fe, B:329:0x0701, B:332:0x0709, B:333:0x070b, B:335:0x0719, B:346:0x074e, B:1090:0x15ca, B:336:0x071f, B:340:0x073d, B:342:0x0742, B:343:0x0745, B:345:0x0747, B:347:0x0755, B:349:0x0759, B:350:0x075f, B:352:0x076d, B:353:0x0774, B:362:0x07ad, B:364:0x07b3, B:365:0x07b6, B:367:0x07b8, B:368:0x07be, B:370:0x07c2, B:371:0x07c8, B:373:0x07d6, B:374:0x07dd, B:383:0x0816, B:385:0x081c, B:386:0x081f, B:388:0x0821, B:389:0x0827, B:391:0x082b, B:392:0x083e, B:395:0x085d, B:398:0x0873, B:397:0x086a, B:400:0x0879, B:401:0x087c, B:900:0x1266, B:404:0x0882, B:405:0x0888, B:407:0x088c, B:410:0x08a6, B:412:0x08aa, B:413:0x08ac, B:414:0x08ae, B:417:0x08c9, B:422:0x08f1, B:421:0x08e7, B:427:0x08fc, B:428:0x08ff, B:431:0x0905, B:433:0x0909, B:435:0x0925, B:437:0x0929, B:438:0x092d, B:441:0x0948, B:446:0x096f, B:445:0x0966, B:451:0x097a, B:452:0x097d, B:455:0x0983, B:457:0x0987, B:458:0x098d, B:460:0x099b, B:461:0x09a2, B:476:0x09ec, B:477:0x09ee, B:479:0x09fc, B:480:0x0a03, B:489:0x0a38, B:491:0x0a3e, B:492:0x0a41, B:494:0x0a43, B:495:0x0a49, B:497:0x0a53, B:498:0x0a57, B:500:0x0a5d, B:501:0x0a6a, B:502:0x0a7b, B:503:0x0a86, B:505:0x0a92, B:506:0x0a99, B:508:0x0aa7, B:511:0x0ab3, B:513:0x0ab7, B:514:0x0aca, B:516:0x0ad6, B:517:0x0ada, B:518:0x0adf, B:521:0x0afa, B:537:0x0b38, B:542:0x0b48, B:543:0x0b4b, B:546:0x0b51, B:548:0x0b55, B:549:0x0b6a, B:552:0x0b85, B:557:0x0bb5, B:556:0x0bab, B:562:0x0bc0, B:563:0x0bc3, B:566:0x0bc9, B:568:0x0bcd, B:569:0x0bd7, B:571:0x0be3, B:572:0x0bea, B:575:0x0c09, B:577:0x0c16, B:579:0x0c1c, B:580:0x0c1f, B:583:0x0c25, B:584:0x0c2b, B:586:0x0c39, B:587:0x0c40, B:589:0x0c4f, B:591:0x0c57, B:592:0x0c5d, B:594:0x0c63, B:596:0x0c73, B:598:0x0c7b, B:605:0x0c8e, B:608:0x0c97, B:606:0x0c91, B:607:0x0c94, B:609:0x0c99, B:611:0x0ca4, B:613:0x0cb2, B:614:0x0cb9, B:616:0x0cc1, B:619:0x0ccd, B:621:0x0cd1, B:623:0x0cd5, B:625:0x0cdf, B:626:0x0ce2, B:627:0x0cff, B:629:0x0d03, B:631:0x0d0d, B:633:0x0d18, B:634:0x0d1b, B:636:0x0d27, B:618:0x0cc5, B:637:0x0d3a, B:639:0x0d42, B:640:0x0d46, B:642:0x0d4c, B:644:0x0d52, B:645:0x0d67, B:646:0x0d6a, B:647:0x0d8a, B:649:0x0d8e, B:651:0x0da7, B:652:0x0dad, B:654:0x0dbb, B:655:0x0dc2, B:664:0x0df2, B:666:0x0df8, B:667:0x0dfb, B:669:0x0dfd, B:670:0x0e03, B:671:0x0e05, B:673:0x0e13, B:674:0x0e1a, B:683:0x0e4a, B:685:0x0e50, B:686:0x0e53, B:688:0x0e55, B:689:0x0e5a, B:690:0x0e65, B:691:0x0e6b, B:693:0x0e79, B:694:0x0e80, B:703:0x0eb0, B:705:0x0eb6, B:706:0x0eb9, B:708:0x0ebb, B:710:0x0ec4, B:712:0x0eca, B:713:0x0edb, B:714:0x0ee6, B:716:0x0efc, B:718:0x0f00, B:720:0x0f10, B:739:0x0f52, B:741:0x0f58, B:742:0x0f5a, B:721:0x0f12, B:723:0x0f18, B:725:0x0f1e, B:726:0x0f22, B:728:0x0f2a, B:730:0x0f34, B:732:0x0f38, B:733:0x0f3c, B:734:0x0f48, B:735:0x0f4a, B:747:0x0f68, B:750:0x0f6d, B:1125:0x1697, B:757:0x0f85, B:759:0x0f89, B:760:0x0f8f, B:763:0x0f99, B:765:0x0f9f, B:768:0x0fbc, B:764:0x0f9c, B:767:0x0fb3, B:769:0x0fc2, B:771:0x0fc6, B:779:0x0ff8, B:784:0x1020, B:786:0x1032, B:788:0x103a, B:790:0x1044, B:793:0x105a, B:791:0x1047, B:783:0x100c, B:792:0x104e, B:794:0x105e, B:823:0x10f5, B:824:0x10fa, B:827:0x1103, B:828:0x110a, B:830:0x1110, B:832:0x1113, B:834:0x1121, B:835:0x1123, B:838:0x1130, B:840:0x1134, B:842:0x1142, B:844:0x114e, B:846:0x1154, B:861:0x11ae, B:860:0x11a9, B:847:0x115c, B:849:0x116a, B:850:0x116f, B:856:0x119b, B:851:0x1176, B:853:0x118e, B:854:0x1194, B:858:0x11a0, B:862:0x11b3, B:863:0x11ba, B:865:0x11c0, B:870:0x11dc, B:871:0x11e4, B:873:0x11f0, B:875:0x11f6, B:893:0x124e, B:894:0x1253, B:879:0x1202, B:881:0x1207, B:882:0x120d, B:885:0x122a, B:892:0x124a, B:896:0x125f, B:897:0x1262, B:869:0x11d5, B:901:0x126b, B:903:0x1271, B:905:0x128d, B:907:0x1297, B:908:0x129d, B:910:0x12ab, B:911:0x12b2, B:917:0x12da, B:912:0x12b9, B:914:0x12c8, B:916:0x12cf, B:918:0x12e1, B:919:0x12ed, B:921:0x12fb, B:922:0x1300, B:931:0x1328, B:923:0x130a, B:926:0x1314, B:928:0x131a, B:930:0x1321, B:932:0x132e, B:934:0x1332, B:936:0x133c, B:938:0x1347, B:939:0x134a, B:941:0x134e, B:945:0x1360, B:947:0x136a, B:948:0x136d, B:949:0x1374, B:951:0x1382, B:952:0x1387, B:953:0x138a, B:976:0x13fd, B:954:0x1391, B:957:0x13ac, B:970:0x13ec, B:972:0x13f1, B:973:0x13f4, B:975:0x13f6, B:943:0x1353, B:1071:0x157f, B:1073:0x1583, B:1075:0x158b, B:1077:0x1593, B:1086:0x15ae, B:1088:0x15be, B:1089:0x15c3, B:1091:0x15ce, B:1098:0x15f7, B:1100:0x1607, B:1102:0x1611, B:1105:0x1622, B:1104:0x161c, B:1123:0x168d, B:1124:0x1691, B:1079:0x1599, B:1081:0x159d, B:1083:0x15a5, B:1092:0x15de, B:1094:0x15ee, B:1108:0x1628, B:1115:0x1645, B:1117:0x165f, B:1119:0x166d, B:1120:0x1685, B:1121:0x168b, B:1114:0x1641, B:1109:0x162d, B:1111:0x1635, B:1112:0x163a, B:977:0x1403, B:979:0x142c, B:981:0x1430, B:983:0x1438, B:985:0x143e, B:987:0x1442, B:990:0x1449, B:992:0x144d, B:994:0x1455, B:1000:0x1469, B:1002:0x146d, B:1004:0x1473, B:1006:0x1477, B:1008:0x147d, B:1013:0x148c, B:1015:0x1496, B:1017:0x149a, B:1019:0x14a0, B:1021:0x14a6, B:1023:0x14ac, B:1025:0x14b0, B:1026:0x14b2, B:1028:0x14ba, B:1030:0x14c0, B:1032:0x14c6, B:1046:0x14ff, B:1048:0x150b, B:1050:0x1511, B:1051:0x1519, B:1053:0x151d, B:1033:0x14c8, B:1035:0x14ce, B:1037:0x14d2, B:1038:0x14d6, B:1040:0x14da, B:1041:0x14ee, B:1043:0x14f2, B:1054:0x1523, B:1056:0x1528, B:1012:0x1486, B:999:0x1462, B:1057:0x152e, B:1059:0x153b, B:1062:0x1541, B:1064:0x154b, B:1065:0x155c, B:1069:0x1568, B:1070:0x1579, B:1067:0x1561, B:795:0x1064, B:797:0x1079, B:798:0x107e, B:799:0x1085, B:802:0x10a0, B:808:0x10cf, B:821:0x10ec, B:818:0x10e7, B:819:0x10ea, B:772:0x0fcc, B:774:0x0fda, B:775:0x0fdf, B:776:0x0fe6, B:778:0x0ff1), top: B:1196:0x0000, inners: #1, #2, #4, #7, #8, #10, #11, #19, #20, #24, #29, #30, #36, #37, #38, #40, #41, #45, #47, #48, #49, #50, #52, #59, #63, #64, #67, #69, #70, #74, #75, #79, #92, #97, #98, #99, #100, #105 }] */
    /* JADX WARN: Type inference failed for: r5v0, types: [X.Dm9] */
    /* JADX WARN: Type inference failed for: r5v1, types: [X.Dm9] */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean handleMessage(android.os.Message r33) {
        /*
            Method dump skipped, instructions count: 5914
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5625Dm8.handleMessage(android.os.Message):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x00ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C5625Dm8(android.os.Handler r8, android.os.Looper r9, X.C1F r10, X.InterfaceC5756Dor r11, X.C5875DrB r12, com.facebook.video.heroplayer.setting.HeroPlayerSetting r13, X.C6130DwX r14) {
        /*
            r7 = this;
            java.util.HashSet r4 = X.C60O.A13()
            r7.<init>()
            X.Dm9 r0 = new X.Dm9
            r0.<init>(r7)
            r7.A0H = r0
            java.util.concurrent.atomic.AtomicReference r0 = X.BV4.A15()
            r7.A0T = r0
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r0.<init>()
            r7.A0Q = r0
            java.lang.Object r0 = X.C3cG.A0T()
            r7.A0L = r0
            r0 = 2
            long[] r0 = new long[r0]
            r0 = {x00e6: FILL_ARRAY_DATA , data: [0, 0} // fill-array
            r7.A0W = r0
            r6 = 0
            java.util.concurrent.atomic.AtomicBoolean r0 = X.BV4.A12(r6)
            r7.A0P = r0
            X.Dm6 r0 = new X.Dm6
            r0.<init>()
            java.util.concurrent.atomic.AtomicReference r0 = X.BV4.A16(r0)
            r7.A0U = r0
            X.Dq8 r0 = X.Dq8.A0D
            java.util.concurrent.atomic.AtomicReference r0 = X.BV4.A16(r0)
            r7.A0S = r0
            java.util.LinkedList r0 = X.BV4.A0y()
            r7.A0N = r0
            java.util.TreeMap r0 = new java.util.TreeMap
            r0.<init>()
            r7.A0O = r0
            java.lang.String r5 = ""
            r7.A08 = r5
            r0 = -1
            r7.A01 = r0
            r7.A0B = r6
            r7.A0C = r6
            r2 = 0
            r7.A0a = r2
            r2 = 1065353216(0x3f800000, float:1.0)
            r7.A0Y = r2
            r7.A0X = r2
            r7.A00 = r0
            r7.A0D = r6
            java.util.ArrayList r0 = X.C3cG.A0h()
            r7.A09 = r0
            java.lang.Object r0 = X.C3cG.A0T()
            r7.A0K = r0
            java.lang.Object r0 = X.C3cG.A0T()
            r7.A0M = r0
            java.util.concurrent.atomic.AtomicReference r0 = X.BV4.A15()
            r7.A0V = r0
            X.DpK r0 = new X.DpK
            r0.<init>()
            r7.A0G = r0
            java.util.concurrent.atomic.AtomicReference r0 = X.BV4.A16(r5)
            r7.A0R = r0
            r7.A0f = r5
            r7.A0h = r6
            java.lang.String r0 = "Create HeroPlayer"
            X.BV6.A13(r7, r0)
            android.os.Handler r0 = new android.os.Handler
            r0.<init>(r9, r7)
            r7.A0F = r0
            X.DmF r0 = new X.DmF
            r0.<init>(r8, r11, r13)
            r7.A0I = r0
            X.DsR r1 = new X.DsR
            r1.<init>(r7, r13, r4)
            r7.A0J = r1
            java.util.concurrent.CopyOnWriteArraySet<X.Dor> r0 = r0.A00
            r0.add(r1)
            r7.A02 = r10
            r7.A04 = r12
            r7.A06 = r13
            boolean r1 = r7.A0B
            boolean r0 = r13.enableDebugLogs
            r1 = r1 | r0
            r7.A0B = r1
            boolean r2 = r7.A0C
            X.Dlv r0 = r13.gen
            if (r0 == 0) goto Lca
            boolean r1 = r0.enable_stacktrace_logging
            r0 = 1
            if (r1 != 0) goto Lcb
        Lca:
            r0 = 0
        Lcb:
            r2 = r2 | r0
            r7.A0C = r2
            X.DmD r0 = new X.DmD
            r0.<init>(r7)
            r7.A05 = r0
            java.util.Set<X.Dm8> r0 = X.C5625Dm8.A0k
            r0.add(r7)
            boolean r1 = r13.enablePlayerActionStateLoggingInFlytrap
            X.DtM r0 = new X.DtM
            r0.<init>(r1)
            r7.A03 = r0
            r7.A07 = r14
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5625Dm8.<init>(android.os.Handler, android.os.Looper, X.C1F, X.Dor, X.DrB, com.facebook.video.heroplayer.setting.HeroPlayerSetting, X.DwX):void");
    }

    public static Dlw A03(C5626Dm9 c5626Dm9, C5625Dm8 c5625Dm8) {
        C5616Dlx c5616DlxA00 = C5626Dm9.A00(c5626Dm9);
        return c5616DlxA00.A0Z.A02(c5625Dm8.A0a);
    }

    private final /* synthetic */ void A04(C5630DmE c5630DmE, EnumC5624Dm7 enumC5624Dm7, EnumC5642DmW enumC5642DmW, String str, String str2) {
        C5623Dm6 c5623Dm6A0i = BV7.A0i(this);
        c5630DmE.A0L(new C5790DpZ(enumC5624Dm7, enumC5642DmW, str, ""), BV7.A0h(this), c5623Dm6A0i, str2);
    }

    public static void A06(C5625Dm8 c5625Dm8, EnumC5624Dm7 enumC5624Dm7, EnumC5642DmW enumC5642DmW, String str, String str2) {
        A0A(c5625Dm8, "onVideoIssueDetected", BV4.A1W());
        if (c5625Dm8.A06.gen.enable_video_issue_detected_flytrap_logging) {
            StringBuilder sbA0q = BV5.A0q(enumC5642DmW);
            sbA0q.append(":");
            sbA0q.append(enumC5624Dm7);
            c5625Dm8.A0R.set(C60P.A1M(":", str, sbA0q));
        }
        C5631DmF c5631DmF = c5625Dm8.A0I;
        C5790DpZ c5790DpZ = new C5790DpZ(enumC5624Dm7, enumC5642DmW, str);
        c5790DpZ.A01 = str2;
        c5631DmF.AXB(c5790DpZ);
    }

    public final void A0F(String str) {
        A0A(this, "pause", BV4.A1W());
        BV6.A0z(this.A0F, this, str, 3);
        Dlv dlv = this.A06.gen;
        if (dlv == null || !dlv.use_lock_free_snapl_listener) {
            synchronized (this.A0M) {
                C5630DmE c5630DmE = this.A0e;
                if (c5630DmE != null) {
                    long jA0D = A0D();
                    DmR dmR = this.A0H.A07;
                    c5630DmE.A0M(str, dmR != null ? dmR.A09 : null, jA0D);
                }
            }
            return;
        }
        C5630DmE c5630DmE2 = this.A0e;
        if (c5630DmE2 != null) {
            long jA0D2 = A0D();
            DmR dmR2 = this.A0H.A07;
            c5630DmE2.A0M(str, dmR2 != null ? dmR2.A09 : null, jA0D2);
        }
    }

    public final void A0G(String str, String str2, String str3, float f) {
        Float fValueOf = Float.valueOf(f);
        A0A(this, "setVolume %f, trigger: %s, reason: %s, callerTag: %s", fValueOf, str, str2, str3);
        if (this.A06.gen.enable_set_volume_dedup && f == this.A0Z) {
            return;
        }
        BV6.A0z(this.A0F, this, new Object[]{fValueOf, str, str2, str3}, 5);
    }
}
