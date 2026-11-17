package X;

/* renamed from: X.AgS, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1282AgS extends HqU {
    public static final C1287AgX A01 = new C1287AgX();
    public final String A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C1282AgS) && this.A00.equals(((C1282AgS) obj).A00));
    }

    public C1282AgS(String str) {
        super(A01);
        this.A00 = str;
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        return C8j4.A0x("CoroutineName(", this.A00);
    }
}
