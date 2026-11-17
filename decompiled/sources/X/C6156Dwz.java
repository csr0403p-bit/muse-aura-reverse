package X;

import android.content.Context;
import android.media.MediaCryptoException;
import android.os.Handler;
import androidx.media3.exoplayer.ExoPlaybackException;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;

/* renamed from: X.Dwz, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6156Dwz extends AbstractC6148Dwq implements InterfaceC5922Ds9 {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public C6154Dwx A05;
    public C6154Dwx A06;
    public E17 A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public long A0B;
    public boolean A0C;
    public boolean A0D;
    public final Dy9 A0E;
    public final C6259DzA A0F;
    public final InterfaceC6272DzP A0G;
    public final boolean A0H;
    public final boolean A0I;
    public final Context A0J;

    public C6156Dwz(Context context, Handler handler, InterfaceC6239Dyh interfaceC6239Dyh, BVV bvv, C6175DxI c6175DxI, InterfaceC6272DzP interfaceC6272DzP, BWK bwk, InterfaceC2356BVg interfaceC2356BVg, int i, boolean z, boolean z2, boolean z3) {
        super(bvv, c6175DxI, null, bwk, interfaceC2356BVg, 44100.0f, 1, 0, i, false, z3);
        this.A01 = 0;
        this.A02 = 0;
        this.A04 = 0L;
        this.A0J = context.getApplicationContext();
        this.A0G = interfaceC6272DzP;
        this.A0H = z;
        this.A0I = z2;
        this.A0A = AbstractC5653Dmh.A03(EnumC5618Dlz.A2A);
        this.A0E = new Dy9(handler, interfaceC6239Dyh);
        interfaceC6272DzP.Ade(new E11(this));
        this.A0F = new C6259DzA(handler, null);
    }

    @Override // X.AbstractC6148Dwq, X.AbstractC6146Dwo
    public final void A0W() {
        try {
            super.A0W();
        } finally {
            if (this.A0D) {
                this.A0D = false;
                this.A0G.reset();
            }
        }
    }

    @Override // X.AbstractC6148Dwq, X.AbstractC6146Dwo
    public final void A0X() {
        this.A0D = true;
        this.A06 = null;
        try {
            this.A0G.flush();
            super.A0X();
        } catch (Throwable th) {
            super.A0X();
            throw th;
        } finally {
            this.A0E.A00(((AbstractC6148Dwq) this).A0E);
        }
    }

    /* JADX WARN: Incorrect types in method signature: (LX/BVg;LX/Dwx;ZLX/DxF;)Ljava/util/List<LX/Dwv;>; */
    public static ImmutableList A00(C6154Dwx c6154Dwx, InterfaceC6172DxF interfaceC6172DxF, InterfaceC2356BVg interfaceC2356BVg, boolean z) {
        C6153Dwv c6153DwvA05;
        String str = c6154Dwx.A0b;
        if (str == null) {
            return ImmutableList.of();
        }
        if (interfaceC6172DxF.Agg(c6154Dwx) && (c6153DwvA05 = C6155Dwy.A05("audio/raw")) != null) {
            return ImmutableList.of(c6153DwvA05);
        }
        List<C6153Dwv> listAEg = interfaceC2356BVg.AEg(str, z, false);
        String strA03 = C6155Dwy.A03(c6154Dwx);
        if (strA03 == null) {
            return ImmutableList.copyOf((Collection) listAEg);
        }
        List<C6153Dwv> listAEg2 = interfaceC2356BVg.AEg(strA03, z, false);
        ImmutableList.Builder builder = ImmutableList.builder();
        builder.addAll(listAEg);
        builder.addAll(listAEg2);
        return builder.build();
    }

    public static void A03(C6156Dwz c6156Dwz) {
        long jAEW = c6156Dwz.A0G.AEW(c6156Dwz.isEnded());
        if (jAEW != Long.MIN_VALUE) {
            if (!c6156Dwz.A08) {
                jAEW = Math.max(c6156Dwz.A0B, jAEW);
            }
            c6156Dwz.A0B = jAEW;
            c6156Dwz.A08 = false;
        }
    }

    @Override // X.AbstractC6148Dwq
    public final C2461Bbo A0c(C5406Dhz c5406Dhz) throws MediaCryptoException, ExoPlaybackException {
        C6154Dwx c6154Dwx = c5406Dhz.A00;
        c6154Dwx.getClass();
        this.A06 = c6154Dwx;
        C2461Bbo c2461BboA0c = super.A0c(c5406Dhz);
        Dy9 dy9 = this.A0E;
        C6154Dwx c6154Dwx2 = this.A06;
        Handler handler = dy9.A00;
        if (handler != null) {
            handler.post(new DyU(c6154Dwx2, c2461BboA0c, dy9));
        }
        return c2461BboA0c;
    }

    @Override // X.AbstractC6148Dwq
    public final void A0l(Di2 di2) {
        if (!this.A0C || AnonymousClass002.A1Q(((AbstractC5364DhG) di2).A00 & Integer.MIN_VALUE, Integer.MIN_VALUE)) {
            return;
        }
        long j = di2.A00;
        if (BV6.A0J(j, this.A0B) > 500000) {
            this.A0B = j;
        }
        this.A0C = false;
    }

    @Override // X.InterfaceC5922Ds9
    public final C6233Dyb AIo() {
        return this.A0G.AIo();
    }

    @Override // X.InterfaceC5922Ds9
    public final long AIv() {
        if (((AbstractC6146Dwo) this).A01 == 2) {
            A03(this);
        }
        return this.A0B;
    }

    @Override // X.InterfaceC5922Ds9
    public final /* synthetic */ boolean ANJ() {
        return false;
    }

    @Override // X.InterfaceC5922Ds9
    public final void Ae1(C6233Dyb c6233Dyb) {
        this.A0G.Ae1(c6233Dyb);
    }

    @Override // X.InterfaceC6068Dv6, X.InterfaceC5921Ds8
    public final String getName() {
        return "MediaCodecAudioRenderer2";
    }

    @Override // X.InterfaceC6068Dv6
    public final boolean isEnded() {
        return this.A0b && this.A0G.isEnded();
    }

    @Override // X.AbstractC6148Dwq, X.InterfaceC6068Dv6
    public final boolean isReady() {
        return this.A0G.ANF() || super.isReady();
    }

    @Override // X.AbstractC6148Dwq, X.AbstractC6146Dwo
    public final void A0Y(long j, boolean z) {
        super.A0Y(j, z);
        boolean z2 = this.A09;
        InterfaceC6272DzP interfaceC6272DzP = this.A0G;
        if (z2) {
            interfaceC6272DzP.ABC();
        } else {
            interfaceC6272DzP.flush();
        }
        this.A0B = j;
        this.A0C = true;
        this.A08 = true;
    }

    @Override // X.AbstractC6148Dwq, X.AbstractC6146Dwo
    public final void A0a(boolean z, boolean z2) {
        super.A0a(z, z2);
        Dy9 dy9 = this.A0E;
        C6173DxG c6173DxG = ((AbstractC6148Dwq) this).A0E;
        Handler handler = dy9.A00;
        if (handler != null) {
            handler.post(new RunnableC6238Dyg(c6173DxG, dy9));
        }
        C5951Dsl c5951Dsl = ((AbstractC6146Dwo) this).A08;
        c5951Dsl.getClass();
        boolean z3 = c5951Dsl.A00;
        InterfaceC6272DzP interfaceC6272DzP = this.A0G;
        if (z3) {
            interfaceC6272DzP.AA0();
        } else {
            interfaceC6272DzP.A92();
        }
        E6Y e6y = ((AbstractC6146Dwo) this).A09;
        e6y.getClass();
        interfaceC6272DzP.Ae6(e6y);
    }
}
