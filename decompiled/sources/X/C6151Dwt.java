package X;

import android.content.Context;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.PlaybackStateEvent;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.util.Pair;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Util;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* renamed from: X.Dwt, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6151Dwt implements InterfaceC6481E7w, InterfaceC6257Dz0 {
    public int A00;
    public int A03;
    public int A04;
    public PlaybackMetrics.Builder A05;
    public C6154Dwx A06;
    public C6154Dwx A07;
    public C6154Dwx A08;
    public PlaybackException A09;
    public C6261DzC A0A;
    public C6261DzC A0B;
    public C6261DzC A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public int A0G;
    public int A0H;
    public String A0I;
    public final Context A0K;
    public final InterfaceC6235Dyd A0L;
    public final PlaybackSession A0N;
    public final Executor A0M = C5341Dgk.A00();
    public final C5998Dth A0P = new C5998Dth();
    public final E6B A0O = new E6B();
    public final HashMap<String, Long> A0Q = BV4.A0u();
    public final HashMap<String, Long> A0R = BV4.A0u();
    public final long A0J = SystemClock.elapsedRealtime();
    public int A02 = 0;
    public int A01 = 0;

    @Override // X.InterfaceC6481E7w
    public final void AUo(BYW byw, int i) {
        if (i == 1) {
            this.A0E = true;
        }
        this.A03 = i;
    }

    public static C6151Dwt A00(Context context) {
        MediaMetricsManager mediaMetricsManager = (MediaMetricsManager) context.getSystemService("media_metrics");
        if (mediaMetricsManager == null) {
            return null;
        }
        return new C6151Dwt(context, mediaMetricsManager.createPlaybackSession());
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A01() {
        /*
            r8 = this;
            android.media.metrics.PlaybackMetrics$Builder r1 = r8.A05
            r5 = 0
            if (r1 == 0) goto L61
            boolean r0 = r8.A0F
            if (r0 == 0) goto L61
            int r0 = r8.A00
            r1.setAudioUnderrunCount(r0)
            android.media.metrics.PlaybackMetrics$Builder r1 = r8.A05
            int r0 = r8.A0G
            r1.setVideoFramesDropped(r0)
            android.media.metrics.PlaybackMetrics$Builder r1 = r8.A05
            int r0 = r8.A0H
            r1.setVideoFramesPlayed(r0)
            java.util.HashMap<java.lang.String, java.lang.Long> r1 = r8.A0R
            java.lang.String r0 = r8.A0I
            java.lang.Number r0 = X.BV6.A0j(r0, r1)
            android.media.metrics.PlaybackMetrics$Builder r2 = r8.A05
            r6 = 0
            if (r0 != 0) goto L7a
            r0 = 0
        L2c:
            r2.setNetworkTransferDurationMillis(r0)
            java.util.HashMap<java.lang.String, java.lang.Long> r1 = r8.A0Q
            java.lang.String r0 = r8.A0I
            java.lang.Number r3 = X.BV6.A0j(r0, r1)
            android.media.metrics.PlaybackMetrics$Builder r2 = r8.A05
            if (r3 != 0) goto L75
            r0 = 0
        L3d:
            r2.setNetworkBytesRead(r0)
            android.media.metrics.PlaybackMetrics$Builder r4 = r8.A05
            if (r3 == 0) goto L4d
            long r2 = r3.longValue()
            int r1 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            r0 = 1
            if (r1 > 0) goto L4e
        L4d:
            r0 = 0
        L4e:
            r4.setStreamSource(r0)
            android.media.metrics.PlaybackMetrics$Builder r0 = r8.A05
            android.media.metrics.PlaybackMetrics r2 = r0.build()
            java.util.concurrent.Executor r1 = r8.A0M
            X.Dz2 r0 = new X.Dz2
            r0.<init>()
            r1.execute(r0)
        L61:
            r0 = 0
            r8.A05 = r0
            r8.A0I = r0
            r8.A00 = r5
            r8.A0G = r5
            r8.A0H = r5
            r8.A08 = r0
            r8.A06 = r0
            r8.A07 = r0
            r8.A0F = r5
            return
        L75:
            long r0 = r3.longValue()
            goto L3d
        L7a:
            long r0 = r0.longValue()
            goto L2c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6151Dwt.A01():void");
    }

    private void A02(C6154Dwx c6154Dwx, int i, int i2, long j) {
        TrackChangeEvent.Builder timeSinceCreatedMillis = new TrackChangeEvent.Builder(i).setTimeSinceCreatedMillis(j - this.A0J);
        if (c6154Dwx != null) {
            timeSinceCreatedMillis.setTrackState(1);
            timeSinceCreatedMillis.setTrackChangeReason(i2 != 1 ? i2 != 2 ? i2 != 3 ? 1 : 4 : 3 : 2);
            String str = c6154Dwx.A0X;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = c6154Dwx.A0b;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = c6154Dwx.A0W;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i3 = c6154Dwx.A05;
            if (i3 != -1) {
                timeSinceCreatedMillis.setBitrate(i3);
            }
            int i4 = c6154Dwx.A0Q;
            if (i4 != -1) {
                timeSinceCreatedMillis.setWidth(i4);
            }
            int i5 = c6154Dwx.A0D;
            if (i5 != -1) {
                timeSinceCreatedMillis.setHeight(i5);
            }
            int i6 = c6154Dwx.A06;
            if (i6 != -1) {
                timeSinceCreatedMillis.setChannelCount(i6);
            }
            int i7 = c6154Dwx.A0L;
            if (i7 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i7);
            }
            String str4 = c6154Dwx.A0a;
            if (str4 != null) {
                String[] strArrSplit = str4.split("-", -1);
                Pair pairCreate = Pair.create(strArrSplit[0], strArrSplit.length >= 2 ? strArrSplit[1] : null);
                timeSinceCreatedMillis.setLanguage((String) pairCreate.first);
                Object obj = pairCreate.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f = c6154Dwx.A01;
            if (f != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.A0F = true;
        final TrackChangeEvent trackChangeEventBuild = timeSinceCreatedMillis.build();
        this.A0M.execute(new Runnable() { // from class: X.Dz5
            public static final String __redex_internal_original_name = "MediaMetricsListener$$ExternalSyntheticLambda0";

            @Override // java.lang.Runnable
            public final void run() {
                this.A0A(trackChangeEventBuild);
            }
        });
    }

    private void A03(Timeline timeline, Dy6 dy6) {
        int iA06;
        int i;
        PlaybackMetrics.Builder builder = this.A05;
        if (dy6 == null || (iA06 = timeline.A06(dy6.A04)) == -1) {
            return;
        }
        E6B e6b = this.A0O;
        timeline.A0D(e6b, iA06, false);
        int i2 = e6b.A00;
        C5998Dth c5998Dth = this.A0P;
        timeline.A0E(c5998Dth, i2, 0L);
        C5568Dkm c5568Dkm = c5998Dth.A09.A03;
        if (c5568Dkm == null) {
            i = 0;
        } else {
            int iA03 = Util.A03(c5568Dkm.A01, c5568Dkm.A06);
            i = 3;
            if (iA03 != 0) {
                i = 1;
                if (iA03 == 1) {
                    i = 5;
                } else if (iA03 == 2) {
                    i = 4;
                }
            }
        }
        builder.setStreamType(i);
        long j = c5998Dth.A03;
        if (j != -9223372036854775807L && !c5998Dth.A0E && !c5998Dth.A0D && c5998Dth.A08 == null) {
            builder.setMediaDurationMillis(Util.A0B(j));
        }
        builder.setPlaybackType(AnonymousClass002.A1X(c5998Dth.A08) ? 2 : 1);
        this.A0F = true;
    }

    private boolean A04(C6261DzC c6261DzC) {
        String str;
        if (c6261DzC != null) {
            String str2 = c6261DzC.A02;
            C6199Dxj c6199Dxj = (C6199Dxj) this.A0L;
            synchronized (c6199Dxj) {
                str = c6199Dxj.A03;
            }
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public final LogSessionId A05() {
        return this.A0N.getSessionId();
    }

    public final /* synthetic */ void A06(NetworkEvent networkEvent) {
        this.A0N.reportNetworkEvent(networkEvent);
    }

    public final /* synthetic */ void A07(PlaybackErrorEvent playbackErrorEvent) {
        this.A0N.reportPlaybackErrorEvent(playbackErrorEvent);
    }

    public final /* synthetic */ void A08(PlaybackMetrics playbackMetrics) {
        this.A0N.reportPlaybackMetrics(playbackMetrics);
    }

    public final /* synthetic */ void A09(PlaybackStateEvent playbackStateEvent) {
        this.A0N.reportPlaybackStateEvent(playbackStateEvent);
    }

    public final /* synthetic */ void A0A(TrackChangeEvent trackChangeEvent) {
        this.A0N.reportTrackChangeEvent(trackChangeEvent);
    }

    @Override // X.InterfaceC6481E7w
    public final void ARw(C6202Dxm c6202Dxm, int i, long j) {
        String str;
        Dy6 dy6 = c6202Dxm.A09;
        if (dy6 != null) {
            InterfaceC6235Dyd interfaceC6235Dyd = this.A0L;
            Timeline timeline = c6202Dxm.A07;
            C6199Dxj c6199Dxj = (C6199Dxj) interfaceC6235Dyd;
            synchronized (c6199Dxj) {
                str = C6199Dxj.A00(c6199Dxj, dy6, E6B.A01(c6199Dxj.A04, timeline, dy6.A04)).A05;
            }
            HashMap<String, Long> map = this.A0Q;
            Number numberA0j = BV6.A0j(str, map);
            HashMap<String, Long> map2 = this.A0R;
            Number numberA0j2 = BV6.A0j(str, map2);
            BV4.A1F(str, map, (numberA0j == null ? 0L : numberA0j.longValue()) + j);
            BV4.A1F(str, map2, (numberA0j2 != null ? numberA0j2.longValue() : 0L) + i);
        }
    }

    @Override // X.InterfaceC6481E7w
    public final void ASb(C6202Dxm c6202Dxm, C5893Dra c5893Dra) {
        String str;
        Dy6 dy6 = c6202Dxm.A09;
        if (dy6 != null) {
            C6154Dwx c6154Dwx = c5893Dra.A05;
            c6154Dwx.getClass();
            int i = c5893Dra.A01;
            InterfaceC6235Dyd interfaceC6235Dyd = this.A0L;
            Timeline timeline = c6202Dxm.A07;
            C6199Dxj c6199Dxj = (C6199Dxj) interfaceC6235Dyd;
            synchronized (c6199Dxj) {
                str = C6199Dxj.A00(c6199Dxj, dy6, E6B.A01(c6199Dxj.A04, timeline, dy6.A04)).A05;
            }
            C6261DzC c6261DzC = new C6261DzC(c6154Dwx, str, i);
            int i2 = c5893Dra.A02;
            if (i2 != 0) {
                if (i2 == 1) {
                    this.A0A = c6261DzC;
                    return;
                } else if (i2 != 2) {
                    if (i2 == 3) {
                        this.A0B = c6261DzC;
                        return;
                    }
                    return;
                }
            }
            this.A0C = c6261DzC;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02c6 A[PHI: r6
  0x02c6: PHI (r6v4 int) = (r6v3 int), (r6v2 int), (r6v2 int), (r6v2 int) binds: [B:148:0x02c1, B:133:0x0292, B:134:0x0294, B:135:0x0296] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0453  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01be  */
    @Override // X.InterfaceC6481E7w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void AT8(X.Dn6 r17, X.C6197Dxh r18) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 1192
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6151Dwt.AT8(X.Dn6, X.Dxh):void");
    }

    @Override // X.InterfaceC6481E7w
    public final void ATw(C5893Dra c5893Dra, IOException iOException) {
        this.A04 = c5893Dra.A00;
    }

    @Override // X.InterfaceC6257Dz0
    public final void AVl(C6202Dxm c6202Dxm, String str) {
        Dy6 dy6 = c6202Dxm.A09;
        if (dy6 == null || !AnonymousClass002.A1P(dy6.A00, -1)) {
            A01();
            this.A0I = str;
            this.A05 = new PlaybackMetrics.Builder().setPlayerName("ExoPlayer").setPlayerVersion("2.8.1");
            A03(c6202Dxm.A07, dy6);
        }
    }

    @Override // X.InterfaceC6257Dz0
    public final void AVo(C6202Dxm c6202Dxm, String str, boolean z) {
        Dy6 dy6 = c6202Dxm.A09;
        if ((dy6 == null || !AnonymousClass002.A1P(dy6.A00, -1)) && str.equals(this.A0I)) {
            A01();
        }
        this.A0R.remove(str);
        this.A0Q.remove(str);
    }

    @Override // X.InterfaceC6481E7w
    public final void AX7(C6173DxG c6173DxG) {
        this.A0G += c6173DxG.A04;
        this.A0H += c6173DxG.A0C;
    }

    @Override // X.InterfaceC6481E7w
    public final void AXH(C6232Dya c6232Dya) {
        C6261DzC c6261DzC = this.A0C;
        if (c6261DzC != null) {
            C6154Dwx c6154Dwx = c6261DzC.A01;
            if (c6154Dwx.A0D == -1) {
                C6162Dx5 c6162Dx5A01 = C6162Dx5.A01(c6154Dwx);
                c6162Dx5A01.A0O = c6232Dya.A02;
                c6162Dx5A01.A0B = c6232Dya.A01;
                this.A0C = new C6261DzC(BV6.A0U(c6162Dx5A01), c6261DzC.A02, c6261DzC.A00);
            }
        }
    }

    public C6151Dwt(Context context, PlaybackSession playbackSession) {
        this.A0K = context.getApplicationContext();
        this.A0N = playbackSession;
        C6199Dxj c6199Dxj = new C6199Dxj();
        this.A0L = c6199Dxj;
        c6199Dxj.A02 = this;
    }

    @Override // X.InterfaceC6257Dz0
    public final void ARh(String str) {
    }

    @Override // X.InterfaceC6481E7w
    public final /* synthetic */ void ASn(Exception exc) {
    }

    @Override // X.InterfaceC6481E7w
    public final /* synthetic */ void ASr(int i) {
    }

    @Override // X.InterfaceC6481E7w
    public final void AUi(PlaybackException playbackException) {
        this.A09 = playbackException;
    }

    @Override // X.InterfaceC6481E7w
    public final /* synthetic */ void AVJ(int i, boolean z) {
    }

    @Override // X.InterfaceC6257Dz0
    public final void AVm(C6202Dxm c6202Dxm, String str) {
    }
}
