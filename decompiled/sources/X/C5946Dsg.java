package X;

/* renamed from: X.Dsg, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5946Dsg extends C06G {
    public final int A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C5946Dsg) {
                C5946Dsg c5946Dsg = (C5946Dsg) obj;
                if (!C7384Etj.areEqual(this.A01, c5946Dsg.A01) || this.A00 != c5946Dsg.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (AnonymousClass006.A0G(this.A01) * 31) + this.A00;
    }

    public C5946Dsg(String str, int i) {
        this.A01 = str;
        this.A00 = i;
    }
}
