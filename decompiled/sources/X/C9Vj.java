package X;

/* renamed from: X.9Vj, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9Vj extends C06G {
    public final C9Vf A00;
    public final C9Vf A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C9Vj) {
                C9Vj c9Vj = (C9Vj) obj;
                if (!C7384Etj.areEqual(this.A01, c9Vj.A01) || !C7384Etj.areEqual(this.A00, c9Vj.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (AnonymousClass006.A0D(this.A01) * 31) + C3cH.A02(this.A00);
    }

    public C9Vj(C9Vf c9Vf, C9Vf c9Vf2) {
        this.A01 = c9Vf;
        this.A00 = c9Vf2;
    }

    public C9Vj() {
        this(null, null);
    }
}
