package X;

/* renamed from: X.9Vf, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9Vf extends C06G {
    public final C9WR A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C9Vf) {
                C9Vf c9Vf = (C9Vf) obj;
                if (this.A00 != c9Vf.A00 || !C7384Etj.areEqual(this.A01, c9Vf.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (AnonymousClass006.A0D(this.A00) * 31) + AnonymousClass005.A0H(this.A01);
    }

    public C9Vf(C9WR c9wr, String str) {
        this.A00 = c9wr;
        this.A01 = str;
    }

    public C9Vf() {
        this(null, null);
    }
}
