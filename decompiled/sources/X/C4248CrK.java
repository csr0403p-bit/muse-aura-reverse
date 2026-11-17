package X;

/* renamed from: X.CrK, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4248CrK<L> {
    public final Object A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C4248CrK) {
                C4248CrK c4248CrK = (C4248CrK) obj;
                if (this.A00 != c4248CrK.A00 || !this.A01.equals(c4248CrK.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass001.A0H(this.A01, System.identityHashCode(this.A00) * 31);
    }

    public C4248CrK(L l, String str) {
        this.A00 = l;
        this.A01 = str;
    }
}
