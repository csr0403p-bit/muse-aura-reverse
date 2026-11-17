package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: X.Dhu, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5401Dhu extends AbstractC6146Dwo implements Handler.Callback {
    public long A00;
    public long A01;
    public C5402Dhv A02;
    public DgB A03;
    public boolean A04;
    public boolean A05;
    public final Handler A06;
    public final InterfaceC5408Di1 A07;
    public final C5407Di0 A08;
    public final InterfaceC5404Dhx A09;

    public C5401Dhu(Looper looper, InterfaceC5404Dhx interfaceC5404Dhx, InterfaceC5408Di1 interfaceC5408Di1) {
        super(5);
        interfaceC5408Di1.getClass();
        this.A07 = interfaceC5408Di1;
        this.A06 = looper == null ? null : new Handler(looper, this);
        this.A09 = interfaceC5404Dhx;
        this.A08 = new C5407Di0(1);
        this.A00 = -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A00(X.C5402Dhv r7, java.util.List<X.InterfaceC5403Dhw> r8) {
        /*
            r6 = this;
            r4 = 0
        L1:
            X.Dhw[] r5 = r7.A01
            int r0 = r5.length
            if (r4 >= r0) goto L46
            r0 = r5[r4]
            X.Dwx r2 = r0.AMq()
            if (r2 == 0) goto L40
            X.Dhx r1 = r6.A09
            boolean r0 = r1.Agg(r2)
            if (r0 == 0) goto L40
            X.DgA r3 = r1.A7i(r2)
            r0 = r5[r4]
            byte[] r2 = r0.AMp()
            r2.getClass()
            X.Di0 r1 = r6.A08
            r1.A02()
            int r0 = r2.length
            r1.A04(r0)
            java.nio.ByteBuffer r0 = r1.A01
            r0.put(r2)
            r1.A03()
            X.Dhv r0 = r3.A8E(r1)
            if (r0 == 0) goto L3d
            r6.A00(r0, r8)
        L3d:
            int r4 = r4 + 1
            goto L1
        L40:
            r0 = r5[r4]
            r8.add(r0)
            goto L3d
        L46:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5401Dhu.A00(X.Dhv, java.util.List):void");
    }

    @Override // X.AbstractC6146Dwo
    public final void A0X() {
        this.A02 = null;
        this.A03 = null;
        this.A00 = -9223372036854775807L;
    }

    @Override // X.AbstractC6146Dwo
    public final void A0Y(long j, boolean z) {
        this.A02 = null;
        this.A04 = false;
        this.A05 = false;
    }

    @Override // X.AbstractC6146Dwo
    public final void A0Z(Dy6 dy6, C6154Dwx[] c6154DwxArr, long j, long j2) {
        this.A03 = this.A09.A7i(c6154DwxArr[0]);
        C5402Dhv c5402Dhv = this.A02;
        if (c5402Dhv != null) {
            long j3 = c5402Dhv.A00;
            long j4 = (j3 + this.A00) - j2;
            if (j3 != j4) {
                c5402Dhv = new C5402Dhv(c5402Dhv.A01, j4);
            }
            this.A02 = c5402Dhv;
        }
        this.A00 = j2;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0067  */
    @Override // X.InterfaceC6068Dv6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Aaz(long r11, long r13) {
        /*
            r10 = this;
        L0:
            boolean r0 = r10.A04
            if (r0 != 0) goto L25
            X.Dhv r0 = r10.A02
            if (r0 != 0) goto L25
            X.Di0 r2 = r10.A08
            r2.A02()
            X.Dhz r3 = r10.A0G
            r0 = 0
            r3.A01 = r0
            r3.A00 = r0
            r9 = 0
            int r1 = r10.A0T(r2, r3, r9)
            r0 = -4
            if (r1 != r0) goto Lbd
            boolean r0 = X.AbstractC5364DhG.A00(r2)
            if (r0 == 0) goto L69
            r0 = 1
            r10.A04 = r0
        L25:
            X.Dhv r8 = r10.A02
            r7 = 1
            if (r8 == 0) goto L67
            long r5 = r8.A00
            r9 = 1
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            boolean r0 = X.AnonymousClass002.A1L(r0)
            X.C1G.A08(r0)
            long r3 = r10.A00
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L42
            r9 = 0
        L42:
            X.C1G.A08(r9)
            long r1 = r11 - r3
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 > 0) goto L67
            android.os.Handler r0 = r10.A06
            if (r0 == 0) goto L61
            X.BV6.A10(r0, r8, r7)
        L52:
            r8 = 0
            r10.A02 = r8
            r1 = 1
        L56:
            boolean r0 = r10.A04
            if (r0 == 0) goto L5e
            if (r8 != 0) goto L5e
            r10.A05 = r7
        L5e:
            if (r1 != 0) goto L0
            return
        L61:
            X.Di1 r0 = r10.A07
            r0.onMetadata(r8)
            goto L52
        L67:
            r1 = 0
            goto L56
        L69:
            long r3 = r2.A00
            long r0 = r10.A02
            int r5 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r5 < 0) goto L25
            long r0 = r10.A01
            r2.A00 = r0
            r2.A03()
            X.DgB r0 = r10.A03
            X.Dhv r1 = r0.A8E(r2)
            if (r1 == 0) goto L25
            X.Dhw[] r0 = r1.A01
            int r0 = r0.length
            java.util.ArrayList r8 = X.C60O.A11(r0)
            r10.A00(r1, r8)
            boolean r0 = r8.isEmpty()
            if (r0 != 0) goto L25
            long r2 = r2.A00
            r1 = 1
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            boolean r0 = X.AnonymousClass002.A1L(r0)
            X.C1G.A08(r0)
            long r4 = r10.A00
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 != 0) goto La8
            r1 = 0
        La8:
            X.C1G.A08(r1)
            long r2 = r2 - r4
            X.Dhw[] r0 = new X.InterfaceC5403Dhw[r9]
            java.lang.Object[] r1 = r8.toArray(r0)
            X.Dhw[] r1 = (X.InterfaceC5403Dhw[]) r1
            X.Dhv r0 = new X.Dhv
            r0.<init>(r1, r2)
            r10.A02 = r0
            goto L25
        Lbd:
            r0 = -5
            if (r1 != r0) goto L25
            X.Dwx r0 = r3.A00
            r0.getClass()
            long r0 = r0.A0R
            r10.A01 = r0
            goto L25
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5401Dhu.Aaz(long, long):void");
    }

    @Override // X.InterfaceC5921Ds8
    public final int Agf(C6154Dwx c6154Dwx) {
        int i;
        if (this.A09.Agg(c6154Dwx)) {
            int i2 = c6154Dwx.A07;
            i = 2;
            if (i2 == 0) {
                i = 4;
            }
        } else {
            i = 0;
        }
        return i | 0 | 128;
    }

    @Override // X.InterfaceC6068Dv6, X.InterfaceC5921Ds8
    public final String getName() {
        return "MetadataRenderer";
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 1) {
            throw BV4.A0T();
        }
        this.A07.onMetadata((C5402Dhv) message.obj);
        return true;
    }

    @Override // X.InterfaceC6068Dv6
    public final boolean isEnded() {
        return this.A05;
    }

    @Override // X.InterfaceC6068Dv6
    public final boolean isReady() {
        return true;
    }
}
