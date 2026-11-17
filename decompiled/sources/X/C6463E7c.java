package X;

import android.os.Looper;
import android.util.SparseArray;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.Timeline;
import androidx.media3.exoplayer.ExoPlaybackException;
import com.facebook.aura.components.reactions.AuraSingleTearKt;
import com.facebook.aura.composer.dictation.voyager.VoyagerAsrClient;
import com.facebook.aura.gateway.connection.ConnectionReducerKt;
import com.google.common.collect.ImmutableList;
import java.io.IOException;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.E7c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6463E7c implements E65 {
    public C6443E5w<InterfaceC6481E7w> A00;
    public Dn6 A01;
    public InterfaceC6459E6s A02;
    public boolean A03;
    public final SparseArray<C6202Dxm> A04;
    public final E0G A05;
    public final E6B A06;
    public final C5998Dth A07;
    public final E7C A08;

    /* JADX WARN: Removed duplicated region for block: B:22:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final X.C6202Dxm A00(androidx.media3.common.Timeline r16, X.Dy6 r17, int r18) {
        /*
            r15 = this;
            r5 = r16
            r7 = r17
            int r0 = r5.A02()
            boolean r4 = X.AnonymousClass002.A1M(r0)
            if (r4 == 0) goto Lf
            r7 = 0
        Lf:
            long r11 = android.os.SystemClock.elapsedRealtime()
            r2 = r15
            X.Dn6 r0 = r15.A01
            X.E5q r0 = (X.C6438E5q) r0
            androidx.media3.common.Timeline r0 = X.AbstractC5797Dph.A02(r0)
            boolean r0 = r5.equals(r0)
            r9 = r18
            if (r0 == 0) goto L2d
            X.Dn6 r0 = r15.A01
            int r0 = r0.AEU()
            r3 = 1
            if (r9 == r0) goto L2e
        L2d:
            r3 = 0
        L2e:
            r13 = 0
            if (r7 == 0) goto L81
            int r1 = r7.A00
            r0 = -1
            boolean r0 = X.AnonymousClass002.A1P(r1, r0)
            if (r0 == 0) goto L81
            if (r3 == 0) goto L55
            X.Dn6 r0 = r15.A01
            int r0 = r0.AEP()
            if (r0 != r1) goto L55
            X.Dn6 r0 = r15.A01
            int r1 = r0.AEQ()
            int r0 = r7.A01
            if (r1 != r0) goto L55
            X.Dn6 r0 = r15.A01
            long r13 = r0.getCurrentPosition()
        L55:
            X.E0G r0 = r15.A05
            X.Dy6 r8 = r0.A00
            X.Dn6 r0 = r15.A01
            X.E5q r0 = (X.C6438E5q) r0
            androidx.media3.common.Timeline r6 = X.AbstractC5797Dph.A02(r0)
            X.Dn6 r0 = r15.A01
            int r10 = r0.AEU()
            X.Dn6 r0 = r15.A01
            long r15 = r0.getCurrentPosition()
            X.Dn6 r0 = r2.A01
            X.E5q r0 = (X.C6438E5q) r0
            X.E60 r0 = X.AbstractC5797Dph.A03(r0)
            long r0 = r0.A0K
            long r17 = androidx.media3.common.util.Util.A0B(r0)
            X.Dxm r4 = new X.Dxm
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r13, r15, r17)
            return r4
        L81:
            if (r3 == 0) goto L90
            X.Dn6 r1 = r15.A01
            X.E5q r1 = (X.C6438E5q) r1
            X.E60 r0 = X.AbstractC5797Dph.A03(r1)
            long r13 = X.C6438E5q.A06(r1, r0)
            goto L55
        L90:
            if (r4 != 0) goto L55
            X.Dth r0 = r15.A07
            X.Dth r0 = r5.A0E(r0, r9, r13)
            long r0 = r0.A02
            long r13 = androidx.media3.common.util.Util.A0B(r0)
            goto L55
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6463E7c.A00(androidx.media3.common.Timeline, X.Dy6, int):X.Dxm");
    }

    public static C6202Dxm A01(C6463E7c c6463E7c) {
        return A02(c6463E7c, c6463E7c.A05.A02);
    }

    public static C6202Dxm A02(C6463E7c c6463E7c, Dy6 dy6) {
        Timeline timeline;
        c6463E7c.A01.getClass();
        if (dy6 != null && (timeline = c6463E7c.A05.A04.get(dy6)) != null) {
            return c6463E7c.A00(timeline, dy6, E6B.A01(c6463E7c.A06, timeline, dy6.A04));
        }
        int iAEU = c6463E7c.A01.AEU();
        Timeline timelineA02 = AbstractC5797Dph.A02((C6438E5q) c6463E7c.A01);
        if (iAEU >= timelineA02.A02()) {
            timelineA02 = Timeline.A00;
        }
        return c6463E7c.A00(timelineA02, null, iAEU);
    }

    private C6202Dxm A03(Dy6 dy6, int i) {
        this.A01.getClass();
        if (dy6 != null) {
            return this.A05.A04.get(dy6) != null ? A02(this, dy6) : A00(Timeline.A00, dy6, i);
        }
        Timeline timelineA02 = AbstractC5797Dph.A02((C6438E5q) this.A01);
        if (i >= timelineA02.A02()) {
            timelineA02 = Timeline.A00;
        }
        return A00(timelineA02, null, i);
    }

    public static final void A04(E7R e7r, C6202Dxm c6202Dxm, C6463E7c c6463E7c, int i) {
        c6463E7c.A04.put(i, c6202Dxm);
        C6443E5w<InterfaceC6481E7w> c6443E5w = c6463E7c.A00;
        c6443E5w.A03(e7r, i);
        c6443E5w.A01();
    }

    @Override // X.E65
    public final void ARR() {
        if (this.A03) {
            return;
        }
        C6202Dxm c6202DxmA00 = E0G.A00(this);
        this.A03 = true;
        A04(new C7585F4y(c6202DxmA00, 36), c6202DxmA00, this, -1);
    }

    @Override // X.GYb
    public final void ARx(final int i, final long j) {
        E0G e0g = this.A05;
        final C6202Dxm c6202DxmA02 = A02(this, e0g.A03.isEmpty() ? null : (Dy6) AbstractC7398Eub.A00(e0g.A03));
        A04(new E7R() { // from class: X.E7z
            @Override // X.E7R
            public final void ANx(Object obj) {
                ((InterfaceC6481E7w) obj).ARw(c6202DxmA02, i, j);
            }
        }, c6202DxmA02, this, VoyagerAsrClient.ABNORMAL_CLOSE_CODE);
    }

    @Override // X.E65
    public final void ASq(int i) {
        C6202Dxm c6202DxmA02 = A02(this, this.A05.A01);
        A04(new C7586F4z(c6202DxmA02, i), c6202DxmA02, this, 1018);
    }

    @Override // X.E65
    public final void AXA() {
        C6202Dxm c6202DxmA02 = A02(this, this.A05.A01);
        A04(new C7585F4y(c6202DxmA02, 31), c6202DxmA02, this, 1021);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x000f  */
    @Override // X.E65
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Ae5(android.os.Looper r8, final X.Dn6 r9) {
        /*
            r7 = this;
            X.Dn6 r0 = r7.A01
            if (r0 == 0) goto Lf
            X.E0G r0 = r7.A05
            com.google.common.collect.ImmutableList<X.Dy6> r0 = r0.A03
            boolean r1 = r0.isEmpty()
            r0 = 0
            if (r1 == 0) goto L10
        Lf:
            r0 = 1
        L10:
            X.C1G.A08(r0)
            r9.getClass()
            r7.A01 = r9
            X.E7C r1 = r7.A08
            r0 = 0
            r2 = r8
            X.E6I r0 = r1.A7o(r0, r8)
            r7.A02 = r0
            X.E5w<X.E7w> r0 = r7.A00
            X.E0D r4 = new X.E0D
            r4.<init>()
            X.E7C r3 = r0.A02
            java.util.concurrent.CopyOnWriteArraySet<X.E6X<T>> r5 = r0.A05
            boolean r6 = r0.A00
            X.E5w r1 = new X.E5w
            r1.<init>(r2, r3, r4, r5, r6)
            r7.A00 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6463E7c.Ae5(android.os.Looper, X.Dn6):void");
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/util/List<LX/Dy6;>;LX/Dy6;)V */
    @Override // X.E65
    public final void Ahx(Dy6 dy6, List list) {
        E0G e0g = this.A05;
        Dn6 dn6 = this.A01;
        dn6.getClass();
        e0g.A03 = ImmutableList.copyOf((Collection) list);
        if (!list.isEmpty()) {
            e0g.A01 = (Dy6) C8j4.A0p(list);
            dy6.getClass();
            e0g.A02 = dy6;
        }
        if (e0g.A00 == null) {
            ImmutableList<Dy6> immutableList = e0g.A03;
            e0g.A00 = E0G.A01(dn6, e0g.A05, e0g.A01, immutableList);
        }
        E0G.A02(AbstractC5797Dph.A02((C6438E5q) dn6), e0g);
    }

    @Override // X.E65
    public final void onAudioDisabled(C6173DxG c6173DxG) {
        C6202Dxm c6202DxmA02 = A02(this, this.A05.A01);
        A04(new F50(11, c6173DxG, c6202DxmA02), c6202DxmA02, this, ConnectionReducerKt.SERVICE_NOTICE_CODE_TRY_AGAIN_LATER);
    }

    @Override // X.E76
    public final void onPlayerError(PlaybackException playbackException) {
        Dy6 dy6;
        C6202Dxm c6202DxmA00 = (!(playbackException instanceof ExoPlaybackException) || (dy6 = ((ExoPlaybackException) playbackException).mediaPeriodId) == null) ? E0G.A00(this) : A02(this, dy6);
        A04(new F50(10, playbackException, c6202DxmA00), c6202DxmA00, this, 10);
    }

    @Override // X.E76
    public final void onPlayerErrorChanged(PlaybackException playbackException) {
        Dy6 dy6;
        C6202Dxm c6202DxmA00 = (!(playbackException instanceof ExoPlaybackException) || (dy6 = ((ExoPlaybackException) playbackException).mediaPeriodId) == null) ? E0G.A00(this) : A02(this, dy6);
        A04(new F50(7, playbackException, c6202DxmA00), c6202DxmA00, this, 10);
    }

    @Override // X.E76
    public final void onTimelineChanged(Timeline timeline, int i) {
        E0G e0g = this.A05;
        Dn6 dn6 = this.A01;
        dn6.getClass();
        ImmutableList<Dy6> immutableList = e0g.A03;
        e0g.A00 = E0G.A01(dn6, e0g.A05, e0g.A01, immutableList);
        E0G.A02(AbstractC5797Dph.A02((C6438E5q) dn6), e0g);
        C6202Dxm c6202DxmA02 = A02(this, e0g.A00);
        A04(new C7585F4y(c6202DxmA02, 20), c6202DxmA02, this, 0);
    }

    @Override // X.E65
    public final void onVideoDisabled(C6173DxG c6173DxG) {
        C6202Dxm c6202DxmA02 = A02(this, this.A05.A01);
        A04(new F50(13, c6173DxG, c6202DxmA02), c6202DxmA02, this, AuraSingleTearKt.SINGLE_TEAR_TOTAL_MS);
    }

    @Override // X.E65
    public final void release() {
        InterfaceC6459E6s interfaceC6459E6s = this.A02;
        C1G.A05(interfaceC6459E6s);
        BV6.A1C(interfaceC6459E6s, new Runnable() { // from class: X.E7d
            public static final String __redex_internal_original_name = "DefaultAnalyticsCollector$$ExternalSyntheticLambda60";

            @Override // java.lang.Runnable
            public final void run() {
                C6463E7c c6463E7c = this.A00;
                C6202Dxm c6202DxmA00 = E0G.A00(c6463E7c);
                C6463E7c.A04(new C7585F4y(c6202DxmA00, 17), c6202DxmA00, c6463E7c, 1028);
                c6463E7c.A00.A02();
            }
        });
    }

    public C6463E7c(E7C e7c) {
        e7c.getClass();
        this.A08 = e7c;
        Looper looperMyLooper = Looper.myLooper();
        this.A00 = new C6443E5w<>(looperMyLooper == null ? Looper.getMainLooper() : looperMyLooper, e7c, new F5C(0), new CopyOnWriteArraySet(), true);
        E6B e6b = new E6B();
        this.A06 = e6b;
        this.A07 = new C5998Dth();
        this.A05 = new E0G(e6b);
        this.A04 = BV4.A0B();
    }

    @Override // X.E65
    public final void A3d(InterfaceC6481E7w interfaceC6481E7w) {
        interfaceC6481E7w.getClass();
        this.A00.A04(interfaceC6481E7w);
    }

    @Override // X.E65
    public final void ARm() {
        C6202Dxm c6202DxmA01 = A01(this);
        A04(new C7585F4y(c6202DxmA01, 27), c6202DxmA01, this, 1008);
    }

    @Override // X.E65
    public final void ARn() {
        C6202Dxm c6202DxmA01 = A01(this);
        A04(new C7585F4y(c6202DxmA01, 19), c6202DxmA01, this, ConnectionReducerKt.SERVICE_NOTICE_CODE_RESTART);
    }

    @Override // X.E65
    public final void ARr() {
        C6202Dxm c6202DxmA01 = A01(this);
        A04(new C7585F4y(c6202DxmA01, 25), c6202DxmA01, this, 1010);
    }

    @Override // X.E65
    public final void ARs() {
        C6202Dxm c6202DxmA01 = A01(this);
        A04(new C7585F4y(c6202DxmA01, 23), c6202DxmA01, this, 1011);
    }

    @Override // X.InterfaceC6021DuE
    public final void ASj(Dy6 dy6, int i) {
        C6202Dxm c6202DxmA03 = A03(dy6, i);
        A04(new C7585F4y(c6202DxmA03, 39), c6202DxmA03, this, 1023);
    }

    @Override // X.InterfaceC6021DuE
    public final void ASk(Dy6 dy6, int i) {
        C6202Dxm c6202DxmA03 = A03(dy6, i);
        A04(new C7585F4y(c6202DxmA03, 34), c6202DxmA03, this, 1025);
    }

    @Override // X.InterfaceC6021DuE
    public final void ASl(Dy6 dy6, int i, int i2) {
        C6202Dxm c6202DxmA03 = A03(dy6, i);
        A04(new C7585F4y(c6202DxmA03, 33), c6202DxmA03, this, 1022);
    }

    @Override // X.InterfaceC6021DuE
    public final void ASm(Dy6 dy6, Exception exc, int i) {
        C6202Dxm c6202DxmA03 = A03(dy6, i);
        A04(new F50(12, exc, c6202DxmA03), c6202DxmA03, this, 1024);
    }

    @Override // X.InterfaceC6021DuE
    public final void ASo(Dy6 dy6, int i) {
        C6202Dxm c6202DxmA03 = A03(dy6, i);
        A04(new C7585F4y(c6202DxmA03, 40), c6202DxmA03, this, 1027);
    }

    @Override // X.E65
    public final void AVI(Object obj) {
        C6202Dxm c6202DxmA01 = A01(this);
        A04(new F50(18, obj, c6202DxmA01), c6202DxmA01, this, 26);
    }

    @Override // X.E65
    public final void AVK(final int i, final boolean z) {
        final C6202Dxm c6202DxmA01 = A01(this);
        A04(new E7R() { // from class: X.E7y
            @Override // X.E7R
            public final void ANx(Object obj) {
                ((InterfaceC6481E7w) obj).AVJ(i, z);
            }
        }, c6202DxmA01, this, 1033);
    }

    @Override // X.E65
    public final void AX5() {
        C6202Dxm c6202DxmA01 = A01(this);
        A04(new C7585F4y(c6202DxmA01, 38), c6202DxmA01, this, 1016);
    }

    @Override // X.E65
    public final void AX6() {
        C6202Dxm c6202DxmA01 = A01(this);
        A04(new C7585F4y(c6202DxmA01, 29), c6202DxmA01, this, 1019);
    }

    @Override // X.E65
    public final void onAudioCodecError(Exception exc) {
        C6202Dxm c6202DxmA01 = A01(this);
        A04(new F50(20, exc, c6202DxmA01), c6202DxmA01, this, 1029);
    }

    @Override // X.E65
    public final void onAudioEnabled(C6173DxG c6173DxG) {
        C6202Dxm c6202DxmA01 = A01(this);
        A04(new F50(1, c6173DxG, c6202DxmA01), c6202DxmA01, this, 1007);
    }

    @Override // X.E65
    public final void onAudioInputFormatChanged(C6154Dwx c6154Dwx, C2461Bbo c2461Bbo) {
        C6202Dxm c6202DxmA01 = A01(this);
        A04(new F51(c6154Dwx, c2461Bbo, c6202DxmA01, 3), c6202DxmA01, this, 1009);
    }

    @Override // X.E76
    public final void onAudioSessionIdChanged(int i) {
        C6202Dxm c6202DxmA01 = A01(this);
        A04(new C7585F4y(c6202DxmA01, 35), c6202DxmA01, this, 21);
    }

    @Override // X.E65
    public final void onAudioSinkError(Exception exc) {
        C6202Dxm c6202DxmA01 = A01(this);
        A04(new F50(22, exc, c6202DxmA01), c6202DxmA01, this, 1014);
    }

    @Override // X.E65
    public final void onAudioTrackInitialized(C6518EAw c6518EAw) {
        C6202Dxm c6202DxmA01 = A01(this);
        A04(new F50(14, c6518EAw, c6202DxmA01), c6202DxmA01, this, 1031);
    }

    @Override // X.E65
    public final void onAudioTrackReleased(C6518EAw c6518EAw) {
        C6202Dxm c6202DxmA01 = A01(this);
        A04(new F50(21, c6518EAw, c6202DxmA01), c6202DxmA01, this, 1032);
    }

    @Override // X.E76
    public final void onAvailableCommandsChanged(E1B e1b) {
        C6202Dxm c6202DxmA00 = E0G.A00(this);
        A04(new F50(2, e1b, c6202DxmA00), c6202DxmA00, this, 13);
    }

    @Override // X.E76
    public final void onCues(DXD dxd) {
        C6202Dxm c6202DxmA00 = E0G.A00(this);
        A04(new F50(17, dxd, c6202DxmA00), c6202DxmA00, this, 27);
    }

    @Override // X.Du7
    public final void onDownstreamFormatChanged(int i, Dy6 dy6, C5893Dra c5893Dra) {
        C6202Dxm c6202DxmA03 = A03(dy6, i);
        A04(new F50(9, c5893Dra, c6202DxmA03), c6202DxmA03, this, 1004);
    }

    @Override // X.E76
    public final void onIsLoadingChanged(boolean z) {
        C6202Dxm c6202DxmA00 = E0G.A00(this);
        A04(new C7585F4y(c6202DxmA00, 18), c6202DxmA00, this, 3);
    }

    @Override // X.E76
    public final void onIsPlayingChanged(boolean z) {
        C6202Dxm c6202DxmA00 = E0G.A00(this);
        A04(new C7585F4y(c6202DxmA00, 26), c6202DxmA00, this, 7);
    }

    @Override // X.Du7
    public final void onLoadCanceled(int i, Dy6 dy6, C5072DTn c5072DTn, C5893Dra c5893Dra) {
        C6202Dxm c6202DxmA03 = A03(dy6, i);
        A04(new F51(c6202DxmA03, c5072DTn, c5893Dra, 0), c6202DxmA03, this, 1002);
    }

    @Override // X.Du7
    public final void onLoadCompleted(int i, Dy6 dy6, C5072DTn c5072DTn, C5893Dra c5893Dra) {
        C6202Dxm c6202DxmA03 = A03(dy6, i);
        A04(new F51(c6202DxmA03, c5072DTn, c5893Dra, 1), c6202DxmA03, this, 1001);
    }

    @Override // X.Du7
    public final void onLoadError(int i, Dy6 dy6, final C5072DTn c5072DTn, final C5893Dra c5893Dra, final IOException iOException, boolean z) {
        final C6202Dxm c6202DxmA03 = A03(dy6, i);
        A04(new E7R() { // from class: X.E7v
            @Override // X.E7R
            public final void ANx(Object obj) {
                ((InterfaceC6481E7w) obj).ATw(c5893Dra, iOException);
            }
        }, c6202DxmA03, this, 1003);
    }

    @Override // X.Du7
    public final void onLoadStarted(int i, Dy6 dy6, C5072DTn c5072DTn, C5893Dra c5893Dra, int i2) {
        C6202Dxm c6202DxmA03 = A03(dy6, i);
        A04(new F51(c6202DxmA03, c5072DTn, c5893Dra, 4), c6202DxmA03, this, 1000);
    }

    @Override // X.E76
    public final void onMediaItemTransition(C5704Dnm c5704Dnm, int i) {
        C6202Dxm c6202DxmA00 = E0G.A00(this);
        A04(new F50(3, c5704Dnm, c6202DxmA00), c6202DxmA00, this, 1);
    }

    @Override // X.E76
    public final void onMediaMetadataChanged(C10388Har c10388Har) {
        C6202Dxm c6202DxmA00 = E0G.A00(this);
        A04(new F50(23, c10388Har, c6202DxmA00), c6202DxmA00, this, 14);
    }

    @Override // X.E76
    public final void onMetadata(C5402Dhv c5402Dhv) {
        C6202Dxm c6202DxmA00 = E0G.A00(this);
        A04(new F50(5, c5402Dhv, c6202DxmA00), c6202DxmA00, this, 28);
    }

    @Override // X.E76
    public final void onPlayWhenReadyChanged(boolean z, int i) {
        C6202Dxm c6202DxmA00 = E0G.A00(this);
        A04(new C7585F4y(c6202DxmA00, 30), c6202DxmA00, this, 5);
    }

    @Override // X.E76
    public final void onPlaybackParametersChanged(C6233Dyb c6233Dyb) {
        C6202Dxm c6202DxmA00 = E0G.A00(this);
        A04(new F50(0, c6233Dyb, c6202DxmA00), c6202DxmA00, this, 12);
    }

    @Override // X.E76
    public final void onPlaybackStateChanged(int i) {
        C6202Dxm c6202DxmA00 = E0G.A00(this);
        A04(new C7585F4y(c6202DxmA00, 32), c6202DxmA00, this, 4);
    }

    @Override // X.E76
    public final void onPlaybackSuppressionReasonChanged(int i) {
        C6202Dxm c6202DxmA00 = E0G.A00(this);
        A04(new C7585F4y(c6202DxmA00, 28), c6202DxmA00, this, 6);
    }

    @Override // X.E76
    public final void onPlayerStateChanged(boolean z, int i) {
        C6202Dxm c6202DxmA00 = E0G.A00(this);
        A04(new C7585F4y(c6202DxmA00, 24), c6202DxmA00, this, -1);
    }

    @Override // X.E76
    public final void onPositionDiscontinuity(int i) {
    }

    @Override // X.E76
    public final void onRepeatModeChanged(int i) {
        C6202Dxm c6202DxmA00 = E0G.A00(this);
        A04(new C7585F4y(c6202DxmA00, 37), c6202DxmA00, this, 8);
    }

    @Override // X.E76
    public final void onSkipSilenceEnabledChanged(boolean z) {
        C6202Dxm c6202DxmA01 = A01(this);
        A04(new C7585F4y(c6202DxmA01, 21), c6202DxmA01, this, 23);
    }

    @Override // X.E76
    public final void onSurfaceSizeChanged(int i, int i2) {
        C6202Dxm c6202DxmA01 = A01(this);
        A04(new C7585F4y(c6202DxmA01, 41), c6202DxmA01, this, 24);
    }

    @Override // X.E76
    public final void onTracksChanged(C5735DoU c5735DoU) {
        C6202Dxm c6202DxmA00 = E0G.A00(this);
        A04(new F50(6, c5735DoU, c6202DxmA00), c6202DxmA00, this, 2);
    }

    @Override // X.Du7
    public final void onUpstreamDiscarded(int i, Dy6 dy6, C5893Dra c5893Dra) {
        C6202Dxm c6202DxmA03 = A03(dy6, i);
        A04(new F50(19, c5893Dra, c6202DxmA03), c6202DxmA03, this, 1005);
    }

    @Override // X.E65
    public final void onVideoCodecError(Exception exc) {
        C6202Dxm c6202DxmA01 = A01(this);
        A04(new F50(4, exc, c6202DxmA01), c6202DxmA01, this, 1030);
    }

    @Override // X.E65
    public final void onVideoEnabled(C6173DxG c6173DxG) {
        C6202Dxm c6202DxmA01 = A01(this);
        A04(new F50(16, c6173DxG, c6202DxmA01), c6202DxmA01, this, 1015);
    }

    @Override // X.E65
    public final void onVideoInputFormatChanged(C6154Dwx c6154Dwx, C2461Bbo c2461Bbo) {
        C6202Dxm c6202DxmA01 = A01(this);
        A04(new F51(c6154Dwx, c2461Bbo, c6202DxmA01, 2), c6202DxmA01, this, 1017);
    }

    @Override // X.E76
    public final void onVideoSizeChanged(C6232Dya c6232Dya) {
        C6202Dxm c6202DxmA01 = A01(this);
        A04(new F50(15, c6232Dya, c6202DxmA01), c6202DxmA01, this, 25);
    }

    @Override // X.E76
    public final void onVolumeChanged(float f) {
        C6202Dxm c6202DxmA01 = A01(this);
        A04(new C7585F4y(c6202DxmA01, 22), c6202DxmA01, this, 22);
    }

    @Override // X.E76
    public final void onEvents(Dn6 dn6, E7N e7n) {
    }

    @Override // X.E76
    public final void onCues(List<E0J> list) {
        C6202Dxm c6202DxmA00 = E0G.A00(this);
        A04(new F50(8, list, c6202DxmA00), c6202DxmA00, this, 27);
    }

    @Override // X.E76
    public final void onPositionDiscontinuity(final BYW byw, final BYW byw2, final int i) {
        if (i == 1) {
            this.A03 = false;
        }
        E0G e0g = this.A05;
        Dn6 dn6 = this.A01;
        dn6.getClass();
        ImmutableList<Dy6> immutableList = e0g.A03;
        Dy6 dy6A01 = E0G.A01(dn6, e0g.A05, e0g.A01, immutableList);
        e0g.A00 = dy6A01;
        final C6202Dxm c6202DxmA02 = A02(this, dy6A01);
        A04(new E7R() { // from class: X.E7x
            @Override // X.E7R
            public final void ANx(Object obj) {
                InterfaceC6481E7w interfaceC6481E7w = (InterfaceC6481E7w) obj;
                interfaceC6481E7w.AUo(byw, i);
            }
        }, c6202DxmA02, this, 11);
    }
}
