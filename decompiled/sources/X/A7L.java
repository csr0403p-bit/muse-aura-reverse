package X;

/* loaded from: classes4.dex */
public final class A7L {
    public final long A00;
    public final A7M A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof A7L) {
                A7L a7l = (A7L) obj;
                if (!this.A01.equals(a7l.A01) || this.A00 != a7l.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass006.A05(this.A00, AnonymousClass005.A0E(this.A01));
    }

    public final String toString() {
        A7M a7m = this.A01;
        long j = this.A00;
        StringBuilder sbA0f = C3cG.A0f(a7m, "StoredSecret(record=");
        sbA0f.append(", updatedAtMillis=");
        sbA0f.append(j);
        return AnonymousClass001.A0v(")", sbA0f);
    }

    public A7L(A7M a7m, long j) {
        this.A01 = a7m;
        this.A00 = j;
    }
}
