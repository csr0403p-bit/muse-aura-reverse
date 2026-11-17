package X;

/* loaded from: classes5.dex */
public abstract class Dg2<K, V> {
    public void A00(C5307Dfq<K, V> c5307Dfq) {
        AbstractC5310Dft abstractC5310Dft = (AbstractC5310Dft) this;
        C5307Dfq<K, V> c5307Dfq2 = abstractC5310Dft.A00;
        if (c5307Dfq2 == c5307Dfq && c5307Dfq == abstractC5310Dft.A01) {
            c5307Dfq2 = null;
            abstractC5310Dft.A01 = null;
            abstractC5310Dft.A00 = null;
        }
        if (c5307Dfq2 == c5307Dfq) {
            c5307Dfq2 = abstractC5310Dft instanceof C5316Dfz ? c5307Dfq2.A00 : c5307Dfq2.A01;
            abstractC5310Dft.A00 = c5307Dfq2;
        }
        C5307Dfq<K, V> c5307Dfq3 = abstractC5310Dft.A01;
        if (c5307Dfq3 == c5307Dfq) {
            abstractC5310Dft.A01 = (c5307Dfq3 == c5307Dfq2 || c5307Dfq2 == null) ? null : abstractC5310Dft instanceof C5316Dfz ? c5307Dfq3.A01 : c5307Dfq3.A00;
        }
    }
}
