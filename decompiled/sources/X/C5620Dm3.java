package X;

import android.os.SystemClock;
import androidx.media3.datasource.HttpDataSource$HttpDataSourceException;
import androidx.media3.exoplayer.ExoPlaybackException;
import com.facebook.video.heroplayer.setting.HeroPlayerSetting;
import exoplayer2.av1.src.Dav1dMediaCodecAdapterSetting;
import java.util.function.BooleanSupplier;

/* renamed from: X.Dm3, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5620Dm3 extends AbstractC6067Dv5 {
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public long A04;
    public Di2 A05;
    public ExoPlaybackException A06;
    public C5406Dhz A07;
    public InterfaceC6022DuF A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public DmR A0E;
    public final long A0F;
    public final InterfaceC5922Ds9 A0G;
    public final InterfaceC6068Dv6 A0H;
    public final C6175DxI A0I;
    public final InterfaceC5860Dqu A0J;
    public final C2354BVe A0K;
    public final C5506Dji A0L;
    public final C5750Dol A0M;
    public final HeroPlayerSetting A0N;
    public final Dav1dMediaCodecAdapterSetting A0O;
    public final boolean A0P;
    public final boolean A0Q;
    public final boolean A0R;
    public final boolean A0S;
    public final C5750Dol A0T;
    public final boolean A0U;
    public final boolean A0V;
    public final boolean A0W;
    public volatile DmR A0X;
    public volatile DmR A0Y;

    private void A00(DmR dmR) {
        if (dmR != this.A0E) {
            this.A0E = dmR;
            this.A01 = 1000;
            this.A00 = 0;
            this.A0A = false;
            this.A09 = false;
            this.A0D = false;
            this.A08 = null;
            this.A07 = null;
            this.A05 = null;
            this.A04 = -9223372036854775807L;
            this.A0C = false;
            this.A06 = null;
            this.A02 = 0L;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x000e A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean A02(int r4) {
        /*
            r3 = this;
            r0 = 4001(0xfa1, float:5.607E-42)
            r2 = 1
            r1 = 0
            if (r4 != r0) goto Lf
            boolean r0 = r3.A0P
            if (r0 == 0) goto L1a
            boolean r0 = r3.A0U
        Lc:
            if (r0 == 0) goto L1a
            return r2
        Lf:
            r0 = 4003(0xfa3, float:5.61E-42)
            if (r4 != r0) goto L1a
            boolean r0 = r3.A0Q
            if (r0 == 0) goto L1a
            boolean r0 = r3.A0V
            goto Lc
        L1a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5620Dm3.A02(int):boolean");
    }

    public static boolean A03(C5620Dm3 c5620Dm3) {
        return c5620Dm3.A02(c5620Dm3.A01) && c5620Dm3.A09 && c5620Dm3.A0A && !c5620Dm3.A0C;
    }

    public final void A04(DmR dmR) {
        InterfaceC6068Dv6 interfaceC6068Dv6 = this.A0H;
        if (interfaceC6068Dv6 instanceof C6150Dws) {
            C6150Dws c6150Dws = (C6150Dws) interfaceC6068Dv6;
            if (c6150Dws.A0o()) {
                this.A0Y = dmR;
                A01(dmR, c6150Dws);
            }
        }
        if (this.A0P || this.A0Q) {
            this.A0X = dmR;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0037  */
    @Override // X.AbstractC6067Dv5, X.InterfaceC6068Dv6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A9y(X.C5951Dsl r5, X.Dy6 r6, X.InterfaceC6022DuF r7, X.C6154Dwx[] r8, long r9, long r11, long r13, boolean r15, boolean r16) {
        /*
            r4 = this;
            r4.A03 = r13
            X.Dv6 r1 = r4.A0H
            boolean r0 = r1 instanceof X.C6150Dws
            if (r0 == 0) goto L15
            X.Dws r1 = (X.C6150Dws) r1
            boolean r0 = r1.A0o()
            if (r0 == 0) goto L15
            X.DmR r0 = r4.A0Y
            A01(r0, r1)
        L15:
            X.DmR r3 = r4.A0X
            r4.A00(r3)
            X.Dv6 r0 = r4.A00
            int r0 = r0.ALv()
            r2 = 0
            r1 = 1
            if (r0 != r1) goto L37
            int r0 = r4.A01
            boolean r0 = r4.A02(r0)
            if (r0 == 0) goto L37
            boolean r0 = r4.A09
            if (r0 == 0) goto L37
            boolean r0 = r4.A0A
            if (r0 != 0) goto L37
            r0 = 1
            if (r3 != 0) goto L38
        L37:
            r0 = 0
        L38:
            super.A9y(r5, r6, r7, r8, r9, r11, r13, r15, r16)
            if (r0 == 0) goto L5a
            r4.A0A = r1
            r4.A0D = r2
            r0 = 0
            r4.A08 = r0
            r4.A07 = r0
            r4.A05 = r0
            r4.A08 = r7
            r4.A0B = r2
            X.Dol r0 = r4.A0M
            r0.A03(r9)
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r4.A04 = r0
            r4.A0C = r2
        L5a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5620Dm3.A9y(X.Dsl, X.Dy6, X.DuF, X.Dwx[], long, long, long, boolean, boolean):void");
    }

    @Override // X.AbstractC6067Dv5, X.InterfaceC6068Dv6
    public final void AQT() throws HttpDataSource$HttpDataSourceException {
        if (!this.A0W) {
            super.AQT();
            return;
        }
        C5506Dji c5506Dji = this.A0L;
        if (!c5506Dji.A05) {
            super.AQT();
            return;
        }
        try {
            super.AQT();
            if (c5506Dji.A03) {
                c5506Dji.A00 = -9223372036854775807L;
            }
        } catch (HttpDataSource$HttpDataSourceException e) {
            if (e.getClass().equals(HttpDataSource$HttpDataSourceException.class)) {
                long j = c5506Dji.A02;
                if (j > 0) {
                    long j2 = c5506Dji.A00;
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    if (j2 == -9223372036854775807L) {
                        c5506Dji.A00 = jElapsedRealtime;
                        return;
                    } else if (jElapsedRealtime - j2 <= j) {
                        return;
                    }
                }
            }
            throw e;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00a2 A[PHI: r8
  0x00a2: PHI (r8v1 boolean) = (r8v0 boolean), (r8v3 boolean) binds: [B:39:0x009a, B:41:0x00a0] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.AbstractC6067Dv5, X.InterfaceC6068Dv6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Aaz(long r12, long r14) throws androidx.media3.exoplayer.ExoPlaybackException {
        /*
            Method dump skipped, instructions count: 404
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5620Dm3.Aaz(long, long):void");
    }

    @Override // X.AbstractC6067Dv5, X.InterfaceC6068Dv6
    public final void start() {
        C5750Dol c5750Dol = this.A0T;
        if (c5750Dol != null) {
            c5750Dol.A01();
        }
        if (A03(this)) {
            this.A0M.A01();
        }
        super.start();
    }

    @Override // X.AbstractC6067Dv5, X.InterfaceC6068Dv6
    public final void stop() {
        C5750Dol c5750Dol = this.A0T;
        if (c5750Dol != null) {
            c5750Dol.A02();
        }
        this.A0M.A02();
        super.stop();
    }

    public C5620Dm3(InterfaceC6068Dv6 interfaceC6068Dv6, C6175DxI c6175DxI, InterfaceC5860Dqu interfaceC5860Dqu, C2354BVe c2354BVe, C5506Dji c5506Dji, C5750Dol c5750Dol, HeroPlayerSetting heroPlayerSetting, Dav1dMediaCodecAdapterSetting dav1dMediaCodecAdapterSetting) {
        super(interfaceC6068Dv6);
        this.A03 = 0L;
        this.A01 = 1000;
        this.A0M = new C5750Dol();
        this.A0G = new C5786DpU(this);
        this.A04 = -9223372036854775807L;
        this.A0L = c5506Dji;
        this.A0T = c5750Dol;
        Dlv dlv = heroPlayerSetting.gen;
        this.A0W = dlv.enable_stream_error_handling_migration;
        this.A0S = dlv.enable_in_play_stall_negative_testing;
        this.A0R = dlv.enable_dynamic_scheduling_pwr_gate;
        this.A0P = dlv.enable_audio_codec_init_error_containment;
        this.A0Q = dlv.enable_audio_codec_runtime_error_containment;
        long j = dlv.audio_codec_error_containment_timeout_ms;
        this.A0F = j <= 0 ? 500L : j;
        this.A0U = dlv.enable_audio_codec_init_error_audio_restore_retry;
        this.A0V = dlv.enable_audio_codec_runtime_error_audio_restore_retry;
        this.A0H = interfaceC6068Dv6;
        if (interfaceC6068Dv6 instanceof C6150Dws) {
            C6150Dws c6150Dws = (C6150Dws) interfaceC6068Dv6;
            if (c6150Dws.A0o()) {
                Ds7 ds7 = c6150Dws.A1Z;
                this.A0Y = (DmR) (ds7 != null ? ds7.A00 : null);
            }
        }
        this.A0K = c2354BVe;
        this.A0N = heroPlayerSetting;
        this.A0J = interfaceC5860Dqu;
        this.A0I = c6175DxI;
        this.A0O = dav1dMediaCodecAdapterSetting;
    }

    public static void A01(final DmR dmR, C6150Dws c6150Dws) {
        final C4904DDx c4904DDx;
        Ds7 ds7;
        if (c6150Dws.A0o()) {
            final BXX bxx = null;
            if (dmR != null) {
                c4904DDx = dmR.A03;
                if (c4904DDx != null) {
                    bxx = c4904DDx.A0A;
                }
            } else {
                c4904DDx = null;
            }
            BooleanSupplier booleanSupplier = new BooleanSupplier() { // from class: X.BYV
                @Override // java.util.function.BooleanSupplier
                public final boolean getAsBoolean() {
                    DmR dmR2 = dmR;
                    C4904DDx c4904DDx2 = c4904DDx;
                    BXX bxx2 = bxx;
                    return dmR2 != null && c4904DDx2 != null && dmR2.A03 == c4904DDx2 && c4904DDx2.A0A == bxx2 && bxx2 == BXX.DASH_LIVE;
                }
            };
            synchronized (c6150Dws) {
                if (c6150Dws.A0o() && ((ds7 = c6150Dws.A1Z) == null || ds7.A00 != dmR || ds7.A01 != c4904DDx || ds7.A02 != bxx)) {
                    c6150Dws.A1Z = new Ds7(dmR, c4904DDx, bxx, booleanSupplier);
                }
            }
        }
    }

    @Override // X.AbstractC6067Dv5, X.InterfaceC6068Dv6
    public final void A90() {
        super.A90();
        if (this.A0P || this.A0Q) {
            this.A0M.A02();
            this.A0B = false;
            this.A0D = false;
            this.A08 = null;
            this.A07 = null;
            this.A05 = null;
            DmR dmR = this.A0E;
            if (this.A06 == null) {
                if (!this.A0A || this.A0C) {
                    return;
                }
                this.A09 = false;
                this.A0A = false;
                this.A04 = -9223372036854775807L;
                return;
            }
            this.A06 = null;
            this.A02 = 0L;
            if (this.A00 == 1 && A02(this.A01) && dmR != null) {
                this.A09 = true;
                this.A0A = false;
                this.A04 = -9223372036854775807L;
                this.A0C = false;
                Dlw dlw = (Dlw) this.A0J;
                Dlw.A0U(dlw.A0f, dlw, dmR, 72);
            }
        }
    }

    @Override // X.AbstractC6067Dv5, X.InterfaceC6068Dv6
    public final void AbP(long j) {
        super.AbP(j);
        if (A03(this)) {
            this.A0M.A03(j);
        }
    }
}
