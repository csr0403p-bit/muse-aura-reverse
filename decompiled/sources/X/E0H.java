package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.facebook.aura.devices.pairing.LinkEncryptedPairingKt;
import com.google.common.collect.ImmutableList;
import java.io.IOException;

/* loaded from: classes5.dex */
public final class E0H extends AbstractC6146Dwo implements Handler.Callback {
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public C6154Dwx A04;
    public E0Q A05;
    public E09 A06;
    public E0B A07;
    public E0M A08;
    public E0M A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public final Di2 A0E;
    public final C5406Dhz A0F;
    public final E0V A0G;
    public final InterfaceC5318DgC A0H;
    public final Handler A0I;

    public E0H(Looper looper, E0V e0v, InterfaceC5318DgC interfaceC5318DgC) {
        super(3);
        interfaceC5318DgC.getClass();
        this.A0H = interfaceC5318DgC;
        this.A0I = looper == null ? null : new Handler(looper, this);
        this.A0G = e0v;
        this.A0E = new Di2(1);
        this.A0F = new C5406Dhz();
        this.A02 = -9223372036854775807L;
        this.A03 = -9223372036854775807L;
        this.A0B = false;
    }

    private void A05() {
        this.A07 = null;
        this.A01 = -1;
        E0M e0m = this.A09;
        if (e0m != null) {
            e0m.A03();
            this.A09 = null;
        }
        E0M e0m2 = this.A08;
        if (e0m2 != null) {
            e0m2.A03();
            this.A08 = null;
        }
    }

    @Override // X.AbstractC6146Dwo
    public final void A0X() {
        this.A04 = null;
        this.A02 = -9223372036854775807L;
        A04();
        this.A03 = -9223372036854775807L;
        if (this.A06 != null) {
            A05();
            E09 e09 = this.A06;
            e09.getClass();
            e09.release();
            this.A06 = null;
            this.A00 = 0;
        }
    }

    @Override // X.AbstractC6146Dwo
    public final void A0Z(Dy6 dy6, C6154Dwx[] c6154DwxArr, long j, long j2) {
        C6154Dwx c6154Dwx = c6154DwxArr[0];
        this.A04 = c6154Dwx;
        if (C6xC.A00(c6154Dwx.A0b, "application/x-media3-cues")) {
            this.A05 = this.A04.A08 == 1 ? new C6301Dzx() : new C6303Dzz();
            return;
        }
        A03();
        if (this.A06 != null) {
            this.A00 = 1;
            return;
        }
        this.A0D = true;
        E0V e0v = this.A0G;
        C6154Dwx c6154Dwx2 = this.A04;
        c6154Dwx2.getClass();
        E09 e09A7j = e0v.A7j(c6154Dwx2);
        this.A06 = e09A7j;
        e09A7j.Adx(super.A02);
    }

    private long A00() {
        if (this.A01 == -1) {
            return LinkEncryptedPairingKt.LINK_COUNTER_MAX;
        }
        this.A09.getClass();
        return this.A01 < this.A09.AFO() ? this.A09.AFN(this.A01) : LinkEncryptedPairingKt.LINK_COUNTER_MAX;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A03() {
        /*
            r4 = this;
            boolean r0 = r4.A0B
            if (r0 != 0) goto L29
            X.Dwx r0 = r4.A04
            java.lang.String r1 = r0.A0b
            java.lang.String r0 = "application/cea-608"
            boolean r0 = X.C6xC.A00(r1, r0)
            if (r0 != 0) goto L29
            X.Dwx r0 = r4.A04
            java.lang.String r1 = r0.A0b
            java.lang.String r0 = "application/x-mp4-cea-608"
            boolean r0 = X.C6xC.A00(r1, r0)
            if (r0 != 0) goto L29
            X.Dwx r0 = r4.A04
            java.lang.String r1 = r0.A0b
            java.lang.String r0 = "application/cea-708"
            boolean r0 = X.C6xC.A00(r1, r0)
            r3 = 0
            if (r0 == 0) goto L2a
        L29:
            r3 = 1
        L2a:
            java.lang.String r2 = "Legacy decoding is disabled, can't handle "
            X.Dwx r0 = r4.A04
            java.lang.String r1 = r0.A0b
            java.lang.String r0 = " samples (expected application/x-media3-cues)."
            java.lang.String r0 = X.FGI.A0U(r2, r1, r0)
            if (r3 == 0) goto L39
            return
        L39:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.IllegalStateException r0 = X.C3cG.A0Q(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E0H.A03():void");
    }

    private void A04() {
        DOM<E0J> dom = DXD.A02;
        ImmutableList immutableListOf = ImmutableList.of();
        C1G.A08(AnonymousClass002.A1L((this.A03 > (-9223372036854775807L) ? 1 : (this.A03 == (-9223372036854775807L) ? 0 : -1))));
        A07(new DXD(immutableListOf));
    }

    private void A07(DXD dxd) {
        Handler handler = this.A0I;
        if (handler != null) {
            BV6.A10(handler, dxd, 1);
            return;
        }
        InterfaceC5318DgC interfaceC5318DgC = this.A0H;
        interfaceC5318DgC.onCues(dxd.A00);
        interfaceC5318DgC.onCues(dxd);
    }

    @Override // X.AbstractC6146Dwo
    public final void A0Y(long j, boolean z) {
        this.A03 = j;
        E0Q e0q = this.A05;
        if (e0q != null) {
            e0q.clear();
        }
        A04();
        this.A0A = false;
        this.A0C = false;
        this.A02 = -9223372036854775807L;
        C6154Dwx c6154Dwx = this.A04;
        if (c6154Dwx == null || C6xC.A00(c6154Dwx.A0b, "application/x-media3-cues")) {
            return;
        }
        if (this.A00 != 0) {
            A06();
            return;
        }
        A05();
        E09 e09 = this.A06;
        e09.getClass();
        e09.flush();
        e09.Adx(super.A02);
    }

    /* JADX WARN: Removed duplicated region for block: B:145:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0389  */
    @Override // X.InterfaceC6068Dv6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Aaz(long r20, long r22) {
        /*
            Method dump skipped, instructions count: 1042
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E0H.Aaz(long, long):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC5921Ds8
    public final int Agf(C6154Dwx c6154Dwx) {
        int iA1L;
        String str = c6154Dwx.A0b;
        if (C6xC.A00(str, "application/x-media3-cues") || this.A0G.Agg(c6154Dwx)) {
            iA1L = 2;
            if (c6154Dwx.A07 == 0) {
                iA1L = 4;
            }
        } else {
            iA1L = AnonymousClass002.A1L(AbstractC6161Dx4.A09(str) ? 1 : 0);
        }
        return iA1L | 0 | 128;
    }

    @Override // X.InterfaceC6068Dv6, X.InterfaceC5921Ds8
    public final String getName() {
        return "TextRenderer";
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 1) {
            throw BV4.A0T();
        }
        DXD dxd = (DXD) message.obj;
        InterfaceC5318DgC interfaceC5318DgC = this.A0H;
        interfaceC5318DgC.onCues(dxd.A00);
        interfaceC5318DgC.onCues(dxd);
        return true;
    }

    @Override // X.InterfaceC6068Dv6
    public final boolean isEnded() {
        return this.A0C;
    }

    @Override // X.InterfaceC6068Dv6
    public final boolean isReady() {
        C6154Dwx c6154Dwx = this.A04;
        if (c6154Dwx != null) {
            if (!C6xC.A00(c6154Dwx.A0b, "application/x-media3-cues")) {
                if (!this.A0C) {
                    if (this.A0A) {
                        E0M e0m = this.A09;
                        long j = this.A03;
                        if (e0m != null && e0m.AFO() > 0 && e0m.AFN(e0m.AFO() - 1) > j) {
                            return true;
                        }
                        E0M e0m2 = this.A08;
                        long j2 = this.A03;
                        if ((e0m2 != null && e0m2.AFO() > 0 && e0m2.AFN(e0m2.AFO() - 1) > j2) || this.A07 == null) {
                            return true;
                        }
                    }
                }
                return false;
            }
            E0Q e0q = this.A05;
            e0q.getClass();
            if (e0q.AI1(this.A03) == Long.MIN_VALUE) {
                try {
                    AQT();
                    return true;
                } catch (IOException unused) {
                    return false;
                }
            }
        }
        return true;
    }

    private void A06() {
        A05();
        E09 e09 = this.A06;
        e09.getClass();
        e09.release();
        this.A06 = null;
        this.A00 = 0;
        this.A0D = true;
        E0V e0v = this.A0G;
        C6154Dwx c6154Dwx = this.A04;
        c6154Dwx.getClass();
        E09 e09A7j = e0v.A7j(c6154Dwx);
        this.A06 = e09A7j;
        e09A7j.Adx(super.A02);
    }
}
