package X;

import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.ExoPlaybackException;
import com.facebook.aura.devices.pairing.LinkEncryptedPairingKt;

/* renamed from: X.Dwo, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC6146Dwo implements InterfaceC6068Dv6, InterfaceC5921Ds8 {
    public int A00;
    public int A01;
    public long A02;
    public long A04;
    public E7C A06;
    public DwA A07;
    public C5951Dsl A08;
    public E6Y A09;
    public InterfaceC6022DuF A0A;
    public boolean A0B;
    public C6154Dwx[] A0C;
    public Dy6 A0D;
    public boolean A0E;
    public final int A0F;
    public final Object A0H = C3cG.A0T();
    public final C5406Dhz A0G = new C5406Dhz();
    public long A03 = Long.MIN_VALUE;
    public Timeline A05 = Timeline.A00;
    public final boolean A0I = AbstractC5653Dmh.A03(EnumC5618Dlz.A0U);

    public static ExoPlaybackException A02(C6154Dwx c6154Dwx, AbstractC6146Dwo abstractC6146Dwo, Throwable th, int i) {
        return abstractC6146Dwo.A0U(c6154Dwx, th, i, false);
    }

    public final ExoPlaybackException A0U(C6154Dwx c6154Dwx, Throwable th, int i, boolean z) {
        int iAgf;
        if (c6154Dwx == null || this.A0E) {
            iAgf = 4;
        } else {
            this.A0E = true;
            try {
                iAgf = Agf(c6154Dwx) & 7;
            } catch (ExoPlaybackException unused) {
            } finally {
                this.A0E = false;
            }
        }
        String name = getName();
        int i2 = this.A00;
        Dy6 dy6 = this.A0D;
        if (c6154Dwx == null) {
            iAgf = 4;
        }
        StringBuilder sbA0g = C3cG.A0g(name);
        sbA0g.append(" error, index=");
        sbA0g.append(i2);
        sbA0g.append(", format=");
        sbA0g.append(c6154Dwx);
        sbA0g.append(", format_supported=");
        String strA0v = AnonymousClass001.A0v(Util.A0H(iAgf), sbA0g);
        if (!TextUtils.isEmpty(null)) {
            strA0v = FGI.A0U(strA0v, ": ", null);
        }
        return new ExoPlaybackException(c6154Dwx, dy6, strA0v, name, th, i, 1, i2, iAgf, SystemClock.elapsedRealtime(), z);
    }

    public void A0W() {
    }

    public abstract void A0X();

    public abstract void A0Y(long j, boolean z);

    public abstract void A0Z(Dy6 dy6, C6154Dwx[] c6154DwxArr, long j, long j2);

    @Override // X.InterfaceC6068Dv6
    public final void A9y(C5951Dsl c5951Dsl, Dy6 dy6, InterfaceC6022DuF interfaceC6022DuF, C6154Dwx[] c6154DwxArr, long j, long j2, long j3, boolean z, boolean z2) {
        C1G.A08(AnonymousClass002.A1M(this.A01));
        this.A08 = c5951Dsl;
        this.A0D = dy6;
        this.A01 = 1;
        A0a(z, z2);
        Ab0(dy6, interfaceC6022DuF, c6154DwxArr, j2, j3);
        boolean z3 = this.A0I;
        this.A0B = false;
        if (z3) {
            this.A02 = j2;
            this.A03 = j2;
            A0Y(j2, z);
        } else {
            this.A02 = j;
            this.A03 = j;
            A0Y(j, z);
        }
    }

    @Override // X.InterfaceC6068Dv6
    public final InterfaceC5921Ds8 ADR() {
        return this;
    }

    @Override // X.InterfaceC6068Dv6
    public final void Ab0(Dy6 dy6, InterfaceC6022DuF interfaceC6022DuF, C6154Dwx[] c6154DwxArr, long j, long j2) {
        C1G.A08(!this.A0B);
        this.A0A = interfaceC6022DuF;
        this.A0D = dy6;
        if (this.A03 == Long.MIN_VALUE) {
            this.A03 = j;
        }
        this.A0C = c6154DwxArr;
        this.A04 = j2;
        A0Z(dy6, c6154DwxArr, j, j2);
    }

    @Override // X.InterfaceC6068Dv6
    public final void AbP(long j) {
        this.A0B = false;
        this.A02 = j;
        this.A03 = j;
        A0Y(j, false);
    }

    @Override // X.InterfaceC6068Dv6
    public final void AdF() {
        this.A0B = true;
    }

    public static int A01(AbstractC6146Dwo abstractC6146Dwo, long j) {
        InterfaceC6022DuF interfaceC6022DuF = abstractC6146Dwo.A0A;
        interfaceC6022DuF.getClass();
        return interfaceC6022DuF.Afl(j - abstractC6146Dwo.A04);
    }

    public final int A0T(Di2 di2, C5406Dhz c5406Dhz, int i) {
        InterfaceC6022DuF interfaceC6022DuF = this.A0A;
        interfaceC6022DuF.getClass();
        int iAZE = interfaceC6022DuF.AZE(di2, c5406Dhz, i);
        if (iAZE == -4) {
            if (AbstractC5364DhG.A00(di2)) {
                this.A03 = Long.MIN_VALUE;
                return this.A0B ? -4 : -3;
            }
            long j = di2.A00 + this.A04;
            di2.A00 = j;
            this.A03 = Math.max(this.A03, j);
        } else if (iAZE == -5) {
            C6154Dwx c6154Dwx = c5406Dhz.A00;
            c6154Dwx.getClass();
            long j2 = c6154Dwx.A0R;
            if (j2 != LinkEncryptedPairingKt.LINK_COUNTER_MAX) {
                C6162Dx5 c6162Dx5A01 = C6162Dx5.A01(c6154Dwx);
                c6162Dx5A01.A0P = j2 + this.A04;
                c5406Dhz.A00 = BV6.A0U(c6162Dx5A01);
                return iAZE;
            }
        }
        return iAZE;
    }

    @Override // X.InterfaceC6068Dv6
    public final void A90() {
        C1G.A08(BV7.A1Q(this.A01));
        C5406Dhz c5406Dhz = this.A0G;
        c5406Dhz.A01 = null;
        c5406Dhz.A00 = null;
        this.A01 = 0;
        this.A0A = null;
        this.A0C = null;
        this.A0B = false;
        A0X();
        this.A0D = null;
    }

    @Override // X.InterfaceC6068Dv6
    public final /* synthetic */ long AEx(long j, long j2) {
        boolean zIsEnded;
        if (this instanceof C6157Dx0) {
            C6157Dx0 c6157Dx0 = (C6157Dx0) this;
            boolean zA1L = AnonymousClass002.A1L((c6157Dx0.A04 > (-9223372036854775807L) ? 1 : (c6157Dx0.A04 == (-9223372036854775807L) ? 0 : -1)));
            if (c6157Dx0.A0B) {
                InterfaceC6272DzP interfaceC6272DzP = c6157Dx0.A0J;
                long jACb = interfaceC6272DzP.ACb();
                if (!zA1L || jACb == -9223372036854775807L) {
                    return 10000L;
                }
                long jMin = (long) ((Math.min(jACb, c6157Dx0.A04 - j) / (interfaceC6272DzP.AIo() != null ? interfaceC6272DzP.AIo().A01 : 1.0f)) / 2.0f);
                ((AbstractC6146Dwo) c6157Dx0).A06.getClass();
                return Math.max(10000L, jMin - (BV7.A0R() - j2));
            }
            if (zA1L) {
                return 1000000L;
            }
            zIsEnded = c6157Dx0.isEnded();
        } else {
            if (this.A01 != 1) {
                return 10000L;
            }
            if (isReady()) {
                return 1000000L;
            }
            zIsEnded = isEnded();
        }
        return zIsEnded ? 1000000L : 10000L;
    }

    @Override // X.InterfaceC6068Dv6
    public final InterfaceC5922Ds9 AHZ() {
        if (this instanceof C6157Dx0) {
            return (C6157Dx0) this;
        }
        if (this instanceof C6156Dwz) {
            return (C6156Dwz) this;
        }
        return null;
    }

    @Override // X.InterfaceC6068Dv6
    public final long AJR() {
        return this.A03;
    }

    @Override // X.InterfaceC6068Dv6
    public final int AL0() {
        return this.A01;
    }

    @Override // X.InterfaceC6068Dv6
    public final InterfaceC6022DuF AL9() {
        return this.A0A;
    }

    @Override // X.InterfaceC6068Dv6
    public final int ALv() {
        return this.A0F;
    }

    /* JADX WARN: Code restructure failed: missing block: B:286:0x03a1, code lost:
    
        if (r4 == 2) goto L287;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x03b9 A[PHI: r15
  0x03b9: PHI (r15v11 android.view.Surface) = (r15v9 android.view.Surface), (r15v8 android.view.Surface), (r15v8 android.view.Surface), (r15v8 android.view.Surface) binds: [B:289:0x03a9, B:292:0x03ad, B:263:0x034a, B:282:0x0397] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:295:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x04a1 A[PHI: r15
  0x04a1: PHI (r15v33 android.view.Surface) = 
  (r15v30 android.view.Surface)
  (r15v30 android.view.Surface)
  (r15v30 android.view.Surface)
  (r15v34 android.view.Surface)
 binds: [B:60:0x00c7, B:48:0x009c, B:61:0x00d5, B:368:0x049f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:371:0x04a5  */
    /* JADX WARN: Removed duplicated region for block: B:419:? A[RETURN, SYNTHETIC] */
    @Override // X.Dv4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void AN4(int r14, java.lang.Object r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC6146Dwo.AN4(int, java.lang.Object):void");
    }

    @Override // X.InterfaceC6068Dv6
    public final boolean ANH() {
        return AnonymousClass002.A1M((this.A03 > Long.MIN_VALUE ? 1 : (this.A03 == Long.MIN_VALUE ? 0 : -1)));
    }

    @Override // X.InterfaceC6068Dv6
    public final void ANc(E7C e7c, E6Y e6y, int i) {
        this.A00 = i;
        this.A09 = e6y;
        this.A06 = e7c;
    }

    @Override // X.InterfaceC6068Dv6
    public final boolean AOI() {
        return this.A0B;
    }

    @Override // X.InterfaceC6068Dv6
    public final void AQT() {
        InterfaceC6022DuF interfaceC6022DuF = this.A0A;
        interfaceC6022DuF.getClass();
        interfaceC6022DuF.AQQ();
    }

    @Override // X.InterfaceC6068Dv6
    public final void Af0(Timeline timeline) {
        if (C6xC.A00(this.A05, timeline)) {
            return;
        }
        this.A05 = timeline;
    }

    @Override // X.InterfaceC6068Dv6
    public final void release() {
        C1G.A08(AnonymousClass002.A1M(this.A01));
    }

    @Override // X.InterfaceC6068Dv6
    public final void reset() {
        C1G.A08(AnonymousClass002.A1M(this.A01));
        C5406Dhz c5406Dhz = this.A0G;
        c5406Dhz.A01 = null;
        c5406Dhz.A00 = null;
        A0W();
    }

    @Override // X.InterfaceC6068Dv6
    public final void start() {
        C1G.A08(BV7.A1Q(this.A01));
        this.A01 = 2;
        if (!(this instanceof C6150Dws)) {
            if (this instanceof C6157Dx0) {
                C6157Dx0 c6157Dx0 = (C6157Dx0) this;
                c6157Dx0.A0J.play();
                c6157Dx0.A0B = true;
                return;
            }
            if (!(this instanceof C6149Dwr)) {
                if (this instanceof C6156Dwz) {
                    ((C6156Dwz) this).A0G.play();
                    return;
                }
                return;
            }
            C6149Dwr c6149Dwr = (C6149Dwr) this;
            c6149Dwr.A01 = 0;
            c6149Dwr.A02 = 0;
            c6149Dwr.A03 = 0;
            c6149Dwr.A07 = SystemClock.elapsedRealtime();
            c6149Dwr.A0D = BV8.A0F();
            c6149Dwr.A0F = 0L;
            c6149Dwr.A06 = 0;
            if (c6149Dwr.A0r || c6149Dwr.A0q) {
                c6149Dwr.A0o.A04();
                return;
            }
            return;
        }
        C6150Dws c6150Dws = (C6150Dws) this;
        c6150Dws.A07 = 0;
        c6150Dws.A08 = 0;
        c6150Dws.A09 = 0;
        c6150Dws.A0G = SystemClock.elapsedRealtime();
        c6150Dws.A0K = BV8.A0F();
        if (c6150Dws.A1G || c6150Dws.A1F) {
            c6150Dws.A18.A04();
        }
        C6192Dxc c6192Dxc = c6150Dws.A13;
        if (c6192Dxc != null) {
            c6192Dxc.A08 = true;
            c6192Dxc.A05 = BV7.A0R();
            C6169DxC c6169DxC = c6192Dxc.A0C;
            c6169DxC.A0B = true;
            c6169DxC.A03 = 0L;
            c6169DxC.A04 = -1L;
            c6169DxC.A06 = -1L;
            Dy0 dy0 = c6169DxC.A0E;
            if (dy0 != null) {
                ChoreographerFrameCallbackC6183DxR choreographerFrameCallbackC6183DxR = c6169DxC.A0F;
                choreographerFrameCallbackC6183DxR.getClass();
                choreographerFrameCallbackC6183DxR.A02.sendEmptyMessage(2);
                DisplayManager displayManager = dy0.A00;
                displayManager.registerDisplayListener(dy0, C1G.A02(null));
                C6169DxC.A00(displayManager.getDisplay(0), dy0.A01);
            }
            C6169DxC.A02(c6169DxC, false);
        }
    }

    @Override // X.InterfaceC6068Dv6
    public final void stop() {
        InterfaceC6272DzP interfaceC6272DzP;
        C1G.A08(AnonymousClass002.A1Q(this.A01, 2));
        this.A01 = 1;
        if (this instanceof C6150Dws) {
            C6150Dws c6150Dws = (C6150Dws) this;
            c6150Dws.A0J = -9223372036854775807L;
            C6150Dws.A0L(c6150Dws);
            C6150Dws.A0K(c6150Dws);
            if (c6150Dws.A1G || c6150Dws.A1F) {
                C6171DxE c6171DxE = c6150Dws.A18;
                c6171DxE.A09 = false;
                InterfaceC6274DzR interfaceC6274DzR = c6171DxE.A0F;
                if (interfaceC6274DzR != null) {
                    interfaceC6274DzR.Ahh();
                    ChoreographerFrameCallbackC6184DxS choreographerFrameCallbackC6184DxS = c6171DxE.A0G;
                    choreographerFrameCallbackC6184DxS.getClass();
                    choreographerFrameCallbackC6184DxS.A02.sendEmptyMessage(2);
                }
                C6171DxE.A02(c6171DxE);
            }
            C6192Dxc c6192Dxc = c6150Dws.A13;
            if (c6192Dxc != null) {
                c6192Dxc.A08 = false;
                c6192Dxc.A03 = -9223372036854775807L;
                c6192Dxc.A0C.A03();
                return;
            }
            return;
        }
        if (this instanceof C6157Dx0) {
            C6157Dx0 c6157Dx0 = (C6157Dx0) this;
            C6157Dx0.A00(c6157Dx0);
            c6157Dx0.A0B = false;
            interfaceC6272DzP = c6157Dx0.A0J;
        } else {
            if (this instanceof C6149Dwr) {
                C6149Dwr c6149Dwr = (C6149Dwr) this;
                c6149Dwr.A0A = -9223372036854775807L;
                C6149Dwr.A0C(c6149Dwr);
                C6149Dwr.A0B(c6149Dwr);
                final int i = c6149Dwr.A06;
                if (i != 0) {
                    final C6205Dxp c6205Dxp = c6149Dwr.A0m;
                    final long j = c6149Dwr.A0F;
                    Handler handler = c6205Dxp.A00;
                    if (handler != null) {
                        handler.post(new Runnable() { // from class: X.Dyp
                            public static final String __redex_internal_original_name = "VideoRendererEventListener$EventDispatcher$$ExternalSyntheticLambda4";

                            @Override // java.lang.Runnable
                            public final void run() {
                                C6205Dxp c6205Dxp2 = c6205Dxp;
                                c6205Dxp2.A01.onVideoFrameProcessingOffset(j, i);
                            }
                        });
                    }
                    c6149Dwr.A0F = 0L;
                    c6149Dwr.A06 = 0;
                }
                if (c6149Dwr.A0r || c6149Dwr.A0q) {
                    C6171DxE c6171DxE2 = c6149Dwr.A0o;
                    c6171DxE2.A09 = false;
                    InterfaceC6274DzR interfaceC6274DzR2 = c6171DxE2.A0F;
                    if (interfaceC6274DzR2 != null) {
                        interfaceC6274DzR2.Ahh();
                        ChoreographerFrameCallbackC6184DxS choreographerFrameCallbackC6184DxS2 = c6171DxE2.A0G;
                        choreographerFrameCallbackC6184DxS2.getClass();
                        choreographerFrameCallbackC6184DxS2.A02.sendEmptyMessage(2);
                    }
                    C6171DxE.A02(c6171DxE2);
                    return;
                }
                return;
            }
            if (!(this instanceof C6156Dwz)) {
                return;
            }
            C6156Dwz c6156Dwz = (C6156Dwz) this;
            C6156Dwz.A03(c6156Dwz);
            interfaceC6272DzP = c6156Dwz.A0G;
        }
        interfaceC6272DzP.pause();
    }

    public AbstractC6146Dwo(int i) {
        this.A0F = i;
    }

    public final boolean A0V() {
        if (ANH()) {
            return this.A0B;
        }
        InterfaceC6022DuF interfaceC6022DuF = this.A0A;
        interfaceC6022DuF.getClass();
        return interfaceC6022DuF.isReady();
    }

    public void A0a(boolean z, boolean z2) {
    }

    @Override // X.InterfaceC6068Dv6
    public /* synthetic */ void Ae2(float f, float f2) {
    }
}
