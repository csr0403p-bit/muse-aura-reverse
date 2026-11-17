package X;

/* renamed from: X.Fwp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9012Fwp {
    public final String A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C9012Fwp) && this.A00.equals(((C9012Fwp) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        return FGI.A0U("DataOrigin(packageName='", this.A00, "')");
    }

    public C9012Fwp(String str) {
        this.A00 = str;
    }
}
