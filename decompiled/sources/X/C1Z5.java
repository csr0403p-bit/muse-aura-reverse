package X;

/* renamed from: X.1Z5, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1Z5 extends Ab8<C3Sq> {
    public final float A00;
    public final C1BO<Integer> A01;
    public final C1BO<Integer> A02;
    public final String A03;

    @Override // X.Ab8
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1Z5) {
                C1Z5 c1z5 = (C1Z5) obj;
                if (this.A00 != c1z5.A00 || !C7384Etj.areEqual(this.A02, c1z5.A02) || !C7384Etj.areEqual(this.A01, c1z5.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.Ab8
    public final /* bridge */ /* synthetic */ AbstractC1439Aj8 create() {
        float f = this.A00;
        C1BO<Integer> c1bo = this.A02;
        C1BO<Integer> c1bo2 = this.A01;
        C3Sq c3Sq = new C3Sq();
        c3Sq.A00 = f;
        c3Sq.A02 = c1bo;
        c3Sq.A01 = c1bo2;
        return c3Sq;
    }

    @Override // X.Ab8
    public final int hashCode() {
        C1BO<Integer> c1bo = this.A02;
        int iHashCode = (c1bo != null ? c1bo.hashCode() : 0) * 31;
        C1BO<Integer> c1bo2 = this.A01;
        return ((iHashCode + (c1bo2 != null ? c1bo2.hashCode() : 0)) * 31) + Float.floatToIntBits(this.A00);
    }

    @Override // X.Ab8
    public final void inspectableProperties(ASF asf) {
        asf.A01 = this.A03;
        asf.A00 = Float.valueOf(this.A00);
    }

    @Override // X.Ab8
    public final /* bridge */ /* synthetic */ void update(AbstractC1439Aj8 abstractC1439Aj8) {
        C3Sq c3Sq = (C3Sq) abstractC1439Aj8;
        c3Sq.A00 = this.A00;
        c3Sq.A02 = this.A02;
        c3Sq.A01 = this.A01;
    }

    /* JADX WARN: Incorrect types in method signature: (FLX/1BO<Ljava/lang/Integer;>;LX/1BO<Ljava/lang/Integer;>;Ljava/lang/String;)V */
    public C1Z5(C1BO c1bo, C1BO c1bo2, String str, float f) {
        this.A00 = f;
        this.A02 = c1bo;
        this.A01 = c1bo2;
        this.A03 = str;
    }
}
