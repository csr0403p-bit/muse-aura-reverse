package X;

/* renamed from: X.ATq, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1062ATq extends Ab8<C1063ATr> {
    public final float A00;
    public final Integer A01;
    public final String A02;

    @Override // X.Ab8
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1062ATq) {
                C1062ATq c1062ATq = (C1062ATq) obj;
                if (this.A01 != c1062ATq.A01 || this.A00 != c1062ATq.A00) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.Ab8
    public final /* bridge */ /* synthetic */ AbstractC1439Aj8 create() {
        Integer num = this.A01;
        float f = this.A00;
        C1063ATr c1063ATr = new C1063ATr();
        c1063ATr.A01 = num;
        c1063ATr.A00 = f;
        return c1063ATr;
    }

    @Override // X.Ab8
    public final int hashCode() {
        return C8j4.A06(ATp.A00(this.A01) * 31, this.A00);
    }

    @Override // X.Ab8
    public final void inspectableProperties(ASF asf) {
        asf.A01 = this.A02;
        asf.A02.A01("fraction", Float.valueOf(this.A00));
    }

    @Override // X.Ab8
    public final /* bridge */ /* synthetic */ void update(AbstractC1439Aj8 abstractC1439Aj8) {
        C1063ATr c1063ATr = (C1063ATr) abstractC1439Aj8;
        c1063ATr.A01 = this.A01;
        c1063ATr.A00 = this.A00;
    }

    public C1062ATq(Integer num, String str, float f) {
        this.A01 = num;
        this.A00 = f;
        this.A02 = str;
    }
}
