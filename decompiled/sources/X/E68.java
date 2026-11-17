package X;

import androidx.media3.exoplayer.ExoPlaybackException;

/* loaded from: classes5.dex */
public final class E68 implements InterfaceC5922Ds9 {
    public InterfaceC5922Ds9 A00;
    public InterfaceC6068Dv6 A01;
    public boolean A03;
    public final InterfaceC6461E7a A05;
    public final E6R A06;
    public boolean A02 = true;
    public boolean A04 = AbstractC5653Dmh.A03(EnumC5618Dlz.A2H);

    public final void A02() {
        this.A03 = false;
        E6R e6r = this.A06;
        if (e6r.A01) {
            e6r.A01(e6r.AIv());
            e6r.A01 = false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long A01(boolean r8) {
        /*
            r7 = this;
            X.Dv6 r0 = r7.A01
            if (r0 == 0) goto L1c
            boolean r0 = r0.isEnded()
            if (r0 != 0) goto L1c
            X.Dv6 r0 = r7.A01
            boolean r0 = r0.isReady()
            if (r0 != 0) goto L2d
            if (r8 != 0) goto L1c
            X.Dv6 r0 = r7.A01
            boolean r0 = r0.ANH()
            if (r0 == 0) goto L2d
        L1c:
            r0 = 1
            r7.A02 = r0
            boolean r0 = r7.A03
            if (r0 == 0) goto L28
            X.E6R r0 = r7.A06
            r0.A00()
        L28:
            long r0 = r7.AIv()
            return r0
        L2d:
            X.Ds9 r6 = r7.A00
            r6.getClass()
            long r3 = r6.AIv()
            boolean r0 = r7.A02
            if (r0 == 0) goto L5d
            X.E6R r5 = r7.A06
            long r1 = r5.AIv()
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L53
            boolean r0 = r5.A01
            if (r0 == 0) goto L28
            long r0 = r5.AIv()
            r5.A01(r0)
            r0 = 0
            r5.A01 = r0
            goto L28
        L53:
            r0 = 0
            r7.A02 = r0
            boolean r0 = r7.A03
            if (r0 == 0) goto L5d
            r5.A00()
        L5d:
            X.E6R r2 = r7.A06
            r2.A01(r3)
            X.Dyb r1 = r6.AIo()
            X.Dyb r0 = r2.A00
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L28
            r2.Ae1(r1)
            X.E7a r0 = r7.A05
            r0.onPlaybackParametersChanged(r1)
            goto L28
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E68.A01(boolean):long");
    }

    @Override // X.InterfaceC5922Ds9
    public final C6233Dyb AIo() {
        InterfaceC5922Ds9 interfaceC5922Ds9 = this.A00;
        return interfaceC5922Ds9 != null ? interfaceC5922Ds9.AIo() : this.A06.A00;
    }

    @Override // X.InterfaceC5922Ds9
    public final long AIv() {
        if (this.A02) {
            return this.A06.AIv();
        }
        InterfaceC5922Ds9 interfaceC5922Ds9 = this.A00;
        interfaceC5922Ds9.getClass();
        return interfaceC5922Ds9.AIv();
    }

    @Override // X.InterfaceC5922Ds9
    public final boolean ANJ() {
        if (this.A02) {
            return false;
        }
        InterfaceC5922Ds9 interfaceC5922Ds9 = this.A00;
        interfaceC5922Ds9.getClass();
        return interfaceC5922Ds9.ANJ();
    }

    @Override // X.InterfaceC5922Ds9
    public final void Ae1(C6233Dyb c6233Dyb) {
        InterfaceC5922Ds9 interfaceC5922Ds9 = this.A00;
        if (interfaceC5922Ds9 != null) {
            interfaceC5922Ds9.Ae1(c6233Dyb);
            c6233Dyb = this.A00.AIo();
        }
        this.A06.Ae1(c6233Dyb);
        if (this.A04) {
            this.A05.onPlaybackParametersChanged(c6233Dyb);
        }
    }

    public E68(E7C e7c, InterfaceC6461E7a interfaceC6461E7a) {
        this.A05 = interfaceC6461E7a;
        this.A06 = new E6R(e7c);
    }

    public static float A00(E68 e68) {
        return e68.AIo().A01;
    }

    public final void A03(InterfaceC6068Dv6 interfaceC6068Dv6) throws ExoPlaybackException {
        InterfaceC5922Ds9 interfaceC5922Ds9;
        InterfaceC5922Ds9 interfaceC5922Ds9AHZ = interfaceC6068Dv6.AHZ();
        if (interfaceC5922Ds9AHZ == null || interfaceC5922Ds9AHZ == (interfaceC5922Ds9 = this.A00)) {
            return;
        }
        if (interfaceC5922Ds9 != null) {
            throw ExoPlaybackException.A01(C3cG.A0Q("Multiple renderer media clocks enabled."), 1000);
        }
        this.A00 = interfaceC5922Ds9AHZ;
        this.A01 = interfaceC6068Dv6;
        interfaceC5922Ds9AHZ.Ae1(this.A06.A00);
    }
}
