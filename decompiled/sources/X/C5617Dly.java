package X;

import android.os.SystemClock;
import androidx.media3.common.util.Util;
import com.facebook.aura.deeplink.AuraDeeplinkRouteMapper;
import com.facebook.video.heroplayer.setting.HeroPlayerSetting;
import java.lang.ref.WeakReference;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.Dly, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5617Dly implements CXB {
    public static WeakReference<C5622Dm5> A0l;
    public double A00;
    public float A01;
    public int A02;
    public int A03;
    public int A04;
    public long A05;
    public long A06;
    public long A07;
    public long A08;
    public long A09;
    public long A0A;
    public long A0B;
    public long A0C;
    public long A0D;
    public long A0E;
    public long A0F;
    public long A0G;
    public long A0H;
    public long A0I;
    public InterfaceC5047DQt A0J;
    public Dq8 A0K;
    public C5623Dm6 A0L;
    public InterfaceC5965Dt6 A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public final float A0T;
    public final DEY A0U;
    public final C5794Dpe A0V;
    public final C5437DiY A0W;
    public final DmR A0X;
    public final C5647Dmb A0Y;
    public final C5789DpY A0Z;
    public final C5619Dm2 A0a;
    public final C5615Dlu A0b;
    public final HeroPlayerSetting A0c;
    public final Deque<Long> A0d;
    public final TreeMap<Long, Integer> A0e;
    public final TreeMap<Long, Integer> A0f;
    public final AtomicReference<C5957Dss> A0g;
    public final C6061Duw A0h;
    public final C5605Dlk A0i;
    public final boolean A0j;
    public volatile boolean A0k;

    /* JADX WARN: Removed duplicated region for block: B:10:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C5617Dly(X.DEY r13, X.C5794Dpe r14, X.C5437DiY r15, X.C6061Duw r16, X.DmR r17, X.C5605Dlk r18, X.C5622Dm5 r19, X.C5619Dm2 r20, X.C5615Dlu r21, com.facebook.video.heroplayer.setting.HeroPlayerSetting r22) {
        /*
            Method dump skipped, instructions count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5617Dly.<init>(X.DEY, X.Dpe, X.DiY, X.Duw, X.DmR, X.Dlk, X.Dm5, X.Dm2, X.Dlu, com.facebook.video.heroplayer.setting.HeroPlayerSetting):void");
    }

    @Override // X.CXB
    public final void AS2(C1J c1j, C1O c1o, int i, boolean z) {
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int A00(X.EnumC5743Doe r8, X.C5617Dly r9, java.lang.Integer r10) {
        /*
            X.Dmb r7 = r9.A0Y
            long r5 = android.os.SystemClock.elapsedRealtime()
            com.facebook.video.heroplayer.setting.HeroPlayerSetting r0 = r7.A04
            boolean r0 = r0.enableSuspensionAfterBroadcasterStall
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r0 == 0) goto L26
            long r1 = r7.A01
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto L26
            long r5 = r5 - r1
            long r1 = r7.A00
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 >= 0) goto L26
            r3 = -1
        L20:
            r0 = 1
        L21:
            X.C1G.A07(r0)
            int r0 = (int) r3
            return r0
        L26:
            java.util.Map<X.Doe, java.util.List<X.DqG>> r0 = r7.A07
            java.util.List r0 = X.BV4.A0z(r8, r0)
            if (r0 == 0) goto L53
            java.util.Iterator r2 = r0.iterator()
        L32:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L53
            java.lang.Object r1 = r2.next()
            X.DqG r1 = (X.C5827DqG) r1
            java.lang.Integer r0 = r1.A02
            boolean r0 = r0.equals(r10)
            if (r0 == 0) goto L32
            int r0 = r1.A00
            long r3 = (long) r0
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L53
            goto L20
        L53:
            r0 = 0
            goto L21
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5617Dly.A00(X.Doe, X.Dly, java.lang.Integer):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x019f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:211:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00d6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(X.C5623Dm6 r33, X.EnumC5743Doe r34, X.C5617Dly r35, int r36, int r37) {
        /*
            Method dump skipped, instructions count: 754
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5617Dly.A01(X.Dm6, X.Doe, X.Dly, int, int):void");
    }

    public static final void A03(C5623Dm6 c5623Dm6, C5617Dly c5617Dly, String str, long j) {
        c5617Dly.A0U.A01(new CallableC5663Dms(c5623Dm6, c5617Dly, str, j));
        if (AbstractC3426CMt.A00 || !AbstractC3426CMt.A01) {
            HashMap mapA0u = BV4.A0u();
            A02(c5623Dm6, c5617Dly, str, mapA0u);
            long j2 = c5623Dm6.A0B;
            Dq8 dq8 = c5617Dly.A0K;
            mapA0u.put("current_position_from_live_start_ms", Long.valueOf(j2 + Math.max(dq8 != null ? dq8.A04 : 0L, 0L)));
            Dq8 dq82 = c5617Dly.A0K;
            mapA0u.put("manifest_first_segment_start_time_ms", Long.valueOf(dq82 != null ? dq82.A04 : -9223372036854775807L));
            A04(c5623Dm6, c5617Dly, mapA0u, j);
            AbstractC3426CMt.A03("LiveLatencyManager", "Live latency manager post-jump state: %s", mapA0u);
        }
    }

    public static void A04(C5623Dm6 c5623Dm6, C5617Dly c5617Dly, AbstractMap abstractMap, long j) {
        abstractMap.put("audio_buffer_position_ms", Long.valueOf(c5623Dm6.A0D));
        abstractMap.put("video_buffer_position_ms", Long.valueOf(c5623Dm6.A0Q));
        abstractMap.put("elapsed_ms", Long.valueOf(j - c5617Dly.A0G));
    }

    public static final void A05(C5617Dly c5617Dly) {
        if (C8j3.A01(c5617Dly.A01, 1.0f) >= 1.0E-4f) {
            c5617Dly.A01 = 1.0f;
            C5615Dlu c5615Dlu = c5617Dly.A0b;
            C6233Dyb c6233Dyb = new C6233Dyb(1.0f, c5615Dlu.A03.A00);
            c5615Dlu.A04.Ae1(c6233Dyb);
            C5750Dol c5750Dol = c5615Dlu.A0M;
            if (c5750Dol != null) {
                c5750Dol.A04(c6233Dyb);
            }
            c5615Dlu.A03 = c6233Dyb;
        }
    }

    public static final void A06(C5617Dly c5617Dly) {
        C5789DpY c5789DpY = c5617Dly.A0Z;
        if (c5789DpY != null) {
            c5789DpY.A05.clear();
            c5789DpY.A03 = 0L;
            c5789DpY.A02 = Integer.MAX_VALUE;
            c5789DpY.A01 = Integer.MIN_VALUE;
            AbstractC3426CMt.A03("BufferMeter", "Clearing buffer sample queue", BV4.A1W());
        }
        c5617Dly.A08 = -9223372036854775807L;
        c5617Dly.A06 = -9223372036854775807L;
    }

    public static final void A08(C5617Dly c5617Dly) {
        c5617Dly.A0M = C5619Dm2.A03(c5617Dly.A0a).useSimpleSpeedController ? new C5808Dps() : new C5670Dmz(c5617Dly.A0c);
    }

    public static final boolean A09(C5617Dly c5617Dly) {
        int i = c5617Dly.A0X.A03.A01;
        return i >= 0 && i < c5617Dly.A0c.goodVsrScoreThreshold;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean A0A(X.C5617Dly r7) {
        /*
            boolean r0 = r7.A0j
            r6 = 0
            if (r0 == 0) goto L80
            X.DiY r1 = r7.A0W
            boolean r0 = r1.A0M
            if (r0 == 0) goto L80
            boolean r0 = r1.A0N
            if (r0 != 0) goto L80
            X.Dm2 r0 = r7.A0a
            X.Dof r1 = r0.A0K
            X.Dof r0 = X.EnumC5744Dof.A03
            if (r1 == r0) goto L80
            com.facebook.video.heroplayer.setting.HeroPlayerSetting r3 = r7.A0c
            boolean r0 = r3.liveLatencyManagerUllStreamsOnly
            if (r0 == 0) goto L33
            X.Dlu r2 = r7.A0b
            X.DmR r0 = r2.A0C
            if (r0 == 0) goto L49
            X.DDx r0 = r0.A03
            X.BXX r1 = r0.A0A
        L27:
            X.BXX r0 = X.BXX.DASH_LIVE
            if (r1 != r0) goto L33
            X.DlZ r0 = r2.A0G
            if (r0 == 0) goto L80
            boolean r0 = r0.A04
            if (r0 == 0) goto L80
        L33:
            X.Dq8 r2 = r7.A0K
            boolean r1 = r3.disableLatencyManagerOnStaticManifest
            if (r1 == 0) goto L4b
            boolean r0 = r7.A0R
            if (r0 == 0) goto L4b
            if (r2 == 0) goto L4b
            boolean r0 = r2.A0C
            if (r0 != 0) goto L4b
            r7.A0R = r6
            A07(r7)
            return r6
        L49:
            r1 = 0
            goto L27
        L4b:
            if (r1 == 0) goto L54
            if (r2 == 0) goto L54
            boolean r0 = r2.A0C
            if (r0 != 0) goto L54
            return r6
        L54:
            X.Duw r5 = r7.A0h
            boolean r4 = r5.A00
            boolean r0 = r7.A0S
            r3 = 1
            if (r0 == 0) goto L71
            if (r4 == 0) goto L71
            A07(r7)
            java.lang.String r1 = "rewind state"
            java.lang.String r0 = "live"
            java.lang.Object[] r2 = new java.lang.Object[]{r1, r0}
            java.lang.String r1 = "LiveLatencyManager"
            java.lang.String r0 = "Transition from %s to %s"
            X.AbstractC3426CMt.A03(r1, r0, r2)
        L71:
            r0 = r4 ^ 1
            r7.A0S = r0
            boolean r0 = r7.A0k
            if (r0 == 0) goto L80
            boolean r0 = r5.A00
            if (r0 == 0) goto L80
            r7.A0R = r3
            return r3
        L80:
            A05(r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5617Dly.A0A(X.Dly):boolean");
    }

    public static final boolean A0B(C5617Dly c5617Dly) {
        String str = C5619Dm2.A03(c5617Dly.A0a).allowedDataConnectionQualities;
        if (C7384Etj.A06(str) == 0) {
            str = "EXCELLENT";
        }
        List listA0e = C7BY.A0e(str, ",");
        if (!(listA0e instanceof Collection) || !listA0e.isEmpty()) {
            Iterator it = listA0e.iterator();
            while (it.hasNext()) {
                String strA0b = C7BY.A0b(it);
                if (strA0b != null && strA0b.equalsIgnoreCase("UNKNOWN")) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean A0C(X.C5617Dly r13, float r14) {
        /*
            X.DQt r1 = r13.A0J
            if (r1 == 0) goto La9
            X.Dm2 r0 = r13.A0a
            X.DmT r5 = X.C5619Dm2.A03(r0)
            boolean r0 = r5.useThroughputForBandwidthCheck
            if (r0 != 0) goto L8c
            long r4 = r1.ACr()
        L12:
            r1 = -1
            r12 = 1
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 == 0) goto Lad
            X.Dlu r0 = r13.A0b
            X.Dmq r0 = r0.A04
            X.E5q r0 = (X.C6438E5q) r0
            X.E60 r0 = X.AbstractC5797Dph.A03(r0)
            X.E6W r0 = r0.A0B
            X.Dic[] r1 = r0.A04
            X.DqB r0 = new X.DqB
            r0.<init>(r1)
            X.Dic[] r7 = r0.A00()
            X.C7384Etj.A0U(r7)
            int r6 = r7.length
            r11 = 0
            r3 = 0
        L36:
            if (r3 >= r6) goto Lad
            r8 = r7[r3]
            if (r8 == 0) goto L71
            X.Dwx r0 = r8.AKF()
            if (r0 == 0) goto L71
            X.Dwx r0 = r8.AKF()
            int r1 = r0.A05
            r0 = -1
            if (r1 == r0) goto L71
            float r2 = (float) r4
            float r2 = r2 * r14
            java.util.ArrayList r10 = X.C3cG.A0h()
            X.DhZ r9 = r8.ALt()
            int r8 = r9.A01
            r1 = 0
        L58:
            if (r1 >= r8) goto L67
            X.Dwx[] r0 = r9.A04
            r0 = r0[r1]
            X.C7384Etj.A0U(r0)
            r10.add(r0)
            int r1 = r1 + 1
            goto L58
        L67:
            boolean r0 = r10 instanceof java.util.Collection
            if (r0 == 0) goto L74
            boolean r0 = r10.isEmpty()
            if (r0 == 0) goto L74
        L71:
            int r3 = r3 + 1
            goto L36
        L74:
            java.util.Iterator r1 = r10.iterator()
        L78:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L71
            java.lang.Object r0 = r1.next()
            X.Dwx r0 = (X.C6154Dwx) r0
            int r0 = r0.A05
            float r0 = (float) r0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 >= 0) goto L78
            return r11
        L8c:
            boolean r0 = r1 instanceof X.InterfaceC4913DEg
            r4 = 0
            if (r0 == 0) goto La9
            X.DEg r1 = (X.InterfaceC4913DEg) r1
            r2 = 0
            if (r1 == 0) goto La9
            X.Drm r1 = r1.ACl()
            if (r1 == 0) goto La9
            int r0 = r5.bandwidthCheckThroughputConfidencePercentile
            long r4 = r1.AFM(r4, r0)
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 <= 0) goto La9
            goto L12
        La9:
            r4 = -1
            goto L12
        Lad:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5617Dly.A0C(X.Dly, float):boolean");
    }

    public final void A0D() {
        C5957Dss c5957Dss;
        AtomicReference<C5957Dss> atomicReference = this.A0g;
        do {
            c5957Dss = atomicReference.get();
        } while (!Bs8.A00(c5957Dss, new C5957Dss(c5957Dss.A01 + 1, null, -9223372036854775807L), atomicReference));
    }

    @Override // X.CXB
    public final void AWh(C1J c1j, C1O c1o, boolean z) {
        this.A05 = Util.A0B(AbstractC5797Dph.A03((C6438E5q) this.A0b.A04).A0K);
    }

    public static void A02(C5623Dm6 c5623Dm6, C5617Dly c5617Dly, Object obj, AbstractMap abstractMap) {
        abstractMap.put(AuraDeeplinkRouteMapper.STATUS_ROUTE, obj);
        abstractMap.put("target_position_ms", Long.valueOf(Math.max(c5617Dly.A0E, c5617Dly.A0H)));
        abstractMap.put("audio_target_position_ms", Long.valueOf(c5617Dly.A0E));
        abstractMap.put("video_target_position_ms", Long.valueOf(c5617Dly.A0H));
        abstractMap.put("current_position_ms", Long.valueOf(c5623Dm6.A0B));
    }

    public static final void A07(C5617Dly c5617Dly) {
        A06(c5617Dly);
        A08(c5617Dly);
        c5617Dly.A0V.A02.clear();
        c5617Dly.A04 = 0;
        c5617Dly.A03 = 0;
        c5617Dly.A07 = -9223372036854775807L;
        c5617Dly.A0P = false;
        c5617Dly.A0f.clear();
        c5617Dly.A0e.clear();
        c5617Dly.A0d.clear();
        c5617Dly.A0I = SystemClock.elapsedRealtime();
        c5617Dly.A0O = false;
        A05(c5617Dly);
        c5617Dly.A0N = false;
        C5647Dmb c5647Dmb = c5617Dly.A0Y;
        SystemClock.elapsedRealtime();
        c5647Dmb.A01 = -9223372036854775807L;
        C5647Dmb.A00(c5647Dmb);
    }

    @Override // X.CXB
    public final void AWk(C1J c1j, C1O c1o, boolean z) {
    }

    @Override // X.CXB
    public final void AWm(C1J c1j, C1O c1o, boolean z) {
    }
}
