package X;

/* renamed from: X.EgU, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7114EgU {
    public C7011EeI A00;
    public final C7113EgT A01;
    public final F0C A03 = new C5322DgG(null, new EWq(this, 33));
    public final F0C A04 = C5322DgG.A00(this, 34);
    public final F0C A05 = C5322DgG.A00(this, 35);
    public final F0C A06 = C5322DgG.A00(this, 36);
    public final F0C A02 = C5322DgG.A00(this, 32);
    public final F0C A07 = C5322DgG.A00(this, 37);
    public final F0C A09 = C5322DgG.A00(this, 38);
    public final F0C A08 = C5322DgG.A00(this, 39);

    public final C7011EeI A00() {
        C7011EeI c7011EeI = this.A00;
        if (c7011EeI != null) {
            return c7011EeI;
        }
        AbstractC6525EBz abstractC6525EBz = (AbstractC6525EBz) this.A06.getValue();
        if (abstractC6525EBz == null) {
            throw BV5.A0Q("failed to get pool for chunk type: ", 0);
        }
        C7011EeI c7011EeI2 = new C7011EeI((C7012EeJ) this.A07.getValue(), abstractC6525EBz);
        this.A00 = c7011EeI2;
        return c7011EeI2;
    }

    public C7114EgU(C7113EgT c7113EgT) {
        this.A01 = c7113EgT;
    }
}
