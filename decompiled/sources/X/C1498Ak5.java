package X;

import com.facebook.aura.localbrowser.LocalBrowserCapacityKt;

/* renamed from: X.Ak5, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1498Ak5 implements AXN {
    public final float A00;
    public final float A01;
    public final InterfaceC1502Ak9 A02;

    @Override // X.AXN
    public final /* synthetic */ float Agy(int i) {
        return i / this.A00;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1498Ak5) {
                C1498Ak5 c1498Ak5 = (C1498Ak5) obj;
                if (Float.compare(this.A00, c1498Ak5.A00) != 0 || Float.compare(this.A01, c1498Ak5.A01) != 0 || !this.A02.equals(c1498Ak5.A02)) {
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

    @Override // X.C0dm
    public final long Ah7(float f) {
        return C19U.A02(this.A02.A7F(f));
    }

    public final int hashCode() {
        return AnonymousClass005.A0G(this.A02, AnonymousClass005.A02(C8j4.A04(this.A00), this.A01));
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("DensityWithConverter(density=");
        sbA0x.append(this.A00);
        sbA0x.append(", fontScale=");
        sbA0x.append(this.A01);
        sbA0x.append(", converter=");
        return AnonymousClass007.A0Z(this.A02, sbA0x);
    }

    public C1498Ak5(InterfaceC1502Ak9 interfaceC1502Ak9, float f, float f2) {
        this.A00 = f;
        this.A01 = f2;
        this.A02 = interfaceC1502Ak9;
    }

    @Override // X.AXN
    public final /* synthetic */ int Abr(float f) {
        return ASU.A01(this, f);
    }

    @Override // X.C0dm
    public final float Agw(long j) {
        if (C1809ArT.A01(j) == LocalBrowserCapacityKt.BACKGROUND_WAKE_MIN_RAM_BYTES) {
            return this.A02.A7H(C1809ArT.A00(j));
        }
        throw C3cG.A0Q("Only Sp can convert to Px");
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

    @Override // X.AXN
    public final /* synthetic */ long Ah8(float f) {
        return AXN.A02(this, f);
    }

    @Override // X.AXN
    public final /* synthetic */ long Ah9(int i) {
        return AXN.A03(this, i);
    }
}
