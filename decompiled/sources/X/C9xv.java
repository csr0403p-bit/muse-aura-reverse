package X;

/* renamed from: X.9xv, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9xv extends C06G {
    public final int A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C9xv) {
                C9xv c9xv = (C9xv) obj;
                if (!C7384Etj.areEqual(this.A01, c9xv.A01) || this.A00 != c9xv.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass001.A0G(this.A01) + this.A00;
    }

    public C9xv(String str, int i) {
        this.A01 = str;
        this.A00 = i;
    }
}
