package X;

/* renamed from: X.Ax6, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2039Ax6 {
    public final String A00;
    public static final C2039Ax6 A02 = new C2039Ax6("text/*");
    public static final C2039Ax6 A01 = new C2039Ax6("*/*");

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2039Ax6) {
            return this.A00.equals(((C2039Ax6) obj).A00);
        }
        return false;
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        return FGI.A0U("MediaType(representation='", this.A00, "')");
    }

    public C2039Ax6(String str) {
        this.A00 = str;
    }
}
