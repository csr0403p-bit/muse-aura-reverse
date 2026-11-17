package X;

/* renamed from: X.AiO, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1393AiO {
    public float A00;
    public float A01;
    public float A02;
    public float A03;

    public final void A00(float f, float f2, float f3, float f4) {
        this.A01 = Math.max(f, this.A01);
        this.A03 = Math.max(f2, this.A03);
        this.A02 = Math.min(f3, this.A02);
        this.A00 = Math.min(f4, this.A00);
    }

    public final boolean A02() {
        return (this.A01 >= this.A02) | (this.A03 >= this.A00);
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("MutableRect(");
        AW8.A01(sbA0x, this.A01);
        sbA0x.append(", ");
        AW8.A01(sbA0x, this.A03);
        sbA0x.append(", ");
        AW8.A01(sbA0x, this.A02);
        sbA0x.append(", ");
        AW8.A01(sbA0x, this.A00);
        return AnonymousClass006.A0z(sbA0x);
    }

    public final void A01(long j) {
        float fA03 = AnonymousClass003.A03(j);
        float fA00 = AnonymousClass004.A00(j);
        this.A01 += fA03;
        this.A03 += fA00;
        this.A02 += fA03;
        this.A00 += fA00;
    }
}
