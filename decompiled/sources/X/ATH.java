package X;

/* loaded from: classes4.dex */
public final class ATH implements AXN {
    public final float A00;
    public final float A01;

    @Override // X.AXN
    public final /* synthetic */ float Agy(int i) {
        return i / this.A00;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ATH) {
                ATH ath = (ATH) obj;
                if (Float.compare(this.A00, ath.A00) != 0 || Float.compare(this.A01, ath.A01) != 0) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.AXN
    public final float AEm() {
        return this.A00;
    }

    @Override // X.C0dm
    public final float AFo() {
        return this.A01;
    }

    @Override // X.AXN
    public final /* synthetic */ float Agx(float f) {
        return f / this.A00;
    }

    @Override // X.AXN
    public final /* synthetic */ float Ah4(float f) {
        return f * this.A00;
    }

    public final int hashCode() {
        return C8j4.A06(C8j4.A04(this.A00), this.A01);
    }

    public final String toString() {
        return FGI.A0P("DensityImpl(density=", ", fontScale=", ')', this.A00, this.A01);
    }

    public ATH(float f, float f2) {
        this.A00 = f;
        this.A01 = f2;
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
