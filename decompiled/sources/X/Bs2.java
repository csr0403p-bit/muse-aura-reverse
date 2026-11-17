package X;

/* loaded from: classes5.dex */
public final class Bs2<V> implements Bs1<V> {
    public int A00 = -1;
    public final AbstractC5306Dfp<V> A01;
    public final Bs1<? super V> A02;

    @Override // X.Bs1
    public final void onChanged(V v) {
        int i = this.A00;
        int i2 = this.A01.A01;
        if (i != i2) {
            this.A00 = i2;
            this.A02.onChanged(v);
        }
    }

    public Bs2(AbstractC5306Dfp<V> abstractC5306Dfp, Bs1<? super V> bs1) {
        this.A01 = abstractC5306Dfp;
        this.A02 = bs1;
    }
}
