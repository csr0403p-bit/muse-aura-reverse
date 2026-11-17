package X;

import java.util.Arrays;

/* renamed from: X.Aiu, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1425Aiu implements InterfaceC1620Amr {
    public long A00 = 9223372034707292159L;
    public long A01 = 0;
    public boolean A02;
    public final /* synthetic */ AbstractC1424Ait A03;

    @Override // X.AXN
    public final /* synthetic */ float Agy(int i) {
        return i / this.A03.AEm();
    }

    public C1425Aiu(AbstractC1424Ait abstractC1424Ait) {
        this.A03 = abstractC1424Ait;
    }

    @Override // X.AXN
    public final float AEm() {
        return this.A03.AEm();
    }

    @Override // X.C0dm
    public final float AFo() {
        return this.A03.AFo();
    }

    @Override // X.InterfaceC1620Amr
    public final void AYh(AbstractC1430Aiz abstractC1430Aiz, float f) {
        AbstractC1424Ait abstractC1424Ait = this.A03;
        C1427Aiw c1427Aiw = abstractC1424Ait.A02;
        if (c1427Aiw == null) {
            c1427Aiw = new C1427Aiw();
            abstractC1424Ait.A02 = c1427Aiw;
        }
        int iA09 = BFI.A09(c1427Aiw.A04, abstractC1430Aiz);
        if (iA09 >= 0) {
            float[] fArr = c1427Aiw.A03;
            if (fArr[iA09] != f) {
                fArr[iA09] = f;
                c1427Aiw.A02[iA09] = 1;
                return;
            } else {
                byte[] bArr = c1427Aiw.A02;
                if (bArr[iA09] == 2) {
                    bArr[iA09] = 0;
                    return;
                }
                return;
            }
        }
        int i = c1427Aiw.A00;
        AbstractC1430Aiz[] abstractC1430AizArr = c1427Aiw.A04;
        if (i == abstractC1430AizArr.length) {
            int i2 = i * 2;
            Object[] objArrCopyOf = Arrays.copyOf(abstractC1430AizArr, i2);
            C7384Etj.A0U(objArrCopyOf);
            c1427Aiw.A04 = (AbstractC1430Aiz[]) objArrCopyOf;
            float[] fArrCopyOf = Arrays.copyOf(c1427Aiw.A03, i2);
            C7384Etj.A0U(fArrCopyOf);
            c1427Aiw.A03 = fArrCopyOf;
            byte[] bArrCopyOf = Arrays.copyOf(c1427Aiw.A02, i2);
            C7384Etj.A0U(bArrCopyOf);
            c1427Aiw.A02 = bArrCopyOf;
        }
        c1427Aiw.A04[i] = abstractC1430Aiz;
        c1427Aiw.A02[i] = 3;
        c1427Aiw.A03[i] = f;
        c1427Aiw.A00++;
    }

    @Override // X.AXN
    public final /* synthetic */ float Agx(float f) {
        return f / this.A03.AEm();
    }

    @Override // X.AXN
    public final /* synthetic */ float Ah4(float f) {
        return AXN.A01(this.A03, f);
    }

    @Override // X.AXN
    public final /* synthetic */ int Abr(float f) {
        return ASU.A01(this, f);
    }

    @Override // X.C0dm
    public final /* synthetic */ float Agw(long j) {
        return AbstractC1499Ak6.A00(this, j);
    }

    @Override // X.AXN
    public final /* synthetic */ long Agz(long j) {
        return ASU.A02(this, j);
    }

    @Override // X.AXN
    public final /* synthetic */ float Ah3(long j) {
        return ASU.A00(j, this);
    }

    @Override // X.AXN
    public final /* synthetic */ long Ah6(long j) {
        return ASU.A03(this, j);
    }

    @Override // X.C0dm
    public final /* synthetic */ long Ah7(float f) {
        return AbstractC1499Ak6.A01(this, f);
    }

    @Override // X.AXN
    public final /* synthetic */ long Ah8(float f) {
        return AXN.A02(this, f);
    }

    @Override // X.AXN
    public final /* synthetic */ long Ah9(int i) {
        return AXN.A03(this, i);
    }
}
