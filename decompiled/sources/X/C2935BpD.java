package X;

/* renamed from: X.BpD, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2935BpD {
    public final int A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C2935BpD) {
                C2935BpD c2935BpD = (C2935BpD) obj;
                if (!this.A01.equals(c2935BpD.A01) || this.A00 != c2935BpD.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass001.A0G(this.A01) + this.A00;
    }

    public final String toString() {
        return FGI.A0A(this.A00, "CachedReadKey(canonicalName=", this.A01, ", access=", ")");
    }

    public C2935BpD(String str, int i) {
        this.A01 = str;
        this.A00 = i;
    }
}
