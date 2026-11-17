package X;

import android.content.Context;
import android.media.MediaFormat;
import android.os.Handler;
import androidx.media3.exoplayer.ExoPlaybackException;
import com.facebook.video.heroplayer.service.heroexoplayer2.HeroExoPlayer2EventListener;

/* renamed from: X.Dx0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6157Dx0 extends AbstractC6147Dwp implements InterfaceC5922Ds9 {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public long A05;
    public MediaFormat A06;
    public C6154Dwx A07;
    public E17 A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public long A0E;
    public Dy6 A0F;
    public boolean A0G;
    public final Dy9 A0H;
    public final C6259DzA A0I;
    public final InterfaceC6272DzP A0J;
    public final boolean A0K;
    public final boolean A0L;
    public final Context A0M;

    @Override // X.AbstractC6147Dwp, X.AbstractC6146Dwo
    public final void A0X() {
        this.A0F = null;
        this.A0D = false;
        try {
            try {
                this.A0J.flush();
                super.A0X();
                synchronized (((AbstractC6147Dwp) this).A0G) {
                }
                this.A0H.A00(((AbstractC6147Dwp) this).A0G);
            } catch (Throwable th) {
                super.A0X();
                synchronized (((AbstractC6147Dwp) this).A0G) {
                    this.A0H.A00(((AbstractC6147Dwp) this).A0G);
                    throw th;
                }
            }
        } catch (Throwable th2) {
            synchronized (((AbstractC6147Dwp) this).A0G) {
                this.A0H.A00(((AbstractC6147Dwp) this).A0G);
                throw th2;
            }
        }
    }

    public C6157Dx0(Context context, Handler handler, InterfaceC6239Dyh interfaceC6239Dyh, InterfaceC5460Div interfaceC5460Div, BVV bvv, C6175DxI c6175DxI, HeroExoPlayer2EventListener heroExoPlayer2EventListener, InterfaceC6272DzP interfaceC6272DzP, InterfaceC2356BVg interfaceC2356BVg, int i, boolean z, boolean z2, boolean z3) {
        super(interfaceC5460Div, bvv, c6175DxI, interfaceC2356BVg, 44100.0f, 1, 0, i, z, AbstractC5653Dmh.A03(EnumC5618Dlz.A0K), false);
        this.A01 = 0;
        this.A02 = 0;
        this.A05 = 0L;
        this.A0M = context.getApplicationContext();
        this.A0J = interfaceC6272DzP;
        this.A0K = z2;
        this.A0L = z3;
        this.A0H = new Dy9(handler, interfaceC6239Dyh);
        this.A04 = -9223372036854775807L;
        interfaceC6272DzP.Ade(new E10(this));
        this.A0I = new C6259DzA(handler, heroExoPlayer2EventListener);
    }

    public static void A00(C6157Dx0 c6157Dx0) {
        long jAEW = c6157Dx0.A0J.AEW(c6157Dx0.isEnded());
        if (jAEW != Long.MIN_VALUE) {
            if (!c6157Dx0.A09) {
                jAEW = Math.max(c6157Dx0.A0E, jAEW);
            }
            c6157Dx0.A0E = jAEW;
            c6157Dx0.A09 = false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001d  */
    @Override // X.AbstractC6146Dwo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0Z(X.Dy6 r7, X.C6154Dwx[] r8, long r9, long r11) {
        /*
            r6 = this;
            X.DxI r0 = r6.A0p
            boolean r0 = r0.A0d
            if (r0 == 0) goto L22
            X.Dy6 r2 = r6.A0F
            if (r2 == 0) goto L1d
            java.lang.Object r1 = r2.A04
            java.lang.Object r0 = r7.A04
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L1d
            long r4 = r2.A03
            long r2 = r7.A03
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            r0 = 1
            if (r1 != 0) goto L1e
        L1d:
            r0 = 0
        L1e:
            r6.A0D = r0
            r6.A0F = r7
        L22:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6157Dx0.A0Z(X.Dy6, X.Dwx[], long, long):void");
    }

    @Override // X.AbstractC6147Dwp
    public final void A0k(Di2 di2) {
        if (!this.A0G || AnonymousClass002.A1Q(((AbstractC5364DhG) di2).A00 & Integer.MIN_VALUE, Integer.MIN_VALUE)) {
            return;
        }
        long j = di2.A00;
        if (BV6.A0J(j, this.A0E) > 500000) {
            this.A0E = j;
        }
        this.A0G = false;
    }

    @Override // X.InterfaceC5922Ds9
    public final C6233Dyb AIo() {
        return this.A0J.AIo();
    }

    @Override // X.InterfaceC5922Ds9
    public final long AIv() {
        if (((AbstractC6146Dwo) this).A01 == 2) {
            A00(this);
        }
        return this.A0E;
    }

    @Override // X.InterfaceC5922Ds9
    public final /* synthetic */ boolean ANJ() {
        return false;
    }

    @Override // X.InterfaceC5922Ds9
    public final void Ae1(C6233Dyb c6233Dyb) {
        this.A0J.Ae1(c6233Dyb);
    }

    @Override // X.InterfaceC6068Dv6, X.InterfaceC5921Ds8
    public final String getName() {
        return "MediaCodecAudioRenderer";
    }

    @Override // X.InterfaceC6068Dv6
    public final boolean isEnded() {
        return this.A0X && this.A0J.isEnded();
    }

    @Override // X.AbstractC6147Dwp, X.InterfaceC6068Dv6
    public final boolean isReady() {
        return this.A0J.ANF() || super.isReady();
    }

    @Override // X.AbstractC6147Dwp, X.AbstractC6146Dwo
    public final void A0W() {
        try {
            super.A0W();
        } finally {
            this.A0J.reset();
        }
    }

    @Override // X.AbstractC6147Dwp, X.AbstractC6146Dwo
    public final void A0Y(long j, boolean z) {
        super.A0Y(j, z);
        boolean z2 = this.A0A;
        InterfaceC6272DzP interfaceC6272DzP = this.A0J;
        if (z2) {
            interfaceC6272DzP.ABC();
        } else {
            interfaceC6272DzP.flush();
        }
        this.A0E = j;
        this.A0G = true;
        this.A09 = true;
    }

    @Override // X.AbstractC6147Dwp, X.AbstractC6146Dwo
    public final void A0a(boolean z, boolean z2) {
        super.A0a(z, z2);
        Dy9 dy9 = this.A0H;
        C6173DxG c6173DxG = ((AbstractC6147Dwp) this).A0G;
        Handler handler = dy9.A00;
        if (handler != null) {
            handler.post(new RunnableC6238Dyg(c6173DxG, dy9));
        }
        C5951Dsl c5951Dsl = ((AbstractC6146Dwo) this).A08;
        c5951Dsl.getClass();
        boolean z3 = c5951Dsl.A00;
        InterfaceC6272DzP interfaceC6272DzP = this.A0J;
        if (z3) {
            interfaceC6272DzP.AA0();
        } else {
            interfaceC6272DzP.A92();
        }
        E6Y e6y = ((AbstractC6146Dwo) this).A09;
        e6y.getClass();
        interfaceC6272DzP.Ae6(e6y);
    }

    @Override // X.AbstractC6147Dwp
    public final void A0j(C6154Dwx c6154Dwx) throws ExoPlaybackException {
        super.A0j(c6154Dwx);
        this.A07 = c6154Dwx;
        Dy9 dy9 = this.A0H;
        C2461Bbo c2461Bbo = null;
        Handler handler = dy9.A00;
        if (handler != null) {
            handler.post(new DyU(c6154Dwx, c2461Bbo, dy9));
        }
    }
}
