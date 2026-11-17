package X;

import java.util.List;

/* loaded from: classes6.dex */
public final class HBG implements InterfaceC10348HBm {
    public float A00;
    public float A01;
    public boolean A05;
    public final /* synthetic */ HB9 A08;
    public List<HBI> A04 = C3cG.A0h();
    public HBI A03 = null;
    public boolean A07 = false;
    public boolean A06 = true;
    public int A02 = -1;

    @Override // X.InterfaceC10348HBm
    public final void A4j(float f, float f2, float f3, float f4, float f5, boolean z, boolean z2) {
        this.A07 = true;
        this.A06 = false;
        HBI hbi = this.A03;
        HB9.A0S(this, hbi.A02, hbi.A03, f, f2, f3, f4, f5, z, z2);
        this.A06 = true;
        this.A05 = false;
    }

    public HBG(HBL hbl, HB9 hb9) {
        this.A08 = hb9;
        if (hbl != null) {
            hbl.A02(this);
            if (this.A05) {
                this.A04.get(-1);
                throw BV4.A0a("add");
            }
        }
    }

    @Override // X.InterfaceC10348HBm
    public final void A87(float f, float f2, float f3, float f4, float f5, float f6) {
        if (this.A06 || this.A07) {
            HBI hbi = this.A03;
            hbi.A00(f, f2);
            this.A04.add(hbi);
            this.A07 = false;
        }
        this.A03 = new HBI(this.A08, f5, f6, f5 - f3, f6 - f4);
        this.A05 = false;
    }

    @Override // X.InterfaceC10348HBm
    public final void APc(float f, float f2) {
        HBI hbi = this.A03;
        hbi.A00(f, f2);
        this.A04.add(hbi);
        HB9 hb9 = this.A08;
        HBI hbi2 = this.A03;
        this.A03 = new HBI(hb9, f, f2, f - hbi2.A02, f2 - hbi2.A03);
        this.A05 = false;
    }

    @Override // X.InterfaceC10348HBm
    public final void AQx(float f, float f2) {
        if (this.A05) {
            HBI hbi = this.A03;
            List<HBI> list = this.A04;
            hbi.A01(list.get(this.A02));
            list.set(this.A02, this.A03);
            this.A05 = false;
        }
        HBI hbi2 = this.A03;
        if (hbi2 != null) {
            this.A04.add(hbi2);
        }
        this.A00 = f;
        this.A01 = f2;
        this.A03 = new HBI(this.A08, f, f2, 0.0f, 0.0f);
        this.A02 = this.A04.size();
    }

    @Override // X.InterfaceC10348HBm
    public final void AYt(float f, float f2, float f3, float f4) {
        HBI hbi = this.A03;
        hbi.A00(f, f2);
        this.A04.add(hbi);
        this.A03 = new HBI(this.A08, f3, f4, f3 - f, f4 - f2);
        this.A05 = false;
    }

    @Override // X.InterfaceC10348HBm
    public final void close() {
        this.A04.add(this.A03);
        APc(this.A00, this.A01);
        this.A05 = true;
    }
}
