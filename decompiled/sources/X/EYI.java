package X;

/* loaded from: classes5.dex */
public final class EYI implements EYY {
    public final /* synthetic */ AbstractC6735EXt A00;
    public final /* synthetic */ Class A01;
    public final /* synthetic */ Class A02;

    public EYI(AbstractC6735EXt abstractC6735EXt, Class cls, Class cls2) {
        this.A02 = cls;
        this.A01 = cls2;
        this.A00 = abstractC6735EXt;
    }

    @Override // X.EYY
    public final <T> AbstractC6735EXt<T> create(EYC eyc, C6753EYn<T> c6753EYn) {
        Class<? super T> cls = c6753EYn.A01;
        if (cls == this.A02 || cls == this.A01) {
            return this.A00;
        }
        return null;
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("Factory[type=");
        BV6.A18(this.A01, sbA0x);
        sbA0x.append("+");
        BV6.A18(this.A02, sbA0x);
        sbA0x.append(",adapter=");
        return BV8.A0u(this.A00, sbA0x);
    }
}
