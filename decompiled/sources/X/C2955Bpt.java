package X;

/* renamed from: X.Bpt, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2955Bpt<T> extends C3016Bs3<T> {
    public AbstractC5306Dfp<T> A00;
    public final T A01;

    /* JADX WARN: Multi-variable type inference failed */
    public final void A0C(AbstractC5306Dfp<T> abstractC5306Dfp) {
        Bs2<?> bs2A01;
        AbstractC5306Dfp<T> abstractC5306Dfp2 = this.A00;
        if (abstractC5306Dfp2 != null && (bs2A01 = ((C3016Bs3) this).A00.A01(abstractC5306Dfp2)) != null) {
            bs2A01.A01.A07(bs2A01);
        }
        this.A00 = abstractC5306Dfp;
        super.A0B(abstractC5306Dfp, new C8938Ftu(this, 8));
    }

    public C2955Bpt(T t) {
        this.A01 = t;
    }

    @Override // X.C3016Bs3
    public final <S> void A0B(AbstractC5306Dfp<S> abstractC5306Dfp, Bs1<? super S> bs1) {
        throw C8j3.A17();
    }
}
