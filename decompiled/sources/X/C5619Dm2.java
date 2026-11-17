package X;

import android.os.Handler;
import android.os.SystemClock;
import com.facebook.exoplayer.monitor.VpsEventCallback;
import com.facebook.video.heroplayer.setting.HeroPlayerSetting;
import java.util.Map;

/* renamed from: X.Dm2, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5619Dm2 {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public long A05;
    public long A06;
    public InterfaceC4913DEg A07;
    public DmR A08;
    public String A09;
    public String A0A;
    public boolean A0B;
    public boolean A0C;
    public long A0D;
    public final Handler A0E;
    public final C5605Dlk A0F;
    public final HeroPlayerSetting A0G;
    public final Runnable A0H;
    public final VpsEventCallback A0I;
    public final DEY A0J;
    public volatile EnumC5744Dof A0K;
    public volatile EnumC5744Dof A0L;

    /* JADX WARN: Removed duplicated region for block: B:6:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C5619Dm2(android.os.Handler r7, com.facebook.exoplayer.monitor.VpsEventCallback r8, X.DEY r9, X.DmR r10, X.C5605Dlk r11, com.facebook.video.heroplayer.setting.HeroPlayerSetting r12) {
        /*
            r6 = this;
            r0 = 0
            X.C7384Etj.A0Y(r7, r0)
            r2 = 1
            r6.<init>()
            r6.A0E = r7
            r6.A0G = r12
            r6.A08 = r10
            r6.A0F = r11
            r6.A0I = r8
            r6.A0J = r9
            int r1 = r10.A01
            r6.A03 = r1
            boolean r0 = r10.A0A
            if (r0 == 0) goto L1f
            r0 = 1
            if (r1 != 0) goto L20
        L1f:
            r0 = 0
        L20:
            r6.A0B = r0
            long r0 = android.os.SystemClock.elapsedRealtime()
            r6.A06 = r0
            r0 = -1
            r6.A0D = r0
            X.Dof r0 = r6.A00()
            r6.A0L = r0
            X.Dof r0 = r6.A0L
            r6.A0K = r0
            X.DsD r0 = new X.DsD
            r0.<init>(r6)
            r6.A0H = r0
            r6.A0C = r2
            java.lang.String r0 = ""
            r6.A0A = r0
            X.DmT r0 = A03(r6)
            boolean r0 = r0.startPlaybackWithRegularLatency
            if (r0 == 0) goto L78
            X.Dof r0 = X.EnumC5744Dof.A03
        L4d:
            r6.A0K = r0
            r6.A09()
            X.Dof r0 = r6.A0K
            X.DmT r0 = A02(r0, r6)
            int r0 = r0.minPlaybackDurationToFallbackMs
            long r2 = (long) r0
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L68
            android.os.Handler r1 = r6.A0E
            java.lang.Runnable r0 = r6.A0H
            r1.postDelayed(r0, r2)
        L68:
            X.Dof r3 = r6.A0L
            X.Dof r2 = r6.A0K
            java.lang.String r1 = r6.A0A
            java.lang.String r0 = "Initial:"
            java.lang.String r0 = X.FGI.A0M(r0, r1)
            r6.A05(r3, r2, r0)
            return
        L78:
            X.Dof r0 = r6.A0K
            goto L4d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5619Dm2.<init>(android.os.Handler, com.facebook.exoplayer.monitor.VpsEventCallback, X.DEY, X.DmR, X.Dlk, com.facebook.video.heroplayer.setting.HeroPlayerSetting):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000a, code lost:
    
        if (r0 != 1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0054 A[PHI: r2
  0x0054: PHI (r2v1 boolean) = (r2v0 boolean), (r2v2 boolean) binds: [B:30:0x0052, B:8:0x000e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0010  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final X.EnumC5744Dof A00() {
        /*
            r4 = this;
            boolean r0 = r4.A0B
            if (r0 == 0) goto L4a
            int r0 = r4.A03
            r1 = 2
            r2 = 1
            if (r0 == r1) goto Lc
            if (r0 != r2) goto L4a
        Lc:
            int r0 = r4.A03
            if (r0 == r2) goto L54
            if (r0 == r1) goto L77
            X.DmR r0 = r4.A08
            X.DDx r0 = r0.A03
            boolean r0 = r0.A0c
            if (r0 == 0) goto L31
            com.facebook.video.heroplayer.setting.HeroPlayerSetting r1 = r4.A0G
            java.util.Map<X.Dof, X.DmT> r0 = r1.liveLatencySettings
            if (r0 == 0) goto L31
            X.Dof r3 = X.EnumC5744Dof.A04
            boolean r0 = r0.containsKey(r3)
            if (r0 != r2) goto L31
            boolean r0 = r1.disableUllBasedOnHoldout
            if (r0 != 0) goto L31
            java.lang.String r0 = "ULLClassifier"
        L2e:
            r4.A0A = r0
            return r3
        L31:
            X.DmR r0 = r4.A08
            X.DDx r0 = r0.A03
            boolean r0 = r0.A0Y
            if (r0 == 0) goto L71
            com.facebook.video.heroplayer.setting.HeroPlayerSetting r0 = r4.A0G
            java.util.Map<X.Dof, X.DmT> r0 = r0.liveLatencySettings
            if (r0 == 0) goto L71
            X.Dof r3 = X.EnumC5744Dof.A02
            boolean r0 = r0.containsKey(r3)
            if (r0 != r2) goto L71
            java.lang.String r0 = "LLClassifier"
            goto L2e
        L4a:
            com.facebook.video.heroplayer.setting.HeroPlayerSetting r0 = r4.A0G
            int r0 = r0.streamLatencyToggleStateOverride
            r1 = 2
            r2 = 1
            if (r0 == r1) goto L77
            if (r0 != r2) goto Lc
        L54:
            X.DmR r0 = r4.A08
            X.DDx r0 = r0.A03
            boolean r0 = r0.A0c
            if (r0 == 0) goto L74
            com.facebook.video.heroplayer.setting.HeroPlayerSetting r1 = r4.A0G
            java.util.Map<X.Dof, X.DmT> r0 = r1.liveLatencySettings
            if (r0 == 0) goto L74
            X.Dof r3 = X.EnumC5744Dof.A04
            boolean r0 = r0.containsKey(r3)
            if (r0 != r2) goto L74
            boolean r0 = r1.disableUllBasedOnHoldout
            if (r0 != 0) goto L74
            java.lang.String r0 = "ToggleLow+LLClassifier"
            goto L2e
        L71:
            java.lang.String r0 = "Classifier"
            goto L79
        L74:
            X.Dof r3 = X.EnumC5744Dof.A02
            return r3
        L77:
            java.lang.String r0 = "ToggleNormal"
        L79:
            r4.A0A = r0
            X.Dof r3 = X.EnumC5744Dof.A03
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5619Dm2.A00():X.Dof");
    }

    public static final DmT A01(EnumC5744Dof enumC5744Dof, C5619Dm2 c5619Dm2) {
        DmT dmT;
        Map<EnumC5744Dof, DmT> map = c5619Dm2.A0G.liveLatencySettings;
        return (map == null || (dmT = map.get(enumC5744Dof)) == null) ? new DmT() : dmT;
    }

    public static final DmT A02(EnumC5744Dof enumC5744Dof, C5619Dm2 c5619Dm2) {
        DmT dmT;
        Map<EnumC5744Dof, DmT> map = c5619Dm2.A0G.liveLatencySettings;
        if (map != null && (dmT = map.get(enumC5744Dof)) != null) {
            return dmT;
        }
        if (enumC5744Dof == EnumC5744Dof.A03) {
            EnumC5744Dof enumC5744Dof2 = c5619Dm2.A0L;
            EnumC5744Dof enumC5744Dof3 = EnumC5744Dof.A02;
            if (enumC5744Dof2 == enumC5744Dof3) {
                return A01(enumC5744Dof3, c5619Dm2);
            }
        }
        return new DmT();
    }

    public static DmT A03(C5619Dm2 c5619Dm2) {
        return A01(c5619Dm2.A0K, c5619Dm2);
    }

    private final void A05(EnumC5744Dof enumC5744Dof, EnumC5744Dof enumC5744Dof2, String str) {
        this.A0I.A5s(new DET(enumC5744Dof, enumC5744Dof2, this.A08.A03.A0Q, str, A01(enumC5744Dof2, this).desiredBuffer, System.currentTimeMillis()));
        this.A0J.A01(new CallableC7567F4g(enumC5744Dof2, this, enumC5744Dof, 1));
    }

    public static final void A06(C5619Dm2 c5619Dm2, int i, boolean z) {
        if (c5619Dm2.A03 != i || z) {
            c5619Dm2.A03 = i;
            EnumC5744Dof enumC5744DofA00 = c5619Dm2.A00();
            if (z) {
                c5619Dm2.A0L = enumC5744DofA00;
                enumC5744DofA00 = c5619Dm2.A0L;
            }
            c5619Dm2.A0K = enumC5744DofA00;
            c5619Dm2.A05(c5619Dm2.A0L, c5619Dm2.A0K, "Toggle");
            c5619Dm2.A04();
        }
    }

    private final boolean A07(int i, int i2) {
        InterfaceC5903Drm interfaceC5903DrmACl;
        InterfaceC4913DEg interfaceC4913DEg = this.A07;
        return AnonymousClass002.A1N((((interfaceC4913DEg == null || (interfaceC5903DrmACl = interfaceC4913DEg.ACl()) == null) ? 0L : interfaceC5903DrmACl.AFM(null, i2)) > i ? 1 : (((interfaceC4913DEg == null || (interfaceC5903DrmACl = interfaceC4913DEg.ACl()) == null) ? 0L : interfaceC5903DrmACl.AFM(null, i2)) == i ? 0 : -1)));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean A08(X.DmT r8) {
        /*
            Method dump skipped, instructions count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5619Dm2.A08(X.DmT):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:133:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:143:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d3 A[PHI: r6 r8
  0x00d3: PHI (r6v7 java.lang.String) = (r6v6 java.lang.String), (r6v6 java.lang.String), (r6v6 java.lang.String), (r6v11 java.lang.String) binds: [B:51:0x00b6, B:53:0x00ba, B:55:0x00c0, B:58:0x00cc] A[DONT_GENERATE, DONT_INLINE]
  0x00d3: PHI (r8v12 java.lang.String) = (r8v11 java.lang.String), (r8v11 java.lang.String), (r8v11 java.lang.String), (r8v20 java.lang.String) binds: [B:51:0x00b6, B:53:0x00ba, B:55:0x00c0, B:58:0x00cc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0159  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A09() {
        /*
            Method dump skipped, instructions count: 472
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5619Dm2.A09():void");
    }

    private final void A04() {
        this.A06 = SystemClock.elapsedRealtime();
        this.A0D = SystemClock.elapsedRealtime();
        this.A04 = 0;
        Handler handler = this.A0E;
        Runnable runnable = this.A0H;
        handler.removeCallbacks(runnable);
        long j = A02(this.A0K, this).minPlaybackDurationToFallbackMs;
        if (j > 0) {
            handler.postDelayed(runnable, j);
        }
    }
}
