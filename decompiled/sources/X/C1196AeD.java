package X;

/* renamed from: X.AeD, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1196AeD implements AeE {
    public C2ae A00;
    public BL4 A01;
    public BL4 A02;
    public EnumC1820Arj A03;
    public final AeE A04;

    @Override // X.AeE
    /* renamed from: calculatePosition-llwVHH4 */
    public final long mo11calculatePositionllwVHH4(BLU blu, long j, EnumC1820Arj enumC1820Arj, long j2) {
        BL4 bl4;
        BL4 bl42;
        C2ae c2ae = this.A00;
        if (c2ae != null && (bl4 = this.A02) != null && bl4.A00 == j && this.A03 == enumC1820Arj && (bl42 = this.A01) != null && bl42.A00 == j2) {
            return c2ae.A00;
        }
        long jMo11calculatePositionllwVHH4 = this.A04.mo11calculatePositionllwVHH4(blu, j, enumC1820Arj, j2);
        this.A02 = BL4.A00(j);
        this.A03 = enumC1820Arj;
        this.A01 = BL4.A00(j2);
        this.A00 = C8j3.A0l(jMo11calculatePositionllwVHH4);
        return jMo11calculatePositionllwVHH4;
    }

    public C1196AeD(AeE aeE) {
        this.A04 = aeE;
    }
}
