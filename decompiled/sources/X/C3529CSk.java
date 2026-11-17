package X;

/* renamed from: X.CSk, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3529CSk extends AbstractC3533CSo {
    public final String A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof AbstractC3533CSo) {
                C3529CSk c3529CSk = (C3529CSk) ((AbstractC3533CSo) obj);
                if (!this.A00.equals(c3529CSk.A00) || !this.A01.equals(c3529CSk.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.A00.hashCode() ^ 1000003) * 1000003) ^ this.A01.hashCode();
    }

    public final String toString() {
        return FGI.A0h("LibraryVersion{libraryName=", this.A00, C8j2.A00(16), this.A01, "}");
    }

    public C3529CSk(String str, String str2) {
        this.A00 = str;
        if (str2 == null) {
            throw new NullPointerException("Null version");
        }
        this.A01 = str2;
    }
}
