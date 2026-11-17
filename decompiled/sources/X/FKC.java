package X;

/* loaded from: classes6.dex */
public final class FKC implements Comparable<FKC> {
    public final int A00;

    public static FKC A01(int i) {
        return new FKC(i);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(FKC fkc) {
        return C7384Etj.A00(this.A00 ^ Integer.MIN_VALUE, fkc.A00 ^ Integer.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof FKC) && this.A00 == ((FKC) obj).A00;
    }

    public final int hashCode() {
        return this.A00;
    }

    public final String toString() {
        return String.valueOf(BV4.A03(this.A00));
    }

    public /* synthetic */ FKC(int i) {
        this.A00 = i;
    }

    public static String A00(int i) {
        return String.valueOf(BV4.A03(i));
    }
}
