package X;

import androidx.media3.common.PlaybackException;
import java.io.IOException;
import java.util.Map;

/* renamed from: X.Dxi, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6198Dxi implements InterfaceC6481E7w, InterfaceC6257Dz0 {
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public long A04;
    public C6154Dwx A05;
    public C6154Dwx A06;
    public C6232Dya A07;
    public C6203Dxn A08;
    public Exception A09;
    public String A0A;
    public final E6B A0B;
    public final InterfaceC6235Dyd A0C;
    public final Map<String, C6200Dxk> A0D;
    public final Dw8 A0E;
    public final Map<String, C6202Dxm> A0F;
    public final boolean A0G;

    @Override // X.InterfaceC6481E7w
    public final void ARw(C6202Dxm c6202Dxm, int i, long j) {
        this.A03 = i;
        this.A02 = j;
    }

    private boolean A00(C6197Dxh c6197Dxh, String str, int i) {
        return c6197Dxh.A01.A00.get(i) && this.A0C.A57(C6197Dxh.A00(c6197Dxh, i), str);
    }

    @Override // X.InterfaceC6257Dz0
    public final void ARh(String str) {
        C6200Dxk c6200Dxk = (C6200Dxk) BV6.A0l(str, this.A0D);
        c6200Dxk.A0B = true;
        c6200Dxk.A0C = false;
    }

    @Override // X.InterfaceC6481E7w
    public final void ASb(C6202Dxm c6202Dxm, C5893Dra c5893Dra) {
        int i = c5893Dra.A02;
        if (i == 2 || i == 0) {
            this.A06 = c5893Dra.A05;
        } else if (i == 1) {
            this.A05 = c5893Dra.A05;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02c4 A[PHI: r1
  0x02c4: PHI (r1v5 char) = (r1v4 char), (r1v6 char) binds: [B:128:0x0274, B:150:0x02b1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x010d  */
    @Override // X.InterfaceC6481E7w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void AT8(X.Dn6 r45, X.C6197Dxh r46) {
        /*
            Method dump skipped, instructions count: 779
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6198Dxi.AT8(X.Dn6, X.Dxh):void");
    }

    @Override // X.InterfaceC6481E7w
    public final void AUo(BYW byw, int i) {
        String str;
        if (this.A0A == null) {
            C6199Dxj c6199Dxj = (C6199Dxj) this.A0C;
            synchronized (c6199Dxj) {
                str = c6199Dxj.A03;
            }
            this.A0A = str;
            this.A04 = byw.A05;
        }
        this.A00 = i;
    }

    @Override // X.InterfaceC6257Dz0
    public final void AVl(C6202Dxm c6202Dxm, String str) {
        ((C6200Dxk) BV6.A0l(str, this.A0D)).A0A = true;
    }

    @Override // X.InterfaceC6257Dz0
    public final void AVm(C6202Dxm c6202Dxm, String str) {
        this.A0D.put(str, new C6200Dxk(c6202Dxm, this.A0G));
        this.A0F.put(str, c6202Dxm);
    }

    @Override // X.InterfaceC6257Dz0
    public final void AVo(C6202Dxm c6202Dxm, String str, boolean z) {
        C6200Dxk c6200DxkRemove = this.A0D.remove(str);
        c6200DxkRemove.getClass();
        C6200Dxk c6200Dxk = c6200DxkRemove;
        this.A0F.remove(str).getClass();
        long j = str.equals(this.A0A) ? this.A04 : -9223372036854775807L;
        int i = 11;
        if (c6200Dxk.A01 != 11 && !z) {
            i = 15;
        }
        long j2 = c6202Dxm.A04;
        C6200Dxk.A06(c6200Dxk, j2, j);
        C6200Dxk.A05(c6200Dxk, j2);
        C6200Dxk.A04(c6200Dxk, j2);
        C6200Dxk.A03(c6202Dxm, c6200Dxk, i);
        this.A08 = C6203Dxn.A00(this.A08, c6200Dxk.A07(true));
    }

    public C6198Dxi(Dw8 dw8, boolean z) {
        this.A0E = dw8;
        this.A0G = z;
        C6199Dxj c6199Dxj = new C6199Dxj();
        this.A0C = c6199Dxj;
        this.A0D = BV4.A0u();
        this.A0F = BV4.A0u();
        this.A08 = C6203Dxn.A0e;
        this.A0B = new E6B();
        this.A07 = C6232Dya.A03;
        c6199Dxj.A02 = this;
    }

    @Override // X.InterfaceC6481E7w
    public final void ASn(Exception exc) {
        this.A09 = exc;
    }

    @Override // X.InterfaceC6481E7w
    public final void ASr(int i) {
        this.A01 = i;
    }

    @Override // X.InterfaceC6481E7w
    public final /* synthetic */ void AUi(PlaybackException playbackException) {
    }

    @Override // X.InterfaceC6481E7w
    public final /* synthetic */ void AX7(C6173DxG c6173DxG) {
    }

    @Override // X.InterfaceC6481E7w
    public final void AXH(C6232Dya c6232Dya) {
        this.A07 = c6232Dya;
    }

    @Override // X.InterfaceC6481E7w
    public final void ATw(C5893Dra c5893Dra, IOException iOException) {
        this.A09 = iOException;
    }

    @Override // X.InterfaceC6481E7w
    public final /* synthetic */ void AVJ(int i, boolean z) {
    }
}
