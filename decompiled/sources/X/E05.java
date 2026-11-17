package X;

/* loaded from: classes5.dex */
public final class E05 extends E0B implements Comparable<E05> {
    public long A00;

    public E05() {
        super(1);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(E05 e05) {
        E05 e052 = e05;
        boolean zA1Q = AnonymousClass002.A1Q(((AbstractC5364DhG) this).A00 & 4, 4);
        if (zA1Q != AnonymousClass002.A1Q(((AbstractC5364DhG) e052).A00 & 4, 4)) {
            return zA1Q ? 1 : -1;
        }
        long j = ((Di2) this).A00 - ((Di2) e052).A00;
        if (j == 0) {
            j = this.A00 - e052.A00;
            if (j == 0) {
                return 0;
            }
        }
        return j > 0 ? 1 : -1;
    }
}
