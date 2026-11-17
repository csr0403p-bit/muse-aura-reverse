package X;

/* loaded from: classes6.dex */
public final class G76 implements Comparable<G76> {
    public final int A00;
    public final G7A A01;
    public final int A02;

    @Override // java.lang.Comparable
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final int compareTo(G76 g76) {
        C7384Etj.A0Y(g76, 0);
        int i = this.A00;
        int i2 = g76.A00;
        if (i != i2) {
            return i - i2;
        }
        ADq aDq = this.A01.A00;
        int i3 = aDq.A01;
        boolean zA1P = AnonymousClass002.A1P(i3, i);
        ADq aDq2 = g76.A01.A00;
        int i4 = aDq2.A01;
        if (zA1P != AnonymousClass002.A1P(i4, i2)) {
            return zA1P ? 1 : -1;
        }
        int i5 = aDq.A00;
        int i6 = aDq2.A00;
        int i7 = (i5 + i3) - (i6 + i4);
        if (i7 == 0) {
            i7 = this.A02 - g76.A02;
            if (!zA1P) {
                return i7;
            }
        } else if (i5 == i3 || i6 == i4) {
            return i7;
        }
        return -i7;
    }

    public G76(G7A g7a, int i, int i2) {
        this.A00 = i;
        this.A02 = i2;
        this.A01 = g7a;
    }

    public final String toString() {
        StringBuilder sbA0w = C60O.A0w();
        G7A g7a = this.A01;
        int i = g7a.A00.A01;
        int i2 = this.A00;
        sbA0w.append(AnonymousClass002.A1P(i, i2) ? "Open" : "Close");
        sbA0w.append(": ");
        sbA0w.append(i2);
        sbA0w.append(" (");
        return AnonymousClass007.A0Z(g7a, sbA0w);
    }
}
